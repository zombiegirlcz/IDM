package cle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f24986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f24987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f24988c;

    public n(h view, f router, a presentationModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f24986a = view;
        this.f24987b = router;
        this.f24988c = presentationModel;
    }
}
