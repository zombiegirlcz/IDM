package hyb;

import a0.d;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import eub.j;
import hul.f0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.s0;
import m1c.u0;
import m1c.v0;
import nyb.u;
import nyb.v;
import t38.e;
import vkm.q;
import vkm.v1;
import vkm.y;
import vkm.z1;
import yji.n;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends n implements bub.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f156774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z1 f156775m;

    public c(j revPointsOptInPlacementsInteractor) {
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementsInteractor, "revPointsOptInPlacementsInteractor");
        this.f156774l = revPointsOptInPlacementsInteractor;
        this.f156775m = q.b(0, 6, null);
    }

    public static void Z2(t tVar, Function1 function1) {
        Object obj2 = tVar.f54722b.f51596l;
        s0 s0Var = obj2 instanceof s0 ? (s0) obj2 : null;
        if (s0Var != null) {
            function1.invoke(s0Var);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(d.m(tVar.f54722b.f51596l, "Unexpected ActionWidgetDelegateClickData parcel: "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final e b3(v0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        v vVar = (v) this.f156774l;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Continuation continuation = null;
        v1 v1Var = new v1(new nyb.t(vVar, type, null));
        u uVar = new u(3, null);
        h0 h0Var = h0.f322473a;
        return new e(rd0.e.n(rd0.e.e(v1Var, h0Var, uVar), h0Var), 24, new y(new g2d.c(2, 12, continuation), this.f156775m), new hwi.b(3, 8, continuation));
    }

    public final boolean c3(t clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (!Intrinsics.f(clickData.f54722b.f51590a, "OPT_IN_PLACEMENT_BANNER_LIST_ID")) {
            return false;
        }
        ActionWidgetDelegate.a aVar = clickData.f54721a;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a)) {
            this.f156775m.k(u0.a.f201459a);
            final int i = 0;
            Z2(clickData, new Function1(this) { // from class: hyb.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f156773b;

                {
                    this.f156773b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    s0 bannerContent = (s0) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(bannerContent, "bannerContent");
                            c cVar = this.f156773b;
                            cVar.T2(new f0(cVar, bannerContent, null, 20), new yi5.b(27));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(bannerContent, "bannerContent");
                            c cVar2 = this.f156773b;
                            cVar2.V2(new b(cVar2, bannerContent, null), new yi5.b(29));
                            break;
                    }
                    return Unit.f186387a;
                }
            });
            return true;
        }
        if (!Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
            return false;
        }
        final int i2 = 1;
        Z2(clickData, new Function1(this) { // from class: hyb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f156773b;

            {
                this.f156773b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                s0 bannerContent = (s0) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(bannerContent, "bannerContent");
                        c cVar = this.f156773b;
                        cVar.T2(new f0(cVar, bannerContent, null, 20), new yi5.b(27));
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bannerContent, "bannerContent");
                        c cVar2 = this.f156773b;
                        cVar2.V2(new b(cVar2, bannerContent, null), new yi5.b(29));
                        break;
                }
                return Unit.f186387a;
            }
        });
        return true;
    }
}
