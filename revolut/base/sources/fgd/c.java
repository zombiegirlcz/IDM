package fgd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlowContract$InputData;
import eyd.v;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements qji.a, yfd.b, bgd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedAddAssetFlowContract$InputData f135039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f135040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f135041c = this;
    public final e4m.e d = e4m.b.b(new v(this, 20));

    public c(d dVar, SharedAddAssetFlowContract$InputData sharedAddAssetFlowContract$InputData) {
        this.f135040b = dVar;
        this.f135039a = sharedAddAssetFlowContract$InputData;
    }

    @Override // yfd.b
    public final h b() {
        return new h(this.f135040b, this.f135041c, 0);
    }

    @Override // bgd.a
    public final a c() {
        return new a(this.f135040b, this.f135041c, 0);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
