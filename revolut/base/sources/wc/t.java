package wc;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import zc.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f296309b;

    public /* synthetic */ t(Object obj2, int i) {
        this.f296308a = i;
        this.f296309b = obj2;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f296308a) {
            case 0:
                c cVar = (c) this.f296309b;
                cVar.f296280b.e("reportBinderDeath", new Object[0]);
                a0.d.B(cVar.i.get());
                cVar.f296280b.e("%s : Binder has died.", cVar.f296281c);
                Iterator it8 = cVar.d.iterator();
                while (it8.hasNext()) {
                    ((s) it8.next()).b(new RemoteException(String.valueOf(cVar.f296281c).concat(" : Binder has died.")));
                }
                cVar.d.clear();
                synchronized (cVar.f) {
                    cVar.d();
                    break;
                }
                return;
            default:
                zc.c cVar2 = (zc.c) this.f296309b;
                cVar2.f320971b.b("reportBinderDeath", new Object[0]);
                a0.d.B(cVar2.f320975j.get());
                cVar2.f320971b.b("%s : Binder has died.", cVar2.f320972c);
                Iterator it9 = cVar2.d.iterator();
                while (it9.hasNext()) {
                    ((z) it9.next()).a(new RemoteException(String.valueOf(cVar2.f320972c).concat(" : Binder has died.")));
                }
                cVar2.d.clear();
                synchronized (cVar2.f) {
                    cVar2.d();
                    break;
                }
                return;
        }
    }
}
