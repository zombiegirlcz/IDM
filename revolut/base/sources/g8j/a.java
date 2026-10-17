package g8j;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.retail.feature.crypto.asset_details.common.impl.glossary.CryptoStatsGlossaryContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.common.impl.glossary.CryptoStatsGlossaryScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements p {
    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof b8j.a)) {
            return null;
        }
        b8j.a aVar = (b8j.a) descriptor;
        return aVar.a(new CryptoStatsGlossaryScreen(new CryptoStatsGlossaryContract$InputData(aVar.f13268a, aVar.f13269b)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
