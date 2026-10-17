package zmb;

import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;
import com.revolut.feature.retail.savings.api.navigation.providers.SavingsNavigationProvider$TopUpConfig;
import com.youTransactor.uCube.rpc.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pcd.s;
import te0.w;
import ufm.i;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jf0.c f323437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f323438c;

    public /* synthetic */ b(jf0.c cVar, f fVar, int i) {
        this.f323436a = i;
        this.f323437b = cVar;
        this.f323438c = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Long lValueOf;
        Object next;
        int i = this.f323436a;
        SavingsAccountCreationFlow$Filter.All all2 = SavingsAccountCreationFlow$Filter.All.f83128a;
        Long lValueOf2 = null;
        jf0.c cVar = this.f323437b;
        f fVar = this.f323438c;
        switch (i) {
            case 0:
                mjb.a aVar = fVar.e;
                List<s> moneyBoxes = (List) obj2;
                Intrinsics.checkNotNullParameter(moneyBoxes, "moneyBoxes");
                String strE = cVar.e(3);
                HashMap map = cVar.d;
                try {
                    String str = (String) map.get("amount");
                    lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                    break;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    lValueOf = null;
                }
                String str2 = (String) map.get("isAmountLocked");
                boolean z = str2 != null ? Boolean.parseBoolean(str2) : false;
                if (!d0.W(strE)) {
                    for (s sVar : moneyBoxes) {
                        if (strE.equals(sVar.f234881a) || strE.equals(sVar.f234882b)) {
                            return ((hob.d) aVar).g(new SavingsNavigationProvider$TopUpConfig(sVar, sVar.e(), lValueOf, false, false, z, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                Long l2 = lValueOf;
                int size = moneyBoxes.size();
                if (size == 0) {
                    return fVar.c(all2);
                }
                if (size == 1) {
                    s sVar2 = (s) zhm.d0.b0(moneyBoxes);
                    return ((hob.d) aVar).g(new SavingsNavigationProvider$TopUpConfig(sVar2, sVar2.e(), l2, false, false, z, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                }
                ufm.b bVarM = efm.d0.m(vhi.c.c(new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination(new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectTopUpAccount(l2)), yhi.b.BOTTOM_DIALOG, null, false, 12));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 1:
                mjb.a aVar2 = fVar.e;
                List moneyBoxes2 = (List) obj2;
                Intrinsics.checkNotNullParameter(moneyBoxes2, "moneyBoxes");
                String strE2 = cVar.e(3);
                Iterator it8 = moneyBoxes2.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        s sVar3 = (s) next;
                        if (Intrinsics.f(strE2, sVar3.f234881a) || Intrinsics.f(strE2, sVar3.f234882b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                s sVar4 = (s) next;
                if (sVar4 == null) {
                    int size2 = moneyBoxes2.size();
                    if (size2 == 0) {
                        return fVar.c(all2);
                    }
                    if (size2 == 1) {
                        return w.j(((hob.d) aVar2).d((s) zhm.d0.b0(moneyBoxes2), null));
                    }
                    ufm.b bVarM2 = efm.d0.m(vhi.c.c(new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination(SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectGoalAccount.f83175a), yhi.b.BOTTOM_DIALOG, null, false, 12));
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                try {
                    String str3 = (String) cVar.d.get("amount");
                    if (str3 != null) {
                        lValueOf2 = Long.valueOf(Long.parseLong(str3));
                    }
                    break;
                } catch (Exception e2) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                }
                return w.j(((hob.d) aVar2).d(sVar4, lValueOf2));
            case 2:
                mjb.a aVar3 = fVar.e;
                List<s> moneyBoxes3 = (List) obj2;
                Intrinsics.checkNotNullParameter(moneyBoxes3, "moneyBoxes");
                String strE3 = cVar.e(3);
                if (d0.W(strE3)) {
                    int size3 = moneyBoxes3.size();
                    if (size3 == 0) {
                        return fVar.c(all2);
                    }
                    if (size3 == 1) {
                        return w.j(((hob.d) aVar3).f((s) zhm.d0.b0(moneyBoxes3), null));
                    }
                    ufm.b bVarM3 = efm.d0.m(vhi.c.c(new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination(SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectSpareChangeAccount.f83176a), yhi.b.BOTTOM_DIALOG, null, false, 12));
                    Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                    return bVarM3;
                }
                for (s sVar5 : moneyBoxes3) {
                    if (strE3.equals(sVar5.f234881a) || strE3.equals(sVar5.f234882b)) {
                        try {
                            String str4 = (String) cVar.d.get("multiplier");
                            if (str4 != null) {
                                lValueOf2 = Long.valueOf(Long.parseLong(str4));
                            }
                            break;
                        } catch (Exception e4) {
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var3);
                        }
                        return w.j(((hob.d) aVar3).f(sVar5, lValueOf2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                s vault = (s) obj2;
                Intrinsics.checkNotNullParameter(vault, "moneyBox");
                try {
                    String str5 = (String) cVar.d.get("amount");
                    if (str5 != null) {
                        lValueOf2 = Long.valueOf(Long.parseLong(str5));
                    }
                    break;
                } catch (Exception e5) {
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e5, h0Var4);
                }
                hob.d dVar = (hob.d) fVar.e;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(vault, "vault");
                i iVar = new i(((n7i.s) dVar.f154264a).d(vault.f234881a), new hje.e(new g31.e(dVar, 27, vault, lValueOf2), 21), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
        }
    }

    public /* synthetic */ b(f fVar, jf0.c cVar) {
        this.f323436a = 3;
        this.f323438c = fVar;
        this.f323437b = cVar;
    }
}
