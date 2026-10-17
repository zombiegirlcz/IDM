package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231679a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f231680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final QrDetailsScreenContract$InputData f231681c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public i(d dVar, f fVar, ViewController viewController, QrDetailsScreenContract$InputData qrDetailsScreenContract$InputData) {
        this.f231680b = viewController;
        this.f231681c = qrDetailsScreenContract$InputData;
        int i = 21;
        this.d = e4m.b.b(new ove.w(dVar, this, 2, i));
        this.e = e4m.b.b(new ove.w(dVar, this, 1, i));
        this.f = e4m.b.b(new ove.w(dVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f231679a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f231679a) {
        }
        return ImmutableSet.of();
    }

    public i(d dVar, e eVar, ViewController viewController, QrDetailsScreenContract$InputData qrDetailsScreenContract$InputData) {
        this.f231680b = viewController;
        this.f231681c = qrDetailsScreenContract$InputData;
        int i = 20;
        this.d = e4m.b.b(new ove.w(dVar, this, 2, i));
        this.e = e4m.b.b(new ove.w(dVar, this, 1, i));
        this.f = e4m.b.b(new ove.w(dVar, this, 0, i));
    }
}
