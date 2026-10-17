package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H¦\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lkotlin/collections/a;", "E", "Lzhm/a;", "", "<init>", "()V", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Companion", "kotlin/collections/c", "kotlin/jvm/internal/d", "kotlin/collections/b", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a<E> extends zhm.a implements List<E> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kotlin.collections.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/a$a;", "", "", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("startIndex: ", i, i2, ", endIndex: ", ", size: ");
                sbW.append(i3);
                throw new IndexOutOfBoundsException(sbW.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(a0.d.g(i, i2, "startIndex: ", " > endIndex: "));
            }
        }

        public static void b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(a0.d.g(i, i2, "index: ", ", size: "));
            }
        }

        public static void c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException(a0.d.g(i, i2, "index: ", ", size: "));
            }
        }

        public static void d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("fromIndex: ", i, i2, ", toIndex: ", ", size: ");
                sbW.append(i3);
                throw new IndexOutOfBoundsException(sbW.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(a0.d.g(i, i2, "fromIndex: ", " > toIndex: "));
            }
        }

        public static int e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof List)) {
            return false;
        }
        Collection other2 = (Collection) other;
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Intrinsics.checkNotNullParameter(other2, "other");
        if (size() == other2.size()) {
            Iterator<E> it8 = other2.iterator();
            Iterator<E> it9 = iterator();
            while (it9.hasNext()) {
                if (!Intrinsics.f(it9.next(), it8.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int index);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Iterator<E> it8 = iterator();
        int iHashCode = 1;
        while (it8.hasNext()) {
            E next = it8.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object element) {
        Iterator<E> it8 = iterator();
        int i = 0;
        while (it8.hasNext()) {
            if (Intrinsics.f(it8.next(), element)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new kotlin.jvm.internal.d(this);
    }

    public int lastIndexOf(Object element) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.f(listIterator.previous(), element)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new b(this, 0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new c(this, i, i2);
    }

    @NotNull
    public ListIterator<E> listIterator(int index) {
        return new b(this, index);
    }
}
