package jn;

import efm.d0;
import fag.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements um.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f176640a;

    public d(d4m.a errorView) {
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        this.f176640a = errorView;
    }

    @Override // um.b
    public final d0 a(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        if (x5d.b.b(errorData)) {
            return new ufm.c(new g(errorData, this, 17), 0);
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // um.b
    public final int getLevel() {
        return -11000;
    }
}
