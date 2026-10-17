package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f186435a = new Object[0];

    public static Collection a(Object obj2) {
        if ((obj2 instanceof pim.a) && !(obj2 instanceof pim.b)) {
            i(obj2, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj2;
        } catch (ClassCastException e) {
            Intrinsics.n(e, u0.class.getName());
            throw e;
        }
    }

    public static Iterator b(Iterator it8) {
        if (!(it8 instanceof pim.a) || (it8 instanceof pim.c)) {
            return it8;
        }
        i(it8, "kotlin.collections.MutableIterator");
        throw null;
    }

    public static List c(Object obj2) {
        if ((obj2 instanceof pim.a) && !(obj2 instanceof pim.d)) {
            i(obj2, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj2;
        } catch (ClassCastException e) {
            Intrinsics.n(e, u0.class.getName());
            throw e;
        }
    }

    public static Map d(Object obj2) {
        if ((obj2 instanceof pim.a) && !(obj2 instanceof pim.f)) {
            i(obj2, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj2;
        } catch (ClassCastException e) {
            Intrinsics.n(e, u0.class.getName());
            throw e;
        }
    }

    public static Set e(Object obj2) {
        if ((obj2 instanceof pim.a) && !(obj2 instanceof pim.g)) {
            i(obj2, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj2;
        } catch (ClassCastException e) {
            Intrinsics.n(e, u0.class.getName());
            throw e;
        }
    }

    public static void f(int i, Object obj2) {
        if (obj2 == null || g(i, obj2)) {
            return;
        }
        i(obj2, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean g(int i, Object obj2) {
        if (obj2 instanceof Function) {
            if ((obj2 instanceof o ? ((o) obj2).getArity() : obj2 instanceof Function0 ? 0 : obj2 instanceof Function1 ? 1 : obj2 instanceof Function2 ? 2 : obj2 instanceof Function3 ? 3 : obj2 instanceof oim.n ? 4 : obj2 instanceof oim.o ? 5 : obj2 instanceof oim.p ? 6 : obj2 instanceof oim.q ? 7 : obj2 instanceof oim.r ? 8 : obj2 instanceof oim.s ? 9 : obj2 instanceof oim.a ? 10 : obj2 instanceof oim.b ? 11 : obj2 instanceof oim.c ? 12 : obj2 instanceof oim.d ? 13 : obj2 instanceof oim.e ? 14 : obj2 instanceof oim.f ? 15 : obj2 instanceof oim.g ? 16 : obj2 instanceof oim.h ? 17 : obj2 instanceof oim.i ? 18 : obj2 instanceof oim.j ? 19 : obj2 instanceof oim.k ? 20 : obj2 instanceof oim.l ? 21 : obj2 instanceof oim.m ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static final d h(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new d(array);
    }

    public static void i(Object obj2, String str) {
        ClassCastException classCastException = new ClassCastException(com.google.android.gms.internal.mlkit_vision_face.a.o(obj2 == null ? "null" : obj2.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.n(classCastException, u0.class.getName());
        throw classCastException;
    }

    public static final Object[] j(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        Object[] objArr = f186435a;
        if (size == 0) {
            return objArr;
        }
        Iterator it8 = collection.iterator();
        if (!it8.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it8.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it8.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else if (!it8.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    public static final Object[] k(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it8 = collection.iterator();
            if (it8.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    Intrinsics.i(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it8.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it8.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    } else if (!it8.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
