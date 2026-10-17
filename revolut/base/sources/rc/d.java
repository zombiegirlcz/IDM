package rc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.integrity.internal.af;
import zc.z;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f253145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f253146c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ h e;
    public final /* synthetic */ f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l2, TaskCompletionSource taskCompletionSource2, h hVar) {
        super(taskCompletionSource);
        this.f253145b = bArr;
        this.f253146c = l2;
        this.d = taskCompletionSource2;
        this.e = hVar;
        this.f = fVar;
    }

    @Override // zc.z
    public final void a(Exception exc2) {
        if (exc2 instanceof af) {
            super.a(new IntegrityServiceException(-9, exc2));
        } else {
            super.a(exc2);
        }
    }

    @Override // zc.z
    public final void b() {
        TaskCompletionSource taskCompletionSource = this.d;
        f fVar = this.f;
        try {
            zc.x xVar = (zc.x) fVar.e.f320978n;
            Bundle bundleA = f.a(fVar, this.f253145b, this.f253146c);
            e eVar = new e(fVar, taskCompletionSource);
            zc.v vVar = (zc.v) xVar;
            vVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(vVar.f320965b);
            int i = zc.p.f320993a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(eVar);
            vVar.k(2, parcelObtain);
        } catch (RemoteException e) {
            fVar.f253148a.a(e, "requestIntegrityToken(%s)", this.e);
            taskCompletionSource.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
