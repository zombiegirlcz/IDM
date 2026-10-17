package e7c;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Le7c/m;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getTimeZoneUtcOffset", "()I", "timeZoneUtcOffset", "b", "getColorDepth", "colorDepth", "c", "getScreenWidth", "screenWidth", "d", "getScreenHeight", "screenHeight", "", "e", "Z", "getJavaEnabled", "()Z", "javaEnabled", "f", "Ljava/lang/Integer;", "getChallengeWindowWidth", "()Ljava/lang/Integer;", "challengeWindowWidth", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeZoneUtcOffset")
    private final int timeZoneUtcOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("screenWidth")
    private final int screenWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("screenHeight")
    private final int screenHeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("challengeWindowWidth")
    private final Integer challengeWindowWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("colorDepth")
    private final int colorDepth = 24;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("javaEnabled")
    private final boolean javaEnabled = false;

    public m(int i, int i2, int i3, Integer num) {
        this.timeZoneUtcOffset = i;
        this.screenWidth = i2;
        this.screenHeight = i3;
        this.challengeWindowWidth = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.timeZoneUtcOffset == mVar.timeZoneUtcOffset && this.colorDepth == mVar.colorDepth && this.screenWidth == mVar.screenWidth && this.screenHeight == mVar.screenHeight && this.javaEnabled == mVar.javaEnabled && Intrinsics.f(this.challengeWindowWidth, mVar.challengeWindowWidth);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.screenHeight, j6.a.b(this.screenWidth, j6.a.b(this.colorDepth, Integer.hashCode(this.timeZoneUtcOffset) * 31, 31), 31), 31), 31, this.javaEnabled);
        Integer num = this.challengeWindowWidth;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
