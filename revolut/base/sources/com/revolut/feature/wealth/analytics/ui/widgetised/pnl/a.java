package com.revolut.feature.wealth.analytics.ui.widgetised.pnl;

import a83.z;
import ba4.x;
import bxg.t;
import bzg.k;
import bzg.m;
import bzg.p;
import bzg.u;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import hx7.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import ou5.b;
import oxg.q;
import qqj.g;
import rp0.l0;
import skm.a2;
import tyg.j;
import vkm.i;
import vkm.j2;
import vyg.d;
import vyg.f;
import yji.l;
import zhm.d0;
import zhm.f0;
import zi0.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements m {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ezg.b f95118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l0 f95119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bzg.a f95120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f95121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f95122t;
    public final tyg.a u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f95123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f95124x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f95125y;

    public a(bzg.y stateMapper, WidgetisedAnalyticsPnLScreenContract$InputData inputData, b pnLInteractor, ezg.b pnLTypePopupMenuProvider, l0 popupMenuDialogDisplayer, bzg.a pnLInfoDialogProvider, q complexAnalyticsDestinationProvider, j configInteractor, tyg.a cryptoDisclaimerParamsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pnLInteractor, "pnLInteractor");
        Intrinsics.checkNotNullParameter(pnLTypePopupMenuProvider, "pnLTypePopupMenuProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(pnLInfoDialogProvider, "pnLInfoDialogProvider");
        Intrinsics.checkNotNullParameter(complexAnalyticsDestinationProvider, "complexAnalyticsDestinationProvider");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerParamsInteractor, "cryptoDisclaimerParamsInteractor");
        this.o = pnLInteractor;
        this.f95118p = pnLTypePopupMenuProvider;
        this.f95119q = popupMenuDialogDisplayer;
        this.f95120r = pnLInfoDialogProvider;
        this.f95121s = complexAnalyticsDestinationProvider;
        this.f95122t = configInteractor;
        this.u = cryptoDisclaimerParamsInteractor;
        this.v = e.a(this, new bwd.a(this, 6));
        WidgetisedAnalyticsType widgetisedAnalyticsType = inputData.f95113a;
        boolean zH = configInteractor.h(widgetisedAnalyticsType);
        List listE = zH ? configInteractor.e(widgetisedAnalyticsType) : f0.f322471a;
        WidgetisedAnalyticsType widgetisedAnalyticsType2 = inputData.f95113a;
        f fVar = f.TOTAL;
        Data dataP = c.P(inputData.f95114b, false, null, 3);
        vyg.c cVar = inputData.f95115c;
        d dVar = d.LINE;
        fzg.f fVar2 = (fzg.f) d0.d0(listE);
        this.f95123w = mra.d.b(this, new k(widgetisedAnalyticsType2, fVar, dataP, cVar, inputData.d, dVar, zH, null, new Data(null, null, true, 3, null), null, null, false, null, listE, listE.size() > 1, fVar2, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, inputData.e), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.b(this.f95119q.f256113c), null, null, new bzg.q(this, continuation, 6), 3);
        t tVar = new t(15);
        y yVar = this.f95123w;
        l.a1(this, vkm.q.H(new btk.j(this, null, 7), yVar.B(tVar)), null, null, new bzg.q(this, continuation, 7), 3);
        l.a1(this, yVar.B(new t(16)), null, null, new u(this, continuation, 1), 3);
        j2 j2Var = (j2) yVar.f22677a;
        WidgetisedAnalyticsType analyticsType = ((k) j2Var.getValue()).f19990a;
        this.f95122t.getClass();
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if ((analyticsType instanceof WidgetisedAnalyticsType.Crypto) || (analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Jisa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities) || (analyticsType instanceof WidgetisedAnalyticsType.Cfd) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestments) || (analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts)) {
            l.a1(this, vkm.q.H(new bzg.q(this, continuation, 8), new x(yVar.B(new t(17)), this, 13)), null, null, new bzg.q(this, continuation, 4), 3);
        } else if (!(analyticsType instanceof WidgetisedAnalyticsType.Robo)) {
            throw new NoWhenBranchMatchedException();
        }
        l.a1(this, yVar.B(new t(18)), null, null, new u(this, continuation, 0), 3);
        l.a1(this, yVar.B(new t(12)), null, null, new bzg.q(this, continuation, 5), 3);
        l.a1(this, this.u.a(((k) j2Var.getValue()).f19990a), null, null, new bzg.q(this, continuation, 2), 3);
    }

    public final void I2() {
        a aVar;
        a2 a2VarA1;
        vyg.e eVar;
        y yVar = this.f95123w;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        fzg.f fVar = ((k) j2Var.getValue()).f19999p;
        if (fVar == null) {
            return;
        }
        a2 a2Var = this.f95124x;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        f fVar2 = ((k) j2Var2.getValue()).f19991b;
        f fVar3 = f.TOTAL;
        b bVar = this.o;
        if (fVar2 == fVar3) {
            WidgetisedAnalyticsType analyticsType = ((k) j2Var2.getValue()).f19990a;
            vyg.c timeframe = ((k) j2Var2.getValue()).d;
            int i = p.f20012a[fVar.ordinal()];
            if (i == 1 || i == 2) {
                eVar = vyg.e.ASSET;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = vyg.e.POSITIONS;
            }
            vyg.e category = eVar;
            sxg.k kVar = (sxg.k) bVar.d;
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(timeframe, "timeframe");
            Intrinsics.checkNotNullParameter(category, "category");
            j jVar = (j) bVar.e;
            a2VarA1 = l.a1(this, !jVar.g(analyticsType) ? kVar.h(analyticsType, timeframe.b(), iwg.c.SIMPLE, category) : kVar.g(analyticsType, jVar.b(analyticsType), timeframe.b(), iwg.c.SIMPLE, category), null, null, new bzg.q(this, continuation, 0), 3);
            aVar = this;
        } else {
            aVar = this;
            WidgetisedAnalyticsType analyticsType2 = ((k) j2Var2.getValue()).f19990a;
            vyg.c timeframe2 = ((k) j2Var2.getValue()).d;
            sxg.k kVar2 = (sxg.k) bVar.d;
            kwg.l lVar = kVar2.f266493b;
            j jVar2 = kVar2.f266494c;
            Intrinsics.checkNotNullParameter(analyticsType2, "analyticsType");
            Intrinsics.checkNotNullParameter(timeframe2, "timeframe");
            boolean zG = ((j) bVar.e).g(analyticsType2);
            Flow flowH = i.f290039a;
            if (zG) {
                eel.c timeSpan = timeframe2.b();
                Intrinsics.checkNotNullParameter(analyticsType2, "analyticsType");
                Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                if (jVar2.g(analyticsType2) && jVar2.h(analyticsType2)) {
                    Intrinsics.checkNotNullParameter(analyticsType2, "analyticsType");
                    Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                    flowH = xam.a.h(new sek.q(kVar2, continuation, 26), lVar.g(new z(lVar, 4, timeSpan, analyticsType2)));
                }
            } else {
                eel.c timeSpan2 = timeframe2.b();
                Intrinsics.checkNotNullParameter(analyticsType2, "analyticsType");
                Intrinsics.checkNotNullParameter(timeSpan2, "timeSpan");
                if (jVar2.h(analyticsType2)) {
                    Intrinsics.checkNotNullParameter(analyticsType2, "analyticsType");
                    Intrinsics.checkNotNullParameter(timeSpan2, "timeSpan");
                    flowH = xam.a.h(new g(kVar2, analyticsType2, continuation, 14), rd0.e.b(lVar.e(analyticsType2, new kwg.d(lVar, timeSpan2, analyticsType2))));
                }
            }
            a2VarA1 = l.a1(aVar, flowH, null, null, new bzg.q(this, continuation, 1), 3);
        }
        aVar.f95124x = a2VarA1;
    }

    public final void J2() {
        a2 a2Var = this.f95125y;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        y yVar = this.f95123w;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        this.f95125y = l.a1(this, this.o.x(((k) j2Var.getValue()).f19990a, ((k) j2Var2.getValue()).d, ((k) j2Var2.getValue()).f19991b), null, null, new bzg.q(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.f95123w.B(new t(13)), null, new u(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f95123w;
    }
}
