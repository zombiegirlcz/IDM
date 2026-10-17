package e53;

import com.revolut.feature.card_personalisation.generation.impl.ui.generation.CustomisationImageGenerationControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.v7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomisationImageGenerationControllerContract$InputData f122732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f122733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f122734c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f122735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f122736h;
    public final e4m.e i;

    public i(h hVar, ViewController viewController, CustomisationImageGenerationControllerContract$InputData customisationImageGenerationControllerContract$InputData) {
        this.f122733b = hVar;
        this.f122732a = customisationImageGenerationControllerContract$InputData;
        this.f122734c = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.d = e4m.b.b(new v7(hVar, this, 1, i));
        this.e = e4m.b.b(new v7(hVar, this, 0, i));
        this.f = e4m.b.b(new v7(hVar, this, 3, i));
        this.f122735g = e4m.b.b(new v7(hVar, this, 2, i));
        this.f122736h = e4m.b.b(new v7(hVar, this, 5, i));
        this.i = e4m.b.b(new v7(hVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(this.e, "Set contributions cannot be null", arrayList);
        return kii.e.C(this.f122735g, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }
}
