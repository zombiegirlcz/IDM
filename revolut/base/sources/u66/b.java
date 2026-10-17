package u66;

import a0.d;
import akg.n;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import com.revolut.feature.defi.trade.impl.data.network.DefiAssetsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import th6.p;
import tp8.l;
import tx0.p4;
import tz6.e;
import ue0.c;
import w4l.i;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefiAssetsService f277497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f277498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f277499c;
    public final x4l.c d;

    public b(DefiAssetsService service, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f277497a = service;
        this.f277498b = memoryCache;
        this.f277499c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new p(this, continuation, 4), new p4(this, 28), new l(this, 29), new e(this, continuation, 25), new sne.e(this, continuation, 10));
    }

    public static String a(q66.c cVar) {
        String strK0 = d0.k0(d0.O0(cVar.f), ",", null, null, 0, null, 62);
        if (strK0.length() == 0) {
            return null;
        }
        return strK0;
    }

    public static String b(q66.c cVar) {
        int i = cVar.f242511a;
        int i2 = cVar.f242512b;
        SortingType sortingType = cVar.d;
        String str = cVar.e;
        if (str == null) {
            str = "";
        }
        String str2 = cVar.f242513c.f306286a;
        String strA = a(cVar);
        if (strA == null) {
            strA = "";
        }
        wk5.a aVar = cVar.f242514g;
        String strName = aVar != null ? aVar.name() : null;
        String str3 = strName != null ? strName : "";
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i);
        sb6.append("_");
        sb6.append(i2);
        sb6.append("_");
        sb6.append(sortingType);
        j6.a.D(sb6, "_", str, "_", str2);
        sb6.append("_");
        sb6.append(strA);
        sb6.append("_");
        sb6.append(str3);
        return d.n("DEFI_ASSETS_CACHE_PREFIX_", sb6.toString().hashCode());
    }

    public final n c(q66.c params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return nim.a.v(this.d.b(params, i.f294643c), new u4e.i(12));
    }
}
