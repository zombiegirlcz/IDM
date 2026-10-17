package gfk;

import gfk.k;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements kg.t {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kg.t
    public final Object deserialize(kg.u json, Type type, kg.s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String strI = boh.f.i("productType", json);
        if (strI == null) {
            throw new NullPointerException("productType field is required");
        }
        switch (strI.hashCode()) {
            case -1600712933:
                if (strI.equals("WEEKEND_EXCHANGE")) {
                    Object objD = ((a31.a) context).d(json, k.h.class);
                    Intrinsics.checkNotNullExpressionValue(objD, "deserialize(...)");
                    return (k) objD;
                }
                break;
            case -1522565597:
                if (strI.equals("EXCHANGE")) {
                    Object objD2 = ((a31.a) context).d(json, k.d.class);
                    Intrinsics.checkNotNullExpressionValue(objD2, "deserialize(...)");
                    return (k) objD2;
                }
                break;
            case -375970027:
                if (strI.equals("COMMODITY_EXCHANGE")) {
                    Object objD3 = ((a31.a) context).d(json, k.b.class);
                    Intrinsics.checkNotNullExpressionValue(objD3, "deserialize(...)");
                    return (k) objD3;
                }
                break;
            case 65146:
                if (strI.equals("ATM")) {
                    Object objD4 = ((a31.a) context).d(json, k.a.class);
                    Intrinsics.checkNotNullExpressionValue(objD4, "deserialize(...)");
                    return (k) objD4;
                }
                break;
            case 80083268:
                if (strI.equals("TRADE")) {
                    Object objD5 = ((a31.a) context).d(json, k.e.class);
                    Intrinsics.checkNotNullExpressionValue(objD5, "deserialize(...)");
                    return (k) objD5;
                }
                break;
            case 417436641:
                if (strI.equals("CRYPTO_EXCHANGE")) {
                    Object objD6 = ((a31.a) context).d(json, k.c.class);
                    Intrinsics.checkNotNullExpressionValue(objD6, "deserialize(...)");
                    return (k) objD6;
                }
                break;
            case 2063509483:
                if (strI.equals("TRANSFER")) {
                    Object objD7 = ((a31.a) context).d(json, k.f.class);
                    Intrinsics.checkNotNullExpressionValue(objD7, "deserialize(...)");
                    return (k) objD7;
                }
                break;
        }
        Object objD8 = ((a31.a) context).d(json, k.g.class);
        Intrinsics.checkNotNullExpressionValue(objD8, "deserialize(...)");
        return (k) objD8;
    }
}
