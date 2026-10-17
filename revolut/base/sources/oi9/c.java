package oi9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.intro.IntroControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntroControllerContract$InputData f225488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f225489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225490c;

    public c(f fVar, w wVar, IntroControllerContract$InputData introControllerContract$InputData) {
        this.f225488a = introControllerContract$InputData;
        int i = 1;
        this.f225489b = e4m.g.a(new a(fVar, this, 1, i));
        this.f225490c = e4m.b.b(new a(fVar, this, 0, i));
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
