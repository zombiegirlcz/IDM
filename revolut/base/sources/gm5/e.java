package gm5;

import gm5.b;
import java.util.concurrent.ConcurrentHashMap;
import ji5.i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f144763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zja.a f144764n;
    public final vh5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b.C0839b f144765p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b.a f144766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ConcurrentHashMap f144767r;

    public e(i cryptoOnboardingInteractor, zja.a productArticleInteractor, vh5.a cryptoPermissionModelExtension) {
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(cryptoPermissionModelExtension, "cryptoPermissionModelExtension");
        this.f144763m = cryptoOnboardingInteractor;
        this.f144764n = productArticleInteractor;
        this.o = cryptoPermissionModelExtension;
        this.f144765p = b.C0839b.f144758a;
        this.f144767r = new ConcurrentHashMap();
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, mo3.a.g(this.f144763m.a(false), null, new gcc.c(23), 1), null, new gii.b(this, null, 9), 3);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f144765p;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // gm5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gm5.b.a r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gm5.e.e3(gm5.b$a, gim.c):java.lang.Object");
    }

    public final void f3(a aVar) {
        MutableSharedFlow mutableSharedFlow;
        b.a aVar2 = this.f144766q;
        if (aVar2 != null && (mutableSharedFlow = (MutableSharedFlow) this.f144767r.get(aVar2)) != null) {
            mutableSharedFlow.k(aVar);
        }
        this.f144766q = null;
    }
}
