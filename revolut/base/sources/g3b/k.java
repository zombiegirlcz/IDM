package g3b;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuoteParams;
import com.revolut.feature.retail.cfd.impl.network.CfdService;
import do3.q;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import qe0.o;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdService f140259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f140260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f140261c;
    public final o d;

    public k(CfdService service, ne0.d cache, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f140259a = service;
        this.f140260b = cache;
        this.f140261c = appCoroutineScope;
        this.d = q.f(new x4l.c(new frk.a(this, null, 18), new g1.b(this, 20), new fv1.a(this, 23), new e31.i(2, 18, null), new eci.a(3, 13, null)), appCoroutineScope);
    }

    public static String a(MarginQuoteParams marginQuoteParams) {
        f8l.e eVar = marginQuoteParams.f82117a;
        bfl.g gVar = marginQuoteParams.f82118b;
        BigDecimal bigDecimal = marginQuoteParams.f82119c;
        String str = marginQuoteParams.d.f306286a;
        String str2 = marginQuoteParams.e.f306286a;
        BigDecimal bigDecimal2 = marginQuoteParams.f;
        BigDecimal bigDecimal3 = marginQuoteParams.f82120g;
        BigDecimal bigDecimal4 = marginQuoteParams.f82121h;
        BigDecimal bigDecimal5 = marginQuoteParams.i;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(eVar);
        sb6.append("_");
        sb6.append(gVar);
        sb6.append("_");
        sb6.append(bigDecimal);
        j6.a.D(sb6, "_", str, "_", str2);
        sb6.append("_");
        sb6.append(bigDecimal2);
        sb6.append("_");
        sb6.append(bigDecimal3);
        sb6.append("_");
        sb6.append(bigDecimal4);
        sb6.append("_");
        sb6.append(bigDecimal5);
        return sb6.toString();
    }
}
