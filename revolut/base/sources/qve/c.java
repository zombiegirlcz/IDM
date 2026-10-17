package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.api.descriptor.BrazilStoredMethodDetailsDescriptor$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements xki.c, zxe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazilStoredMethodDetailsDescriptor$InputData f249579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f249580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f249581c = this;
    public final e4m.e d;

    public c(k kVar, BrazilStoredMethodDetailsDescriptor$InputData brazilStoredMethodDetailsDescriptor$InputData) {
        this.f249580b = kVar;
        this.f249579a = brazilStoredMethodDetailsDescriptor$InputData;
        this.d = e4m.b.b(new qbj.w(kVar, this, 20));
    }

    @Override // zxe.b
    public final zxe.a b() {
        return new t(this.f249580b, this.f249581c);
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
