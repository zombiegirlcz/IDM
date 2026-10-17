package sdc;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends n implements vki.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i90.b f261851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f261852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f261853n;

    public f(i90.b uuidUtils, d inputData) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f261851l = uuidUtils;
        this.f261852m = inputData;
        this.f261853n = pyd.c.a(this, new e(Z2(), null));
    }

    public final c Z2() {
        b bVarA = this.f261852m.a();
        return bVarA != null ? bVarA : new a(y.u(this.f261851l, "toString(...)"));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f261853n;
    }
}
