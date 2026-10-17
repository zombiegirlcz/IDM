package com.revolut.domain.models.moneyrequest;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final MoneyRequestCounterParty a(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        int i = v61.a.f286264a[moneyRequest.f60322n.ordinal()];
        if (i == 1) {
            return moneyRequest.f60320l;
        }
        if (i == 2) {
            return moneyRequest.k;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean b(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        if (moneyRequest.f60322n != MoneyRequestDirection.INCOMING) {
            return false;
        }
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
        String f60343a = moneyRequestCounterParty != null ? moneyRequestCounterParty.getF60343a() : null;
        return f60343a == null || f60343a.length() == 0;
    }

    public static final boolean c(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        if (moneyRequest.f60322n != MoneyRequestDirection.OUTGOING) {
            return false;
        }
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
        String f60343a = moneyRequestCounterParty != null ? moneyRequestCounterParty.getF60343a() : null;
        return f60343a == null || f60343a.length() == 0;
    }

    public static final String d(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        MoneyRequestChannel moneyRequestChannel = moneyRequest.f60316c;
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.f60320l;
        if (!Intrinsics.f(moneyRequestChannel, MoneyRequestChannel.Upi.f60335b)) {
            Intrinsics.checkNotNullParameter(moneyRequestCounterParty, "<this>");
            String strC = a.c(moneyRequestCounterParty);
            return strC.length() == 0 ? m70.a.l(a.d(moneyRequestCounterParty)) : strC;
        }
        if (!(moneyRequestCounterParty instanceof MoneyRequestCounterParty.Apm)) {
            if (moneyRequestCounterParty instanceof MoneyRequestCounterParty.Revolut) {
                return a.b((MoneyRequestCounterParty.Revolut) moneyRequestCounterParty);
            }
            if (moneyRequestCounterParty instanceof MoneyRequestCounterParty.BankBeneficiary) {
                return a.a((MoneyRequestCounterParty.BankBeneficiary) moneyRequestCounterParty);
            }
            throw new NoWhenBranchMatchedException();
        }
        MoneyRequestCounterParty.Apm apm = (MoneyRequestCounterParty.Apm) moneyRequestCounterParty;
        String str = apm.e;
        if (str == null) {
            Intrinsics.checkNotNullParameter(apm, "<this>");
            Intrinsics.checkNotNullParameter(apm, "<this>");
            String str2 = apm.d;
            if (str2 != null) {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    str = str2;
                }
            }
            if (str == null) {
                m70.a.c(t0.f186434a);
                return "";
            }
        }
        return str;
    }

    public static final boolean e(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        MoneyRequestChannel moneyRequestChannel = moneyRequest.f60316c;
        DateTime dateTime = moneyRequest.i;
        if (moneyRequestChannel instanceof MoneyRequestChannel.Revolut) {
            return dateTime == null || DateTime.now().compareTo((ReadableInstant) dateTime.plusHours(2)) > 0;
        }
        if ((moneyRequestChannel instanceof MoneyRequestChannel.APM) || (moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean f(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        return moneyRequest.f60315b == MoneyRequestState.CANCELLED;
    }
}
