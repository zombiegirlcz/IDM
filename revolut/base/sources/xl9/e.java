package xl9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f306958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f306959c;
    public final wi0.b d;

    public e() {
        this(0);
    }

    public static e a(e eVar, boolean z, Data optInRewardRevPoints, boolean z3, wi0.b bVar, int i) {
        if ((i & 1) != 0) {
            z = eVar.f306957a;
        }
        if ((i & 2) != 0) {
            optInRewardRevPoints = eVar.f306958b;
        }
        if ((i & 4) != 0) {
            z3 = eVar.f306959c;
        }
        if ((i & 8) != 0) {
            bVar = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(optInRewardRevPoints, "optInRewardRevPoints");
        return new e(optInRewardRevPoints, bVar, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f306957a == eVar.f306957a && Intrinsics.f(this.f306958b, eVar.f306958b) && this.f306959c == eVar.f306959c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f306958b, Boolean.hashCode(this.f306957a) * 31, 31), 31, this.f306959c);
        wi0.b bVar = this.d;
        return iC + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }

    public e(Data optInRewardRevPoints, wi0.b bVar, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(optInRewardRevPoints, "optInRewardRevPoints");
        this.f306957a = z;
        this.f306958b = optInRewardRevPoints;
        this.f306959c = z3;
        this.d = bVar;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), null, false, false);
    }
}
