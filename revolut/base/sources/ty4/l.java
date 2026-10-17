package ty4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit.direct.debit.account_selection.models.LinkedPocketInfo;
import com.revolut.feature.credit.direct.debit.account_selection.models.RevolutPocketInfo;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f275474b;

    public /* synthetic */ l(o oVar, int i) {
        this.f275473a = i;
        this.f275474b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        int i = this.f275473a;
        o oVar = this.f275474b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                oVar.f275482t.getClass();
                oVar.X1(xy4.b.a());
                return Boolean.TRUE;
            case 1:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                r rVarW = nim.a.w(u1.e(osg.b.d(oVar.f275483w), osg.b.e(oVar.f275483w, false, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, null, 116), z71.a.b(oVar.f275484x, false, null, null, 6)), new l(oVar, 3));
                cz4.b bVar = oVar.f275481s;
                String str = oVar.f275479q.f69887a;
                if (str == null) {
                    str = "";
                }
                return nim.a.w(kli.a.h(rVarW, nim.a.w(bVar.b(str), new twg.a(accounts, oVar, 9))), new s78.n(accounts, 15));
            case 2:
                List<AccountDetails.LinkedAccount> accounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                oVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (AccountDetails.LinkedAccount linkedAccount : accounts2) {
                    arrayList.add(new LinkedPocketInfo(linkedAccount.f68540a, linkedAccount.f68541b, linkedAccount.f68542c, linkedAccount.d, linkedAccount.e, linkedAccount.f, linkedAccount.f68543g, linkedAccount.f68544h));
                }
                return arrayList;
            default:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                xi0.b bVar2 = (xi0.b) rVar.f314201a;
                List list = (List) rVar.f314202b;
                List list2 = (List) rVar.f314203c;
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        io3.d dVar = (io3.d) next;
                        if (dVar.f != io3.k.ACTIVE || !Intrinsics.f(dVar.f163147c, bVar2.f306286a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar2 = (io3.d) next;
                Iterator it9 = list2.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((n71.b) next2).f212975b, bVar2.f306286a)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                n71.b bVar3 = (n71.b) next2;
                List<io3.d> listL = v.l(dVar2);
                ArrayList arrayList2 = new ArrayList();
                for (io3.d dVar3 : listL) {
                    xi0.a aVar = xi0.b.Companion;
                    String str2 = dVar3.f163147c;
                    String str3 = dVar3.f163147c;
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(str2);
                    String strA = oVar.v.a(new xi0.b(6, str3, null));
                    String str4 = strA == null ? str3 : strA;
                    Image imageB = ((di6.a) oVar.u).b(dVar3.f163156r);
                    if (imageB == null) {
                        imageB = new CurrencyImage(str3, (ImageTransformations) null, (TextLocalisedClause) null, 14);
                    }
                    arrayList2.add(new RevolutPocketInfo(dVar3.i, dVar3, bVarA, str4, imageB, bVar3 != null ? bVar3.f212976c : null, bVar3 != null ? bVar3.d : null, bVar3 != null ? bVar3.i : null));
                }
                return arrayList2;
        }
    }
}
