package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages;

import cli.g;
import cli.y;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.InvestorUpdateHistoryPageScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n7f.d;
import n7f.e;
import n7f.f;
import n7f.j;
import n7f.l;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vii.b;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements n7f.h {

    @NotNull
    private static final j Companion = new j();
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a2 f91368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f91369q;

    public a(InvestorUpdateHistoryPageScreenContract$InputData inputData, b reloadContentFlow, l stateMapper) {
        cli.j dVar;
        cli.j jVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(reloadContentFlow, "reloadContentFlow");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = reloadContentFlow;
        if (inputData instanceof InvestorUpdateHistoryPageScreenContract$InputData.Loading) {
            jVar = f.f213085a;
        } else {
            if (inputData instanceof InvestorUpdateHistoryPageScreenContract$InputData.Error) {
                dVar = new e(((InvestorUpdateHistoryPageScreenContract$InputData.Error) inputData).f91366a);
            } else {
                if (!(inputData instanceof InvestorUpdateHistoryPageScreenContract$InputData.Content)) {
                    throw new NoWhenBranchMatchedException();
                }
                InvestorUpdateHistoryPageScreenContract$InputData.Content content = (InvestorUpdateHistoryPageScreenContract$InputData.Content) inputData;
                dVar = new d(content.f91364a, content.f91365b);
            }
            jVar = dVar;
        }
        this.f91369q = mra.d.b(this, jVar, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f91369q;
    }
}
