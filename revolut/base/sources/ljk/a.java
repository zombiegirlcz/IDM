package ljk;

import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import ljk.d;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements t {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kg.t
    public final Object deserialize(u json, Type type, s context) {
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
                type2 = d.g.a.e.class;
                break;
                break;
            case 2241657:
                if (!strI.equals("ICON")) {
                    return null;
                }
                type2 = d.g.a.c.class;
                break;
                break;
            case 2571565:
                if (!strI.equals("TEXT")) {
                    return null;
                }
                type2 = d.g.a.f.class;
                break;
                break;
            case 1970608946:
                if (!strI.equals("BUTTON")) {
                    return null;
                }
                type2 = d.g.a.C1109a.class;
                break;
                break;
            default:
                return null;
        }
        return (d.g.a) ((a31.a) context).d(json, type2);
    }
}
