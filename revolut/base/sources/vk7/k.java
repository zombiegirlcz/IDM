package vk7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.api.models.cfac.CFACClaim;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimIds;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimStatus;
import com.revolut.feature.insurance.impl.R$string;
import ip0.gu;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import vgg.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements p {

    @NotNull
    public static final i Companion = new i();

    public static aim.e b() {
        aim.e eVarB = u.b();
        eVarB.add(new gu("CLAIMS ACTIVE SUBHEADER", 0, 0, 30));
        List listK = v.k(new pb0("CLAIM"), new pb0("CLAIM"), new pb0("CLAIM"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return u.a(eVarB);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f289875a, new vjk.b(this, 3), new a0(this, 23), new vjh.c(this, 1)));
    }

    public final ArrayList c(ArrayList arrayList) {
        Clause textLocalisedClause;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            CFACClaim cFACClaim = (CFACClaim) it8.next();
            String str = cFACClaim.d;
            if (str == null || str.length() == 0) {
                textLocalisedClause = new TextLocalisedClause(R$string.cfac_my_claims_claims_list_claim_name_claim, null, null, 14);
            } else {
                String str2 = cFACClaim.d;
                if (str2 == null) {
                    m70.a.c(t0.f186434a);
                    str2 = "";
                }
                textLocalisedClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            Clause clause = textLocalisedClause;
            int i = R$string.cfac_my_claims_claims_list_subtitle;
            long j2 = cFACClaim.f74933b;
            TimeClause.Format.INSTANCE.getClass();
            TimeClause timeClause = new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12);
            CFACClaimIds cFACClaimIds = cFACClaim.f74932a;
            String str3 = cFACClaimIds.f74960b;
            if (str3 == null) {
                str3 = cFACClaimIds.f74959a;
            }
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, v.k(timeClause, str3), null, 12);
            CFACClaimStatus status = cFACClaim.f74934c;
            Intrinsics.checkNotNullParameter(status, "status");
            arrayList2.add(new RowDelegate.Model("CLAIM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_shield, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), qk7.a.a(status), null, false, 28), clause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, cFACClaim, null, 0, 0, 0, 0, 532676568));
        }
        return arrayList2;
    }
}
