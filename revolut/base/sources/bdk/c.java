package bdk;

import a09.o;
import com.revolut.retail.feature.plan_rewards.impl.data.service.MilestoneRewardsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MilestoneRewardsService f14608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f14609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f14610c;
    public final x4l.c d;

    public c(MilestoneRewardsService service, ne0.j cache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f14608a = service;
        this.f14609b = cache;
        this.f14610c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new o(this, continuation, 19), new b9i.f(this, 12), new b7d.c(this, 20), new az.i(this, continuation, 26), new awd.b(this, continuation, 9));
    }
}
