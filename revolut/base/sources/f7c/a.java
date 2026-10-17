package f7c;

import boh.f;
import e7c.v;
import e7c.w;
import e7c.y;
import e7c.z;
import java.lang.reflect.Type;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.s;
import kg.t;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements t {

    @NotNull
    private static final C0775a Companion = new C0775a();

    /* JADX INFO: renamed from: f7c.a$a, reason: collision with other inner class name */
    public static final class C0775a {
        private C0775a() {
        }
    }

    @Override // kg.t
    public final Object deserialize(u json, Type type, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        String strI = f.i("type", json);
        if (strI != null) {
            int iHashCode = strI.hashCode();
            if (iHashCode != -1865391603) {
                if (iHashCode != 2061072) {
                    if (iHashCode == 427409162 && strI.equals("BANK_ACCOUNT")) {
                        return (z) ((a31.a) context).d(json, v.class);
                    }
                } else if (strI.equals("CARD")) {
                    return (z) ((a31.a) context).d(json, w.class);
                }
            } else if (strI.equals("REVOLUT_ACCOUNT")) {
                return (z) ((a31.a) context).d(json, y.class);
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unsupported payment method type: ", strI));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }
}
