package pzl;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.utils.job.workers.TransactionLocationWorker;
import com.revolut.utils.job.workers.WalletsReloadWorker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k51.a f241048b;

    public w(k51.a walletInteractor, int i) {
        this.f241047a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                this.f241048b = walletInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(walletInteractor, "locationInteractor");
                this.f241048b = walletInteractor;
                break;
        }
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        switch (this.f241047a) {
            case 0:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj2 = this.f241048b.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return new TransactionLocationWorker(appContext, params, (w39.b) obj2);
            default:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                Object obj3 = this.f241048b.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                return new WalletsReloadWorker(appContext, params, (osg.b) obj3);
        }
    }
}
