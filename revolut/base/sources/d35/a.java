package d35;

import b35.d;
import boh.f;
import d34.b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import u25.i;
import xq3.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f110917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u25.a f110918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f110919c;

    public a(w entryPointsInteractor, u25.a productContract, int i) {
        this.f110919c = i;
        Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
        Intrinsics.checkNotNullParameter(productContract, "productContract");
        this.f110917a = entryPointsInteractor;
        this.f110918b = productContract;
    }

    @Override // mf1.a
    public final Flow a() {
        return d.d(f.e(((i) this.f110918b).p(), new b(this, 1)));
    }

    @Override // b35.d
    public final fs3.b c() {
        switch (this.f110919c) {
            case 0:
                return fs3.b.HOME_IMPROVEMENT_LOAN;
            case 1:
                return fs3.b.LOAN;
            case 2:
                return fs3.b.MORTGAGE;
            case 3:
                return fs3.b.REFINANCING_LOAN;
            default:
                return fs3.b.REFINANCING_MORTGAGE;
        }
    }
}
