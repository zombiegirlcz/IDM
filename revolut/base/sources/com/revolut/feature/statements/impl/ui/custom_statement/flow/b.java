package com.revolut.feature.statements.impl.ui.custom_statement.flow;

import ang.f;
import com.revolut.feature.statements.impl.ui.custom_statement.flow.CustomStatementFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vvc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements vzd.b {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f88330p;

    public b(f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = userInteractor;
        s sVar = new s(this, 5);
        this.f88330p = d.a(this, CustomStatementFlowContract$Step.ProductArticle.f88329a, f0.f322471a, sVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f88330p;
    }
}
