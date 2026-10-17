package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lg0.b f127311l;

    public d1(lg0.b deeplinkHandler) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f127311l = deeplinkHandler;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "ID_NOTE_DELEGATE_CLAUSE")) {
            return Boolean.FALSE;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.clause.ClauseDisplayer.ClickData");
        eif.j jVar = new eif.j(this, (ty0.a) obj2, null, 9);
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, jVar, continuation);
    }
}
