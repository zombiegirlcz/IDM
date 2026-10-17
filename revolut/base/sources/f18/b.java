package f18;

import e18.f;
import f0d.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.serialization.json.Json;
import rlm.o;
import ue0.e;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f131179a = e.b(Json.d, new k(4));

    public static f b(String typeString) {
        Intrinsics.checkNotNullParameter(typeString, "typeString");
        if (Intrinsics.f(typeString, "REV_INSIGHTS")) {
            return f.REV_INSIGHT;
        }
        if (Intrinsics.f(typeString, "PRICE_ALERTS")) {
            return f.PRICE_ALERT;
        }
        throw new IllegalStateException("Please specify the type of notification");
    }

    public final List a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (d0.W(value)) {
            return f0.f322471a;
        }
        o oVar = this.f131179a;
        oVar.getClass();
        return (List) oVar.b(new qlm.e(e18.b.Companion.serializer()), value);
    }
}
