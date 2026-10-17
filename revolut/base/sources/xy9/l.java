package xy9;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ApmDescriptor f309663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SendFromClipboardType.PixType f309664x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f309665y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, ApmDescriptor apmDescriptor, SendFromClipboardType.PixType pixType, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
        this.f309663w = apmDescriptor;
        this.f309664x = pixType;
        this.f309665y = valid;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f309663w, this.f309664x, this.f309665y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        o oVar = this.v;
        i8a.a aVar = oVar.f309674p;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            f8a.b bVar = oVar.u;
            this.u = 1;
            obj2 = ((vca.d) bVar).a(this.f309663w, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        g8a.g gVar = (g8a.g) obj2;
        Continuation continuation = null;
        if (gVar instanceof g8a.c) {
            oVar.A2(new PixTransferNavigation$Destination(new PixTransferNavigation$InputData.ApmTransfer(((g8a.c) gVar).f141301a, (hrf.f) null, 6)));
            return Unit.f186387a;
        }
        if (gVar instanceof g8a.e) {
            yji.n.j2(oVar, oVar.L2(((uca.c) aVar).e()), null, null, 7);
            return Unit.f186387a;
        }
        if (gVar instanceof g8a.f) {
            yji.n.j2(oVar, oVar.L2(((uca.c) aVar).d()), null, new wo2.l((g8a.f) gVar, oVar, continuation, 19), 3);
            return Unit.f186387a;
        }
        if (!(gVar instanceof g8a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        oVar.b3(((g8a.d) gVar).f141302a, this.f309664x, this.f309665y);
        return Boolean.TRUE;
    }
}
