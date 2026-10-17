package ha1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.feature.acquiring.card_reader.data.impl.domain.exception.PaymentAuthorizationInProgressException;
import com.revolut.feature.apm.blik.impl.ui.confirmation.InvalidPendingTransactionState;
import efm.h0;
import fa1.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f150364b;

    public /* synthetic */ j(int i, Function1 function1) {
        this.f150363a = i;
        this.f150364b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) throws InvalidPendingTransactionState, PaymentAuthorizationInProgressException {
        switch (this.f150363a) {
            case 2:
                ((h8b.l) this.f150364b).invoke(obj2);
                break;
            case 4:
                ((h8b.l) this.f150364b).invoke(obj2);
                break;
            case 10:
                ((m) this.f150364b).invoke(obj2);
                break;
            case 15:
                ((k) this.f150364b).invoke(obj2);
                break;
            case 18:
                ((k) this.f150364b).invoke(obj2);
                break;
            default:
                ((gqh.a) this.f150364b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f150363a) {
            case 0:
                h8b.l lVar = (h8b.l) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qa1.i) lVar.invoke(p0);
            case 1:
                i iVar = (i) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qa1.g) iVar.invoke(p0);
            case 2:
            case 4:
            case 10:
            case 15:
            case 18:
            case 19:
            default:
                r rVar = (r) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) rVar.invoke(p0);
            case 3:
                i iVar2 = (i) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qa1.g) iVar2.invoke(p0);
            case 5:
                k kVar = (k) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qa1.j) kVar.invoke(p0);
            case 6:
                k kVar2 = (k) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qa1.j) kVar2.invoke(p0);
            case 7:
                k kVar3 = (k) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qa1.j) kVar3.invoke(p0);
            case 8:
                m mVar = (m) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) mVar.invoke(p0);
            case 9:
                i iVar3 = (i) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PairingInfo) iVar3.invoke(p0);
            case 11:
                i iVar4 = (i) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar4.invoke(p0);
            case 12:
                h hVar = (h) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) hVar.invoke(p0);
            case 13:
                h hVar2 = (h) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) hVar2.invoke(p0);
            case 14:
                k kVar4 = (k) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qa1.i) kVar4.invoke(p0);
            case 16:
                q qVar = (q) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) qVar.invoke(p0);
            case 17:
                r rVar2 = (r) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) rVar2.invoke(p0);
            case 20:
                k kVar5 = (k) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) kVar5.invoke(p0);
            case 21:
                r rVar3 = (r) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) rVar3.invoke(p0);
            case 22:
                gwc.h hVar3 = (gwc.h) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) hVar3.invoke(p0);
            case 23:
                gwc.h hVar4 = (gwc.h) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) hVar4.invoke(p0);
            case 24:
                gqh.a aVar = (gqh.a) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) aVar.invoke(p0);
            case 25:
                k kVar6 = (k) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) kVar6.invoke(p0);
            case 26:
                gwc.h hVar5 = (gwc.h) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) hVar5.invoke(p0);
            case 27:
                k kVar7 = (k) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) kVar7.invoke(p0);
            case 28:
                q qVar2 = (q) this.f150364b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) qVar2.invoke(p0);
        }
    }
}
