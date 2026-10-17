package rc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f253163c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TaskCompletionSource f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f253164g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, TaskCompletionSource taskCompletionSource, w wVar, long j2, long j3, TaskCompletionSource taskCompletionSource2) {
        super(qVar, taskCompletionSource);
        this.f253163c = wVar;
        this.d = j2;
        this.e = j3;
        this.f = taskCompletionSource2;
        this.f253164g = qVar;
    }

    @Override // zc.z
    public final void b() {
        w wVar = this.f253163c;
        TaskCompletionSource taskCompletionSource = this.f;
        q qVar = this.f253164g;
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
            Bundle bundleA = q.a(qVar, wVar, this.d, this.e);
            o oVar = new o(qVar, taskCompletionSource, 0);
            zc.r rVar = (zc.r) tVar;
            rVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(rVar.f320965b);
            int i = zc.p.f320993a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(oVar);
            rVar.k(3, parcelObtain);
        } catch (RemoteException e) {
            qVar.f253169a.a(e, "requestExpressIntegrityToken(%s, %s, %s)", wVar.f253179a, wVar.f253180b, Long.valueOf(this.d));
            taskCompletionSource.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
