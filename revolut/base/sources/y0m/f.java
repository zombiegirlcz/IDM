package y0m;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0m.z;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes23.dex */
public final class f implements i {

    @NotNull
    public static final e Companion = new e();

    @Override // y0m.i
    public final void a(z event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // y0m.i
    public final List b() {
        return v.k("iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0");
    }

    @Override // y0m.i
    public final List c() {
        return f0.f322471a;
    }

    @Override // y0m.i
    public final List d(f1m.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    @Override // y0m.i
    public final g e(f1m.a event, g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof f1m.e) {
            return new d(true, ((f1m.e) event).f131309b);
        }
        if (event instanceof f1m.c) {
            return new d(false, ((f1m.c) event).f131308b);
        }
        return null;
    }

    @Override // y0m.i
    public final List f() {
        return f0.f322471a;
    }

    @Override // y0m.i
    public final Map g(z event, g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    @Override // y0m.i
    public final String getIdentifier() {
        Companion.getClass();
        return "Lifecycle";
    }

    @Override // y0m.i
    public final List h(z event, g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (gVar == null) {
            return u.c(new e1m.e(true));
        }
        d dVar = gVar instanceof d ? (d) gVar : null;
        if (dVar == null) {
            return null;
        }
        e1m.e eVar = new e1m.e(dVar.f310228a);
        Integer num = dVar.f310229b;
        HashMap map = eVar.f122002b;
        if (num != null) {
            map.put("index", Integer.valueOf(num.intValue()));
        }
        eVar.a(map);
        return u.c(eVar);
    }

    @Override // y0m.i
    public final List i() {
        return u.c("*");
    }

    @Override // y0m.i
    public final List j() {
        return f0.f322471a;
    }

    @Override // y0m.i
    public final Boolean k(z event, g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    @Override // y0m.i
    public final f0 l() {
        return f0.f322471a;
    }
}
