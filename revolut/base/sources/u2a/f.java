package u2a;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import pfm.h;
import qz0.j;
import qz0.n;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ CoroutineScope v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f276591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ P2pPersonalisation f276592x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineScope coroutineScope, g gVar, P2pPersonalisation p2pPersonalisation, Continuation continuation) {
        super(1, continuation);
        this.v = coroutineScope;
        this.f276591w = gVar;
        this.f276592x = p2pPersonalisation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f276591w, this.f276592x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        P2pPersonalisation p2pPersonalisation = this.f276592x;
        g gVar = this.f276591w;
        try {
            if (i == 0) {
                o.b(obj2);
                m.Companion companion = m.INSTANCE;
                n nVar = gVar.f276594q;
                UrlImage urlImage = new UrlImage(p2pPersonalisation.f79970b.getF79976c(), null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                qz0.i iVar = j.Companion;
                h hVarF = nVar.f(urlImage, true, -1, -1);
                this.u = 1;
                if (nim.a.a(hVarF, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = Unit.f186387a;
            m.Companion companion2 = m.INSTANCE;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
        }
        gVar.C2(new g2a.e(p2pPersonalisation));
        return Unit.f186387a;
    }
}
