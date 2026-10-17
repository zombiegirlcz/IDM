package i9g;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f159809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f159810c;
    public final /* synthetic */ w4l.k d;

    public /* synthetic */ k0(l0 l0Var, String str, w4l.k kVar, int i) {
        this.f159808a = i;
        this.f159809b = l0Var;
        this.f159810c = str;
        this.d = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f159808a) {
            case 0:
                Boolean experiencesEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(experiencesEnabled, "experiencesEnabled");
                if (!experiencesEnabled.booleanValue()) {
                    return efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
                }
                l0 l0Var = this.f159809b;
                return m70.a.g(((atg.v) l0Var.f159815b).i(AccountId.Personal.f51414a, w4l.h.f294642c), null, null, 3).switchMap(new f0(7, new k0(l0Var, this.f159810c, this.d, 1)));
            default:
                fo3.c wallet = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                fag.d0 d0Var = this.f159809b.f159814a;
                fag.z params = new fag.z(this.f159810c, wallet.d);
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                w4l.k loadingStrategy = this.d;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return d0Var.d.e(params, loadingStrategy);
        }
    }
}
