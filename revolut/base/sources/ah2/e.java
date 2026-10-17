package ah2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements eo0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f4877a;

    public e(d upiSmartIntentInteractorImpl) {
        Intrinsics.checkNotNullParameter(upiSmartIntentInteractorImpl, "upiSmartIntentInteractorImpl");
        this.f4877a = upiSmartIntentInteractorImpl;
    }

    @Override // eo0.b
    public final Object a(Continuation continuation) {
        Object objA = this.f4877a.a((gim.c) continuation);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // eo0.b
    public final /* bridge */ /* synthetic */ eo0.a c() {
        return eo0.a.f127858a;
    }
}
