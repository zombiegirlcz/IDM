package vy5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.currency.accounts.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yfe.a2;
import yfe.e2;
import yfe.f2;
import yfe.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements yfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.b f293139a;

    public b(g6e.b subaccountBackgroundInteractor) {
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        this.f293139a = subaccountBackgroundInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yfe.b
    public final yfe.p0 a(h.c cVar) {
        Void snapshot = (Void) cVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        throw new IllegalStateException("Cash total wealth does not support placeholder state");
    }

    @Override // yfe.b
    public final yfe.q0 b(h.a aVar) {
        Object a1Var;
        yfe.g snapshot = (yfe.g) aVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.home_total_wealth_category_cash_title, null, null, 14);
        dj0.d dVar = snapshot.f313255c;
        List<f2> list = snapshot.e;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (f2 f2Var : list) {
            if (f2Var instanceof a2) {
                a1Var = new yfe.z0(((a2) f2Var).f313241a);
            } else {
                if (!(f2Var instanceof e2)) {
                    throw new NoWhenBranchMatchedException();
                }
                a1Var = new yfe.a1(((s6e.d) this.f293139a).d(((e2) f2Var).f313252a));
            }
            arrayList.add(a1Var);
        }
        return new yfe.q0(textLocalisedClause, dVar, new yfe.d1(v13.d.Z(arrayList, new yfe.b1(R$drawable.uikit_icn_24_coins)), false), null, 56);
    }
}
