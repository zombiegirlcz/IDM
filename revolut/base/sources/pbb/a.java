package pbb;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import e4m.e;
import kbb.r;
import rg0.d;
import vc.s;
import vxc.l;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234672a;

    public /* synthetic */ a(int i) {
        this.f234672a = i;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f234672a) {
            case 0:
                return new r();
            case 1:
                nf.a aVarE = nf.a.e();
                s.k(aVarE);
                return aVarE;
            case 2:
                RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
                s.k(remoteConfigManager);
                return remoteConfigManager;
            case 3:
                SessionManager sessionManager = SessionManager.getInstance();
                s.k(sessionManager);
                return sessionManager;
            case 4:
                return new uz9.a();
            case 5:
                return new p1k.b();
            case 6:
                return new d();
            case 7:
                return new nh8.a();
            case 8:
                return new qli.c();
            case 9:
                return new tp.a();
            case 10:
                return new orh.a();
            case 11:
                return new com.revolut.feature.card_screen.impl.prompts.b();
            case 12:
                return new uoi.b();
            case 13:
                return new uq.a();
            case 14:
                return new xr2.b();
            case 15:
                return new hcf.c();
            case 16:
                return new td9.b();
            case 17:
                return new vgi.b();
            case 18:
                return new vsg.a();
            case 19:
                return new l();
            case 20:
                return v8k.l.a();
            case 21:
                return new wfa.b();
            case 22:
                return new tgi.a();
            case 23:
                return new wwc.c();
            case 24:
                return new ufa.a();
            case 25:
                return ddh.a.a();
            case 26:
                return new xtf.a();
            case 27:
                return new byj.a();
            case 28:
                return new com.revolut.feature.card_screen.impl.kompot.cards_list.a();
            default:
                return new fp5.a();
        }
    }
}
