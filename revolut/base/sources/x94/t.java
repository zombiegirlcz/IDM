package x94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f303573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tqi.g f303574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hz3.c f303575c;

    public t(ln.a navigationCommandsDispatcher, tqi.g shareNaviCommandFactory, g creditDocumentsViewerState, hz3.c creditApplicationCommandsFactory) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(creditDocumentsViewerState, "creditDocumentsViewerState");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        this.f303573a = navigationCommandsDispatcher;
        this.f303574b = shareNaviCommandFactory;
        this.f303575c = creditApplicationCommandsFactory;
    }
}
