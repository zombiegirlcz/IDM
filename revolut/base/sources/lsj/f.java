package lsj;

import com.revolut.retail.feature.impl.budgeting_cycle.network.AnalyticsCycleService;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f199691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f199692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsCycleService f199693c;
    public final w4l.f d;

    public f(ue0.c storage, ne0.d memoryCache, b80.c connectivityRepository, AnalyticsCycleService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f199691a = storage;
        this.f199692b = memoryCache;
        this.f199693c = service;
        int i = 3;
        new w4l.f(new e(this, 2), new d(this, i), new e(this, i), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        this.d = new w4l.f(w.k0(connectivityRepository, new d(this, 0)), new d(this, 1), new e(this, 0), new d(this, 2), new e(this, 1), null, null, null, BERTags.FLAGS);
    }
}
