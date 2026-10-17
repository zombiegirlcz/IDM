package q50;

import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements y50.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f242225a;

    public g(j model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f242225a = model;
    }

    @Override // y50.a
    public final void h1(fx.d dVar, koi.c delegatesManager) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        koi.k kVarC = delegatesManager.c(ChatItemsDelegate.class);
        if (kVarC == null) {
            kVarC = new ChatItemsDelegate();
            delegatesManager.a(kVarC);
        }
        h hVar = j.Companion;
        String widgetId = this.f242225a.c3().f310974a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        skm.e0.C(dVar.f138715a, null, null, new q03.m(rd0.e.b(((ChatItemsDelegate) kVarC).f52046m.f121375b), new f(widgetId + "_row", this), null, 12), 3);
    }
}
