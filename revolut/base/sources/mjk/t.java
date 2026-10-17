package mjk;

import bjk.i2;
import bjk.j2;
import bjk.k2;
import bjk.l2;
import bjk.m2;
import bjk.n2;
import bjk.o2;
import bjk.p2;
import bjk.s2;
import bjk.t2;
import bjk.u2;
import bjk.v2;
import com.revolut.feature.pricingplans.models.documents.PricingPlanDocument;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t {
    public static final PricingPlanAction a(v2 v2Var) {
        Intrinsics.checkNotNullParameter(v2Var, "<this>");
        if (v2Var instanceof l2) {
            return PricingPlanAction.Dismiss.f102801a;
        }
        if (v2Var instanceof k2) {
            return PricingPlanAction.Decline.f102800a;
        }
        hha.i iVar = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        if (v2Var instanceof m2) {
            m2 m2Var = (m2) v2Var;
            String str = m2Var.f16024a;
            String str2 = m2Var.f16025b;
            if (str2 != null) {
                hha.i[] iVarArrValues = hha.i.values();
                int length = iVarArrValues.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    hha.i iVar2 = iVarArrValues[i2];
                    if (a0.z(iVar2.name(), str2, true)) {
                        iVar = iVar2;
                        break;
                    }
                    i2++;
                }
            }
            return new PricingPlanAction.OpenBillingPicker(iVar, str, m2Var.f16026c, m2Var.d);
        }
        if (v2Var instanceof n2) {
            return new PricingPlanAction.OpenUrl(((n2) v2Var).f16032a);
        }
        if (v2Var instanceof o2) {
            return new PricingPlanAction.SeeAllBenefits(((o2) v2Var).f16039a);
        }
        if (v2Var instanceof u2) {
            u2 u2Var = (u2) v2Var;
            String str3 = u2Var.f16083b;
            String str4 = u2Var.f16082a;
            hha.i[] iVarArrValues2 = hha.i.values();
            int length2 = iVarArrValues2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                hha.i iVar3 = iVarArrValues2[i5];
                if (a0.z(iVar3.name(), str3, true)) {
                    iVar = iVar3;
                    break;
                }
                i5++;
            }
            if (iVar == null) {
                throw new IllegalArgumentException(j6.a.q("Unsupported billing period: ", str3));
            }
            String str5 = u2Var.f16084c;
            Boolean bool = u2Var.d;
            return new PricingPlanAction.Upgrade(str4, iVar, str5, bool != null ? bool.booleanValue() : false);
        }
        if (v2Var instanceof i2) {
            i2 i2Var = (i2) v2Var;
            String str6 = i2Var.f15983b;
            String str7 = i2Var.f15982a;
            hha.i[] iVarArrValues3 = hha.i.values();
            int length3 = iVarArrValues3.length;
            while (true) {
                if (i3 >= length3) {
                    break;
                }
                hha.i iVar4 = iVarArrValues3[i3];
                if (a0.z(iVar4.name(), str6, true)) {
                    iVar = iVar4;
                    break;
                }
                i3++;
            }
            if (iVar != null) {
                return new PricingPlanAction.ApplyDiscount(iVar, str7, i2Var.f15984c);
            }
            throw new IllegalArgumentException(j6.a.q("Unsupported billing period: ", str6));
        }
        if (!(v2Var instanceof j2)) {
            if (!(v2Var instanceof p2)) {
                if (v2Var instanceof t2) {
                    return new PricingPlanAction.Unsupported(((t2) v2Var).f16075a);
                }
                throw new NoWhenBranchMatchedException();
            }
            Iterable iterable = ((p2) v2Var).f16047a;
            if (iterable == null) {
                iterable = f0.f322471a;
            }
            Iterable<s2> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(zhm.w.t(iterable2, 10));
            for (s2 s2Var : iterable2) {
                arrayList.add(new PricingPlanDocument(s2Var.f16068a, s2Var.f16069b));
            }
            return new PricingPlanAction.SeeAllDocuments(arrayList);
        }
        j2 j2Var = (j2) v2Var;
        String str8 = j2Var.d;
        String str9 = j2Var.f15994a;
        String str10 = j2Var.f15995b;
        hha.i[] iVarArrValues4 = hha.i.values();
        int length4 = iVarArrValues4.length;
        while (true) {
            if (i >= length4) {
                break;
            }
            hha.i iVar5 = iVarArrValues4[i];
            if (a0.z(iVar5.name(), str8, true)) {
                iVar = iVar5;
                break;
            }
            i++;
        }
        if (iVar != null) {
            return new PricingPlanAction.ClaimPlanReferral(iVar, str9, str10, j2Var.f15996c);
        }
        throw new IllegalArgumentException(j6.a.q("Unsupported billing period: ", str8));
    }
}
