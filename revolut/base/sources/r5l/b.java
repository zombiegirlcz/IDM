package r5l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0018"}, d2 = {"Lr5l/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "e", "()I", "primary", "b", "f", "primaryBack", "c", "g", "secondary", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "badge", "badgeText", "customisation", "backgroundTint", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("primary")
    private final int primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryBack")
    private final int primaryBack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondary")
    private final int secondary;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("badge")
    private final Integer badge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("badgeText")
    private final Integer badgeText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("customisation")
    private final Integer customisation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("backgroundTint")
    private final Integer backgroundTint;

    public b(int i, int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4) {
        this.primary = i;
        this.primaryBack = i2;
        this.secondary = i3;
        this.badge = num;
        this.badgeText = num2;
        this.customisation = num3;
        this.backgroundTint = num4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getBackgroundTint() {
        return this.backgroundTint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getBadgeText() {
        return this.badgeText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getCustomisation() {
        return this.customisation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPrimary() {
        return this.primary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.primary == bVar.primary && this.primaryBack == bVar.primaryBack && this.secondary == bVar.secondary && Intrinsics.f(this.badge, bVar.badge) && Intrinsics.f(this.badgeText, bVar.badgeText) && Intrinsics.f(this.customisation, bVar.customisation) && Intrinsics.f(this.backgroundTint, bVar.backgroundTint);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPrimaryBack() {
        return this.primaryBack;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSecondary() {
        return this.secondary;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.secondary, j6.a.b(this.primaryBack, Integer.hashCode(this.primary) * 31, 31), 31);
        Integer num = this.badge;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.badgeText;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.customisation;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.backgroundTint;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }
}
