package com.revolut.feature.pix.impl.flow.alias_deletion;

import com.revolut.feature.pix.impl.flow.alias_deletion.AliasDeletionContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u3a.p;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements v8a.a {
    public final yki.a o;

    public a(AliasDeletionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new AliasDeletionContract$Step.ReviewDelete(inputData.f80569b), f0.f322471a, new p(inputData, this, 9));
    }

    @Override // yki.g
    public final b s() {
        return this.o;
    }
}
