package i47;

import com.revolut.data.model.Data;
import ds6.d0;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f158287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f158288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f158289c;
    public final Set d;
    public final Set e;

    public h() {
        this(0);
    }

    public static h a(h hVar, Data filters, Set selectedCategories, Set selectedCurrencies, int i) {
        if ((i & 1) != 0) {
            filters = hVar.f158287a;
        }
        if ((i & 2) != 0) {
            selectedCategories = hVar.f158288b;
        }
        if ((i & 4) != 0) {
            selectedCurrencies = hVar.f158289c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        return new h(filters, selectedCategories, selectedCurrencies);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f158287a, hVar.f158287a) && Intrinsics.f(this.f158288b, hVar.f158288b) && Intrinsics.f(this.f158289c, hVar.f158289c);
    }

    public final int hashCode() {
        return this.f158289c.hashCode() + p.a.f(this.f158287a.hashCode() * 31, 31, this.f158288b);
    }

    public h(Data filters, Set selectedCategories, Set selectedCurrencies) {
        Map map;
        Map map2;
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        this.f158287a = filters;
        this.f158288b = selectedCategories;
        this.f158289c = selectedCurrencies;
        d0 d0Var = (d0) filters.getContent();
        Set setKeySet = null;
        Set setKeySet2 = (d0Var == null || (map2 = d0Var.f117232a) == null) ? null : map2.keySet();
        this.d = setKeySet2 == null ? h0.f322473a : setKeySet2;
        d0 d0Var2 = (d0) filters.getContent();
        if (d0Var2 != null && (map = d0Var2.f117233b) != null) {
            setKeySet = map.keySet();
        }
        this.e = setKeySet == null ? h0.f322473a : setKeySet;
    }

    public h(int i) {
        Data data = new Data(null, null, true, 3, null);
        h0 h0Var = h0.f322473a;
        this(data, h0Var, h0Var);
    }
}
