package p2b;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuoteParams;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import vkm.c2;
import vkm.d2;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1b.a f232205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd0.d f232206b;

    public l(y1b.a cfdInteractor) {
        Intrinsics.checkNotNullParameter(cfdInteractor, "cfdInteractor");
        this.f232205a = cfdInteractor;
        this.f232206b = new fd0.d(10);
    }

    public final Flow a(MarginQuoteParams params) {
        Object objC;
        Intrinsics.checkNotNullParameter(params, "params");
        fd0.d dVar = this.f232206b;
        f8l.e eVar = params.f82117a;
        bfl.g gVar = params.f82118b;
        BigDecimal bigDecimal = params.f82119c;
        String str = params.d.f306286a;
        String str2 = params.e.f306286a;
        BigDecimal bigDecimal2 = params.f;
        BigDecimal bigDecimal3 = params.f82120g;
        BigDecimal bigDecimal4 = params.f82121h;
        BigDecimal bigDecimal5 = params.i;
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
        String string = sb6.toString();
        synchronized (dVar) {
            objC = dVar.c(string);
            if (objC == null) {
                objC = q.M(((b) this.f232205a).c(params), rd0.e.a(p0.f264003c), c2.a(d2.Companion, 0L, 3), 1);
                dVar.d(string, objC);
            }
        }
        return (Flow) objC;
    }
}
