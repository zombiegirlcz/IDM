package rdj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements pcj.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pcj.e f253474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pcj.d f253475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pcj.a f253476c;

    public j(pcj.e view, pcj.d presentationModel, pcj.a router) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f253474a = view;
        this.f253475b = presentationModel;
        this.f253476c = router;
    }
}
