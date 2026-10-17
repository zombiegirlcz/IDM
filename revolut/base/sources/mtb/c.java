package mtb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSlideFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import e4m.e;
import java.util.Set;
import m2b.r;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainContainerSlideFlowContract$InputData f208796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseFlow f208797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f208798c;

    public c(d dVar, BaseFlow baseFlow, MainContainerSlideFlowContract$InputData mainContainerSlideFlowContract$InputData) {
        this.f208796a = mainContainerSlideFlowContract$InputData;
        this.f208797b = baseFlow;
        this.f208798c = e4m.b.b(new r(dVar, this, 21));
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
