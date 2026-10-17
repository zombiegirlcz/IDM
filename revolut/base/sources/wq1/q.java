package wq1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends bji.b implements l {

    @NotNull
    public static final n Companion = new n();
    public final uq1.a u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xq1.a f299398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f299399x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jki.p stateMapper, uq1.a pagoPAInteractor, j60.a bottomDialog, xq1.a dialogFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pagoPAInteractor, "pagoPAInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        this.u = pagoPAInteractor;
        this.v = bottomDialog;
        this.f299398w = dialogFactory;
        this.f299399x = new i(h.NOTICE, new g(0));
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.f299399x;
    }
}
