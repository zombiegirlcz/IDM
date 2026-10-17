package com.revolut.feature.pockets.impl.ui.add_new;

import com.revolut.feature.pockets.impl.ui.add_new.OpenNewPocketFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import y8a.g;
import yea.k;
import zfe.e;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h implements k {
    public final OpenNewPocketFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f80903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f80904q;

    public d(OpenNewPocketFlowContract$InputData inputData, e newAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        this.o = inputData;
        this.f80903p = newAccountDestinationResolver;
        this.f80904q = cp5.d.a(this, OpenNewPocketFlowContract$Step.AddNewPocket.f80890a, f0.f322471a, new g(this, 18));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80904q;
    }
}
