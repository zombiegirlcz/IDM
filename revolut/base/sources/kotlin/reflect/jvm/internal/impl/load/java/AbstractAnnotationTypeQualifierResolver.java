package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    @NotNull
    private static final ljm.a Companion = new ljm.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f186856c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaTypeEnhancementState f186857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f186858b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f186856c = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(@NotNull JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f186857a = javaTypeEnhancementState;
        this.f186858b = new ConcurrentHashMap();
    }

    public final Object a(Object obj2, FqName fqName) {
        for (Object obj3 : getMetaAnnotations(obj2)) {
            if (Intrinsics.f(getFqName(obj3), fqName)) {
                return obj3;
            }
        }
        return null;
    }

    public final boolean b(Object obj2, FqName fqName) {
        Iterable metaAnnotations = getMetaAnnotations(obj2);
        if ((metaAnnotations instanceof Collection) && ((Collection) metaAnnotations).isEmpty()) {
            return false;
        }
        Iterator it8 = metaAnnotations.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(getFqName(it8.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus c(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r5.getFqName(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r2 = r5.f186857a
            kotlin.jvm.functions.Function1 r2 = r2.getGetReportLevelForAnnotation()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r2
            boolean r3 = r2.isIgnore()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            goto L8d
        L29:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L8d
        L36:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getFORCE_FLEXIBILITY_ANNOTATIONS()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L8d
        L43:
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION_FQ_NAME()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.enumArguments(r6, r4)
            java.lang.Object r6 = zhm.d0.c0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L8d
        L8b:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
        L8d:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            boolean r1 = r2.isWarning()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.c(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    public final ReportLevel d(Object obj2) {
        ReportLevel reportLevelE = e(obj2);
        return reportLevelE != null ? reportLevelE : this.f186857a.getJsr305().getGlobalLevel();
    }

    public final ReportLevel e(Object obj2) {
        Iterable iterableEnumArguments;
        String str;
        JavaTypeEnhancementState javaTypeEnhancementState = this.f186857a;
        ReportLevel reportLevel = javaTypeEnhancementState.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(getFqName(obj2));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object objA = a(obj2, JvmAnnotationNamesKt.getUNDER_MIGRATION_ANNOTATION_FQ_NAME());
        if (objA == null || (iterableEnumArguments = enumArguments(objA, false)) == null || (str = (String) d0.c0(iterableEnumArguments)) == null) {
            return null;
        }
        ReportLevel migrationLevel = javaTypeEnhancementState.getJsr305().getMigrationLevel();
        if (migrationLevel != null) {
            return migrationLevel;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return ReportLevel.WARN;
                }
            } else if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return ReportLevel.IGNORE;
        }
        return null;
    }

    public abstract Iterable enumArguments(Object obj2, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType r20, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends TAnnotation> r21) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.extractAndMergeDefaultQualifiers(kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType, java.lang.Iterable):kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType");
    }

    public final MutabilityQualifier extractMutability(@NotNull Iterable<? extends TAnnotation> annotations) {
        MutabilityQualifier mutabilityQualifier;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Iterator<? extends TAnnotation> it8 = annotations.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it8.hasNext()) {
            FqName fqName = getFqName(it8.next());
            if (d0.T(JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS(), fqName)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (d0.T(JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS(), fqName)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullability(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends TAnnotation> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super TAnnotation, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "forceWarning"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = r0
        L10:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r6.next()
            java.lang.Object r3 = r7.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r3 = r5.c(r2, r3)
            if (r3 == 0) goto L2b
            goto L57
        L2b:
            java.lang.Object r3 = r5.resolveTypeQualifierAnnotation(r2)
            if (r3 != 0) goto L33
        L31:
            r3 = r0
            goto L57
        L33:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = r5.d(r2)
            boolean r4 = r2.isIgnore()
            if (r4 == 0) goto L3e
            goto L31
        L3e:
            java.lang.Object r4 = r7.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r3 = r5.c(r3, r4)
            if (r3 == 0) goto L31
            boolean r2 = r2.isWarning()
            r4 = 1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus.copy$default(r3, r0, r2, r4, r0)
        L57:
            if (r1 != 0) goto L5a
            goto L7c
        L5a:
            if (r3 == 0) goto L10
            boolean r2 = r3.equals(r1)
            if (r2 == 0) goto L63
            goto L10
        L63:
            boolean r2 = r3.isForWarningOnly()
            if (r2 == 0) goto L70
            boolean r2 = r1.isForWarningOnly()
            if (r2 != 0) goto L70
            goto L10
        L70:
            boolean r2 = r3.isForWarningOnly()
            if (r2 != 0) goto L7e
            boolean r1 = r1.isForWarningOnly()
            if (r1 == 0) goto L7e
        L7c:
            r1 = r3
            goto L10
        L7e:
            return r0
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.extractNullability(java.lang.Iterable, kotlin.jvm.functions.Function1):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    public abstract FqName getFqName(Object obj2);

    public abstract Object getKey(Object obj2);

    public abstract Iterable getMetaAnnotations(Object obj2);

    public abstract boolean isK2();

    public final boolean isTypeUseAnnotation(@NotNull TAnnotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Object objA = a(annotation, StandardNames.FqNames.target);
        if (objA == null) {
            return false;
        }
        Iterable iterableEnumArguments = enumArguments(objA, false);
        if ((iterableEnumArguments instanceof Collection) && ((Collection) iterableEnumArguments).isEmpty()) {
            return false;
        }
        Iterator it8 = iterableEnumArguments.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f((String) it8.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TAnnotation resolveTypeQualifierAnnotation(@NotNull TAnnotation annotation) {
        TAnnotation tannotation;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (this.f186857a.getJsr305().isDisabled()) {
            return null;
        }
        if (d0.T(JvmAnnotationNamesKt.getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS(), getFqName(annotation)) || b(annotation, JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME())) {
            return annotation;
        }
        if (!b(annotation, JvmAnnotationNamesKt.getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME())) {
            return null;
        }
        Object key = getKey(annotation);
        ConcurrentHashMap concurrentHashMap = this.f186858b;
        TAnnotation tannotation2 = (TAnnotation) concurrentHashMap.get(key);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator it8 = getMetaAnnotations(annotation).iterator();
        while (true) {
            if (!it8.hasNext()) {
                tannotation = null;
                break;
            }
            tannotation = (TAnnotation) resolveTypeQualifierAnnotation(it8.next());
            if (tannotation != null) {
                break;
            }
        }
        if (tannotation == null) {
            return null;
        }
        TAnnotation tannotation3 = (TAnnotation) concurrentHashMap.putIfAbsent(key, tannotation);
        return tannotation3 == null ? tannotation : tannotation3;
    }
}
