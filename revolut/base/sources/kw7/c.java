package kw7;

import akg.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f190299a;

    public c(e insuranceHomeLayoutInteractor) {
        Intrinsics.checkNotNullParameter(insuranceHomeLayoutInteractor, "insuranceHomeLayoutInteractor");
        this.f190299a = insuranceHomeLayoutInteractor;
    }

    public final n a(gw7.a insuranceType) {
        Intrinsics.checkNotNullParameter(insuranceType, "insuranceType");
        return nim.a.v(e.a(this.f190299a), new kv7.g(insuranceType, 4));
    }
}
