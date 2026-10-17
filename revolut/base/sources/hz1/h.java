package hz1;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lhz1/h;", "", "", "toString", "()Ljava/lang/String;", "Lt02/d;", "a", "Lt02/d;", "getSource", "()Lt02/d;", "source", "b", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "Ljo3/a;", "c", "Ljo3/a;", "getTransferAmount", "()Ljo3/a;", "transferAmount", "Lr02/b;", "d", "Lr02/b;", "getApmDestinationDto", "()Lr02/b;", "apmDestinationDto", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final t02.d source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferAmount")
    @NotNull
    private final jo3.a transferAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("destination")
    private final r02.b apmDestinationDto;

    public h(t02.d source, String paymentMethod, jo3.a transferAmount, r02.b bVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(transferAmount, "transferAmount");
        this.source = source;
        this.paymentMethod = paymentMethod;
        this.transferAmount = transferAmount;
        this.apmDestinationDto = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.source, hVar.source) && Intrinsics.f(this.paymentMethod, hVar.paymentMethod) && Intrinsics.f(this.transferAmount, hVar.transferAmount) && Intrinsics.f(this.apmDestinationDto, hVar.apmDestinationDto);
    }

    public final int hashCode() {
        int iJ = v7.j(this.transferAmount, p.a.c(this.source.hashCode() * 31, 31, this.paymentMethod), 31);
        r02.b bVar = this.apmDestinationDto;
        return iJ + (bVar == null ? 0 : bVar.hashCode());
    }
}
