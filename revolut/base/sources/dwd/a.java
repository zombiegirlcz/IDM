package dwd;

import com.revolut.feature.staking.impl.service.unstaking.UnstakingDataService;
import cvi.i;
import dp4.f1;
import dt4.p;
import jud.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nd.m;
import ne0.j;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f120367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnstakingDataService f120368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f120369c;
    public final m d;
    public final x4l.c e;

    public a(j memoryCache, UnstakingDataService unstakingDataService, h unstakingDataDao, m unstakingDataMapper) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(unstakingDataService, "unstakingDataService");
        Intrinsics.checkNotNullParameter(unstakingDataDao, "unstakingDataDao");
        Intrinsics.checkNotNullParameter(unstakingDataMapper, "unstakingDataMapper");
        this.f120367a = memoryCache;
        this.f120368b = unstakingDataService;
        this.f120369c = unstakingDataDao;
        this.d = unstakingDataMapper;
        Continuation continuation = null;
        this.e = new x4l.c(new i(this, continuation, 28), new dug.a(this, 6), new p(this, 9), new dob.c(this, continuation, 22), new f1(this, continuation, 1));
    }
}
