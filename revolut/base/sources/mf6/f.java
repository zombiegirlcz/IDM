package mf6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mf6.g;
import org.jetbrains.annotations.NotNull;
import qo6.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lmf6/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "consentId", "b", "fromPocketId", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "paymentAmount", "Lmf6/g$e;", "d", "Lmf6/g$e;", "()Lmf6/g$e;", "paymentInformation", "", "e", "Z", "()Z", "paymentNotificationsEnabled", "Lqo6/s;", "f", "Lqo6/s;", "()Lqo6/s;", "thirdParty", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("consentId")
    @NotNull
    private final String consentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fromPocketId")
    private final String fromPocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAmount")
    private final jo3.a paymentAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("paymentInformation")
    @NotNull
    private final g.e paymentInformation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentNotificationsEnabled")
    private final boolean paymentNotificationsEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("thirdParty")
    @NotNull
    private final s thirdParty;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConsentId() {
        return this.consentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFromPocketId() {
        return this.fromPocketId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getPaymentAmount() {
        return this.paymentAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g.e getPaymentInformation() {
        return this.paymentInformation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPaymentNotificationsEnabled() {
        return this.paymentNotificationsEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.consentId, fVar.consentId) && Intrinsics.f(this.fromPocketId, fVar.fromPocketId) && Intrinsics.f(this.paymentAmount, fVar.paymentAmount) && Intrinsics.f(this.paymentInformation, fVar.paymentInformation) && this.paymentNotificationsEnabled == fVar.paymentNotificationsEnabled && Intrinsics.f(this.thirdParty, fVar.thirdParty);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final s getThirdParty() {
        return this.thirdParty;
    }

    public final int hashCode() {
        int iHashCode = this.consentId.hashCode() * 31;
        String str = this.fromPocketId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jo3.a aVar = this.paymentAmount;
        return this.thirdParty.hashCode() + j6.a.c((this.paymentInformation.hashCode() + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31, 31, this.paymentNotificationsEnabled);
    }
}
