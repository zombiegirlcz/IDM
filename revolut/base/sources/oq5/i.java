package oq5;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements b {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f227751p;

    public i(n mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, new a(0), mapper, null, false, 12);
        this.f227751p = hx7.e.a(this, new oq3.e(2));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f227751p;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
