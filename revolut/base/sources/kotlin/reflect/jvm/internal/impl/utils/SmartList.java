package kotlin.reflect.jvm.internal.impl.utils;

import a0.d;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import mkm.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f187880b;

    public static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        int i = this.f187879a;
        if (i == 0) {
            this.f187880b = e;
        } else if (i == 1) {
            this.f187880b = new Object[]{this.f187880b, e};
        } else {
            Object[] objArr = (Object[]) this.f187880b;
            int length = objArr.length;
            if (i >= length) {
                int iD = d.D(length, 3, 2, 1);
                int i2 = i + 1;
                if (iD < i2) {
                    iD = i2;
                }
                Object[] objArr2 = new Object[iD];
                this.f187880b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f187879a] = e;
        }
        this.f187879a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f187880b = null;
        this.f187879a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f187879a)) {
            return i2 == 1 ? (E) this.f187880b : (E) ((Object[]) this.f187880b)[i];
        }
        StringBuilder sbW = d.w(i, "Index: ", ", Size: ");
        sbW.append(this.f187879a);
        throw new IndexOutOfBoundsException(sbW.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        int i = this.f187879a;
        if (i == 0) {
            return c.f206505a;
        }
        if (i == 1) {
            return new mkm.d(this);
        }
        Iterator<E> it8 = super.iterator();
        if (it8 != null) {
            return it8;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f187879a)) {
            StringBuilder sbW = d.w(i, "Index: ", ", Size: ");
            sbW.append(this.f187879a);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (i2 == 1) {
            e = (E) this.f187880b;
            this.f187880b = null;
        } else {
            Object[] objArr = (Object[]) this.f187880b;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.f187880b = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f187879a - 1] = null;
            }
            e = (E) obj2;
        }
        this.f187879a--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f187879a)) {
            StringBuilder sbW = d.w(i, "Index: ", ", Size: ");
            sbW.append(this.f187879a);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (i2 == 1) {
            E e2 = (E) this.f187880b;
            this.f187880b = e;
            return e2;
        }
        Object[] objArr = (Object[]) this.f187880b;
        E e4 = (E) objArr[i];
        objArr[i] = e;
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f187879a;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i = this.f187879a;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f187880b, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr == 0) {
            a(4);
            throw null;
        }
        int length = tArr.length;
        int i = this.f187879a;
        if (i == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f187880b;
                return tArr2;
            }
            tArr[0] = this.f187880b;
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f187880b, i, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                a(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.f187880b, 0, tArr, 0, i);
            }
        }
        int i2 = this.f187879a;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f187879a)) {
            if (i2 == 0) {
                this.f187880b = e;
            } else if (i2 == 1 && i == 0) {
                this.f187880b = new Object[]{e, this.f187880b};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.f187880b;
                } else {
                    Object[] objArr2 = (Object[]) this.f187880b;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.f187879a - i);
                }
                objArr[i] = e;
                this.f187880b = objArr;
            }
            this.f187879a++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbW = d.w(i, "Index: ", ", Size: ");
        sbW.append(this.f187879a);
        throw new IndexOutOfBoundsException(sbW.toString());
    }
}
