package t01;

import c1b.h;
import java.util.List;
import je0.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import wim.z;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f266849a;

    public b(d objectMapper) {
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        this.f266849a = objectMapper;
    }

    public static String a(String str) {
        return p.a.p("'", str, "'");
    }

    public static String b(h hVar) {
        switch (a.f266847b[hVar.ordinal()]) {
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "5";
            case 4:
                return "10";
            case 5:
                return "15";
            case 6:
                return "30";
            case 7:
                return "60";
            case 8:
                return "240";
            case 9:
                return "720";
            case 10:
                return "1D";
            case 11:
                return "2D";
            case 12:
                return "4D";
            case 13:
                return "1W";
            case 14:
                return "5W";
            case 15:
                return "1M";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String c(List list) {
        if (list.isEmpty()) {
            return "[]";
        }
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        KType kTypeB = o0.b(d1b.b.class);
        companion.getClass();
        return (String) this.f266849a.c(list, z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
    }
}
