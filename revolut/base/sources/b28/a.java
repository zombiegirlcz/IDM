package b28;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f11923c;

    public a(Data wealthDisclaimersData, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        this.f11921a = z;
        this.f11922b = z3;
        this.f11923c = wealthDisclaimersData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f11921a == aVar.f11921a && this.f11922b == aVar.f11922b && Intrinsics.f(this.f11923c, aVar.f11923c);
    }

    public final int hashCode() {
        return this.f11923c.hashCode() + j6.a.c(Boolean.hashCode(this.f11921a) * 31, 31, this.f11922b);
    }
}
