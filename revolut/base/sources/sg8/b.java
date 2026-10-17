package sg8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_graduation.impl.ui.flow.identification.IdentificationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentificationFlowContract$InputData f262603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f262604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f262605c;
    public final b d = this;
    public final e4m.e e;
    public final e4m.e f;

    public b(c cVar, ViewController viewController, IdentificationFlowContract$InputData identificationFlowContract$InputData) {
        this.f262605c = cVar;
        this.f262603a = identificationFlowContract$InputData;
        this.f262604b = viewController;
        int i = 14;
        this.e = e4m.b.b(new ryc.d(cVar, this, 1, i));
        this.f = e4m.b.b(new ryc.d(cVar, this, 0, i));
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
