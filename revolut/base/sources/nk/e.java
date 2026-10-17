package nk;

import kotlin.coroutines.CoroutineContext;
import skm.a0;
import skm.z;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends kotlin.coroutines.a implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f216612b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(z.f264021a);
        this.f216612b = fVar;
    }

    @Override // skm.a0
    public final void handleException(CoroutineContext coroutineContext, Throwable th10) {
        f fVar = this.f216612b;
        fVar.f216618s = th10;
        qk.b bVar = fVar.f216616q;
        bVar.getClass();
        bVar.setValue(new qk.a(th10));
    }
}
