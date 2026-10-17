package a79;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0010"}, d2 = {"La79/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "messageId", "b", "inboxId", "campaignId", "d", "e", "tileId", "pushId", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageId")
    private final String messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("inboxId")
    private final String inboxId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaignId")
    private final String campaignId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("tileId")
    private final String tileId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pushId")
    private final String pushId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInboxId() {
        return this.inboxId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPushId() {
        return this.pushId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTileId() {
        return this.tileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.messageId, kVar.messageId) && Intrinsics.f(this.inboxId, kVar.inboxId) && Intrinsics.f(this.campaignId, kVar.campaignId) && Intrinsics.f(this.tileId, kVar.tileId) && Intrinsics.f(this.pushId, kVar.pushId);
    }

    public final int hashCode() {
        String str = this.messageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inboxId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tileId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pushId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
