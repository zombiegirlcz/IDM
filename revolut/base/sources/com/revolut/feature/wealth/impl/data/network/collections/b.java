package com.revolut.feature.wealth.impl.data.network.collections;

import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteParams;
import com.revolut.feature.wealth.impl.data.network.collections.a;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final a.C0583a a(CollectionQuoteParams collectionQuoteParams) {
        Intrinsics.checkNotNullParameter(collectionQuoteParams, "<this>");
        String str = collectionQuoteParams.f95274a;
        List list = collectionQuoteParams.f95275b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((xi0.b) it8.next()).f306286a);
        }
        d dVar = collectionQuoteParams.f95276c;
        jo3.a aVarP = dVar != null ? mo3.a.p(dVar) : null;
        d dVar2 = collectionQuoteParams.d;
        return new a.C0583a(str, arrayList, aVarP, dVar2 != null ? mo3.a.p(dVar2) : null);
    }
}
