package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.api.navigation.BrazilInboundMandateConfirmationDescriptor$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements xki.c, xj6.a, ik6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazilInboundMandateConfirmationDescriptor$InputData f304942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f304944c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f304945g;

    public m(t tVar, BrazilInboundMandateConfirmationDescriptor$InputData brazilInboundMandateConfirmationDescriptor$InputData) {
        this.f304943b = tVar;
        this.f304942a = brazilInboundMandateConfirmationDescriptor$InputData;
        int i = 26;
        this.d = e4m.b.b(new vy9.a(this, 1, i));
        this.e = e4m.b.b(new vy9.a(this, 2, i));
        this.f = e4m.b.b(new vy9.a(this, 3, i));
        this.f304945g = e4m.b.b(new vy9.a(this, 0, i));
    }

    @Override // xj6.a
    public final l b() {
        return new l(this.f304943b, this.f304944c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // ik6.a
    public final k j() {
        return new k(this.f304943b, this.f304944c, 0);
    }
}
