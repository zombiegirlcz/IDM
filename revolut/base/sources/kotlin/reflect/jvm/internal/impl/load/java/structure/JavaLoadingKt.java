package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX INFO: loaded from: classes14.dex */
public final class JavaLoadingKt {
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isObjectMethodInInterface(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r5.getContainingClass()
            boolean r0 = r0.isInterface()
            r1 = 0
            if (r0 == 0) goto L95
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
            if (r0 == 0) goto L95
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod r5 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) r5
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r5.getName()
            java.lang.String r0 = r0.asString()
            int r2 = r0.hashCode()
            r3 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            r4 = 1
            if (r2 == r3) goto L82
            r3 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r2 == r3) goto L3c
            r3 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r2 == r3) goto L33
            goto L80
        L33:
            java.lang.String r2 = "hashCode"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L8a
            goto L80
        L3c:
            java.lang.String r2 = "equals"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L45
            goto L80
        L45:
            java.util.List r5 = r5.getValueParameters()
            java.lang.Object r5 = zhm.d0.M0(r5)
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter r5 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter) r5
            r0 = 0
            if (r5 == 0) goto L57
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType r5 = r5.getType()
            goto L58
        L57:
            r5 = r0
        L58:
            boolean r2 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
            if (r2 == 0) goto L5f
            r0 = r5
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r0 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) r0
        L5f:
            if (r0 != 0) goto L62
            goto L80
        L62:
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier r5 = r0.getClassifier()
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
            if (r0 == 0) goto L80
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r5 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) r5
            kotlin.reflect.jvm.internal.impl.name.FqName r5 = r5.getFqName()
            if (r5 == 0) goto L80
            java.lang.String r5 = r5.asString()
            java.lang.String r0 = "java.lang.Object"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            if (r5 == 0) goto L80
            r5 = r4
            goto L92
        L80:
            r5 = r1
            goto L92
        L82:
            java.lang.String r2 = "toString"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L80
        L8a:
            java.util.List r5 = r5.getValueParameters()
            boolean r5 = r5.isEmpty()
        L92:
            if (r5 == 0) goto L95
            return r4
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt.isObjectMethodInInterface(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember):boolean");
    }
}
