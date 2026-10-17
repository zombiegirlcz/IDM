package zyd;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import efm.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements i {

    @NotNull
    public static final k Companion = new k();
    public static final Set u;
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f326445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zxd.c f326446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0e.b f326447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vyd.a f326448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f326449t;

    static {
        io3.l[] elements = {io3.l.CURRENT, io3.l.SAVINGS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        u = kotlin.collections.d.y0(elements);
    }

    public m(p stateMapper, h inputData, wsg.n walletInteractor, zxd.c statementsInteractor, n0e.b statementsNaviCommandsFactory, vyd.a dialogModelConfigurationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        this.o = inputData;
        this.f326445p = walletInteractor;
        this.f326446q = statementsInteractor;
        this.f326447r = statementsNaviCommandsFactory;
        this.f326448s = dialogModelConfigurationFactory;
        this.f326449t = mra.d.b(this, new g(new Data(null, null, true, 3, null), false, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        io3.k kVar = io3.k.ACTIVE;
        h hVar = this.o;
        r rVarG = osg.b.g(this.f326445p, w4l.h.f294642c, null, kVar, null, null, null, hVar.f326440a, 58);
        r rVarX = this.f326445p.x(hVar.f326440a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        yji.l.a1(this, rd0.e.b(w.l(rVarG, rVarX)), null, null, new l(this, null, 0), 3);
    }

    public final void I2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        if (!(obj2 instanceof xi0.b)) {
            obj2 = null;
        }
        xi0.b bVar = (xi0.b) obj2;
        if (bVar == null) {
            throw new IllegalStateException("No Currency in the model parcel!");
        }
        H2(this.f326449t, new vgc.b(25, bVar));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f326449t;
    }
}
