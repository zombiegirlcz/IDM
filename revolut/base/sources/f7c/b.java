package f7c;

import boh.f;
import e7c.c0;
import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements t {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // kg.t
    public final Object deserialize(u json, Type type, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String strI = f.i("type", json);
        if (Intrinsics.f(strI, "KYC")) {
            Object objD = ((a31.a) context).d(json, c0.b.C0718b.class);
            Intrinsics.checkNotNullExpressionValue(objD, "deserialize(...)");
            return (c0.b) objD;
        }
        if (!Intrinsics.f(strI, "PAYMENTS")) {
            throw new IllegalArgumentException(j6.a.q("Unsupported requirement type: ", strI));
        }
        Object objD2 = ((a31.a) context).d(json, c0.b.c.class);
        Intrinsics.checkNotNullExpressionValue(objD2, "deserialize(...)");
        return (c0.b) objD2;
    }
}
