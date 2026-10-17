package hve;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.checkout.models.PreorderResult;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;
import java.util.ArrayList;
import kl7.f1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import ll7.u;
import pie.s;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u = 2;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f155835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f155836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f155837y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(akg.n nVar, FlowCollector flowCollector, xi0.b bVar, k18.c cVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f155836x = nVar;
        this.z = flowCollector;
        this.A = bVar;
        this.B = cVar;
        this.f155835w = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hve.i.b(java.lang.Object):java.lang.Object");
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i((o) this.z, (TopUpMethodsContext) this.A, this.f155835w, (CheckoutContext) this.B, continuation);
                iVar.f155837y = obj2;
                return iVar;
            case 1:
                return new i((u) this.f155836x, (String) this.f155837y, (String) this.z, (f1) this.A, this.f155835w, (ArrayList) this.B, continuation);
            case 2:
                i iVar2 = new i((akg.n) this.f155836x, (FlowCollector) this.z, (xi0.b) this.A, (k18.c) this.B, this.f155835w, continuation);
                iVar2.f155837y = obj2;
                return iVar2;
            case 3:
                i iVar3 = new i((sn.a) this.A, (View) this.B, this.f155835w, continuation);
                iVar3.f155837y = obj2;
                return iVar3;
            case 4:
                return new i((com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f155837y, (f0) this.z, (n93.f) this.A, this.f155835w, (ArrayList) this.B, continuation);
            case 5:
                return new i((wh3.i) this.f155836x, (CheckoutParams) this.f155837y, (AnalyticsProduct) this.z, (NaviCommand) this.A, (PreorderResult) this.B, this.f155835w, continuation);
            default:
                i iVar4 = new i((xge.g) this.f155836x, (ProductSpaceIdentifier) this.z, (s) this.A, this.f155835w, (sfe.a) this.B, continuation);
                iVar4.f155837y = obj2;
                return iVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0889, code lost:
    
        if (skm.k0.b(100, r51) != r5) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x09d0 A[Catch: Exception -> 0x0974, TryCatch #0 {Exception -> 0x0974, blocks: (B:187:0x096f, B:190:0x0978, B:215:0x0a21, B:193:0x0983, B:212:0x09f6, B:194:0x0987, B:205:0x09ca, B:207:0x09d0, B:202:0x09bd), top: B:223:0x095b }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06b0  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0889 -> B:122:0x07b7). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hve.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, f0 f0Var, n93.f fVar, boolean z, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f155837y = gVar;
        this.z = f0Var;
        this.A = fVar;
        this.f155835w = z;
        this.B = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, TopUpMethodsContext topUpMethodsContext, boolean z, CheckoutContext checkoutContext, Continuation continuation) {
        super(2, continuation);
        this.z = oVar;
        this.A = topUpMethodsContext;
        this.f155835w = z;
        this.B = checkoutContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar, String str, String str2, f1 f1Var, boolean z, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f155836x = uVar;
        this.f155837y = str;
        this.z = str2;
        this.A = f1Var;
        this.f155835w = z;
        this.B = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sn.a aVar, View view, boolean z, Continuation continuation) {
        super(2, continuation);
        this.A = aVar;
        this.B = view;
        this.f155835w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wh3.i iVar, CheckoutParams checkoutParams, AnalyticsProduct analyticsProduct, NaviCommand naviCommand, PreorderResult preorderResult, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f155836x = iVar;
        this.f155837y = checkoutParams;
        this.z = analyticsProduct;
        this.A = naviCommand;
        this.B = preorderResult;
        this.f155835w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xge.g gVar, ProductSpaceIdentifier productSpaceIdentifier, s sVar, boolean z, sfe.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f155836x = gVar;
        this.z = productSpaceIdentifier;
        this.A = sVar;
        this.f155835w = z;
        this.B = aVar;
    }
}
