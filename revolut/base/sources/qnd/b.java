package qnd;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import i4b.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.e;
import md6.m;
import md6.n;
import md6.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f247937a;

    public b(f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.f247937a = legalEntityContextProvider;
    }

    public static md6.b a(e eVar) {
        md6.f fVar = md6.f.AGGREGATED;
        return new md6.b(eVar, m.f204493a, md6.d.DISCOVERY, fVar);
    }

    public static md6.b b(e eVar, io3.d dVar) {
        return new md6.b(eVar, d(z92.f.l(dVar)), md6.d.OPENED, md6.f.SIMPLE);
    }

    public static md6.b c(Subaccount subaccount) {
        e eVar;
        xi0.b currency = subaccount.getCurrency();
        SubaccountType subaccountTypeC = subaccount.c();
        if (subaccountTypeC.equals(SubaccountType.Group.f88960a)) {
            eVar = e.GROUP_SUBACCOUNT;
        } else if (subaccountTypeC.equals(SubaccountType.Joint.f88961a)) {
            eVar = e.JOINT_SUBACCOUNT;
        } else if (subaccountTypeC.equals(SubaccountType.Junior.f88962a)) {
            eVar = e.YOUTH_SUBACCOUNT;
        } else if (subaccountTypeC.equals(SubaccountType.Personal.f88963a)) {
            eVar = e.PERSONAL_SUBACCOUNT;
        } else if (subaccountTypeC.equals(SubaccountType.Pro.f88964a)) {
            eVar = e.PRO_SUBACCOUNT;
        } else if (subaccountTypeC.equals(SubaccountType.ProTax.f88965a)) {
            eVar = e.PRO_TAX_SUBACCOUNT;
        } else {
            if (!subaccountTypeC.equals(SubaccountType.Teen.f88966a)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = e.YOUTH_SUBACCOUNT;
        }
        return new md6.b(eVar, d(currency), md6.d.OPENED, md6.f.SIMPLE);
    }

    public static o d(xi0.b bVar) {
        return bVar != null ? new n(bVar) : m.f204493a;
    }
}
