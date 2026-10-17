package xea;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import je6.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f304560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cm4.a f304561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.b f304562c;

    public c(h externalInstitutionLogoMapper, cm4.a creditCardItemMapper, t70.b currencyLocalization) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(creditCardItemMapper, "creditCardItemMapper");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        this.f304560a = externalInstitutionLogoMapper;
        this.f304561b = creditCardItemMapper;
        this.f304562c = currencyLocalization;
    }

    public static Clause b(io3.g gVar) {
        dj0.d dVar = gVar.f163164b;
        io3.d dVar2 = gVar.f163163a;
        return (dVar == null || Intrinsics.f(dVar2.f163147c, dVar.f115083b.f306286a) || dVar2.i == 0) ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.AccountCellItemDelegate.Model a(io3.g r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xea.c.a(io3.g, boolean):com.revolut.core.ui_kit.delegates.AccountCellItemDelegate$Model");
    }
}
