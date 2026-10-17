package l8a;

import com.revolut.feature.pix.impl.data.model.PixQrCodeDecodeStatusDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Ll8a/g0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "Lcom/revolut/feature/pix/impl/data/model/PixQrCodeDecodeStatusDto;", "b", "Lcom/revolut/feature/pix/impl/data/model/PixQrCodeDecodeStatusDto;", "f", "()Lcom/revolut/feature/pix/impl/data/model/PixQrCodeDecodeStatusDto;", "status", "c", "e", "paymentDate", "encodedValue", "failureReason", "Ll8a/f0;", "Ll8a/f0;", "()Ll8a/f0;", "data", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final PixQrCodeDecodeStatusDto status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentDate")
    @NotNull
    private final String paymentDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("encodedValue")
    @NotNull
    private final String encodedValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("failureReason")
    private final String failureReason;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("data")
    private final f0 data;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f0 getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEncodedValue() {
        return this.encodedValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.id, g0Var.id) && this.status == g0Var.status && Intrinsics.f(this.paymentDate, g0Var.paymentDate) && Intrinsics.f(this.encodedValue, g0Var.encodedValue) && Intrinsics.f(this.failureReason, g0Var.failureReason) && Intrinsics.f(this.data, g0Var.data);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final PixQrCodeDecodeStatusDto getStatus() {
        return this.status;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.status.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.paymentDate), 31, this.encodedValue);
        String str = this.failureReason;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        f0 f0Var = this.data;
        return iHashCode + (f0Var != null ? f0Var.hashCode() : 0);
    }
}
