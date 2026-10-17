package cpi;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f107963b;

    public /* synthetic */ l(m mVar, int i) {
        this.f107962a = i;
        this.f107963b = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f107962a) {
            case 0:
                return new k(this.f107963b);
            case 1:
                return new yhi.a(yh5.b.c(((ip.a) ue0.e.j(this.f107963b.f107964a)).b()));
            default:
                return new h(this.f107963b, 0);
        }
    }
}
