package mk5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f206189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f206191c;
    public final Clause d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f206192g;

    public m(o selectedTab, String searchQuery, Data currencies, Clause title, Data contactsData, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contactsData, "contactsData");
        this.f206189a = selectedTab;
        this.f206190b = searchQuery;
        this.f206191c = currencies;
        this.d = title;
        this.e = contactsData;
        this.f = z;
        this.f206192g = z3;
    }

    public static m a(m mVar, o oVar, String str, Data data, Data data2, boolean z, int i) {
        if ((i & 1) != 0) {
            oVar = mVar.f206189a;
        }
        o selectedTab = oVar;
        if ((i & 2) != 0) {
            str = mVar.f206190b;
        }
        String searchQuery = str;
        if ((i & 4) != 0) {
            data = mVar.f206191c;
        }
        Data currencies = data;
        Clause title = mVar.d;
        if ((i & 16) != 0) {
            data2 = mVar.e;
        }
        Data contactsData = data2;
        if ((i & 32) != 0) {
            z = mVar.f;
        }
        boolean z3 = mVar.f206192g;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contactsData, "contactsData");
        return new m(selectedTab, searchQuery, currencies, title, contactsData, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f206189a == mVar.f206189a && Intrinsics.f(this.f206190b, mVar.f206190b) && Intrinsics.f(this.f206191c, mVar.f206191c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && this.f == mVar.f && this.f206192g == mVar.f206192g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206192g) + j6.a.c(kii.e.c(this.e, p.a.a(kii.e.c(this.f206191c, p.a.c(this.f206189a.hashCode() * 31, 31, this.f206190b), 31), 31, this.d), 31), 31, this.f);
    }
}
