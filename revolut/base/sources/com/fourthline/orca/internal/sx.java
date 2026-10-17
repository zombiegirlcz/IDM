package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sx implements rx {
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cd f33149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bd f33150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f33151c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public sx(cd countriesFilter, bd countriesComparator, Function0 resources) {
        Intrinsics.checkNotNullParameter(countriesFilter, "countriesFilter");
        Intrinsics.checkNotNullParameter(countriesComparator, "countriesComparator");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f33149a = countriesFilter;
        this.f33150b = countriesComparator;
        this.f33151c = resources;
    }

    @Override // com.fourthline.orca.internal.rx
    public void a(String query, List items, Function1 onItemSelected, Function1 onSuggestionsReady) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        Intrinsics.checkNotNullParameter(onSuggestionsReady, "onSuggestionsReady");
        List listV0 = zhm.d0.V0(zhm.d0.P0(this.f33149a.a(query, items), this.f33150b), 5);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((cd.a) it8.next()).a());
        }
        if (a(query, arrayList)) {
            onItemSelected.invoke(zhm.d0.b0(arrayList));
        } else {
            onSuggestionsReady.invoke(arrayList);
        }
    }

    private final boolean a(String str, List list) {
        return list.size() == 1 && kotlin.text.a0.z(str, d81.a(((a01) zhm.d0.b0(list)).getName(), this.f33151c), true);
    }
}
