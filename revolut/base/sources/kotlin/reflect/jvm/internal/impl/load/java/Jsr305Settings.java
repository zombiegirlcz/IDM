package kotlin.reflect.jvm.internal.impl.load.java;

import ajm.d;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class Jsr305Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportLevel f186885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReportLevel f186886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f186887c;
    public final Lazy d;
    public final boolean e;

    public Jsr305Settings(@NotNull ReportLevel globalLevel, ReportLevel reportLevel, @NotNull Map<FqName, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f186885a = globalLevel;
        this.f186886b = reportLevel;
        this.f186887c = userDefinedLevelForSpecificAnnotation;
        this.d = j.b(new d(this, 23));
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        this.e = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj2;
        return this.f186885a == jsr305Settings.f186885a && this.f186886b == jsr305Settings.f186886b && Intrinsics.f(this.f186887c, jsr305Settings.f186887c);
    }

    @NotNull
    public final ReportLevel getGlobalLevel() {
        return this.f186885a;
    }

    public final ReportLevel getMigrationLevel() {
        return this.f186886b;
    }

    @NotNull
    public final Map<FqName, ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.f186887c;
    }

    public int hashCode() {
        int iHashCode = this.f186885a.hashCode() * 31;
        ReportLevel reportLevel = this.f186886b;
        return this.f186887c.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final boolean isDisabled() {
        return this.e;
    }

    @NotNull
    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f186885a + ", migrationLevel=" + this.f186886b + ", userDefinedLevelForSpecificAnnotation=" + this.f186887c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? null : reportLevel2, (i & 4) != 0 ? r0.g() : map);
    }
}
