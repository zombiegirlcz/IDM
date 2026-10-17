package zfi;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f321951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f321952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f321953c;
    public final Map d;

    public a() {
        this(0);
    }

    public static a a(a aVar, Map booleanFilters, Map checkBoxFilters, Map radioFilters, Map priceRangeFilters, int i) {
        if ((i & 1) != 0) {
            booleanFilters = aVar.f321951a;
        }
        if ((i & 2) != 0) {
            checkBoxFilters = aVar.f321952b;
        }
        if ((i & 4) != 0) {
            radioFilters = aVar.f321953c;
        }
        if ((i & 8) != 0) {
            priceRangeFilters = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(booleanFilters, "booleanFilters");
        Intrinsics.checkNotNullParameter(checkBoxFilters, "checkBoxFilters");
        Intrinsics.checkNotNullParameter(radioFilters, "radioFilters");
        Intrinsics.checkNotNullParameter(priceRangeFilters, "priceRangeFilters");
        return new a(booleanFilters, checkBoxFilters, radioFilters, priceRangeFilters);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f321951a, aVar.f321951a) && Intrinsics.f(this.f321952b, aVar.f321952b) && Intrinsics.f(this.f321953c, aVar.f321953c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.e(p.a.e(this.f321951a.hashCode() * 31, 31, this.f321952b), 31, this.f321953c);
    }

    public a(Map booleanFilters, Map checkBoxFilters, Map radioFilters, Map priceRangeFilters) {
        Intrinsics.checkNotNullParameter(booleanFilters, "booleanFilters");
        Intrinsics.checkNotNullParameter(checkBoxFilters, "checkBoxFilters");
        Intrinsics.checkNotNullParameter(radioFilters, "radioFilters");
        Intrinsics.checkNotNullParameter(priceRangeFilters, "priceRangeFilters");
        this.f321951a = booleanFilters;
        this.f321952b = checkBoxFilters;
        this.f321953c = radioFilters;
        this.d = priceRangeFilters;
    }

    public /* synthetic */ a(int i) {
        this(r0.g(), r0.g(), r0.g(), r0.g());
    }
}
