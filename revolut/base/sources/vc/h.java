package vc;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends pc.d implements wc.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f287585b;
    public final /* synthetic */ i e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, TaskCompletionSource taskCompletionSource, int i) {
        super(1);
        this.f = i;
        this.e = iVar;
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        this.f287585b = taskCompletionSource;
    }

    @Override // wc.j
    public void a(Bundle bundle) {
        switch (this.f) {
            case 0:
                l(bundle);
                this.f287585b.trySetResult(null);
                break;
            default:
                l(bundle);
                break;
        }
    }

    @Override // wc.j
    public void g(Bundle bundle) {
        switch (this.f) {
            case 1:
                m(bundle);
                this.f287585b.trySetResult(null);
                break;
            default:
                m(bundle);
                break;
        }
    }

    @Override // wc.j
    public void j(int i, Bundle bundle) {
        switch (this.f) {
            case 2:
                n(i, bundle);
                this.f287585b.trySetResult(Integer.valueOf(i));
                break;
            default:
                n(i, bundle);
                break;
        }
    }

    public final void l(Bundle bundle) {
        this.e.f287588b.c(this.f287585b);
        i.f287586c.e("onDeferredInstall", new Object[0]);
    }

    public final void m(Bundle bundle) {
        this.e.f287588b.c(this.f287585b);
        i.f287586c.e("onDeferredUninstall", new Object[0]);
    }

    public final void n(int i, Bundle bundle) {
        this.e.f287588b.c(this.f287585b);
        i.f287586c.e("onStartInstall(%d)", Integer.valueOf(i));
    }
}
