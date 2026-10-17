package rc;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.i0;
import java.util.Iterator;
import zc.y;
import zc.z;

/* JADX INFO: loaded from: classes16.dex */
public final class l extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f253160b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f253161c;
    public final /* synthetic */ Object d;

    public l(i0 i0Var, IBinder iBinder) {
        this.f253161c = iBinder;
        this.d = i0Var;
    }

    @Override // zc.z
    public final void b() {
        switch (this.f253160b) {
            case 0:
                ((q) this.d).f253171c.trySetResult(Integer.valueOf(zc.d.a((Context) this.f253161c)));
                break;
            default:
                zc.c cVar = (zc.c) ((i0) this.d).f157269b;
                cVar.f320978n = (IInterface) cVar.i.c((IBinder) this.f253161c);
                y yVar = cVar.f320971b;
                yVar.b("linkToDeath", new Object[0]);
                try {
                    cVar.f320978n.asBinder().linkToDeath(cVar.k, 0);
                } catch (RemoteException e) {
                    yVar.a(e, "linkToDeath failed", new Object[0]);
                }
                cVar.f320973g = false;
                Iterator it8 = cVar.d.iterator();
                while (it8.hasNext()) {
                    ((Runnable) it8.next()).run();
                }
                cVar.d.clear();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f253161c = context;
        this.d = qVar;
    }
}
