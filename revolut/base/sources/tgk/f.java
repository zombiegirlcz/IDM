package tgk;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptPresentAction;
import gim.i;
import igk.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pi3.h;
import th6.b0;
import tjh.h0;
import tk9.j;
import tmb.l;
import tna.r;
import tqh.k;
import xjg.m;
import yji.n;
import zh9.y;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f271196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f271197x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f271196w = obj2;
        this.f271197x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a) this.f271196w, (d0) this.f271197x, continuation, 0);
            case 1:
                return new f((com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a) this.f271196w, (h) this.f271197x, continuation, 1);
            case 2:
                return new f((com.revolut.feature.apm.wero.impl.ui.flow.b) this.f271196w, (sh2.a) this.f271197x, continuation, 2);
            case 3:
                return new f((th6.h) this.f271196w, (lg6.a) this.f271197x, continuation, 3);
            case 4:
                return new f((b0) this.f271196w, (tg6.b) this.f271197x, continuation, 4);
            case 5:
                return new f((h0) this.f271196w, (String) this.f271197x, continuation, 5);
            case 6:
                f fVar = new f((h0) this.f271197x, continuation, 6);
                fVar.f271196w = obj2;
                return fVar;
            case 7:
                return new f((h0) this.f271196w, (List) this.f271197x, continuation, 7);
            case 8:
                return new f((h0) this.f271196w, (bih.e) this.f271197x, continuation, 8);
            case 9:
                return new f((h0) this.f271196w, (bih.f) this.f271197x, continuation, 9);
            case 10:
                return new f((h0) this.f271196w, (bih.d) this.f271197x, continuation, 10);
            case 11:
                return new f((h0) this.f271196w, (ty0.a) this.f271197x, continuation, 11);
            case 12:
                return new f((h0) this.f271196w, (WealthAction) this.f271197x, continuation, 12);
            case 13:
                return new f((j) this.f271196w, (y) this.f271197x, continuation, 13);
            case 14:
                return new f((j) this.f271196w, (bi9.f) this.f271197x, continuation, 14);
            case 15:
                f fVar2 = new f((tkb.c) this.f271197x, continuation, 15);
                fVar2.f271196w = obj2;
                return fVar2;
            case 16:
                return new f((xo9.h) this.f271196w, (tl1.c) this.f271197x, continuation, 16);
            case 17:
                return new f((l) this.f271196w, (tmb.h) this.f271197x, continuation, 17);
            case 18:
                return new f((tmk.i) this.f271196w, (PlanOfferPromptPresentAction) this.f271197x, continuation, 18);
            case 19:
                return new f((r) this.f271196w, (ColorThemeOption) this.f271197x, continuation, 19);
            case 20:
                return new f((r) this.f271196w, (GlobalThemeDeclaration) this.f271197x, continuation, 20);
            case 21:
                return new f((r) this.f271196w, (m) this.f271197x, continuation, 21);
            case 22:
                return new f((tne.g) this.f271196w, (dj0.d) this.f271197x, continuation, 22);
            case 23:
                return new f((com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b) this.f271196w, (String) this.f271197x, continuation, 23);
            case 24:
                return new f((tok.h) this.f271196w, (String) this.f271197x, continuation, 24);
            case 25:
                return new f((com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a) this.f271196w, (String) this.f271197x, continuation, 25);
            case 26:
                return new f((com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a) this.f271196w, (t61.g) this.f271197x, continuation, 26);
            case 27:
                return new f((tp6.g) this.f271196w, (yo6.e) this.f271197x, continuation, 27);
            case 28:
                return new f((com.revolut.feature.wealth_discovery.impl.screener.screens.collection.a) this.f271196w, (ty0.a) this.f271197x, continuation, 28);
            default:
                return new f((vkm.d) this.f271196w, (k) this.f271197x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:422:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tgk.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f271197x = nVar;
    }
}
