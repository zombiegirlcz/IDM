package ab4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreen;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import dx4.t0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ESignDocumentsScreen f2872w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ESignDocumentsScreen eSignDocumentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2872w = eSignDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f2872w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f2872w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f2872w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((wu3.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((t0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ESignDocumentsScreen eSignDocumentsScreen = this.f2872w;
        switch (i) {
            case 0:
                wu3.g term = (wu3.g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE3 = eSignDocumentsScreen.e3();
                sVarE3.getClass();
                Intrinsics.checkNotNullParameter(term, "term");
                sVarE3.C2(new l(term));
                break;
            case 1:
                t0 clickedItem = (t0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE32 = eSignDocumentsScreen.e3();
                sVarE32.getClass();
                Intrinsics.checkNotNullParameter(clickedItem, "clickedItem");
                sVarE32.H2(sVarE32.f2889r, new p(clickedItem, 0));
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE33 = eSignDocumentsScreen.e3();
                String url2 = aVar3.f275445a;
                String title = aVar3.f275446b;
                sVarE33.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                Intrinsics.checkNotNullParameter(title, "title");
                sVarE33.C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(url2, new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, true, true, true, 64924))));
                break;
        }
        return Unit.f186387a;
    }
}
