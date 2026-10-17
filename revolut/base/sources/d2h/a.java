package d2h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetSelectionFlowControllerContract$InputData f110832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f110833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f110834c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(e eVar, AssetSelectionFlowControllerContract$InputData assetSelectionFlowControllerContract$InputData) {
        this.f110833b = eVar;
        this.f110832a = assetSelectionFlowControllerContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new cbb.b(this, 1, i));
        this.e = e4m.b.b(new cbb.b(this, 2, i));
        this.f = e4m.b.b(new cbb.b(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
