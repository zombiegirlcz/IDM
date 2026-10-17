package com.revolut.feature.rev_points.impl.ui.transactions.list;

import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import java.util.List;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RevPointsTransactionsListScreen.a f83884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RevPointsTransactionsListScreen.a f83885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f83886c;

    public a(RevPointsTransactionsListScreen.a aVar, RevPointsTransactionsListScreen.a aVar2, List list) {
        this.f83884a = aVar;
        this.f83885b = aVar2;
        this.f83886c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RevPointsTransactionsListScreen.a aVar = this.f83884a;
        aVar.k = null;
        if (aVar.f83875j == null) {
            return;
        }
        f0 f0Var = f0.f322471a;
        RevPointsTransactionsListScreen.a aVar2 = this.f83885b;
        super/*koi.h*/.c(f0Var);
        super/*koi.h*/.c(this.f83886c);
    }
}
