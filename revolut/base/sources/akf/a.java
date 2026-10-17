package akf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.adjust_analytics.api.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import tof.a3;
import tof.t4;
import tof.v4;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function3 {
    public /* synthetic */ a3 u;
    public /* synthetic */ klf.j1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f5812w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(3, continuation);
        this.f5812w = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = new a(this.f5812w, (Continuation) obj4);
        aVar.u = (a3) obj2;
        aVar.v = (klf.j1) obj3;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a3 a3Var = this.u;
        klf.j1 j1Var = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        rhf.d dVar = this.f5812w.f5820n;
        boolean zB = j1Var.b();
        List listC = null;
        if (dVar == rhf.d.ANALYTICS && k71.k.j(a3Var)) {
            v4 v4Var = a3Var.u;
            if (!Intrinsics.f(v4Var != null ? Boolean.valueOf(v4Var instanceof t4) : null, Boolean.TRUE) && !zB && !d9.e1.B(a3Var) && !k71.k.q0(a3Var) && !k71.k.P0(a3Var) && (!k71.k.N0(a3Var) || !k71.k.h(a3Var))) {
                u1 u1Var = v1.Companion;
                t1 t1Var = t1.ADJUST_ANALYTICS;
                u1Var.getClass();
                boolean z = false;
                e4 e4Var = null;
                Clause clause = null;
                listC = zhm.u.c(new ActionsView.Item(u1.a(t1Var), mx0.d.SEMIACCENT, z, e4Var, clause, new TextLocalisedClause(R$string.analytics_adjust_amount_action_adjust_for_analytics, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668));
            }
        }
        return listC == null ? zhm.f0.f322471a : listC;
    }
}
