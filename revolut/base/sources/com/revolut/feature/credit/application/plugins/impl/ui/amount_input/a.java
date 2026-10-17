package com.revolut.feature.credit.application.plugins.impl.ui.amount_input;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$Configuration;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import dj0.d;
import dx4.s;
import dx4.t;
import dx4.w;
import dx4.x;
import dx4.y;
import dx4.z;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final TextLocalisedClause a(int i, long j2, s sVar) {
        return new TextLocalisedClause(i, u.c(new MoneyClause(new d(j2, sVar.f120758a), new MoneyClause.Format.Editable(), null, o9.NON_SENSITIVE, 4)), null, 12);
    }

    public static final TextLocalisedClause b(int i, long j2) {
        return new TextLocalisedClause(i, u.c(new TextClause(String.valueOf(j2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public static final CreditAmountInputScreenContract$InputData c(z zVar, String parameterKey, boolean z) {
        Long l2;
        CreditAmountInputScreenContract$Configuration.Remote remote;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        CreditAmountInputScreenContract$Configuration.Local local;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        t tVarT6 = zVar.t6();
        if (!(zVar instanceof w)) {
            if (!(zVar instanceof y)) {
                throw new NoWhenBranchMatchedException();
            }
            y yVar = (y) zVar;
            long j2 = yVar.d;
            long j3 = yVar.f120847c;
            Long l3 = yVar.e;
            int i = yVar.f;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_manual_input_title, u.c(new TextClause(yVar.f120845a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            x xVar = yVar.f120846b;
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_manual_input_button, u.c(new TextClause(yVar.f120850j, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            if (tVarT6 instanceof t.a) {
                l2 = l3;
                remote = new CreditAmountInputScreenContract$Configuration.Remote(b(R$string.credit_application_calculator_edit_duration_suggestion_min, j3), b(R$string.credit_application_calculator_edit_duration_suggestion_max, j2), yVar.f120851l, yVar.k, yVar.f120852m);
            } else {
                l2 = l3;
                if (tVarT6 instanceof t.b) {
                    remote = new CreditAmountInputScreenContract$Configuration.Remote(d(R$plurals.credit_application_calculator_edit_duration_suggestion_years_min, j3), d(R$plurals.credit_application_calculator_edit_duration_suggestion_years_max, j2), yVar.f120851l, yVar.k, yVar.f120852m);
                } else {
                    if (!(tVarT6 instanceof s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s sVar = (s) tVarT6;
                    remote = new CreditAmountInputScreenContract$Configuration.Remote(a(R$string.credit_application_calculator_edit_amount_suggestion_min, j3, sVar), a(R$string.credit_application_calculator_edit_amount_suggestion_max, j2, sVar), yVar.f120851l, yVar.k, yVar.f120852m);
                }
            }
            return new CreditAmountInputScreenContract$InputData(j3, j2, l2, i, textLocalisedClause3, xVar, textLocalisedClause4, tVarT6, yVar.f120849h, remote, parameterKey, z, yVar.f120853n);
        }
        w wVar = (w) zVar;
        long j5 = wVar.f120807c;
        long j16 = wVar.f120806b;
        long j22 = wVar.d;
        int i2 = wVar.e;
        boolean z3 = tVarT6 instanceof t.a;
        if (z3 || (tVarT6 instanceof t.b)) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_application_calculator_edit_duration_title, u.c(new TextClause(wVar.f120805a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            if (!(tVarT6 instanceof s)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_application_calculator_edit_amount_title, u.c(new TextClause(wVar.f120805a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        if (z3 || (tVarT6 instanceof t.b)) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_calculator_edit_duration_action, null, null, 14);
        } else {
            if (!(tVarT6 instanceof s)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_calculator_edit_amount_action, null, null, 14);
        }
        if (z3) {
            local = new CreditAmountInputScreenContract$Configuration.Local(b(R$string.credit_application_calculator_edit_duration_suggestion_min, j16), b(R$string.credit_application_calculator_edit_duration_suggestion_max, j5), R$string.credit_application_calculator_edit_duration_error_max, R$string.credit_application_calculator_edit_duration_error_min, R$string.credit_application_calculator_edit_duration_info_rounding);
        } else if (tVarT6 instanceof t.b) {
            local = new CreditAmountInputScreenContract$Configuration.Local(d(R$plurals.credit_application_calculator_edit_duration_suggestion_years_min, j16), d(R$plurals.credit_application_calculator_edit_duration_suggestion_years_max, j5), R$string.credit_application_calculator_edit_duration_error_max, R$string.credit_application_calculator_edit_duration_error_min, R$string.credit_application_calculator_edit_duration_info_rounding);
        } else {
            if (!(tVarT6 instanceof s)) {
                throw new NoWhenBranchMatchedException();
            }
            s sVar2 = (s) tVarT6;
            local = new CreditAmountInputScreenContract$Configuration.Local(a(R$string.credit_application_calculator_edit_amount_suggestion_min, j16, sVar2), a(R$string.credit_application_calculator_edit_amount_suggestion_max, j5, sVar2), R$string.credit_application_calculator_edit_amount_error_max, R$string.credit_application_calculator_edit_amount_error_min, R$string.credit_application_calculator_edit_amount_info_rounding);
        }
        CreditAmountInputScreenContract$Configuration.Local local2 = local;
        return new CreditAmountInputScreenContract$InputData(j16, j5, Long.valueOf(j22), i2, textLocalisedClause, null, textLocalisedClause2, tVarT6, wVar.f120808g, local2, parameterKey, z, null);
    }

    public static final TextLocalisedQuantityClause d(int i, long j2) {
        return new TextLocalisedQuantityClause(i, Integer.valueOf((int) j2), (List) null, (Style) null, 28);
    }
}
