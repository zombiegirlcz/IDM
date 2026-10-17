package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.youTransactor.uCube.api.UCubeAPI;
import com.youTransactor.uCube.connexion.ConnectionStatus;
import k0.b;

/* JADX INFO: loaded from: classes17.dex */
public final class j0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f169899b;

    public /* synthetic */ j0(v0 v0Var, int i) {
        this.f169898a = i;
        this.f169899b = v0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f169898a) {
            case 0:
                v0 v0Var = this.f169899b;
                j0 j0Var = v0Var.E;
                if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                    int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
                    if (intExtra == 10 && intExtra2 == 11) {
                        t1.a("device bonding");
                    } else if (intExtra == 11 && intExtra2 == 12) {
                        t1.a("device bound");
                        try {
                            if (v0Var.f284705y) {
                                UCubeAPI.getContext().unregisterReceiver(j0Var);
                                v0Var.f284705y = false;
                            }
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                        int i = v0Var.G;
                        if (i == 4 || i == 5) {
                            v0Var.a();
                        }
                    } else if ((intExtra == 11 || intExtra == 12) && intExtra2 == 10) {
                        t1.b("error to bound device", new Exception[0]);
                        try {
                            if (v0Var.f284705y) {
                                UCubeAPI.getContext().unregisterReceiver(j0Var);
                                v0Var.f284705y = false;
                            }
                            break;
                        } catch (IllegalArgumentException unused2) {
                        }
                        int i2 = v0Var.G;
                        if (i2 == 4 || i2 == 5) {
                            v0Var.c(ConnectionStatus.ERROR_TO_BIND_DEVICE);
                        }
                    }
                }
                break;
            default:
                this.f169899b.B.submit(new b(this, intent, 7));
                break;
        }
    }
}
