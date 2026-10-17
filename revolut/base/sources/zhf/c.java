package zhf;

import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import h30.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements y50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f322404a;

    public c(g model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f322404a = model;
    }

    @Override // y50.a
    public final void h1(fx.d dVar, koi.c delegatesManager) {
        CoroutineScope coroutineScope = dVar.f138715a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        koi.k kVarC = delegatesManager.c(ChatItemsDelegate.class);
        if (kVarC == null) {
            throw new IllegalStateException(l.r("No delegate found for class ", o0.f186429a.b(ChatItemsDelegate.class).e()));
        }
        ChatItemsDelegate chatItemsDelegate = (ChatItemsDelegate) kVarC;
        Continuation continuation = null;
        e0.C(coroutineScope, null, null, new zah.f(rd0.e.b(chatItemsDelegate.f52045l.f121375b), new a(this), continuation, 12), 3);
        e0.C(coroutineScope, null, null, new zah.f(rd0.e.b(chatItemsDelegate.f52047n.f121375b), new b(this), continuation, 13), 3);
    }
}
