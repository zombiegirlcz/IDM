package sj4;

import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import pkm.e;
import t70.g;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f263676a;

    public a(g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f263676a = localization;
    }

    public final String a(int i) {
        b.Companion companion = b.INSTANCE;
        e eVar = e.MINUTES;
        long jG = c.g(i, eVar);
        e eVar2 = e.HOURS;
        long jL = b.l(jG, c.g(12, eVar2));
        e eVar3 = e.DAYS;
        long jN = b.n(b.n(jL, eVar3) > b.n(jG, eVar3) ? b.l(jG, c.g(1, eVar3)) : jG, eVar3);
        if (b.n(b.l(jG, c.g(30, eVar)), eVar2) > b.n(jG, eVar2)) {
            jG = b.l(jG, c.g(1, eVar2));
        }
        long jN2 = b.n(jG, eVar2);
        g gVar = this.f263676a;
        return jN2 > 24 ? gVar.h(R$plurals.loan_application_expires_days, Long.valueOf(jN), Long.valueOf(jN)) : (1 > jN2 || jN2 >= 25) ? gVar.getString(R$string.loan_application_expires_in_less_than_one_hour) : gVar.h(R$plurals.loan_application_expires_hours, Long.valueOf(jN2), Long.valueOf(jN2));
    }
}
