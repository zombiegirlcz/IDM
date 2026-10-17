package w10;

import java.lang.reflect.Type;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements kg.t {
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, kg.s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return Instant.parse(json.f());
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }
}
