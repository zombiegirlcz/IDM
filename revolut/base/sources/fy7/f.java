package fy7;

import com.google.firebase.messaging.t;
import fs2.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements mm.b, cn.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm.e f138959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy7.a f138960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tm.g f138961c;

    public f(wm.e expandableDialogActionDispatcher, fx7.a petAnalyticsInteractor, gy7.a uiBuilder, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f138959a = expandableDialogActionDispatcher;
        this.f138960b = uiBuilder;
        this.f138961c = actionDelegateFactory.f(new k(this, 23));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        a action = (a) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f138961c.a(action);
    }
}
