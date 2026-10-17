package gxa;

import com.revolut.feature.referrals.impl.network.services.PersonalizedTrackingService;
import g2e.m0;
import ghl.l;
import gul.n;
import gwe.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f147740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.a f147741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersonalizedTrackingService f147742c;
    public final j d;
    public final x4l.c e;

    static {
        Intrinsics.checkNotNullParameter("PERSONALIZED_TRACKING_CONFETTI", "id");
    }

    public c(ue0.c storage, mk0.a personalisationStorage, PersonalizedTrackingService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f147740a = storage;
        this.f147741b = personalisationStorage;
        this.f147742c = service;
        this.d = memoryCache;
        Continuation continuation = null;
        this.e = new x4l.c(new l(this, continuation, 1), new d(this, 4), new ghl.c(this, 25), new n(this, continuation, 5), new m0(this, continuation, 14));
    }

    public static String a(String str) {
        return j6.a.q("PERSONALIZED_DETAILS_KEY_", str);
    }
}
