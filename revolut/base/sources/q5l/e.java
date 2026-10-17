package q5l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0014"}, d2 = {"Lq5l/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "primary", "b", "f", "primaryBack", "c", "g", "secondary", "d", "badge", "badgeText", "customisation", "backgroundTint", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("primary")
    private final String primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryBack")
    private final String primaryBack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondary")
    private final String secondary;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("badge")
    private final String badge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("badgeText")
    private final String badgeText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("customisation")
    private final String customisation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("backgroundTint")
    private final String backgroundTint;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundTint() {
        return this.backgroundTint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCustomisation() {
        return this.customisation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrimary() {
        return this.primary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.primary, eVar.primary) && Intrinsics.f(this.primaryBack, eVar.primaryBack) && Intrinsics.f(this.secondary, eVar.secondary) && Intrinsics.f(this.badge, eVar.badge) && Intrinsics.f(this.badgeText, eVar.badgeText) && Intrinsics.f(this.customisation, eVar.customisation) && Intrinsics.f(this.backgroundTint, eVar.backgroundTint);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPrimaryBack() {
        return this.primaryBack;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSecondary() {
        return this.secondary;
    }

    public final int hashCode() {
        String str = this.primary;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.primaryBack;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondary;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.badge;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.badgeText;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.customisation;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.backgroundTint;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }
}
