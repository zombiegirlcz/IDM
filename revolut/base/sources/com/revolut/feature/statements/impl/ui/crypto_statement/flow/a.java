package com.revolut.feature.statements.impl.ui.crypto_statement.flow;

import com.revolut.feature.statements.impl.ui.crypto_statement.flow.CryptoStatementFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import szd.b;
import szd.c;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f88327p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        suf.a aVar = new suf.a(this, 13);
        this.f88327p = d.a(this, CryptoStatementFlowContract$Step.CryptoStatementScreen.f88326a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f88327p;
    }
}
