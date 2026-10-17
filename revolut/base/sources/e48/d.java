package e48;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.joint.impl.ui.consent.ConsentScreenContract$InputData;
import dw3.q8;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentScreenContract$InputData f122416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f122417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f122418c;

    public d(g gVar, m mVar, ConsentScreenContract$InputData consentScreenContract$InputData) {
        this.f122416a = consentScreenContract$InputData;
        this.f122417b = e4m.b.b(new q8(gVar, mVar, this, 1, 25));
        this.f122418c = e4m.b.b(new q8(gVar, mVar, this, 0, 25));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
