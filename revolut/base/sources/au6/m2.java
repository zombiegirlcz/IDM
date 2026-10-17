package au6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerSettingsFeaturesService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m2 {

    @NotNull
    public static final l2 Companion = new l2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerSettingsFeaturesService f9570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f9572c;
    public final x4l.c d;

    public m2(FreelancerSettingsFeaturesService api2, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9570a = api2;
        this.f9571b = memoryCache;
        this.f9572c = storage;
        Continuation continuation = null;
        int i = 26;
        this.d = new x4l.c(new a09.o(this, continuation, 10), new ar1.c(this, i), new anc.b(this, i), new akl.e0(this, continuation, 14), new u(this, continuation, 1));
    }
}
