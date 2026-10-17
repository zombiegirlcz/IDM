package c86;

import com.revolut.core.backend_flow.ui.exceptions.BackendFlowNavigationException;
import java.util.concurrent.CopyOnWriteArrayList;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22120b;

    public /* synthetic */ b(String str, int i) {
        this.f22119a = i;
        this.f22120b = str;
    }

    @Override // kfm.a
    public final void run() {
        int i = this.f22119a;
        String str = this.f22120b;
        switch (i) {
            case 0:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "DeviceLockProtectionActivityDelegate", p.a.p("[", str, "] Finished successfully"), null, null, 16);
                break;
            default:
                BackendFlowNavigationException backendFlowNavigationException = new BackendFlowNavigationException(j6.a.q("Deeplink can't be handled: ", str));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, backendFlowNavigationException, h0Var);
                break;
        }
    }
}
