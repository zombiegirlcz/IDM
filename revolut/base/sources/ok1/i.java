package ok1;

import fl1.o;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f225880b;

    public /* synthetic */ i(j jVar, int i) {
        this.f225879a = i;
        this.f225880b = jVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f225879a) {
            case 0:
                return new com.revolut.feature.alipay.impl.ui.webcontainer.a(this.f225880b.f225881a);
            default:
                return new fl1.n(this.f225880b.f225881a, new o());
        }
    }
}
