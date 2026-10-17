package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$InputData;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalCardDetailsFlowContract$InputData f249585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f249586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f249587c = this;
    public final e4m.e d;
    public final e4m.e e;

    public e(k kVar, ExternalCardDetailsFlowContract$InputData externalCardDetailsFlowContract$InputData) {
        this.f249586b = kVar;
        this.f249585a = externalCardDetailsFlowContract$InputData;
        int i = 13;
        this.d = e4m.b.b(new v1(kVar, this, 1, i));
        this.e = e4m.b.b(new v1(kVar, this, 0, i));
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
