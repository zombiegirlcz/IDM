package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import mkm.e;
import mkm.f;
import org.jetbrains.annotations.NotNull;
import zhm.j;
import zhm.z0;

/* JADX INFO: loaded from: classes14.dex */
public final class SmartSet<T> extends j {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f187881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187882b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }

        @NotNull
        public final <T> SmartSet<T> create(@NotNull Collection<? extends T> set) {
            Intrinsics.checkNotNullParameter(set, "set");
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(set);
            return smartSet;
        }
    }

    public SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t2) {
        Object obj2;
        if (size() == 0) {
            this.f187881a = t2;
        } else if (size() == 1) {
            if (Intrinsics.f(this.f187881a, t2)) {
                return false;
            }
            this.f187881a = new Object[]{this.f187881a, t2};
        } else if (size() < 5) {
            Object obj3 = this.f187881a;
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (d.I(objArr, t2)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetF = z0.f(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetF.add(t2);
                obj2 = linkedHashSetF;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = t2;
                obj2 = objArrCopyOf;
            }
            this.f187881a = obj2;
        } else {
            Object obj4 = this.f187881a;
            Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!u0.e(obj4).add(t2)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f187881a = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj2) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.f(this.f187881a, obj2);
        }
        if (size() < 5) {
            Object obj3 = this.f187881a;
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return d.I((Object[]) obj3, obj2);
        }
        Object obj4 = this.f187881a;
        Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj4).contains(obj2);
    }

    @Override // zhm.j
    public int getSize() {
        return this.f187882b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new f(this.f187881a);
        }
        if (size() < 5) {
            Object obj2 = this.f187881a;
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new e((Object[]) obj2);
        }
        Object obj3 = this.f187881a;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return u0.e(obj3).iterator();
    }

    public void setSize(int i) {
        this.f187882b = i;
    }
}
