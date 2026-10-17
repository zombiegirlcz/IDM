package oid;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import mid.x;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements kg.t {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kg.t
    public final Object deserialize(kg.u json, Type typeOfT, kg.s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        String strF = json.c().i("type").f();
        if (strF == null) {
            return null;
        }
        switch (strF.hashCode()) {
            case -631810228:
                if (strF.equals("REV_POINTS_BANNER")) {
                    return (mid.x) ((a31.a) context).d(json, x.c.class);
                }
                return null;
            case 299919071:
                if (strF.equals("EMPTY_STATE")) {
                    return (mid.x) ((a31.a) context).d(json, x.a.class);
                }
                return null;
            case 386270650:
                if (strF.equals("RECENT_SEARCHES")) {
                    return (mid.x) ((a31.a) context).d(json, x.b.class);
                }
                return null;
            case 912789695:
                if (strF.equals("TRENDING_HORIZONTAL_LIST")) {
                    return (mid.x) ((a31.a) context).d(json, x.d.class);
                }
                return null;
            case 2033599431:
                if (strF.equals("VERTICAL_LIST")) {
                    return (mid.x) ((a31.a) context).d(json, x.e.class);
                }
                return null;
            default:
                return null;
        }
    }
}
