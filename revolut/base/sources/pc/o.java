package pc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import defpackage.i0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class o extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f234768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f234769c;

    public o(i0 i0Var, IBinder iBinder) {
        this.f234769c = i0Var;
        this.f234768b = iBinder;
    }

    @Override // pc.l
    public final void a() {
        h fVar;
        p pVar = (p) this.f234769c.f157269b;
        int i = g.f234761b;
        IBinder iBinder = this.f234768b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new f(iBinder);
        }
        pVar.f234778m = fVar;
        k kVar = pVar.f234772b;
        kVar.e("linkToDeath", new Object[0]);
        try {
            pVar.f234778m.asBinder().linkToDeath(pVar.f234776j, 0);
        } catch (RemoteException e) {
            kVar.d(e, "linkToDeath failed", new Object[0]);
        }
        pVar.f234774g = false;
        Iterator it8 = pVar.d.iterator();
        while (it8.hasNext()) {
            ((Runnable) it8.next()).run();
        }
        pVar.d.clear();
    }
}
