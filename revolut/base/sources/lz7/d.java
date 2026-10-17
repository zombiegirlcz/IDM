package lz7;

import com.google.firebase.messaging.t;
import kotlin.jvm.internal.Intrinsics;
import lu5.o;
import tm.g;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm.e f200946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mz7.a f200947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f200948c;

    public d(wm.e expandableDialogActionDispatcher, mz7.a uiBuilder, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f200946a = expandableDialogActionDispatcher;
        this.f200947b = uiBuilder;
        this.f200948c = actionDelegateFactory.f(new o(this, 21));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        a action = (a) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f200948c.a(action);
    }
}
