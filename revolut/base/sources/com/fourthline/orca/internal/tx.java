package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class tx implements ux {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f33886c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cd f33887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bd f33888b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public tx(cd countriesFilter, bd countriesComparator) {
        Intrinsics.checkNotNullParameter(countriesFilter, "countriesFilter");
        Intrinsics.checkNotNullParameter(countriesComparator, "countriesComparator");
        this.f33887a = countriesFilter;
        this.f33888b = countriesComparator;
    }

    @Override // com.fourthline.orca.internal.ux
    public List a(String query, List candidates) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(candidates, "candidates");
        List listV0 = zhm.d0.V0(zhm.d0.P0(this.f33887a.a(query, candidates), this.f33888b), 5);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((cd.a) it8.next()).a());
        }
        return arrayList;
    }
}
