package o9k;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f223301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ skm.l f223302c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d0(j0 j0Var, skm.l lVar, Object obj2, int i) {
        this.f223300a = i;
        this.f223301b = j0Var;
        this.f223302c = lVar;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f223300a) {
            case 0:
                PeerToPeerTransferDescriptor descriptor = (PeerToPeerTransferDescriptor) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                j0.Z2((j0) this.f223301b, this.f223302c, new q8k.l((dj0.d) this.d, descriptor, zBooleanValue));
                break;
            case 1:
                qua.p recurringPayment = (qua.p) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                j0.Z2((j0) this.f223301b, this.f223302c, new q8k.k(((PeerToPeerTransferData) this.d).f102256s, recurringPayment, zBooleanValue2));
                break;
            default:
                Exception exception = (Exception) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                xg0.o oVar = new xg0.o((String) obj3, exception);
                ((oi0.b) this.f223301b).d.k(new xg0.e((Set) this.d, oVar));
                t1.H(this.f223302c, oVar);
                break;
        }
        return Unit.f186387a;
    }

    public d0(oi0.b bVar, Set set, skm.l lVar) {
        this.f223300a = 2;
        this.f223301b = bVar;
        this.d = set;
        this.f223302c = lVar;
    }
}
