package n14;

import dx4.e1;
import dx4.q;
import dx4.s;
import dx4.s4;
import dx4.t;
import dx4.u4;
import dx4.v4;
import dx4.w;
import dx4.w4;
import dx4.x4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nx4.m0;
import nx4.o0;
import nx4.p;
import nx4.s1;
import zhm.d0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f211237a = r0.k(new Pair("AMOUNT_FIRST", eu3.b.AMOUNT_FIRST), new Pair("DURATION_FIRST", eu3.b.DURATION_FIRST));

    public static final x4 a(c04.c cVar, String str, v4 v4Var, t tVar, String str2) {
        String title = cVar.getTitle();
        long minAmount = cVar.getMinAmount();
        long maxAmount = cVar.getMaxAmount();
        Integer increment = cVar.getIncrement();
        int iIntValue = increment != null ? increment.intValue() : 1;
        long defaultAmount = cVar.getDefaultAmount();
        Boolean enabled = cVar.getEnabled();
        boolean zBooleanValue = enabled != null ? enabled.booleanValue() : true;
        q qVar = cVar.getInfo() != null ? q.INFO : null;
        s1 info = cVar.getInfo();
        dx4.h hVar = info != null ? new dx4.h(p.c(info)) : null;
        q qVar2 = q.PENCIL;
        long minAmount2 = cVar.getMinAmount();
        long maxAmount2 = cVar.getMaxAmount();
        long defaultAmount2 = cVar.getDefaultAmount();
        Integer increment2 = cVar.getIncrement();
        return new x4(str, title, minAmount, maxAmount, defaultAmount, iIntValue, v4Var, zBooleanValue, hVar, qVar, new dx4.d(new w(cVar.getTitle(), minAmount2, maxAmount2, defaultAmount2, increment2 != null ? increment2.intValue() : 1, tVar)), qVar2, str2, null, w4.START);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final eu3.c b(c04.a aVar) {
        x4 x4VarA;
        eu3.b bVar;
        ?? arrayList;
        ?? arrayList2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String title = aVar.getTitle();
        String description = aVar.getDescription();
        String tag2 = aVar.getTag();
        c04.c amountSlider = aVar.getAmountSlider();
        x4 x4VarA2 = null;
        if (amountSlider != null) {
            xi0.a aVar2 = xi0.b.Companion;
            String currency = aVar.getCurrency();
            aVar2.getClass();
            xi0.b bVarA = xi0.a.a(currency);
            x4VarA = a(amountSlider, "id_borrow_amount_seek_bar", new s4(bVarA), new s(bVarA), "amountRequested");
        } else {
            x4VarA = null;
        }
        c04.c durationSlider = aVar.getDurationSlider();
        if (durationSlider != null) {
            String minAmountLabel = durationSlider.getMinAmountLabel();
            if (minAmountLabel == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String maxAmountLabel = durationSlider.getMaxAmountLabel();
            if (maxAmountLabel == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String currentAmountTemplate = durationSlider.getCurrentAmountTemplate();
            if (currentAmountTemplate == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            x4VarA2 = a(durationSlider, "id_month_seek_bar", new u4(minAmountLabel, maxAmountLabel, currentAmountTemplate), t.a.f120768a, "durationRequested");
        }
        x4 x4Var = x4VarA2;
        String slidersOrder = aVar.getSlidersOrder();
        if (slidersOrder == null || (bVar = (eu3.b) u1.v(slidersOrder, f211237a)) == null) {
            bVar = eu3.b.AMOUNT_FIRST;
        }
        eu3.b bVar2 = bVar;
        List items = aVar.getItems();
        if (items != null) {
            ArrayList arrayListZ = d0.Z(items);
            arrayList = new ArrayList();
            Iterator it8 = arrayListZ.iterator();
            while (it8.hasNext()) {
                e1 e1VarP = o0.p((m0) it8.next(), arrayListZ);
                if (e1VarP != null) {
                    arrayList.add(e1VarP);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r87 = arrayList;
        List bottomItems = aVar.getBottomItems();
        if (bottomItems != null) {
            ArrayList arrayListZ2 = d0.Z(bottomItems);
            arrayList2 = new ArrayList();
            Iterator it9 = arrayListZ2.iterator();
            while (it9.hasNext()) {
                e1 e1VarP2 = o0.p((m0) it9.next(), arrayListZ2);
                if (e1VarP2 != null) {
                    arrayList2.add(e1VarP2);
                }
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        return new eu3.c(title, description, tag2, x4VarA, x4Var, bVar2, r87, arrayList2, aVar.getDisclaimer(), aVar.getConfirmButtonTitle());
    }
}
