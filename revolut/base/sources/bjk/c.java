package bjk;

import bjk.d;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements kg.t {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kg.t
    public final Object deserialize(kg.u json, Type type, kg.s context) {
        Type type2;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String strI = boh.f.i("type", json);
        if (strI == null) {
            throw new NullPointerException("type field is required");
        }
        switch (strI.hashCode()) {
            case 82810:
                if (!strI.equals("TAG")) {
                    return null;
                }
                type2 = d.C0102d.a.e.class;
                break;
                break;
            case 2241657:
                if (!strI.equals("ICON")) {
                    return null;
                }
                type2 = d.C0102d.a.c.class;
                break;
                break;
            case 2571565:
                if (!strI.equals("TEXT")) {
                    return null;
                }
                type2 = d.C0102d.a.f.class;
                break;
                break;
            case 1970608946:
                if (!strI.equals("BUTTON")) {
                    return null;
                }
                type2 = d.C0102d.a.C0103a.class;
                break;
                break;
            default:
                return null;
        }
        return (d.C0102d.a) ((a31.a) context).d(json, type2);
    }
}
