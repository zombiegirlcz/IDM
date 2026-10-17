package com.revolut.feature.global_markets.impl.ui.flow.index_details;

import com.revolut.data.model.Data;
import java.util.List;
import kii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f74588c;
    public final String d;
    public final Boolean e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f74589g;

    public a(String ref2, String symbol, List pagerItems, String selectedPagerItemId, Boolean bool, Data details, Data instrumentTicker) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        this.f74586a = ref2;
        this.f74587b = symbol;
        this.f74588c = pagerItems;
        this.d = selectedPagerItemId;
        this.e = bool;
        this.f = details;
        this.f74589g = instrumentTicker;
    }

    public static a a(a aVar, String str, Boolean bool, Data data, Data data2, int i) {
        String ref2 = aVar.f74586a;
        String symbol = aVar.f74587b;
        List pagerItems = aVar.f74588c;
        if ((i & 8) != 0) {
            str = aVar.d;
        }
        String selectedPagerItemId = str;
        if ((i & 16) != 0) {
            bool = aVar.e;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            data = aVar.f;
        }
        Data details = data;
        if ((i & 64) != 0) {
            data2 = aVar.f74589g;
        }
        Data instrumentTicker = data2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        return new a(ref2, symbol, pagerItems, selectedPagerItemId, bool2, details, instrumentTicker);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f74588c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f74586a, aVar.f74586a) && Intrinsics.f(this.f74587b, aVar.f74587b) && Intrinsics.f(this.f74588c, aVar.f74588c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f74589g, aVar.f74589g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(p.a.c(this.f74586a.hashCode() * 31, 31, this.f74587b), 31, this.f74588c), 31, this.d);
        Boolean bool = this.e;
        return this.f74589g.hashCode() + e.c(this.f, (iC + (bool == null ? 0 : bool.hashCode())) * 31, 31);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.d;
    }
}
