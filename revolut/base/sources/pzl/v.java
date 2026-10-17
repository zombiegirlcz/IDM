package pzl;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.utils.job.workers.ProfileLocationWorker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class v implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k51.a f241045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k51.a f241046b;

    public v(k51.a locationInteractor, k51.a userInteractor) {
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f241045a = locationInteractor;
        this.f241046b = userInteractor;
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj2 = this.f241045a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        Object obj3 = this.f241046b.get();
        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
        return new ProfileLocationWorker(appContext, params, (w39.b) obj2, (ylg.b) obj3);
    }
}
