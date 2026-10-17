package wpk;

import cp5.d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import qta.h;
import qta.i;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f299350a = r0.k(new Pair("ACTIVE", h.ACTIVE), new Pair("COMPLETED", h.COMPLETED), new Pair("CANCELLED", h.CANCELLED));

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList a(spk.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List<spk.b> data = cVar.getData();
        ArrayList arrayList = new ArrayList(w.t(data, 10));
        for (spk.b bVar : data) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Pair pairH = d.H(bVar.getCurrencyPair());
            String id10 = bVar.getId();
            h hVar = (h) u1.u(bVar.getState(), f299350a);
            BigDecimal bigDecimal = new BigDecimal(bVar.getTargetRate());
            String placementRate = bVar.getPlacementRate();
            BigDecimal bigDecimal2 = placementRate != null ? new BigDecimal(placementRate) : null;
            xi0.b bVar2 = (xi0.b) pairH.f186385a;
            xi0.b bVar3 = (xi0.b) pairH.f186386b;
            long createdDate = bVar.getCreatedDate();
            Long executedDate = bVar.getExecutedDate();
            long jLongValue = executedDate != null ? executedDate.longValue() : 0L;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            arrayList.add(new i(id10, hVar, bigDecimal, bigDecimal2, bVar2, bVar3, createdDate, jLongValue));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final gpk.a b(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f249054a;
        String strG = u1.g(iVar.f249055b, f299350a);
        String plainString = iVar.f249056c.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        BigDecimal bigDecimal = iVar.d;
        return new gpk.a(str, strG, plainString, bigDecimal != null ? bigDecimal.toPlainString() : null, iVar.e.f306286a, iVar.f.f306286a, iVar.f249057g, iVar.f249058h);
    }
}
