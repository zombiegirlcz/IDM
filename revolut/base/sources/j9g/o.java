package j9g;

import java.time.LocalDate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f172339a;

    public o(n searchItemMapper, u smartFiltersMapper) {
        Intrinsics.checkNotNullParameter(searchItemMapper, "searchItemMapper");
        Intrinsics.checkNotNullParameter(smartFiltersMapper, "smartFiltersMapper");
        this.f172339a = searchItemMapper;
    }

    public static LocalDate a(String str) {
        Object objA;
        Object obj2 = null;
        if (str == null) {
            return null;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = LocalDate.parse(str);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA == null) {
            obj2 = objA;
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
        }
        return (LocalDate) obj2;
    }
}
