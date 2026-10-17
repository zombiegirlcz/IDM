package yc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.selfserve.core.R$string;
import dsh.o;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.i7;
import yzc.v;
import z28.x;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f312557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f312558c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj2, int i, Object obj3, Object obj4) {
        this.f312556a = i;
        this.f312558c = obj2;
        this.f312557b = obj3;
        this.d = obj4;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f312556a) {
            case 0:
                m mVar = (m) this.f312558c;
                BaseDraggableWidgetDelegate.a aVar = (BaseDraggableWidgetDelegate.a) this.f312557b;
                mVar.f312563c.a(new o((HomeFeedWidgetContext.Personal) this.d, ((q0) aVar).f55476b));
                break;
            case 1:
                yi5.l lVar = (yi5.l) this.f312558c;
                BaseDraggableWidgetDelegate.a aVar2 = (BaseDraggableWidgetDelegate.a) this.f312557b;
                lVar.f314259c.a(new o((CryptoWidgetContext) this.d, ((q0) aVar2).f55476b));
                break;
            case 2:
                ypb.e eVar = (ypb.e) this.f312558c;
                BaseDraggableWidgetDelegate.a aVar3 = (BaseDraggableWidgetDelegate.a) this.f312557b;
                eVar.f315809a.a(new o((HomeFeedWidgetContext.Savings) this.d, ((q0) aVar3).f55476b));
                break;
            case 3:
                ys5.f fVar = (ys5.f) this.f312558c;
                a3 a3Var = (a3) this.f312557b;
                i7 i7Var = (i7) this.d;
                sr5.a aVar4 = fVar.f316404a;
                pu5.e eVar2 = fVar.f316405b;
                Intrinsics.h(i7Var);
                aVar4.a(eVar2.a(a3Var, i7Var, ""));
                break;
            case 4:
                v vVar = (v) this.f312558c;
                swl.a.t(vVar.k, uc0.b.g(R$string.sot_document_list_media_picker_title, vVar.f318088l), new yrk.e(vVar, 10, (yzc.f) this.f312557b, (gzc.a) this.d));
                break;
            case 5:
                x xVar = (x) this.f312558c;
                BaseDraggableWidgetDelegate.a aVar5 = (BaseDraggableWidgetDelegate.a) this.f312557b;
                xVar.f.a(new o((InvestWidgetContext) this.d, ((q0) aVar5).f55476b));
                break;
            default:
                zpb.e eVar3 = (zpb.e) this.f312558c;
                BaseDraggableWidgetDelegate.a aVar6 = (BaseDraggableWidgetDelegate.a) this.f312557b;
                eVar3.i.a(new o((HomeFeedWidgetContext.Savings) this.d, ((q0) aVar6).f55476b));
                break;
        }
    }
}
