package rc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f253162c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, TaskCompletionSource taskCompletionSource, long j2, TaskCompletionSource taskCompletionSource2) {
        super(qVar, taskCompletionSource);
        this.f253162c = j2;
        this.d = taskCompletionSource2;
        this.e = qVar;
    }

    @Override // zc.z
    public final void b() {
        TaskCompletionSource taskCompletionSource = this.d;
        long j2 = this.f253162c;
        q qVar = this.e;
        if (q.d(qVar)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (q.c(qVar)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            zc.t tVar = (zc.t) qVar.e.f320978n;
            Bundle bundleB = q.b(qVar, j2);
            o oVar = new o(qVar, taskCompletionSource, 1);
            zc.r rVar = (zc.r) tVar;
            rVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(rVar.f320965b);
            int i = zc.p.f320993a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(oVar);
            rVar.k(2, parcelObtain);
        } catch (RemoteException e) {
            qVar.f253169a.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j2));
            taskCompletionSource.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
