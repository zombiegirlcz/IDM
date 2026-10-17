package uo7;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreen;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sl7.h;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CarSearchScreen f281571w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CarSearchScreen carSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281571w = carSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f281571w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f281571w, continuation, 1);
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

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CarSearchScreen carSearchScreen = this.f281571w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) carSearchScreen.Z.getValue();
                Intrinsics.h(id10);
                m mVar = (m) iVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                tl7.f.R(mVar.f281582p, R$string.car_insurance_car_search_learn_more_title, R$string.car_insurance_car_search_learn_more_clickable_subtitle_text, u.c(new TextLocalisedClause(R$string.car_insurance_car_search_learn_more_clickable_subtitle_link, null, new Click(30, (Integer) null, (Object) null, "CAR_SEARCH_MANUAL_INPUT_ITEM", false), 10)), null, null, new um7.d(mVar, 9), null, null, Constants.TAG_EMV_L2_CHECKSUM);
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) carSearchScreen.Z.getValue();
                Intrinsics.h(clickData);
                m mVar2 = (m) iVar2;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str = clickData.f275445a;
                int iHashCode = str.hashCode();
                if (iHashCode != -1615159331) {
                    if (iHashCode != 203964622) {
                        if (iHashCode == 2099624445 && str.equals("CAR_SEARCH_PRIVACY_POLICY_ITEM")) {
                            mVar2.C1(h.a.f264158a.b());
                        }
                    } else if (str.equals("CAR_SEARCH_TERMS_OF_BUSINESS_ITEM")) {
                        mVar2.C1(h.c.f264160a.b());
                    }
                } else if (str.equals("CAR_SEARCH_PRIVACY_POLICY_ITEM_AIG")) {
                    mVar2.C1(h.b.f264159a.b());
                }
                break;
        }
        return Unit.f186387a;
    }
}
