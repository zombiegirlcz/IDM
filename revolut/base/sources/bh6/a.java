package bh6;

import com.revolut.core.model.account.AccountId;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wsg.n;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f15233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z71.a f15234b;

    public a(n walletInteractor, z71.a bankAccountsRepository) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(bankAccountsRepository, "bankAccountsRepository");
        this.f15233a = walletInteractor;
        this.f15234b = bankAccountsRepository;
    }

    public final vkm.d a() {
        r rVarN = new rfm.j(this.f15233a.x(AccountId.Personal.f51414a), new bce.e(new b9i.f(this, 27), 25), 2).n();
        Intrinsics.checkNotNullExpressionValue(rVarN, "toObservable(...)");
        r map = w.a0(rVarN, new bek.a(13)).map(new bce.e(new bek.a(14), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}
