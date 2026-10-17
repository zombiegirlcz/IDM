package pzl;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.utils.job.workers.ProductAccountMigrationWorker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k51.a f241035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k51.a f241036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k51.a f241037c;
    public final k51.a d;
    public final k51.a e;

    public q(k51.a juniorProfileInteractorProvider, k51.a newWalletsInteractorProvider, k51.a hiddenAccountsInteractorProvider, k51.a productAccountMigratorProvider, k51.a backgroundsMigratorProvider) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractorProvider, "juniorProfileInteractorProvider");
        Intrinsics.checkNotNullParameter(newWalletsInteractorProvider, "newWalletsInteractorProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractorProvider, "hiddenAccountsInteractorProvider");
        Intrinsics.checkNotNullParameter(productAccountMigratorProvider, "productAccountMigratorProvider");
        Intrinsics.checkNotNullParameter(backgroundsMigratorProvider, "backgroundsMigratorProvider");
        this.f241035a = juniorProfileInteractorProvider;
        this.f241036b = newWalletsInteractorProvider;
        this.f241037c = hiddenAccountsInteractorProvider;
        this.d = productAccountMigratorProvider;
        this.e = backgroundsMigratorProvider;
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj2 = this.f241035a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        hj8.a aVar = (hj8.a) obj2;
        Object obj3 = this.f241036b.get();
        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
        osg.a aVar2 = (osg.a) obj3;
        Object obj4 = this.f241037c.get();
        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
        pa7.a aVar3 = (pa7.a) obj4;
        Object obj5 = this.d.get();
        Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
        qfe.d dVar = (qfe.d) obj5;
        Object obj6 = this.e.get();
        Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
        return new ProductAccountMigrationWorker(appContext, params, aVar, aVar2, aVar3, dVar, (cm2.g) obj6);
    }
}
