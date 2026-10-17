package kotlin.reflect.jvm.internal.impl.load.java;

import a0.d;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import yhm.h;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class JavaNullabilityAnnotationSettingsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f186875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FqName[] f186876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NullabilityAnnotationStatesImpl f186877c;
    public static final JavaNullabilityAnnotationsStatus d;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f186875a = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        String strAsString = fqName3.asString();
        f186876b = new FqName[]{new FqName(d.r(strAsString, ".Nullable")), new FqName(d.r(strAsString, ".NonNull"))};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        Pair pair = new Pair(fqName5, companion.getDEFAULT());
        Pair pair2 = new Pair(new FqName("androidx.annotation"), companion.getDEFAULT());
        Pair pair3 = new Pair(new FqName("android.support.annotation"), companion.getDEFAULT());
        Pair pair4 = new Pair(new FqName("android.annotation"), companion.getDEFAULT());
        Pair pair5 = new Pair(new FqName("com.android.annotations"), companion.getDEFAULT());
        Pair pair6 = new Pair(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT());
        Pair pair7 = new Pair(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT());
        Pair pair8 = new Pair(fqName4, companion.getDEFAULT());
        Pair pair9 = new Pair(new FqName("javax.annotation"), companion.getDEFAULT());
        Pair pair10 = new Pair(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT());
        Pair pair11 = new Pair(new FqName("io.reactivex.annotations"), companion.getDEFAULT());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pair12 = new Pair(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pair13 = new Pair(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pair14 = new Pair(new FqName("lombok"), companion.getDEFAULT());
        h hVar = new h(2, 1, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f186877c = new NullabilityAnnotationStatesImpl(r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, hVar, reportLevel2)), new Pair(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new h(2, 1, 0), reportLevel2)), new Pair(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new h(1, 8, 0), reportLevel2)), new Pair(new FqName("jakarta.annotation"), new JavaNullabilityAnnotationsStatus(reportLevel, new h(2, 4, 0), reportLevel2))));
        d = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings getDefaultJsr305Settings(@org.jetbrains.annotations.NotNull yhm.h r6) {
        /*
            java.lang.String r0 = "configuredKotlinVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus r0 = kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.d
            yhm.h r1 = r0.getSinceVersion()
            if (r1 == 0) goto L26
            yhm.h r1 = r0.getSinceVersion()
            r1.getClass()
            java.lang.String r2 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            int r1 = r1.d
            int r6 = r6.d
            int r1 = r1 - r6
            if (r1 > 0) goto L26
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r6 = r0.getReportLevelAfter()
        L24:
            r1 = r6
            goto L2b
        L26:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r6 = r0.getReportLevelBefore()
            goto L24
        L2b:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = getDefaultMigrationJsr305ReportLevelForGivenGlobal(r1)
            kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings r0 = new kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings
            r4 = 4
            r5 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings(yhm.h):kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings");
    }

    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(@NotNull ReportLevel globalReportLevel) {
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    @NotNull
    public static final ReportLevel getDefaultReportLevelForAnnotation(@NotNull FqName annotationFqName, @NotNull h configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(annotationFqName, "annotationFqName");
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        return getReportLevelForAnnotation(annotationFqName, NullabilityAnnotationStates.Companion.getEMPTY(), configuredKotlinVersion);
    }

    @NotNull
    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return f186875a;
    }

    @NotNull
    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return f186876b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ReportLevel getReportLevelForAnnotation(@NotNull FqName annotation, @NotNull NullabilityAnnotationStates<? extends ReportLevel> configuredReportLevels, @NotNull h other) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(other, "configuredKotlinVersion");
        ReportLevel reportLevel = configuredReportLevels.get(annotation);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) f186877c.get(annotation);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        if (javaNullabilityAnnotationsStatus.getSinceVersion() != null) {
            h sinceVersion = javaNullabilityAnnotationsStatus.getSinceVersion();
            sinceVersion.getClass();
            Intrinsics.checkNotNullParameter(other, "other");
            if (sinceVersion.d - other.d <= 0) {
                return javaNullabilityAnnotationsStatus.getReportLevelAfter();
            }
        }
        return javaNullabilityAnnotationsStatus.getReportLevelBefore();
    }
}
