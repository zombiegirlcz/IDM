package h3k;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\t\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b\u0005\u0010$¨\u0006&"}, d2 = {"Lh3k/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "h", "transferVendor", "Lh3k/r;", "Lh3k/r;", "g", "()Lh3k/r;", "transferLimits", "", "d", "Z", "()Z", "decimalsAllowed", "", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "multiple", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "options", "Lh3k/o;", "referenceOptions", "Lh3k/c;", "Lh3k/c;", "()Lh3k/c;", "accountSwitchingInformation", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferVendor")
    private final String transferVendor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferLimits")
    @NotNull
    private final r transferLimits;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("decimalsAllowed")
    private final boolean decimalsAllowed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("multiple")
    private final Long multiple;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("options")
    private final List<String> options;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("referenceOptions")
    private final List<o> referenceOptions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountSwitchingInformation")
    private final c accountSwitchingInformation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getAccountSwitchingInformation() {
        return this.accountSwitchingInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDecimalsAllowed() {
        return this.decimalsAllowed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getMultiple() {
        return this.multiple;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getOptions() {
        return this.options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.transferVendor, dVar.transferVendor) && Intrinsics.f(this.transferLimits, dVar.transferLimits) && this.decimalsAllowed == dVar.decimalsAllowed && Intrinsics.f(this.multiple, dVar.multiple) && Intrinsics.f(this.options, dVar.options) && Intrinsics.f(this.referenceOptions, dVar.referenceOptions) && Intrinsics.f(this.accountSwitchingInformation, dVar.accountSwitchingInformation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getReferenceOptions() {
        return this.referenceOptions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final r getTransferLimits() {
        return this.transferLimits;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTransferVendor() {
        return this.transferVendor;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.transferVendor;
        int iC = j6.a.c((this.transferLimits.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.decimalsAllowed);
        Long l2 = this.multiple;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<String> list = this.options;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<o> list2 = this.referenceOptions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        c cVar = this.accountSwitchingInformation;
        return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }
}
