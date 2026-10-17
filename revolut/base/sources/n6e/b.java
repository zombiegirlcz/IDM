package n6e;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import g48.r0;
import g6e.d;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pcd.m;
import pcd.s;
import rd0.e;
import w4l.k;
import wsg.n;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements g6e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f212772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f212773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.b f212774c;
    public final r0 d;

    public b(n walletInteractor, d subaccountInteractor, g6e.b subaccountBackgroundInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f212772a = walletInteractor;
        this.f212773b = subaccountInteractor;
        this.f212774c = subaccountBackgroundInteractor;
        this.d = jointAccountsInteractor;
    }

    public static boolean d(Subaccount subaccount) {
        if (cp5.d.A(subaccount.getCurrency())) {
            return subaccount.c().equals(SubaccountType.Personal.f88963a) || subaccount.c().equals(SubaccountType.Joint.f88961a) || subaccount.c().equals(SubaccountType.Pro.f88964a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public final ArrayList b(List list, LinkedHashMap linkedHashMap, boolean z) {
        ?? arrayList;
        s sVar;
        List list2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            io3.d dVar = (io3.d) it8.next();
            Subaccount subaccount = (Subaccount) linkedHashMap.get(dVar.f163145a);
            if (subaccount != null || !z) {
                String name = subaccount != null ? subaccount.getName() : null;
                LayeredImage layeredImageC = subaccount != null ? ((s6e.d) this.f212774c).c(subaccount.c()) : null;
                xi0.b currency = subaccount != null ? subaccount.getCurrency() : null;
                Subaccount.Personal personal = subaccount instanceof Subaccount.Personal ? (Subaccount.Personal) subaccount : null;
                if (personal == null || (sVar = personal.f88956a) == null || (list2 = sVar.f234888m) == null) {
                    arrayList = f0.f322471a;
                } else {
                    List list3 = list2;
                    arrayList = new ArrayList(w.t(list3, 10));
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(((m) it9.next()).f234873b);
                    }
                }
                pocketWithSubaccount = new PocketWithSubaccount(dVar, name, layeredImageC, currency, (List) arrayList, Intrinsics.f(subaccount != null ? subaccount.c() : null, SubaccountType.Pro.f88964a));
            }
            if (pocketWithSubaccount != null) {
                arrayList2.add(pocketWithSubaccount);
            }
        }
        return arrayList2;
    }

    public final vkm.d c(AccountId accountId, k kVar) {
        l[] elements = {l.SAVINGS, l.CURRENT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return e.b(nim.a.w(osg.b.g(this.f212772a, kVar, null, null, null, null, null, accountId, 62), new imk.e(15, kotlin.collections.d.y0(elements))));
    }
}
