package l10;

import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueScreenContract$InputData;
import com.revolut.data.model.Data;
import kkf.r6;
import kkf.z7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends oki.h implements o {
    public final SharedCardDesignCatalogueScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cli.y f191386p;

    public n(cli.n stateMapper, SharedCardDesignCatalogueScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f191386p = mra.d.b(this, new p(inputData.f50951b, new Data(null, null, true, 3, null), inputData.f50952c, inputData.d, inputData.e, null, inputData.f50954h, null, inputData.f50953g), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        SharedCardDesignCatalogueScreenContract$InputData sharedCardDesignCatalogueScreenContract$InputData = this.o;
        Continuation continuation = null;
        if (!sharedCardDesignCatalogueScreenContract$InputData.i) {
            yji.l.a1(this, vkm.q.P(new r6(new z7((Flow) sharedCardDesignCatalogueScreenContract$InputData.f50950a.invoke(), this, 15), 9), 1), null, null, new j(this, continuation, 0), 3);
        }
        l2(new j(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, vkm.q.q((Flow) sharedCardDesignCatalogueScreenContract$InputData.f50955j.invoke()), null, null, new l(this, continuation, 1), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2(l10.w r8) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l10.n.I2(l10.w):void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f191386p;
    }
}
