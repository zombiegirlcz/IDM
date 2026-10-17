package com.revolut.feature.credit.card.impl.ui.statement.details;

import ali.b;
import ang.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreenContract$StatementPagerItem;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreenContract$InputData;
import ft4.w;
import fv4.n;
import hx7.e;
import java.time.LocalDate;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lt4.d;
import md6.s;
import oki.h;
import om4.x2;
import vkm.j2;
import vkm.q;
import vl4.i;
import w4l.j;
import yji.l;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zi0.c;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements n {
    public final CreditCardStatementDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f69661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f69662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f69663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f69664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69665t;
    public final b u;

    public a(CreditCardStatementDetailsScreenContract$InputData inputData, al4.n creditCardInteractor, d creditCardDialogModelMapper, f userInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogModelMapper, "creditCardDialogModelMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69661p = creditCardInteractor;
        this.f69662q = creditCardDialogModelMapper;
        this.f69663r = userInteractor;
        this.f69664s = mra.d.b(this, new fv4.f(new Data(null, null, true, 3, null), null, f0.f322471a), stateMapper, null, false, 12);
        final int i = 0;
        this.f69665t = e.a(this, new Function2(this) { // from class: fv4.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.statement.details.a f138344b;

            {
                this.f138344b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        CreditCardStatementDetailsScreenContract$ModalStep step = (CreditCardStatementDetailsScreenContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof CreditCardStatementDetailsScreenContract$ModalStep.Dialog)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lt4.d dVar = this.f138344b.f69662q;
                        CreditCardDialogModel creditCardDialogModel = ((CreditCardStatementDetailsScreenContract$ModalStep.Dialog) step).f69659a.f68855a;
                        dVar.getClass();
                        return lt4.d.a(creditCardDialogModel);
                    default:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        CreditCardStatementDetailsScreenContract$StatementPagerItem creditCardStatementDetailsScreenContract$StatementPagerItem = (CreditCardStatementDetailsScreenContract$StatementPagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(creditCardStatementDetailsScreenContract$StatementPagerItem, "<destruct>");
                        LocalDate localDate = creditCardStatementDetailsScreenContract$StatementPagerItem.f69660a;
                        com.revolut.feature.credit.card.impl.ui.statement.details.a aVar = this.f138344b;
                        CreditCardStatementPageScreen creditCardStatementPageScreen = new CreditCardStatementPageScreen(new CreditCardStatementPageScreenContract$InputData(aVar.o.f69657a, localDate));
                        fs2.k block = new fs2.k(aVar, 13);
                        Intrinsics.checkNotNullParameter(block, "block");
                        creditCardStatementPageScreen.H = block;
                        return creditCardStatementPageScreen;
                }
            }
        });
        final int i2 = 1;
        this.u = s.b(this, new Function2(this) { // from class: fv4.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.statement.details.a f138344b;

            {
                this.f138344b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        CreditCardStatementDetailsScreenContract$ModalStep step = (CreditCardStatementDetailsScreenContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof CreditCardStatementDetailsScreenContract$ModalStep.Dialog)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lt4.d dVar = this.f138344b.f69662q;
                        CreditCardDialogModel creditCardDialogModel = ((CreditCardStatementDetailsScreenContract$ModalStep.Dialog) step).f69659a.f68855a;
                        dVar.getClass();
                        return lt4.d.a(creditCardDialogModel);
                    default:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        CreditCardStatementDetailsScreenContract$StatementPagerItem creditCardStatementDetailsScreenContract$StatementPagerItem = (CreditCardStatementDetailsScreenContract$StatementPagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(creditCardStatementDetailsScreenContract$StatementPagerItem, "<destruct>");
                        LocalDate localDate = creditCardStatementDetailsScreenContract$StatementPagerItem.f69660a;
                        com.revolut.feature.credit.card.impl.ui.statement.details.a aVar = this.f138344b;
                        CreditCardStatementPageScreen creditCardStatementPageScreen = new CreditCardStatementPageScreen(new CreditCardStatementPageScreenContract$InputData(aVar.o.f69657a, localDate));
                        fs2.k block = new fs2.k(aVar, 13);
                        Intrinsics.checkNotNullParameter(block, "block");
                        creditCardStatementPageScreen.H = block;
                        return creditCardStatementPageScreen;
                }
            }
        });
    }

    @Override // ali.h
    public final b I0() {
        return this.u;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.q(rd0.e.n(nim.a.v(u0.m(((x2) this.f69661p).s(this.o.f69657a, w4l.h.f294642c), nim.a.v(this.f69663r.j(j.f294644c), fv4.s.f)), new w(25)), h0.f322473a)), null, null, new fna.f(this, null, 13), 3);
    }

    public final i I2() {
        y yVar = this.f69664s;
        for (i iVar : ((fv4.e) c.I(((fv4.f) ((j2) yVar.f22677a).getValue()).f138327c)).f138323a) {
            if (Intrinsics.f(iVar.f290264b.toString(), ((fv4.f) ((j2) yVar.f22677a).getValue()).f138326b)) {
                return iVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69665t;
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.f69664s;
    }
}
