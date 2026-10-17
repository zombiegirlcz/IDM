package z1k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceAccountSwitchingInformation;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceOption;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b\u0006\u0010%¨\u0006'"}, d2 = {"Lz1k/e;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId;", "a", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId;", "c", "()Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceRouteId;", "id", "Lz1k/q;", "b", "Lz1k/q;", "f", "()Lz1k/q;", "transferLimits", "", "Z", "g", "()Z", "isDecimalsAllowed", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "amountMultiple", "", "Lz1k/g;", "e", "Ljava/util/List;", "()Ljava/util/List;", "options", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceReferenceOption;", "referenceOptions", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceAccountSwitchingInformation;", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceAccountSwitchingInformation;", "()Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceAccountSwitchingInformation;", "accountSwitchingInformation", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final RemittanceRouteId id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferLimits")
    @NotNull
    private final q transferLimits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("isDecimalsAllowed")
    private final boolean isDecimalsAllowed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amountMultiple")
    private final Long amountMultiple;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("options")
    private final List<g> options;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("referenceOptions")
    @NotNull
    private final List<RemittanceReferenceOption> referenceOptions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountSwitchingInformation")
    private final RemittanceAccountSwitchingInformation accountSwitchingInformation;

    public e(RemittanceRouteId id10, q transferLimits, boolean z, Long l2, ArrayList arrayList, List referenceOptions, RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transferLimits, "transferLimits");
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        this.id = id10;
        this.transferLimits = transferLimits;
        this.isDecimalsAllowed = z;
        this.amountMultiple = l2;
        this.options = arrayList;
        this.referenceOptions = referenceOptions;
        this.accountSwitchingInformation = remittanceAccountSwitchingInformation;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RemittanceAccountSwitchingInformation getAccountSwitchingInformation() {
        return this.accountSwitchingInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getAmountMultiple() {
        return this.amountMultiple;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RemittanceRouteId getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getReferenceOptions() {
        return this.referenceOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.transferLimits, eVar.transferLimits) && this.isDecimalsAllowed == eVar.isDecimalsAllowed && Intrinsics.f(this.amountMultiple, eVar.amountMultiple) && Intrinsics.f(this.options, eVar.options) && Intrinsics.f(this.referenceOptions, eVar.referenceOptions) && Intrinsics.f(this.accountSwitchingInformation, eVar.accountSwitchingInformation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final q getTransferLimits() {
        return this.transferLimits;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsDecimalsAllowed() {
        return this.isDecimalsAllowed;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.transferLimits.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.isDecimalsAllowed);
        Long l2 = this.amountMultiple;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<g> list = this.options;
        int iD = p.a.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.referenceOptions);
        RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation = this.accountSwitchingInformation;
        return iD + (remittanceAccountSwitchingInformation != null ? remittanceAccountSwitchingInformation.hashCode() : 0);
    }
}
