package kotlin.reflect.jvm.internal.impl.builtins.functions;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes14.dex */
public final class FunctionTypeKindExtractor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FunctionTypeKindExtractor f186482c = new FunctionTypeKindExtractor(v.k(FunctionTypeKind.Function.INSTANCE, FunctionTypeKind.SuspendFunction.INSTANCE, FunctionTypeKind.KFunction.INSTANCE, FunctionTypeKind.KSuspendFunction.INSTANCE));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f186484b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final FunctionTypeKindExtractor getDefault() {
            return FunctionTypeKindExtractor.f186482c;
        }
    }

    public static final class KindWithArity {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FunctionTypeKind f186485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f186486b;

        public KindWithArity(@NotNull FunctionTypeKind kind, int i) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.f186485a = kind;
            this.f186486b = i;
        }

        @NotNull
        public final FunctionTypeKind component1() {
            return this.f186485a;
        }

        public final int component2() {
            return this.f186486b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj2;
            return Intrinsics.f(this.f186485a, kindWithArity.f186485a) && this.f186486b == kindWithArity.f186486b;
        }

        @NotNull
        public final FunctionTypeKind getKind() {
            return this.f186485a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f186486b) + (this.f186485a.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("KindWithArity(kind=");
            sb6.append(this.f186485a);
            sb6.append(", arity=");
            return j6.a.t(sb6, this.f186486b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public FunctionTypeKindExtractor(@NotNull List<? extends FunctionTypeKind> kinds) {
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        this.f186483a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : kinds) {
            FqName packageFqName = ((FunctionTypeKind) obj2).getPackageFqName();
            Object arrayList = linkedHashMap.get(packageFqName);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(packageFqName, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        this.f186484b = linkedHashMap;
    }

    public final FunctionTypeKind getFunctionalClassKind(@NotNull FqName packageFqName, @NotNull String className) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        KindWithArity functionalClassKindWithArity = getFunctionalClassKindWithArity(packageFqName, className);
        if (functionalClassKindWithArity != null) {
            return functionalClassKindWithArity.getKind();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.KindWithArity getFunctionalClassKindWithArity(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.FqName r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.LinkedHashMap r0 = r8.f186484b
            java.lang.Object r9 = r0.get(r9)
            java.util.List r9 = (java.util.List) r9
            r0 = 0
            if (r9 != 0) goto L16
            goto L73
        L16:
            java.util.Iterator r9 = r9.iterator()
        L1a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r9.next()
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind r1 = (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind) r1
            java.lang.String r2 = r1.getClassNamePrefix()
            r3 = 0
            boolean r2 = kotlin.text.a0.H(r10, r2, r3)
            if (r2 == 0) goto L1a
            java.lang.String r2 = r1.getClassNamePrefix()
            int r2 = r2.length()
            java.lang.String r2 = r10.substring(r2)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            int r4 = r2.length()
            if (r4 != 0) goto L4a
        L48:
            r2 = r0
            goto L67
        L4a:
            int r4 = r2.length()
            r5 = r3
        L4f:
            if (r3 >= r4) goto L63
            char r6 = r2.charAt(r3)
            int r6 = r6 + (-48)
            if (r6 < 0) goto L48
            r7 = 10
            if (r6 >= r7) goto L48
            int r5 = r5 * 10
            int r5 = r5 + r6
            int r3 = r3 + 1
            goto L4f
        L63:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L67:
            if (r2 == 0) goto L1a
            int r9 = r2.intValue()
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor$KindWithArity r10 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor$KindWithArity
            r10.<init>(r1, r9)
            return r10
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.getFunctionalClassKindWithArity(kotlin.reflect.jvm.internal.impl.name.FqName, java.lang.String):kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor$KindWithArity");
    }
}
