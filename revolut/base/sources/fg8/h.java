package fg8;

import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.junior_coparent.api.navigation.CoparentFeatureConfig$ConfirmCoparent;
import com.revolut.retail.core.navigation.FinishCommand;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f134934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f134935c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.f134933a = i;
        this.f134935c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f134934b = z;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f134933a) {
            case 0:
                jf0.c cVar = (jf0.c) this.f134935c;
                String str = (String) this.d;
                m mVar = (m) this.e;
                HashMap map = cVar.d;
                String str2 = (String) map.get("guardianFirstName");
                String str3 = (String) map.get("guardianLastName");
                String str4 = (String) map.get("youthFirstName");
                if (str2 == null || str3 == null || str4 == null) {
                    throw new IllegalArgumentException("No enough information about parent and child names");
                }
                mVar.g(m.m(u0.f(new CoparentFeatureConfig$ConfirmCoparent(new vd8.f(str, str2, str3, str4))), this.f134934b));
                return;
            case 1:
                qc7.h hVar = (qc7.h) this.f134935c;
                h93.f0 f0Var = (h93.f0) this.d;
                hVar.d.b(new fc7.d(new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(f0Var.f150110a, 4, f0Var.d() && this.f134934b && ngm.n.p(((yt8.c) this.e).f316662a), false), n63.a.ZoomWidgets, 15)));
                return;
            default:
                up5.g0 g0Var = (up5.g0) this.f134935c;
                up5.d step = (up5.d) this.d;
                xi0.b bVar = (xi0.b) this.e;
                up5.a0 a0Var = (up5.a0) g0Var.f281892a;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(step, "step");
                ((up5.e) a0Var.f281852b).D0().set(step);
                g0Var.f281893b.b(com.revolut.retail.core.navigation.a.c(g0Var.b(step, bVar, this.f134934b), new FinishCommand(null, null, null, 7)));
                return;
        }
    }

    public /* synthetic */ h(qc7.h hVar, h93.f0 f0Var, boolean z, yt8.c cVar) {
        this.f134933a = 1;
        this.f134935c = hVar;
        this.d = f0Var;
        this.f134934b = z;
        this.e = cVar;
    }
}
