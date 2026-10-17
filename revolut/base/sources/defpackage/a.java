package defpackage;

import com.youTransactor.uCube.mdm.ServiceState;
import java.util.List;
import smd.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends l {
    public List I;
    public boolean J;
    public boolean K;

    @Override // defpackage.l
    public final void a() {
        b(ServiceState.RETRIEVE_DEVICE_CONFIG, new Object[0]);
        c cVar = new c(this.H);
        s sVar = new s();
        sVar.f264432a = cVar;
        sVar.f264433b = this;
        cVar.execute(sVar);
    }
}
