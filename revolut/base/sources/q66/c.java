package q66;

import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import h30.l;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lk0.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f242511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f242512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f242513c;
    public final SortingType d;
    public final String e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wk5.a f242514g;

    public c(int i, int i2, xi0.b fiatCurrency, SortingType sortingType, String str, Set userBalanceExternalAssetIds, wk5.a aVar) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(userBalanceExternalAssetIds, "userBalanceExternalAssetIds");
        this.f242511a = i;
        this.f242512b = i2;
        this.f242513c = fiatCurrency;
        this.d = sortingType;
        this.e = str;
        this.f = userBalanceExternalAssetIds;
        this.f242514g = aVar;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        return this.f242511a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f242511a == cVar.f242511a && this.f242512b == cVar.f242512b && Intrinsics.f(this.f242513c, cVar.f242513c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f242514g == cVar.f242514g;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + l.j(this.f242513c, j6.a.b(this.f242512b, Integer.hashCode(this.f242511a) * 31, 31), 31)) * 31;
        String str = this.e;
        int iF = p.a.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        wk5.a aVar = this.f242514g;
        return iF + (aVar != null ? aVar.hashCode() : 0);
    }
}
