package aj3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.chooser.kompot.bridge.ChooserScreenKompotBridgeContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements qji.a, z7a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChooserScreenKompotBridgeContract$InputData f5387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f5388b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f5389c = e4m.b.b(new a0b.c(this, 23));

    public h(ChooserScreenKompotBridgeContract$InputData chooserScreenKompotBridgeContract$InputData) {
        this.f5387a = chooserScreenKompotBridgeContract$InputData;
    }

    @Override // z7a.c
    public final z7a.a c() {
        return new i(this.f5388b);
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
