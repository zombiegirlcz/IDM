package com.revolut.feature.credit.application.plugins.impl.ui.debts;

import c84.t;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import e84.e;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q5g.f0;
import q84.d;
import q84.h;
import q84.l;
import rp0.m;
import wsg.n;
import yki.i;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements d {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z84.a f67433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ww3.c f67434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f67435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final OutstandingDebtsFlowContract$InputData f67436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f67437t;
    public final i u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z84.a mapper, ww3.c interactor, n walletInteractor, OutstandingDebtsFlowContract$InputData inputData, j60.a bottomDialogExtension, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67433p = mapper;
        this.f67434q = interactor;
        this.f67435r = walletInteractor;
        this.f67436s = inputData;
        this.f67437t = bottomDialogExtension;
        this.u = d8l.d.a(this, new f0(this, 4));
    }

    @Override // yki.j
    public final void M0() {
        l2(new l(this, null, 0), new yi5.b(26));
    }

    public final void P2() {
        int i;
        int i2;
        this.f67433p.getClass();
        m.b bVar = m.Companion;
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.credit_application_outstanding_debts_add_debt_dialog_title, null, null, 14), null, null, 30);
        rp0.l lVar = rp0.l.WINDOW;
        EnumEntries<q84.b> enumEntriesA = q84.b.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (q84.b bVar2 : enumEntriesA) {
            String string = bVar2.toString();
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(z84.a.a(bVar2), null, null, false, null, false, 60);
            int[] iArr = q84.a.f242970a;
            int i3 = iArr[bVar2.ordinal()];
            if (i3 == 1) {
                i = R$string.credit_application_outstanding_debts_add_debt_dialog_mortgage_title;
            } else if (i3 == 2) {
                i = R$string.credit_application_outstanding_debts_add_debt_dialog_loan_title;
            } else if (i3 == 3) {
                i = R$string.credit_application_outstanding_debts_add_debt_dialog_credit_card_title;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.credit_application_outstanding_debts_add_debt_dialog_other_title;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
            int i5 = iArr[bVar2.ordinal()];
            if (i5 == 1) {
                i2 = R$string.credit_application_outstanding_debts_add_debt_dialog_mortgage_subtitle;
            } else if (i5 == 2) {
                i2 = R$string.credit_application_outstanding_debts_add_debt_dialog_loan_subtitle;
            } else if (i5 == 3) {
                i2 = R$string.credit_application_outstanding_debts_add_debt_dialog_credit_card_subtitle;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.credit_application_outstanding_debts_add_debt_dialog_other_subtitle;
            }
            arrayList.add(new RowDelegate.Model(string, image40, textLocalisedClause, null, 0, new TextLocalisedClause(i2, null, null, 14), null, null, 0, null, true, null, false, null, null, null, null, null, null, bVar2, null, 0, 0, 0, 0, 532674520));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp16, 0, 0, 29);
        this.f67437t.x(dy4.b.b(bVar, arrayList, tVar, lVar, null, null, null, 1016));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
