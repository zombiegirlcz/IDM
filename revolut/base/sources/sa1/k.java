package sa1;

import com.youTransactor.uCube.connexion.BatteryLevelListener;
import efm.e0;
import efm.g0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k implements BatteryLevelListener, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f261230a;

    public /* synthetic */ k(q qVar) {
        this.f261230a = qVar;
    }

    @Override // com.youTransactor.uCube.connexion.BatteryLevelListener
    public void onLevelChanged(int i) {
        ne0.n nVar = this.f261230a.d;
        qa1.e eVar = (qa1.e) nVar.get("KEY_CHARGE_STATE");
        if (eVar != null) {
            qa1.f state = eVar.f243934b;
            qa1.a firmwareType = eVar.f243935c;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(firmwareType, "firmwareType");
            nVar.f("KEY_CHARGE_STATE", new qa1.e(i, state, firmwareType));
        }
    }

    @Override // efm.g0
    public void subscribe(e0 emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f261230a.b().disconnect(new defpackage.g0((ufm.a) emitter, 1));
    }
}
