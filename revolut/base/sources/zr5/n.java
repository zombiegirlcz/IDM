package zr5;

import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements y50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f324600a;

    public n(r model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f324600a = model;
    }

    @Override // y50.a
    public final void h1(fx.d dVar, koi.c delegatesManager) {
        CoroutineScope coroutineScope = dVar.f138715a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        koi.k kVarC = delegatesManager.c(ChatItemsDelegate.class);
        if (kVarC == null) {
            throw new IllegalStateException(h30.l.r("No delegate found for class ", o0.f186429a.b(ChatItemsDelegate.class).e()));
        }
        ChatItemsDelegate chatItemsDelegate = (ChatItemsDelegate) kVarC;
        Continuation continuation = null;
        e0.C(coroutineScope, null, null, new zah.f(rd0.e.b(chatItemsDelegate.f52045l.f121375b), new l(this), continuation, 29), 3);
        e0.C(coroutineScope, null, null, new k(rd0.e.b(chatItemsDelegate.k.f121375b), new m(this), continuation, 0), 3);
    }
}
