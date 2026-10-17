package apc;

import kotlin.jvm.internal.Intrinsics;
import m1h.l;
import m1h.n;
import m1h.o;
import m1h.q;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8153a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8155c;
    public Object d;

    public /* synthetic */ d() {
    }

    @Override // m1h.n
    public final o a() {
        switch (this.f8153a) {
            case 0:
                return (o) ((e4m.e) this.f8155c).get();
            default:
                return (o) this.f8155c;
        }
    }

    @Override // m1h.n
    public final l b() {
        switch (this.f8153a) {
            case 0:
                return (l) ((e4m.e) this.d).get();
            default:
                return (l) this.d;
        }
    }

    @Override // m1h.n
    public final q q() {
        switch (this.f8153a) {
            case 0:
                return (q) ((e4m.e) this.f8154b).get();
            default:
                return (q) this.f8154b;
        }
    }

    public d(q provider, o mapper, l extensionFactory) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(extensionFactory, "extensionFactory");
        this.f8154b = provider;
        this.f8155c = mapper;
        this.d = extensionFactory;
    }
}
