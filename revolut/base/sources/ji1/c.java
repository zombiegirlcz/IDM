package ji1;

import cli.y;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreen;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddressSearchScreen f174322w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AddressSearchScreen addressSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f174322w = addressSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f174322w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f174322w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddressSearchScreen addressSearchScreen = this.f174322w;
        switch (i) {
            case 0:
                String text = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVar = (f) addressSearchScreen.S.getValue();
                Intrinsics.h(text);
                com.revolut.feature.address.common.impl.flow.screen.find.b bVar = (com.revolut.feature.address.common.impl.flow.screen.find.b) fVar;
                y yVar = bVar.u;
                Intrinsics.checkNotNullParameter(text, "query");
                if (d0.W(text)) {
                    bVar.H2(yVar, new jhi.a(6));
                } else if (text.length() < 3) {
                    bVar.H2(yVar, new jhi.a(7));
                } else {
                    AddressSearchScreenContract$InputData addressSearchScreenContract$InputData = bVar.f61017q;
                    a2 a2Var = bVar.f61020t;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    a2 a2Var2 = bVar.f61019s;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    wi0.a aVar2 = wi0.b.Companion;
                    String str = addressSearchScreenContract$InputData.f61009a;
                    aVar2.getClass();
                    if (!com.bumptech.glide.d.t(wi0.a.a(str)) || bVar.f61016p.a(text, wi0.b.X0)) {
                        rh1.b bVar2 = bVar.o;
                        String country = addressSearchScreenContract$InputData.f61009a;
                        String strI2 = bVar.I2();
                        lj1.a aVar3 = (lj1.a) bVar2;
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(country, "country");
                        Intrinsics.checkNotNullParameter(text, "query");
                        zi1.d dVar = aVar3.f195590b;
                        Intrinsics.checkNotNullParameter(text, "searchString");
                        Intrinsics.checkNotNullParameter(country, "countryCode");
                        cj1.c cVar = dVar.f322493b;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(text, "text");
                        Intrinsics.checkNotNullParameter(country, "country");
                        bVar.f61019s = yji.l.a1(bVar, cVar.f24580b.b(new cj1.a(text, country, strI2), w4l.h.f294642c), new hp4.e(2, bVar, com.revolut.feature.address.common.impl.flow.screen.find.b.class, "doOnError", "doOnError(Ljava/lang/Throwable;)Z", 4, 28), null, new im9.h(bVar, text, (Continuation) null, 7), 2);
                    } else {
                        bVar.H2(yVar, new jhi.a(9));
                    }
                }
                break;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVar2 = (f) addressSearchScreen.S.getValue();
                String id10 = aVar4.f275445a;
                com.revolut.feature.address.common.impl.flow.screen.find.b bVar3 = (com.revolut.feature.address.common.impl.flow.screen.find.b) fVar2;
                y yVar2 = bVar3.u;
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "NO_RESULT_ITEM_CLICK_ID")) {
                    bVar3.C2(new th1.b(((e) ((j2) yVar2.f22677a).getValue()).f174325c));
                } else if (Intrinsics.f(id10, "LOCATION_NO_RESULTS_ITEM_ID")) {
                    bVar3.H2(yVar2, new jhi.a(3));
                }
                break;
        }
        return Unit.f186387a;
    }
}
