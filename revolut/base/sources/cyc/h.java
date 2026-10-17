package cyc;

import ayc.i;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.entity.config.shared.ui.help.EntityHelpScreenContract$InputData;
import cw7.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends oki.h implements dli.b {
    public final bal.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EntityHelpScreenContract$InputData f110083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f110084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f110085r;

    public h(bal.a entityConfigRepository, EntityHelpScreenContract$InputData inputData, f80.a uriHelper, n mapper) {
        Intrinsics.checkNotNullParameter(entityConfigRepository, "entityConfigRepository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = entityConfigRepository;
        this.f110083p = inputData;
        this.f110084q = uriHelper;
        this.f110085r = mra.d.b(this, new e(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2(false);
    }

    public final void I2(boolean z) {
        H2(this.f110085r, new j(18));
        l.a1(this, rd0.e.b(ue0.e.p(((i) this.o).b(this.f110083p.f85844a, z), h0.f322473a)), null, null, new cvi.j(this, (Continuation) null, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f110085r;
    }
}
