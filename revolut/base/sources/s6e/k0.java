package s6e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f260295b;

    public /* synthetic */ k0(l0 l0Var, int i) {
        this.f260294a = i;
        this.f260295b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Subaccount subaccount = (Subaccount) obj2;
        switch (this.f260294a) {
            case 0:
                Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                j0 j0Var = this.f260295b.f260297a;
                Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                return j0Var.a(subaccount.getF88959a());
            default:
                Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                return rd0.e.b(nim.a.w(this.f260295b.f260299c.Z(subaccount.getF88959a().f, w4l.h.f294642c), new g(10)));
        }
    }
}
