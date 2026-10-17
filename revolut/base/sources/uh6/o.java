package uh6;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010%\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Luh6/o;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "isRootedDevice", "()Z", "", "b", "I", "getScreenBrightness", "()I", "screenBrightness", "", "c", "J", "getElapsedTimeSinceBoot", "()J", "elapsedTimeSinceBoot", "d", "Ljava/lang/String;", "getOsVersion", "osVersion", "e", "getUserTimeZoneOffset", "userTimeZoneOffset", "f", "getLanguage", "language", "Luh6/m;", "g", "Luh6/m;", "getScreenDimensions", "()Luh6/m;", "screenDimensions", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("is_rooted_device")
    private final boolean isRootedDevice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("screen_brightness")
    private final int screenBrightness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("elapsed_time_since_boot")
    private final long elapsedTimeSinceBoot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("os_version")
    @NotNull
    private final String osVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("user_time_zone_offset")
    @NotNull
    private final String userTimeZoneOffset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("device_language")
    @NotNull
    private final String language;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("screen_dimensions")
    @NotNull
    private final m screenDimensions;

    public o(boolean z, int i, long j2, String userTimeZoneOffset, String language, m screenDimensions) {
        String osVersion = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(userTimeZoneOffset, "userTimeZoneOffset");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(screenDimensions, "screenDimensions");
        this.isRootedDevice = z;
        this.screenBrightness = i;
        this.elapsedTimeSinceBoot = j2;
        this.osVersion = osVersion;
        this.userTimeZoneOffset = userTimeZoneOffset;
        this.language = language;
        this.screenDimensions = screenDimensions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.isRootedDevice == oVar.isRootedDevice && this.screenBrightness == oVar.screenBrightness && this.elapsedTimeSinceBoot == oVar.elapsedTimeSinceBoot && Intrinsics.f(this.osVersion, oVar.osVersion) && Intrinsics.f(this.userTimeZoneOffset, oVar.userTimeZoneOffset) && Intrinsics.f(this.language, oVar.language) && Intrinsics.f(this.screenDimensions, oVar.screenDimensions);
    }

    public final int hashCode() {
        return this.screenDimensions.hashCode() + p.a.c(p.a.c(p.a.c(a0.d.c(j6.a.b(this.screenBrightness, Boolean.hashCode(this.isRootedDevice) * 31, 31), 31, this.elapsedTimeSinceBoot), 31, this.osVersion), 31, this.userTimeZoneOffset), 31, this.language);
    }
}
