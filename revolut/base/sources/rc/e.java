package rc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityServiceException;
import zc.y;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends pc.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f253147b;
    public final TaskCompletionSource e;
    public final /* synthetic */ f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f = fVar;
        this.f253147b = new y("OnRequestIntegrityTokenCallback");
        this.e = taskCompletionSource;
    }

    @Override // pc.d
    public final boolean k(int i, Parcel parcel) {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zc.p.a(parcel);
        zc.p.b(parcel);
        f fVar = this.f;
        zc.c cVar = fVar.e;
        TaskCompletionSource taskCompletionSource = this.e;
        cVar.c(taskCompletionSource);
        this.f253147b.b("onRequestIntegrityToken", new Object[0]);
        fVar.d.getClass();
        int i2 = bundle.getInt("error");
        IntegrityServiceException integrityServiceException = i2 != 0 ? new IntegrityServiceException(i2, null) : null;
        if (integrityServiceException != null) {
            taskCompletionSource.trySetException(integrityServiceException);
            return true;
        }
        String string = bundle.getString("token");
        if (string == null) {
            taskCompletionSource.trySetException(new IntegrityServiceException(-100, null));
            return true;
        }
        bundle.getLong("request.token.sid");
        com.google.android.gms.internal.mlkit_vision_face.a.m("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat("IntegrityDialogWrapper");
        taskCompletionSource.trySetResult(new i(string));
        return true;
    }
}
