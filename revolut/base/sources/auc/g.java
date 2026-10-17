package auc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\t\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u0018\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004¨\u0006'"}, d2 = {"Lauc/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "cardId", "", "c", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "thisDevice", "", "d", "J", "()J", "createdAt", "h", "state", "f", "deviceType", "g", "deviceName", "l", "tokenType", "j", "tokenRequestor", "k", "tokenRequestorName", "Lauc/l;", "Lauc/l;", "()Lauc/l;", "merchant", "panSource", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardId")
    @NotNull
    private final String cardId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("thisDevice")
    private final Boolean thisDevice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("deviceType")
    private final String deviceType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("deviceName")
    private final String deviceName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("tokenType")
    @NotNull
    private final String tokenType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("tokenRequestor")
    private final String tokenRequestor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("tokenRequestorName")
    @NotNull
    private final String tokenRequestorName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("merchant")
    private final l merchant;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("panSource")
    private final String panSource;

    public g(String id10, String cardId, Boolean bool, long j2, String state, String str, String str2, String tokenType, String str3, String tokenRequestorName, l lVar, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        Intrinsics.checkNotNullParameter(tokenRequestorName, "tokenRequestorName");
        this.id = id10;
        this.cardId = cardId;
        this.thisDevice = bool;
        this.createdAt = j2;
        this.state = state;
        this.deviceType = str;
        this.deviceName = str2;
        this.tokenType = tokenType;
        this.tokenRequestor = str3;
        this.tokenRequestorName = tokenRequestorName;
        this.merchant = lVar;
        this.panSource = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.cardId, gVar.cardId) && Intrinsics.f(this.thisDevice, gVar.thisDevice) && this.createdAt == gVar.createdAt && Intrinsics.f(this.state, gVar.state) && Intrinsics.f(this.deviceType, gVar.deviceType) && Intrinsics.f(this.deviceName, gVar.deviceName) && Intrinsics.f(this.tokenType, gVar.tokenType) && Intrinsics.f(this.tokenRequestor, gVar.tokenRequestor) && Intrinsics.f(this.tokenRequestorName, gVar.tokenRequestorName) && Intrinsics.f(this.merchant, gVar.merchant) && Intrinsics.f(this.panSource, gVar.panSource);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getMerchant() {
        return this.merchant;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPanSource() {
        return this.panSource;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.cardId);
        Boolean bool = this.thisDevice;
        int iC2 = p.a.c(a0.d.c((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.createdAt), 31, this.state);
        String str = this.deviceType;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceName;
        int iC3 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.tokenType);
        String str3 = this.tokenRequestor;
        int iC4 = p.a.c((iC3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.tokenRequestorName);
        l lVar = this.merchant;
        int iHashCode2 = (iC4 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str4 = this.panSource;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getThisDevice() {
        return this.thisDevice;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTokenRequestor() {
        return this.tokenRequestor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTokenRequestorName() {
        return this.tokenRequestorName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }
}
