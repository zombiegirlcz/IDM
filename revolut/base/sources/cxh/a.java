package cxh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcxh/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "d", "()I", "screenWidth", "b", "c", "screenHeight", "Ljava/lang/String;", "f", "type", "e", "timeZoneUtcOffset", "colorDepth", "", "Z", "()Z", "javaEnabled", "feature_cpg_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("screen_width")
    private final int screenWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("screen_height")
    private final int screenHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("time_zone_utc_offset")
    private final int timeZoneUtcOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("color_depth")
    private final int colorDepth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("java_enabled")
    private final boolean javaEnabled;

    public a(int i, int i2) {
        Intrinsics.checkNotNullParameter("browser", "type");
        this.screenWidth = i;
        this.screenHeight = i2;
        this.type = "browser";
        this.timeZoneUtcOffset = -180;
        this.colorDepth = 24;
        this.javaEnabled = false;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColorDepth() {
        return this.colorDepth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getJavaEnabled() {
        return this.javaEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getScreenHeight() {
        return this.screenHeight;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getScreenWidth() {
        return this.screenWidth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTimeZoneUtcOffset() {
        return this.timeZoneUtcOffset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.screenWidth == aVar.screenWidth && this.screenHeight == aVar.screenHeight && Intrinsics.f(this.type, aVar.type) && this.timeZoneUtcOffset == aVar.timeZoneUtcOffset && this.colorDepth == aVar.colorDepth && this.javaEnabled == aVar.javaEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.javaEnabled) + j6.a.b(this.colorDepth, j6.a.b(this.timeZoneUtcOffset, p.a.c(j6.a.b(this.screenHeight, Integer.hashCode(this.screenWidth) * 31, 31), 31, this.type), 31), 31);
    }
}
