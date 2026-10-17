package t1i;

import android.content.res.Resources;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ej0.b f267360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ej0.b f267361c;
    public static final ej0.b d;
    public static final ej0.b e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f267362a;

    static {
        BigDecimal bigDecimal = new BigDecimal("3098.65");
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        xi0.b bVar = xi0.b.i;
        f267360b = new ej0.b(bigDecimal, bVar);
        BigDecimal bigDecimal2 = new BigDecimal("199.50");
        aVar.getClass();
        f267361c = new ej0.b(bigDecimal2, bVar);
        BigDecimal bigDecimal3 = new BigDecimal("30.00");
        aVar.getClass();
        d = new ej0.b(bigDecimal3, bVar);
        BigDecimal bigDecimal4 = new BigDecimal("160.00");
        aVar.getClass();
        e = new ej0.b(bigDecimal4, bVar);
    }

    public d(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f267362a = resources;
    }

    public static eel.e a(List list, ej0.b value, double d5) {
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
            arrayList.add(new eel.l("", j2, new eel.f(value2)));
            i = i2;
        }
        long size = (long) (((double) arrayList.size()) / d5);
        eel.i iVar = eel.i.PRICE;
        Intrinsics.checkNotNullParameter(value, "value");
        return new eel.e(arrayList, 0L, size, iVar, new eel.f(value));
    }
}
