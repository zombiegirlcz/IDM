package r2d;

import c2d.m0;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import java.util.List;
import java.util.Set;
import jid.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.i implements Function3 {
    public final /* synthetic */ String A;
    public final /* synthetic */ int B;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f251093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f251094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AlertsWidgetContext f251095y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Continuation continuation, c cVar, AlertsWidgetContext alertsWidgetContext, int i, String str, int i2) {
        super(3, continuation);
        this.f251094x = cVar;
        this.f251095y = alertsWidgetContext;
        this.z = i;
        this.A = str;
        this.B = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = new a((Continuation) obj4, this.f251094x, this.f251095y, this.z, this.A, this.B);
        aVar.v = (FlowCollector) obj2;
        aVar.f251093w = obj3;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector;
        Flow flowS;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector2 = this.v;
            if (((Boolean) this.f251093w).booleanValue()) {
                c cVar = this.f251094x;
                z zVar = cVar.f251097b;
                AlertsWidgetContext alertsWidgetContext = this.f251095y;
                Set assetsToShow = alertsWidgetContext.f86005a;
                Set set = alertsWidgetContext.f86006b;
                boolean z = alertsWidgetContext.f86007c;
                AssetIdWithSymbol assetIdWithSymbol = alertsWidgetContext.d;
                boolean z3 = alertsWidgetContext.f;
                boolean z4 = alertsWidgetContext.f86008g;
                String str = alertsWidgetContext.f86009h;
                List alertStates = alertsWidgetContext.i;
                o1d.f seeAllLabelPolicy = alertsWidgetContext.f86010j;
                boolean z6 = alertsWidgetContext.k;
                boolean z11 = alertsWidgetContext.f86011l;
                boolean z12 = alertsWidgetContext.f86012m;
                Intrinsics.checkNotNullParameter(assetsToShow, "assetsToShow");
                Intrinsics.checkNotNullParameter(alertStates, "alertStates");
                Intrinsics.checkNotNullParameter(seeAllLabelPolicy, "seeAllLabelPolicy");
                AlertsWidgetContext widgetContext = new AlertsWidgetContext(assetsToShow, set, z, assetIdWithSymbol, this.z, z3, z4, str, alertStates, seeAllLabelPolicy, z6, z11, z12);
                Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
                p pVar = (p) zVar.f174462c;
                Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
                sfm.b bVar = new sfm.b(pVar.a(widgetContext), new r25.c(5, new l(pVar, 0)), 2);
                Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                efm.r map = bVar.filter(new r25.c(3, new d(0))).map(new r25.c(4, new r10.b(zVar, widgetContext, 21)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                flowS = new m0(rd0.e.b(map), cVar, this.A, this.B, 6);
                flowCollector = null;
            } else {
                flowCollector = null;
                flowS = org.bouncycastle.jcajce.provider.digest.a.s(3, null);
            }
            this.v = flowCollector;
            this.f251093w = flowCollector;
            this.u = 1;
            if (vkm.q.u(flowCollector2, flowS, this) == aVar) {
                return aVar;
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
