package ka1;

import com.youTransactor.uCube.api.UCubeAPI;
import com.youTransactor.uCube.connexion.IConnexionManager;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements e4m.e {
    public static IConnexionManager a() {
        e.Companion.getClass();
        IConnexionManager connexionManager = UCubeAPI.getConnexionManager();
        Intrinsics.checkNotNullExpressionValue(connexionManager, "getConnexionManager(...)");
        s.k(connexionManager);
        return connexionManager;
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
