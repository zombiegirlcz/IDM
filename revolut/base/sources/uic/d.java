package uic;

import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u83.f;
import ud3.f0;
import wli.x;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements j {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bgc.e f280373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f280374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f280375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sf0.h f280376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f280377t;

    public d(b inputData, bgc.e rewardsInteractor, e perkAccessStatusDialogFactory, x deeplinkHandler, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(perkAccessStatusDialogFactory, "perkAccessStatusDialogFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = inputData;
        this.f280373p = rewardsInteractor;
        this.f280374q = perkAccessStatusDialogFactory;
        this.f280375r = deeplinkHandler;
        this.f280376s = serverErrorParser;
        this.f280377t = d8l.d.a(this, new f0(28));
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 10), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f280377t;
    }
}
