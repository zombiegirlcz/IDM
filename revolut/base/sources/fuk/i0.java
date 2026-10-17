package fuk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 {
    private i0() {
    }

    public static j0 a(cel.n assetDataSeries, TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        xi0.b bVar;
        ej0.b bVar2;
        huk.a aVar;
        huk.a aVar2;
        huk.a aVar3;
        xi0.b bVar3;
        dj0.d dVar;
        huk.a aVar4;
        Intrinsics.checkNotNullParameter(assetDataSeries, "assetDataSeries");
        Intrinsics.checkNotNullParameter(title, "title");
        if (assetDataSeries instanceof cel.d) {
            ArrayList<cel.m> arrayList = ((cel.d) assetDataSeries).f23500a;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            for (cel.m mVar : arrayList) {
                int i = mVar.f23505b;
                cel.k kVar = mVar.f23506c;
                Integer numValueOf = kVar != null ? Integer.valueOf(kVar.b()) : null;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((dj0.d) mVar.d).f115082a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                int i2 = h0.f138242a[mVar.f23504a.ordinal()];
                if (i2 == 1) {
                    aVar4 = huk.a.ACTUAL;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4 = huk.a.ESTIMATE;
                }
                arrayList2.add(new huk.b(i, numValueOf, bigDecimalValueOf, aVar4));
            }
            cel.m mVar2 = (cel.m) zhm.d0.d0(arrayList);
            if (mVar2 == null || (dVar = (dj0.d) mVar2.d) == null || (bVar3 = dVar.f115083b) == null) {
                xi0.b.Companion.getClass();
                bVar3 = xi0.b.i;
            }
            return new j0(arrayList2, new rwk.g(bVar3), title, textLocalisedClause);
        }
        if (assetDataSeries instanceof cel.f) {
            ArrayList<cel.m> arrayList3 = ((cel.f) assetDataSeries).f23501a;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
            for (cel.m mVar3 : arrayList3) {
                int i3 = mVar3.f23505b;
                cel.k kVar2 = mVar3.f23506c;
                Integer numValueOf2 = kVar2 != null ? Integer.valueOf(kVar2.b()) : null;
                BigDecimal bigDecimal = (BigDecimal) mVar3.d;
                int i5 = h0.f138242a[mVar3.f23504a.ordinal()];
                if (i5 == 1) {
                    aVar3 = huk.a.ACTUAL;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3 = huk.a.ESTIMATE;
                }
                arrayList4.add(new huk.b(i3, numValueOf2, bigDecimal, aVar3));
            }
            return new j0(arrayList4, rwk.j.f257991a, title, textLocalisedClause);
        }
        if (assetDataSeries instanceof cel.h) {
            ArrayList<cel.m> arrayList5 = ((cel.h) assetDataSeries).f23502a;
            ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
            for (cel.m mVar4 : arrayList5) {
                int i6 = mVar4.f23505b;
                cel.k kVar3 = mVar4.f23506c;
                Integer numValueOf3 = kVar3 != null ? Integer.valueOf(kVar3.b()) : null;
                BigDecimal bigDecimalMultiply = ((BigDecimal) mVar4.d).multiply(new BigDecimal(100));
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                int i21 = h0.f138242a[mVar4.f23504a.ordinal()];
                if (i21 == 1) {
                    aVar2 = huk.a.ACTUAL;
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2 = huk.a.ESTIMATE;
                }
                arrayList6.add(new huk.b(i6, numValueOf3, bigDecimalMultiply, aVar2));
            }
            return new j0(arrayList6, rwk.h.f257989a, title, textLocalisedClause);
        }
        if (!(assetDataSeries instanceof cel.j)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<cel.m> arrayList7 = ((cel.j) assetDataSeries).f23503a;
        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
        for (cel.m mVar5 : arrayList7) {
            int i22 = mVar5.f23505b;
            cel.k kVar4 = mVar5.f23506c;
            Integer numValueOf4 = kVar4 != null ? Integer.valueOf(kVar4.b()) : null;
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(mif.a.Q((ej0.b) mVar5.d).f115082a);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            int i32 = h0.f138242a[mVar5.f23504a.ordinal()];
            if (i32 == 1) {
                aVar = huk.a.ACTUAL;
            } else {
                if (i32 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = huk.a.ESTIMATE;
            }
            arrayList8.add(new huk.b(i22, numValueOf4, bigDecimalValueOf2, aVar));
        }
        cel.m mVar6 = (cel.m) zhm.d0.d0(arrayList7);
        if (mVar6 == null || (bVar2 = (ej0.b) mVar6.d) == null || (bVar = bVar2.f126704b) == null) {
            xi0.b.Companion.getClass();
            bVar = xi0.b.i;
        }
        return new j0(arrayList8, new rwk.g(bVar), title, textLocalisedClause);
    }
}
