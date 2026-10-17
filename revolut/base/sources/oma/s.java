package oma;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends qri.c implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f226805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tla.d f226806c;
    public final xla.a d;
    public final wm.e e;
    public final vla.b f;

    public s(ln.a actionDispatcher, tla.d appNavigationCommandsProvider, xla.a changeDataCommandsProvider, wm.e expandableDialogActionDispatcher, vla.b dialogModelFactory) {
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        Intrinsics.checkNotNullParameter(appNavigationCommandsProvider, "appNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(changeDataCommandsProvider, "changeDataCommandsProvider");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(dialogModelFactory, "dialogModelFactory");
        this.f226805b = actionDispatcher;
        this.f226806c = appNavigationCommandsProvider;
        this.d = changeDataCommandsProvider;
        this.e = expandableDialogActionDispatcher;
        this.f = dialogModelFactory;
    }
}
