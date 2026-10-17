package qki;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import os2.g;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements pki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f247011a;

    public b(uki.c controller, uki.b model) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f247011a = model;
    }

    @Override // pki.a
    public final void J1(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f247011a.getState().e(state);
    }

    @Override // pki.a
    public final void e0(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f247011a.getState().g(outState);
    }
}
