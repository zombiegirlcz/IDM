package yh1;

import com.revolut.feature.address.common.api.navigation.FindAddressControllerDescriptor$InputData;
import java.util.Collections;
import java.util.Set;
import xsl.q;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements xki.c, ki1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FindAddressControllerDescriptor$InputData f313712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f313713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f313714c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f(e eVar, FindAddressControllerDescriptor$InputData findAddressControllerDescriptor$InputData) {
        this.f313713b = eVar;
        this.f313712a = findAddressControllerDescriptor$InputData;
        int i = 23;
        this.d = e4m.b.b(new q(eVar, this, 1, i));
        this.e = e4m.b.b(new q(eVar, this, 0, i));
        this.f = e4m.b.b(new q(eVar, this, 2, i));
    }

    @Override // ki1.a
    public final k b() {
        return new k(this.f313713b, this.f313714c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return Collections.singleton((n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
