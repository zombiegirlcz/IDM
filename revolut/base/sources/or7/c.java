package or7;

import com.revolut.feature.insurance_common.data.network.InsuranceCommonService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import nfj.l1;
import o29.l;
import oli.f;
import or4.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCommonService f228075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f228076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f228077c;
    public final mk0.a d;
    public final ij0.a e;
    public final x4l.c f;

    static {
        Intrinsics.checkNotNullParameter("INSURANCE_HOME_ANNOUNCEMENT_HAS_BEEN_HIDDEN", "id");
    }

    public c(InsuranceCommonService service, j memoryCache, ue0.c storage, mk0.a personalisationStorage, ij0.a configuration) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f228075a = service;
        this.f228076b = memoryCache;
        this.f228077c = storage;
        this.d = personalisationStorage;
        this.e = configuration;
        Continuation continuation = null;
        this.f = new x4l.c(new l(this, continuation, 11), new oqk.c(this, 3), new i(this, 1), new f(this, continuation, 18), new l1(this, continuation, 21));
    }
}
