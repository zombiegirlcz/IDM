package pn4;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardFeatureConfig;
import hx7.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import ll4.i;
import ll4.j;
import on4.k;
import yhm.m;
import yhm.n;
import yhm.o;
import yw4.f;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static final CreditCardFeatureConfig a(k kVar) throws Throwable {
        Object objA;
        f fVar;
        Object objA2;
        j jVar;
        i iVar;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (!(kVar instanceof on4.i)) {
            if (kVar instanceof on4.j) {
                return CreditCardFeatureConfig.UnsupportedFeatureConfig.f68734a;
            }
            throw new NoWhenBranchMatchedException();
        }
        on4.i iVar2 = (on4.i) kVar;
        String currency = iVar2.getCurrency();
        try {
            m.Companion companion = m.INSTANCE;
            i[] iVarArrValues = i.values();
            int length = iVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    iVar = null;
                    break;
                }
                i iVar3 = iVarArrValues[i];
                if (a0.z(iVar3.name(), currency, true)) {
                    iVar = iVar3;
                    break;
                }
                i++;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (iVar == null) {
            throw new IllegalStateException("Unsupported enum value: " + currency + " for " + o0.f186429a.b(i.class).m());
        }
        objA = iVar;
        Throwable thA = m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
        boolean z = objA instanceof n;
        Object obj2 = objA;
        if (z) {
            obj2 = null;
        }
        i iVar4 = (i) ((Enum) obj2);
        if (iVar4 == null) {
            iVar4 = i.FACILITY_CURRENCY;
        }
        String feature = iVar2.getFeature();
        f[] fVarArrValues = f.values();
        int length2 = fVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i2];
            if (a0.z(fVar.name(), feature, true)) {
                break;
            }
            i2++;
        }
        if (fVar == null) {
            throw new IllegalStateException(j6.a.q("Unknown enum value: ", iVar2.getFeature()));
        }
        List<String> products = iVar2.getProducts();
        ArrayList arrayList = new ArrayList(w.t(products, 10));
        for (String str : products) {
            try {
                m.Companion companion3 = m.INSTANCE;
                j[] jVarArrValues = j.values();
                int length3 = jVarArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        jVar = null;
                        break;
                    }
                    j jVar2 = jVarArrValues[i3];
                    if (a0.z(jVar2.name(), str, true)) {
                        jVar = jVar2;
                        break;
                    }
                    i3++;
                }
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th11) {
                m.Companion companion4 = m.INSTANCE;
                objA2 = o.a(th11);
            }
            if (jVar == null) {
                throw new IllegalStateException("Unsupported enum value: " + str + " for " + o0.f186429a.b(j.class).m());
            }
            objA2 = jVar;
            Throwable thA2 = m.a(objA2);
            if (thA2 != null) {
                e.n(thA2);
            }
            boolean z3 = objA2 instanceof n;
            Object obj3 = objA2;
            if (z3) {
                obj3 = null;
            }
            j jVar3 = (j) ((Enum) obj3);
            if (jVar3 == null) {
                jVar3 = j.UNKNOWN;
            }
            arrayList.add(jVar3);
        }
        return new CreditCardFeatureConfig.MoveMoneyFeatureConfig(iVar4, fVar, arrayList);
    }
}
