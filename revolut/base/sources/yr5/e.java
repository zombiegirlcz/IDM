package yr5;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import yg6.v;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements y50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f316131a;

    public e(n widgetModel) {
        Intrinsics.checkNotNullParameter(widgetModel, "widgetModel");
        this.f316131a = widgetModel;
    }

    public static final boolean a(e eVar, BaseChatBubbleDelegate.BaseModel baseModel) {
        return Intrinsics.f(baseModel.getF53563a(), eVar.f316131a.c3().f310974a);
    }

    @Override // y50.a
    public final void h1(fx.d dVar, koi.c delegatesManager) {
        CoroutineScope coroutineScope = dVar.f138715a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        koi.k kVarC = delegatesManager.c(ChatContextualChartDelegate.class);
        if (kVarC == null) {
            throw new IllegalStateException(h30.l.r("No delegate found for class ", o0.f186429a.b(ChatContextualChartDelegate.class).e()));
        }
        ChatContextualChartDelegate chatContextualChartDelegate = (ChatContextualChartDelegate) kVarC;
        koi.k kVarC2 = delegatesManager.c(ChatItemsDelegate.class);
        if (kVarC2 == null) {
            kVarC2 = new ChatItemsDelegate();
            delegatesManager.a(kVarC2);
        }
        Continuation continuation = null;
        e0.C(coroutineScope, null, null, new v(rd0.e.b(((ChatItemsDelegate) kVarC2).f52047n.f121375b), new a(this), continuation, 16), 3);
        e0.C(coroutineScope, null, null, new v(rd0.e.b(chatContextualChartDelegate.f52027m.f121375b), new b(this), continuation, 17), 3);
        e0.C(coroutineScope, null, null, new v(rd0.e.b(chatContextualChartDelegate.f52026l.f121375b), new c(this), continuation, 18), 3);
        e0.C(coroutineScope, null, null, new v(rd0.e.b(chatContextualChartDelegate.k.f121375b), new d(this), continuation, 19), 3);
    }
}
