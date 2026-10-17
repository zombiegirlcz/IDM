package a79;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"La79/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getInboxId", "inboxId", "b", "getMessageId", "messageId", "c", "getCampaignId", "campaignId", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("inboxId")
    @NotNull
    private final String inboxId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageId")
    private final String messageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaignId")
    private final String campaignId;

    public l(String inboxId, String str, String str2) {
        Intrinsics.checkNotNullParameter(inboxId, "inboxId");
        this.inboxId = inboxId;
        this.messageId = str;
        this.campaignId = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.inboxId, lVar.inboxId) && Intrinsics.f(this.messageId, lVar.messageId) && Intrinsics.f(this.campaignId, lVar.campaignId);
    }

    public final int hashCode() {
        int iHashCode = this.inboxId.hashCode() * 31;
        String str = this.messageId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.campaignId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
