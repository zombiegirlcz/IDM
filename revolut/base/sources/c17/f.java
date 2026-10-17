package c17;

import c17.i;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FreelancerWebsiteScreen f20387w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(FreelancerWebsiteScreen freelancerWebsiteScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f20387w = freelancerWebsiteScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f20387w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f20387w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerWebsiteScreen freelancerWebsiteScreen = this.f20387w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = freelancerWebsiteScreen.R2();
                Intrinsics.h(clickData);
                s sVar = (s) jVarE3;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "ITEM_ID_SUBTITLE_LEARN_MORE")) {
                    j60.a aVar2 = sVar.f20406p;
                    sVar.o.getClass();
                    List listK = v.k("mobile/freelancer/website/facebook", "mobile/freelancer/website/instagram", "mobile/freelancer/website/linkedin", "mobile/freelancer/website/amazon", "mobile/freelancer/website/ebay", "mobile/freelancer/website/fiverr", "mobile/freelancer/website/google", "mobile/freelancer/website/booking");
                    ArrayList arrayList = new ArrayList(w.t(listK, 10));
                    int i2 = 0;
                    for (Object obj3 : listK) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            v.s();
                            throw null;
                        }
                        arrayList.add(new IconDelegate.Model(a0.d.n("ITEM_ID_BOTTOM_DIALOG_SOCIAL_PAGE_PREFIX_", i2), new CdnImage("icon", (String) obj3, null, null, null, null, Constants.TAG_FC_SPEED_MODE), null, null, 124));
                        i2 = i3;
                    }
                    xk xkVar = new xk("ITEM_ID_BOTTOM_DIALOG_SOCIAL_PAGES_GRID", arrayList, 4, null, null, 56);
                    yp0.b.l(xkVar, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ITEM_ID_BOTTOM_DIALOG_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
                    int i5 = R$attr.uikit_dp16;
                    yp0.b.r(model, i5, i5, 0, 0, 12);
                    qv0.i[] elements = {xkVar, model, null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    aVar2.x(new y(kotlin.collections.d.L(elements), new rp0.t(new TextLocalisedClause(R$string.freelancer_business_website_explainer_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_business_website_explainer_subtitle, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                }
                return Unit.f186387a;
            default:
                String listId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = freelancerWebsiteScreen.R2();
                Intrinsics.h(listId);
                s sVar2 = (s) jVarE32;
                sVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "ITEM_ID_MENU_SKIP")) {
                    sVar2.C2(i.a.f20391a);
                }
                return Unit.f186387a;
        }
    }
}
