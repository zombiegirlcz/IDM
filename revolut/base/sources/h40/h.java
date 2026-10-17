package h40;

import com.revolut.chat.ui.archive.ArchiveScreen;
import ip0.xc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArchiveScreen f149262w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ArchiveScreen archiveScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149262w = archiveScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f149262w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f149262w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((xc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArchiveScreen archiveScreen = this.f149262w;
        switch (i) {
            case 0:
                xc xcVar = (xc) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE3 = archiveScreen.e3();
                n nVar = (n) bVarE3;
                nVar.I2(xcVar.f, xcVar.f167122a);
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE32 = archiveScreen.e3();
                n nVar2 = (n) bVarE32;
                nVar2.I2(aVar2.d, aVar2.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
