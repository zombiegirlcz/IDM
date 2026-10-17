package ecm;

import com.google.common.base.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f124830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f124831b;

    public k(e eVar, j jVar) {
        this.f124830a = eVar;
        this.f124831b = (j) Preconditions.checkNotNull(jVar, "interceptor");
    }

    @Override // ecm.e
    public final String e() {
        return this.f124830a.e();
    }

    @Override // ecm.e
    public final i f(p1 method, d callOptions) {
        ((to.c) this.f124831b).getClass();
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(callOptions, "callOptions");
        e next = this.f124830a;
        Intrinsics.checkNotNullParameter(next, "next");
        return new to.d(callOptions, next.f(method, callOptions));
    }
}
