package dv5;

import kotlin.jvm.internal.Intrinsics;
import pt5.r;
import pt5.s;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f118051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pt5.m f118052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f118053c;
    public pt5.b d;

    public o(r view, pt5.m router, l presentationModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f118051a = view;
        this.f118052b = router;
        this.f118053c = presentationModel;
        this.d = pt5.b.TRANSACTIONS;
    }
}
