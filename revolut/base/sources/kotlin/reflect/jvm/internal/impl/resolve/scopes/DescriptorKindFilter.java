package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class DescriptorKindFilter {

    @NotNull
    public static final DescriptorKindFilter ALL;

    @NotNull
    public static final DescriptorKindFilter CALLABLES;

    @NotNull
    public static final DescriptorKindFilter CLASSIFIERS;

    @NotNull
    public static final Companion Companion;

    @NotNull
    public static final DescriptorKindFilter FUNCTIONS;

    @NotNull
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;

    @NotNull
    public static final DescriptorKindFilter PACKAGES;

    @NotNull
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;

    @NotNull
    public static final DescriptorKindFilter TYPE_ALIASES;

    @NotNull
    public static final DescriptorKindFilter VALUES;

    @NotNull
    public static final DescriptorKindFilter VARIABLES;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f187607c;
    public static final int d;
    public static final int e;
    public static final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f187608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f187609h;
    public static final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f187610j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArrayList f187611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ArrayList f187612m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f187613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187614b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final int access$nextMask(Companion companion) {
            companion.getClass();
            int i = DescriptorKindFilter.f187607c;
            DescriptorKindFilter.f187607c <<= 1;
            return i;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.f187610j;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.k;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.f187609h;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.d;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.f187608g;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.e;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.f;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.i;
        }
    }

    static {
        a aVar;
        a aVar2;
        Companion companion = new Companion(null);
        Companion = companion;
        f187607c = 1;
        int iAccess$nextMask = Companion.access$nextMask(companion);
        d = iAccess$nextMask;
        int iAccess$nextMask2 = Companion.access$nextMask(companion);
        e = iAccess$nextMask2;
        int iAccess$nextMask3 = Companion.access$nextMask(companion);
        f = iAccess$nextMask3;
        int iAccess$nextMask4 = Companion.access$nextMask(companion);
        f187608g = iAccess$nextMask4;
        int iAccess$nextMask5 = Companion.access$nextMask(companion);
        f187609h = iAccess$nextMask5;
        int iAccess$nextMask6 = Companion.access$nextMask(companion);
        i = iAccess$nextMask6;
        int iAccess$nextMask7 = Companion.access$nextMask(companion) - 1;
        f187610j = iAccess$nextMask7;
        int i2 = iAccess$nextMask | iAccess$nextMask2 | iAccess$nextMask3;
        k = i2;
        ALL = new DescriptorKindFilter(iAccess$nextMask7, null, 2, null);
        CALLABLES = new DescriptorKindFilter(iAccess$nextMask5 | iAccess$nextMask6, null, 2, null);
        NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iAccess$nextMask, null, 2, null);
        SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iAccess$nextMask2, null, 2, null);
        TYPE_ALIASES = new DescriptorKindFilter(iAccess$nextMask3, null, 2, null);
        CLASSIFIERS = new DescriptorKindFilter(i2, null, 2, null);
        PACKAGES = new DescriptorKindFilter(iAccess$nextMask4, null, 2, null);
        FUNCTIONS = new DescriptorKindFilter(iAccess$nextMask5, null, 2, null);
        VARIABLES = new DescriptorKindFilter(iAccess$nextMask6, null, 2, null);
        VALUES = new DescriptorKindFilter(iAccess$nextMask2 | iAccess$nextMask5 | iAccess$nextMask6, null, 2, null);
        Field[] fields = DescriptorKindFilter.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj2 = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj2 instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj2 : null;
            if (descriptorKindFilter != null) {
                int i3 = descriptorKindFilter.f187614b;
                String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                aVar2 = new a(i3, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f187611l = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (Intrinsics.f(((Field) obj3).getType(), Integer.TYPE)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj4 = field4.get(null);
            Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj4).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                aVar = new a(iIntValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f187612m = arrayList5;
    }

    public DescriptorKindFilter(int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? f0.f322471a : list);
    }

    public final boolean acceptsKinds(int i2) {
        return (i2 & this.f187614b) != 0;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!DescriptorKindFilter.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj2;
        return Intrinsics.f(this.f187613a, descriptorKindFilter.f187613a) && this.f187614b == descriptorKindFilter.f187614b;
    }

    @NotNull
    public final List<DescriptorKindExclude> getExcludes() {
        return this.f187613a;
    }

    public final int getKindMask() {
        return this.f187614b;
    }

    public int hashCode() {
        return (this.f187613a.hashCode() * 31) + this.f187614b;
    }

    public final DescriptorKindFilter restrictedToKindsOrNull(int i2) {
        int i3 = i2 & this.f187614b;
        if (i3 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i3, this.f187613a);
    }

    @NotNull
    public String toString() throws IOException {
        Object next;
        Iterator it8 = f187611l.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a) next).f187630a == this.f187614b) {
                break;
            }
        }
        a aVar = (a) next;
        String strK0 = aVar != null ? aVar.f187631b : null;
        if (strK0 == null) {
            ArrayList arrayList = new ArrayList();
            for (a aVar2 : f187612m) {
                String str = acceptsKinds(aVar2.f187630a) ? aVar2.f187631b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strK0 = d0.k0(arrayList, " | ", null, null, 0, null, 62);
        }
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f187613a, com.google.android.gms.internal.mlkit_vision_face.a.x("DescriptorKindFilter(", strK0, ", "));
    }

    public DescriptorKindFilter(int i2, @NotNull List<? extends DescriptorKindExclude> excludes) {
        Intrinsics.checkNotNullParameter(excludes, "excludes");
        this.f187613a = excludes;
        Iterator<T> it8 = excludes.iterator();
        while (it8.hasNext()) {
            i2 &= ~((DescriptorKindExclude) it8.next()).getFullyExcludedDescriptorKinds();
        }
        this.f187614b = i2;
    }
}
