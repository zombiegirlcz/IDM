package ppg;

import com.revolut.data.model.Data;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yea.l;
import ypg.p;

/* JADX INFO: loaded from: classes9.dex */
public interface a {
    static r a(a aVar, String vaultId) {
        ypg.b bVar = (ypg.b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        if (!bVar.d.a("ACCOUNT.pockets")) {
            return w.h(new Data(null, new IllegalStateException("Vaults is disabled!"), false, 5, null));
        }
        return pd.b.r(((p) bVar.f315865a).i(vaultId), new l(1, bVar, ypg.b.class, "observeCustomisedVault", "observeCustomisedVault(Lcom/revolut/feature/shared/savings/models/vault/Vault;)Lio/reactivex/Observable;", 0, 11));
    }
}
