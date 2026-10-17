package s7j;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import eel.i;
import eel.k;
import eel.l;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ej0.b f260854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ej0.b f260855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ej0.b f260856c;
    public static final ej0.b d;

    static {
        BigDecimal bigDecimal = new BigDecimal("3098.65");
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        xi0.b bVar = xi0.b.i;
        f260854a = new ej0.b(bigDecimal, bVar);
        BigDecimal bigDecimal2 = new BigDecimal("199.50");
        aVar.getClass();
        f260855b = new ej0.b(bigDecimal2, bVar);
        BigDecimal bigDecimal3 = new BigDecimal("30.00");
        aVar.getClass();
        f260856c = new ej0.b(bigDecimal3, bVar);
        BigDecimal bigDecimal4 = new BigDecimal("160.00");
        aVar.getClass();
        d = new ej0.b(bigDecimal4, bVar);
    }

    public static k a(List list, ej0.b value, double d5, Map map) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            long j2 = i;
            BigDecimal bigDecimal = new BigDecimal((String) obj2);
            xi0.b.Companion.getClass();
            ej0.b value2 = new ej0.b(bigDecimal, xi0.b.i);
            Intrinsics.checkNotNullParameter(value2, "value");
            arrayList.add(new l("", j2, new eel.f(value2)));
            i = i2;
        }
        long size = (long) (((double) arrayList.size()) / d5);
        i iVar = i.PRICE;
        Intrinsics.checkNotNullParameter(value, "value");
        return new k(arrayList, 0L, size, new eel.f(value), iVar, map, (HashMap) null, 192);
    }

    public static bfl.f b(bfl.g gVar) {
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneId.of("UTC"));
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeOfInstant, "ofInstant(...)");
        ZonedDateTime zonedDateTimeOfInstant2 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(0L), ZoneId.of("UTC"));
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeOfInstant2, "ofInstant(...)");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        xi0.b.Companion.getClass();
        return new bfl.f("", zonedDateTimeOfInstant, zonedDateTimeOfInstant2, "", "", new dj0.d(0L, xi0.b.i), BitmapDescriptorFactory.HUE_RED, null, null, null, gVar);
    }
}
