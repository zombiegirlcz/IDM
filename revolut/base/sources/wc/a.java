package wc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import defpackage.i0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f296274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f296275c;

    public a(i0 i0Var, IBinder iBinder) {
        this.f296275c = i0Var;
        this.f296274b = iBinder;
    }

    @Override // wc.s
    public final void c() {
        i gVar;
        c cVar = (c) this.f296275c.f157269b;
        int i = h.f296291b;
        IBinder iBinder = this.f296274b;
        if (iBinder == null) {
            gVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            gVar = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new g(iBinder);
        }
        cVar.f296286m = gVar;
        ecm.c cVar2 = cVar.f296280b;
        cVar2.e("linkToDeath", new Object[0]);
        try {
            cVar.f296286m.asBinder().linkToDeath(cVar.f296284j, 0);
        } catch (RemoteException e) {
            cVar2.d(e, "linkToDeath failed", new Object[0]);
        }
        cVar.f296282g = false;
        Iterator it8 = cVar.d.iterator();
        while (it8.hasNext()) {
            ((Runnable) it8.next()).run();
        }
        cVar.d.clear();
    }
}
