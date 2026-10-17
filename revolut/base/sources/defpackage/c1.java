package defpackage;

import android.content.Context;
import com.youTransactor.uCube.mdm.ServiceState;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes21.dex */
public final class c1 extends l {
    public byte[] I;
    public KeyStore J;
    public final Context K;

    public c1(Context context) {
        this.K = context;
    }

    @Override // defpackage.l
    public final void a() {
        if (this.J != null) {
            new o1(this.H).execute(new b1(this, 0));
        } else {
            b(ServiceState.RETRIEVE_DEVICE_CERTIFICAT, new Object[0]);
            new o1().execute(new b1(this, 1));
        }
    }
}
