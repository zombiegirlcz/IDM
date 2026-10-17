package r15;

import android.content.Intent;
import android.net.Uri;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.legacy.FinancialDifficultiesScreen;
import com.revolut.kompot.common.ExternalDestination;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import qu4.s;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FinancialDifficultiesScreen f250903w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FinancialDifficultiesScreen financialDifficultiesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f250903w = financialDifficultiesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f250903w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f250903w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FinancialDifficultiesScreen financialDifficultiesScreen = this.f250903w;
        switch (i) {
            case 0:
                x10 clickData = (x10) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar = (i) financialDifficultiesScreen.f70007a0.getValue();
                Intrinsics.h(clickData);
                n nVar = (n) iVar;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                nVar.n2(new s(nVar, clickData, null, 17), new whi.b(6));
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar2 = (i) financialDifficultiesScreen.f70007a0.getValue();
                Intrinsics.h(clickData2);
                n nVar2 = (n) iVar2;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                String str = clickData2.f275445a;
                Continuation continuation = null;
                if (a0.H(str, "tel:", false)) {
                    nVar2.C1(new ExternalDestination.ByIntent(new Intent("android.intent.action.DIAL", Uri.parse(str)), null));
                } else if (str.contentEquals("ID_CLICK_CONTACT_US")) {
                    nVar2.y2();
                } else if (a0.H(str, "https://", false) || a0.H(str, "http://", false)) {
                    nVar2.C1(new ExternalDestination.ByIntent(new Intent("android.intent.action.VIEW", Uri.parse(str)), null));
                } else {
                    nVar2.n2(new qd8.e(nVar2, clickData2, str, continuation, 18), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
