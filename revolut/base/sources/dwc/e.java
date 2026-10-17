package dwc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f120356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f120357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f120358c;
    public final bwc.d d;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data limits, Data walletLimits, boolean z, bwc.d dVar, int i) {
        if ((i & 1) != 0) {
            limits = eVar.f120356a;
        }
        if ((i & 2) != 0) {
            walletLimits = eVar.f120357b;
        }
        if ((i & 4) != 0) {
            z = eVar.f120358c;
        }
        if ((i & 8) != 0) {
            dVar = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
        return new e(limits, walletLimits, z, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f120356a, eVar.f120356a) && Intrinsics.f(this.f120357b, eVar.f120357b) && this.f120358c == eVar.f120358c && this.d == eVar.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f120357b, this.f120356a.hashCode() * 31, 31), 31, this.f120358c);
        bwc.d dVar = this.d;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    public e(Data limits, Data walletLimits, boolean z, bwc.d dVar) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
        this.f120356a = limits;
        this.f120357b = walletLimits;
        this.f120358c = z;
        this.d = dVar;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, null);
    }
}
