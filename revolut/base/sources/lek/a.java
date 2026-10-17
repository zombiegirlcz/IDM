package lek;

import kotlin.jvm.internal.Intrinsics;
import le3.y;
import pfm.z;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f194560a;

    public a(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f194560a = userInteractor;
    }

    public final z a() {
        ufm.i iVar = new ufm.i(this.f194560a.f(false), new y(new le3.b(23), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }
}
