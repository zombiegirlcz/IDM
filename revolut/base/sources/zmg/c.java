package zmg;

import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import com.revolut.retail.core.navigation.NaviCommand;
import do3.n;
import efm.h0;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import yui.v;
import zhf.f;
import znc.j;
import znd.k;
import znd.u0;
import zw5.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements kfm.c, o, g, kfm.d, p, yil.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f323509b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f323508a = i;
        this.f323509b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f323508a;
        Object obj3 = this.f323509b;
        switch (i) {
            case 6:
                AnalyticsDetailsController.Companion aVar = AnalyticsDetailsController.INSTANCE;
                ((k) obj3).invoke(obj2);
                break;
            case 9:
                AnalyticsDetailsController.Companion aVar2 = AnalyticsDetailsController.INSTANCE;
                ((k) obj3).invoke(obj2);
                break;
            case 19:
                ((zr8.c) obj3).invoke(obj2);
                break;
            default:
                ((h) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        switch (this.f323508a) {
            case 0:
                zk1.p pVar = (zk1.p) this.f323509b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (n) pVar.invoke(p0, p17);
            case 1:
                zk1.p pVar2 = (zk1.p) this.f323509b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (i) pVar2.invoke(p0, p17);
            default:
                zk1.p pVar3 = (zk1.p) this.f323509b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (n) pVar3.invoke(p0, p17);
        }
    }

    @Override // yil.a
    public String generate() {
        com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.a aVar = (com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.a) this.f323509b;
        String strB = aVar.f106695r.b();
        aVar.f106697t = strB;
        return aVar.f106695r.a(strB);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f323508a;
        Object obj2 = this.f323509b;
        switch (i) {
            case 8:
                AnalyticsDetailsController.Companion aVar = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
            case 12:
            case 13:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 10:
                AnalyticsDetailsController.Companion aVar2 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                AnalyticsDetailsController.Companion aVar3 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((u0) obj2).invoke(p0)).booleanValue();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f323508a;
        Object obj2 = this.f323509b;
        switch (i) {
            case 3:
                AnalyticsDetailsController.Companion aVar = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((zmb.c) obj2).invoke(p0);
            case 4:
                AnalyticsDetailsController.Companion aVar2 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((zmb.c) obj2).invoke(p0);
            case 5:
                AnalyticsDetailsController.Companion aVar3 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((zmb.c) obj2).invoke(p0);
                return "tab_custom";
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                return (dj0.d) ((vgc.b) obj2).invoke(p0);
            case 12:
                AnalyticsDetailsController.Companion aVar4 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((zmb.c) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((u0) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((zr2.o) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((v) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((v) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((f) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((zr2.o) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((zr2.o) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((ztc.b) obj2).invoke(p0);
                return Boolean.TRUE;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((ztc.b) obj2).invoke(p0);
                return Boolean.TRUE;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SecurityHubDestination) ((zr2.o) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((zr2.o) obj2).invoke(p0);
        }
    }

    @Override // kfm.d
    public boolean test(Object p0, Object p17) {
        j jVar = (j) this.f323509b;
        AnalyticsDetailsController.Companion aVar = AnalyticsDetailsController.INSTANCE;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((Boolean) jVar.invoke(p0, p17)).booleanValue();
    }
}
