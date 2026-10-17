package xrk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements hsk.d, csk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f308368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f308369b;

    public j(ln.a navigationCommandsDispatcher, h presentationModel, o9h.g footerDisclosureRouter) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(footerDisclosureRouter, "footerDisclosureRouter");
        this.f308368a = navigationCommandsDispatcher;
        this.f308369b = presentationModel;
    }
}
