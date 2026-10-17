package hh6;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.api.model.Mandate;
import hh6.j;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh6.c f152275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bh6.h f152276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je6.h f152277c;

    public q(bh6.c mandateDetailsMapper, bh6.h termsAndConditionsMapper, je6.h externalInstitutionLogoMapper) {
        Intrinsics.checkNotNullParameter(mandateDetailsMapper, "mandateDetailsMapper");
        Intrinsics.checkNotNullParameter(termsAndConditionsMapper, "termsAndConditionsMapper");
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        this.f152275a = mandateDetailsMapper;
        this.f152276b = termsAndConditionsMapper;
        this.f152277c = externalInstitutionLogoMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof i) {
            i iVar2 = (i) domainState;
            qe6.b bVar = iVar2.f152259a;
            List listB = ((bh6.d) this.f152275a).b(bVar.f245087b, iVar2.f152260b, iVar2.f152261c, iVar2.d, iVar2.e, bVar.f245086a.e);
            yp0.b.k(listB, 0, 0, 0, 0, 31);
            ArrayList arrayListU = w.u(v.k(listB, v.l(bVar.f245086a.e ? ((bh6.i) this.f152276b).a(bh6.g.DETAILS_SCREEN) : null)));
            dj0.d dVar = iVar2.f152260b;
            Mandate mandate = bVar.f245086a;
            ExternalInstitution externalInstitution = bVar.f245087b;
            return new l(arrayListU, !(Intrinsics.f(dVar, mandate.f72226c.f72227a) && Intrinsics.f(iVar2.f152261c, mandate.f72226c.f72228b)) && mandate.e, bVar.f245086a.e, new TextClause(externalInstitution.f66108b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((di6.a) this.f152277c).b(externalInstitution.f66109c));
        }
        if (!Intrinsics.f(domainState, j.a.f152262a)) {
            throw new NoWhenBranchMatchedException();
        }
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("loading_", it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new l(arrayList, false, false, null, null);
    }
}
