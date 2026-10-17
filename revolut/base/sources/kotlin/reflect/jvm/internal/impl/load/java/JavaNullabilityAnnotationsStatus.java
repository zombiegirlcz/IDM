package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.h;

/* JADX INFO: loaded from: classes13.dex */
public final class JavaNullabilityAnnotationsStatus {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final JavaNullabilityAnnotationsStatus d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportLevel f186878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f186879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReportLevel f186880c;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final JavaNullabilityAnnotationsStatus getDEFAULT() {
            return JavaNullabilityAnnotationsStatus.d;
        }
    }

    public JavaNullabilityAnnotationsStatus(@NotNull ReportLevel reportLevelBefore, h hVar, @NotNull ReportLevel reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.f186878a = reportLevelBefore;
        this.f186879b = hVar;
        this.f186880c = reportLevelAfter;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj2;
        return this.f186878a == javaNullabilityAnnotationsStatus.f186878a && Intrinsics.f(this.f186879b, javaNullabilityAnnotationsStatus.f186879b) && this.f186880c == javaNullabilityAnnotationsStatus.f186880c;
    }

    @NotNull
    public final ReportLevel getReportLevelAfter() {
        return this.f186880c;
    }

    @NotNull
    public final ReportLevel getReportLevelBefore() {
        return this.f186878a;
    }

    public final h getSinceVersion() {
        return this.f186879b;
    }

    public int hashCode() {
        int iHashCode = this.f186878a.hashCode() * 31;
        h hVar = this.f186879b;
        return this.f186880c.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.d)) * 31);
    }

    @NotNull
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f186878a + ", sinceVersion=" + this.f186879b + ", reportLevelAfter=" + this.f186880c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, h hVar, ReportLevel reportLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new h(1, 0, 0) : hVar, (i & 4) != 0 ? reportLevel : reportLevel2);
    }
}
