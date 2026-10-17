package eve;

import com.revolut.feature.topup_screen.impl.data.network.service.TopUpLimitsService;
import es.e;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lue.d;
import lue.f;
import ne0.j;
import ue0.c;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpLimitsService f129781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lue.b f129782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f129783c;
    public final j d;
    public final c e;
    public final Lazy f;

    public b(TopUpLimitsService topUpLimitsService, lue.b dtoMapper, d v2DtoMapper, f v2EntityMapper, j memoryCache, c countryTopUpLimitsStorage) {
        Intrinsics.checkNotNullParameter(topUpLimitsService, "topUpLimitsService");
        Intrinsics.checkNotNullParameter(dtoMapper, "dtoMapper");
        Intrinsics.checkNotNullParameter(v2DtoMapper, "v2DtoMapper");
        Intrinsics.checkNotNullParameter(v2EntityMapper, "v2EntityMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(countryTopUpLimitsStorage, "countryTopUpLimitsStorage");
        this.f129781a = topUpLimitsService;
        this.f129782b = dtoMapper;
        this.f129783c = v2DtoMapper;
        this.d = memoryCache;
        this.e = countryTopUpLimitsStorage;
        this.f = yhm.j.b(new e(this, 6));
    }

    public static final String a(b bVar, String str, n nVar) {
        if (nVar == null) {
            nVar = n.CURRENT;
        }
        return "COUNTRY_LIMITS_STORAGE_KEY_" + str + "_" + nVar;
    }
}
