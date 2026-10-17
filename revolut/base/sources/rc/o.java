package rc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import zc.y;

/* JADX INFO: loaded from: classes16.dex */
public final class o extends pc.d implements zc.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f253165b;
    public final /* synthetic */ q e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f253166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f253167h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, TaskCompletionSource taskCompletionSource, byte b4) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.e = qVar;
        this.f253165b = taskCompletionSource;
    }

    @Override // zc.u
    public void c(Bundle bundle) {
        switch (this.f) {
            case 0:
                l(bundle);
                this.f253166g.b("onRequestExpressIntegrityToken", new Object[0]);
                ApiException apiExceptionB = this.f253167h.d.b(bundle);
                TaskCompletionSource taskCompletionSource = this.f253165b;
                if (apiExceptionB != null) {
                    taskCompletionSource.trySetException(apiExceptionB);
                    return;
                }
                bundle.getLong("request.token.sid");
                com.google.android.gms.internal.mlkit_vision_face.a.m("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                String string = bundle.getString("token");
                if (string == null) {
                    throw new NullPointerException("Null token");
                }
                taskCompletionSource.trySetResult(new s(string));
                return;
            default:
                l(bundle);
                return;
        }
    }

    @Override // zc.u
    public void h(Bundle bundle) {
        switch (this.f) {
            case 1:
                m(bundle);
                this.f253166g.b("onWarmUpExpressIntegrityToken", new Object[0]);
                ApiException apiExceptionB = this.f253167h.d.b(bundle);
                TaskCompletionSource taskCompletionSource = this.f253165b;
                if (apiExceptionB == null) {
                    taskCompletionSource.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
                } else {
                    taskCompletionSource.trySetException(apiExceptionB);
                }
                break;
            default:
                m(bundle);
                break;
        }
    }

    @Override // pc.d
    public final boolean k(int i, Parcel parcel) {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zc.p.a(parcel);
            zc.p.b(parcel);
            h(bundle);
            return true;
        }
        if (i == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) zc.p.a(parcel);
            zc.p.b(parcel);
            c(bundle2);
            return true;
        }
        TaskCompletionSource taskCompletionSource = this.f253165b;
        q qVar = this.e;
        if (i == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            zc.p.b(parcel);
            qVar.e.c(taskCompletionSource);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        zc.p.b(parcel);
        qVar.e.c(taskCompletionSource);
        return true;
    }

    public final void l(Bundle bundle) {
        this.e.e.c(this.f253165b);
    }

    public final void m(Bundle bundle) {
        this.e.e.c(this.f253165b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(q qVar, TaskCompletionSource taskCompletionSource, int i) {
        this(qVar, taskCompletionSource, (byte) 0);
        this.f = i;
        switch (i) {
            case 1:
                this.f253167h = qVar;
                this(qVar, taskCompletionSource, (byte) 0);
                this.f253166g = new y("OnWarmUpIntegrityTokenCallback");
                break;
            default:
                this.f253167h = qVar;
                this.f253166g = new y("OnRequestIntegrityTokenCallback");
                break;
        }
    }
}
