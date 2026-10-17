package bba;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f14200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14201b;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f14200a, dVar.f14200a) && Intrinsics.f(this.f14201b, dVar.f14201b);
    }

    public final int hashCode() {
        int iHashCode = this.f14200a.hashCode() * 31;
        String str = this.f14201b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public d(Data beneficiaries, String str) {
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        this.f14200a = beneficiaries;
        this.f14201b = str;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
