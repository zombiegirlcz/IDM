package oi9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_later.impl.ui.linkedplans.PayLaterLinkedPlansControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterLinkedPlansControllerContract$InputData f225519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f225520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225521c;

    public h(f fVar, PayLaterLinkedPlansControllerContract$InputData payLaterLinkedPlansControllerContract$InputData) {
        this.f225519a = payLaterLinkedPlansControllerContract$InputData;
        int i = 4;
        this.f225520b = e4m.b.b(new a(fVar, this, 1, i));
        this.f225521c = e4m.b.b(new a(fVar, this, 0, i));
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
