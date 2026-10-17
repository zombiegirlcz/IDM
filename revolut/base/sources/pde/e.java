package pde;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lpde/e;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "b", "Ljava/lang/String;", "getSenderBankCountry", "senderBankCountry", "c", "getSentOn", "sentOn", "d", "getBankAccountId", "bankAccountId", "", "e", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", ib.b.Features, "Companion", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("senderBankCountry")
    @NotNull
    private final String senderBankCountry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sentOn")
    @NotNull
    private final String sentOn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bankAccountId")
    private final String bankAccountId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b(ib.b.Features)
    private final List<String> features;

    public e(String senderBankCountry, String sentOn, List list, jo3.a amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(senderBankCountry, "senderBankCountry");
        Intrinsics.checkNotNullParameter(sentOn, "sentOn");
        this.amount = amount;
        this.senderBankCountry = senderBankCountry;
        this.sentOn = sentOn;
        this.bankAccountId = null;
        this.features = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.amount, eVar.amount) && Intrinsics.f(this.senderBankCountry, eVar.senderBankCountry) && Intrinsics.f(this.sentOn, eVar.sentOn) && Intrinsics.f(this.bankAccountId, eVar.bankAccountId) && Intrinsics.f(this.features, eVar.features);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.amount.hashCode() * 31, 31, this.senderBankCountry), 31, this.sentOn);
        String str = this.bankAccountId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.features;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
