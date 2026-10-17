package com.revolut.feature.wealth.impl.data.network.mosttraded;

import com.revolut.feature.wealth.impl.data.network.mosttraded.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xzg.a0;
import xzg.b0;
import xzg.c0;
import xzg.z;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static final c0 a(a aVar, z assetType) {
        b0 b0Var;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        a.d timeSpan = aVar.getTimeSpan();
        int i = timeSpan == null ? -1 : b.f95495a[timeSpan.ordinal()];
        if (i == -1) {
            throw new IllegalStateException(("Unsupported time span " + timeSpan).toString());
        }
        if (i == 1) {
            b0Var = b0.ONE_DAY;
        } else if (i == 2) {
            b0Var = b0.ONE_WEEK;
        } else if (i == 3) {
            b0Var = b0.ONE_MONTH;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            b0Var = b0.ONE_YEAR;
        }
        List mostTraded = aVar.getMostTraded();
        if (mostTraded != null) {
            List<a.b> list = mostTraded;
            arrayList = new ArrayList(w.t(list, 10));
            for (a.b bVar : list) {
                arrayList.add(new a0(bVar.getRef(), assetType, bVar.getBuyToAllRatio()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        List mostBought = aVar.getMostBought();
        if (mostBought != null) {
            List<a.b> list2 = mostBought;
            arrayList2 = new ArrayList(w.t(list2, 10));
            for (a.b bVar2 : list2) {
                arrayList2.add(new a0(bVar2.getRef(), assetType, bVar2.getBuyToAllRatio()));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        List mostSold = aVar.getMostSold();
        if (mostSold != null) {
            List<a.b> list3 = mostSold;
            arrayList3 = new ArrayList(w.t(list3, 10));
            for (a.b bVar3 : list3) {
                arrayList3.add(new a0(bVar3.getRef(), assetType, bVar3.getBuyToAllRatio()));
            }
        } else {
            arrayList3 = f0.f322471a;
        }
        return new c0(b0Var, arrayList, arrayList2, arrayList3);
    }
}
