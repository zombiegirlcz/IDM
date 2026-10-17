package qj8;

import com.revolut.feature.junior_profile.impl.services.JuniorWorkflowBasedProfileService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfk.q;
import q5g.f0;
import qgf.o;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorWorkflowBasedProfileService f246793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f246794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f246795c;
    public final x4l.c d;

    public l(JuniorWorkflowBasedProfileService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f246793a = service;
        this.f246794b = memoryCache;
        this.f246795c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new pti.d(this, continuation, 10), new o(this, 5), new f0(this, 27), new qc3.c(this, continuation, 17), new q(this, continuation, 19));
    }

    public static String a(String str) {
        return j6.a.q("JUNIOR_PROFILE_DYNAMIC_FIELDS_KEY_", str);
    }
}
