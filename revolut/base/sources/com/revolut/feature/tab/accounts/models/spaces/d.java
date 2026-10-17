package com.revolut.feature.tab.accounts.models.spaces;

import com.revolut.feature.tab.accounts.models.ProductId;
import pie.s;
import pie.u;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d extends s implements u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f89760c;
    public final ProductId d;

    public d(v vVar, ProductId productId) {
        super(vVar, productId);
        this.f89760c = vVar;
        this.d = productId;
    }

    @Override // pie.s
    public final v a() {
        return this.f89760c;
    }

    @Override // pie.s
    public final ProductId b() {
        return this.d;
    }
}
