package c8i;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.feature_move_money.impl.interactor.MoveMoneyBalanceSyncWorker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k51.a f22182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k51.a f22183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k51.a f22184c;
    public final k51.a d;
    public final k51.a e;
    public final k51.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k51.a f22185g;

    public d(k51.a walletInteractor, k51.a jointAccountsInteractor, k51.a vaultsInteractor, k51.a savingsVaultInteractor, k51.a creditCardInteractor, k51.a revPointsPocketInteractor, k51.a portfolioInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f22182a = walletInteractor;
        this.f22183b = jointAccountsInteractor;
        this.f22184c = vaultsInteractor;
        this.d = savingsVaultInteractor;
        this.e = creditCardInteractor;
        this.f = revPointsPocketInteractor;
        this.f22185g = portfolioInteractor;
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj2 = this.f22182a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        Object obj3 = this.f22183b.get();
        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
        Object obj4 = this.f22184c.get();
        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
        Object obj5 = this.d.get();
        Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
        Object obj6 = this.e.get();
        Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
        Object obj7 = this.f.get();
        Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
        Object obj8 = this.f22185g.get();
        Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
        return new MoveMoneyBalanceSyncWorker(new m((osg.b) obj2, (k38.c) obj3, (ppg.b) obj4, (rnb.w) obj5, (al4.n) obj6, (ldi.f) obj7, (ybl.d) obj8), params, appContext);
    }
}
