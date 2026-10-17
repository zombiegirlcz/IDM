package gcg;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyPreview;
import com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ VoucherSmallTileDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f142439w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(VoucherSmallTileDelegate.Model model, e0 e0Var, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f142439w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d0(this.v, this.f142439w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = this.v.f53623w;
            boolean z = obj3 instanceof lcg.a;
            Continuation continuation = null;
            e0 e0Var = this.f142439w;
            if (z) {
                e0Var.l2(new ga9.v(e0Var, (lcg.a) obj3, (Continuation) null, 15), new yi5.b(26));
            } else if (obj3 instanceof jcg.f) {
                g37.z zVar = new g37.z(e0Var, obj3, continuation, 26);
                this.u = 1;
                if (e0Var.p2(this, zVar) == aVar) {
                    return aVar;
                }
            } else if (obj3 instanceof wfi.a) {
                wfi.a aVar2 = (wfi.a) obj3;
                e0Var.C2(new n(new HotelsPropertyInputData.BookablePreview(new HotelsPropertyPreview(aVar2.f297148a, aVar2.d), (LocalDate) null, (LocalDate) null, (List) null, 30)));
            } else if (obj3 instanceof NavigableTravelHotelsDropoff) {
                e0Var.C2(new p((NavigableTravelHotelsDropoff) obj3));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
