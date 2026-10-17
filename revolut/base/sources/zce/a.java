package zce;

import bde.e;
import bde.g;
import bde.h;
import bde.i;
import bde.j;
import bde.k;
import bde.l;
import bde.m;
import bde.r;
import boh.f;
import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements t {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kg.t
    public final Object deserialize(u json, Type type, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String strI = f.i("type", json);
        String strI2 = f.i("source", json);
        if (strI2 == null) {
            strI2 = "UNSUPPORTED";
        }
        String str = strI2;
        if (strI == null) {
            return null;
        }
        switch (strI.hashCode()) {
            case -1407593444:
                if (strI.equals("MERCHANT_FEEDBACK")) {
                    return new m(strI, str, f.j("title", json));
                }
                return null;
            case -757077946:
                if (!strI.equals("HYPERLINK")) {
                    return null;
                }
                String strI3 = f.i("title", json);
                u uVarI = json.c().i("payload");
                Intrinsics.checkNotNullExpressionValue(uVarI, "get(...)");
                return new k(strI, str, strI3, (l) ((a31.a) context).d(uVarI, l.class));
            case 69366:
                if (!strI.equals("FAQ")) {
                    return null;
                }
                String strI4 = f.i("title", json);
                u uVarI2 = json.c().i("payload");
                Intrinsics.checkNotNullExpressionValue(uVarI2, "get(...)");
                return new i(strI, str, strI4, (j) ((a31.a) context).d(uVarI2, j.class));
            case 835624813:
                if (!strI.equals("DEEP_LINK")) {
                    return null;
                }
                String strJ = f.j("title", json);
                u uVarI3 = json.c().i("payload");
                Intrinsics.checkNotNullExpressionValue(uVarI3, "get(...)");
                a31.a aVar = (a31.a) context;
                h hVar = (h) aVar.d(uVarI3, h.class);
                u uVarI4 = json.c().i("metadata");
                Intrinsics.checkNotNullExpressionValue(uVarI4, "get(...)");
                return new g(strI, str, strJ, hVar, (r) aVar.d(uVarI4, r.class));
            case 1084439102:
                if (!strI.equals("CARD_DELIVERY_TROUBLESHOOTING")) {
                    return null;
                }
                u uVarI5 = json.c().i("payload");
                Intrinsics.checkNotNullExpressionValue(uVarI5, "get(...)");
                return new bde.a(strI, str, (bde.b) ((a31.a) context).d(uVarI5, bde.b.class));
            case 1669513305:
                if (!strI.equals("CONTENT")) {
                    return null;
                }
                String strJ2 = f.j("title", json);
                u uVarI6 = json.c().i("payload");
                Intrinsics.checkNotNullExpressionValue(uVarI6, "get(...)");
                return new e(strI, str, strJ2, (bde.f) ((a31.a) context).d(uVarI6, bde.f.class));
            default:
                return null;
        }
    }
}
