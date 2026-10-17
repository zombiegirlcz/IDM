package w0m;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y0m.i;
import z0m.z;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes23.dex */
public final class h implements i {

    @NotNull
    public static final g Companion = new g();

    @Override // y0m.i
    public final void a(z event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // y0m.i
    public final List b() {
        return v.k("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0");
    }

    @Override // y0m.i
    public final List c() {
        return u.c("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
    }

    @Override // y0m.i
    public final List d(f1m.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return u.c(new f1m.f());
    }

    @Override // y0m.i
    public final y0m.g e(f1m.a event, y0m.g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof f1m.h) {
            f fVar = new f();
            fVar.f293773a = System.currentTimeMillis();
            return fVar;
        }
        f fVar2 = (f) gVar;
        if (fVar2 == null) {
            return null;
        }
        if (event instanceof f1m.e) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            fVar2.f293775c += jCurrentTimeMillis - fVar2.f293773a;
            fVar2.f293773a = jCurrentTimeMillis;
            return gVar;
        }
        if (event instanceof f1m.c) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            fVar2.f293774b += jCurrentTimeMillis2 - fVar2.f293773a;
            fVar2.f293773a = jCurrentTimeMillis2;
            return gVar;
        }
        if (event instanceof f1m.f) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            fVar2.f293774b += jCurrentTimeMillis3 - fVar2.f293773a;
            fVar2.f293773a = jCurrentTimeMillis3;
        }
        return gVar;
    }

    @Override // y0m.i
    public final List f() {
        return v.k("iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0");
    }

    @Override // y0m.i
    public final Map g(z event, y0m.g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    @Override // y0m.i
    public final String getIdentifier() {
        Companion.getClass();
        return "ScreenSummaryContext";
    }

    @Override // y0m.i
    public final List h(z event, y0m.g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (((f) gVar) == null) {
            return null;
        }
        return u.c(new h1m.a("iglu:com.snowplowanalytics.mobile/screen_summary/jsonschema/1-0-0", r0.n(new Pair("foreground_sec", Double.valueOf(r8.f293774b / 1000.0d)), new Pair("background_sec", Double.valueOf(r8.f293775c / 1000.0d)))));
    }

    @Override // y0m.i
    public final List i() {
        return v.k("iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0");
    }

    @Override // y0m.i
    public final List j() {
        return f0.f322471a;
    }

    @Override // y0m.i
    public final Boolean k(z event, y0m.g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event.f318694a, "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0")) {
            return Boolean.valueOf(gVar != null);
        }
        return Boolean.FALSE;
    }

    @Override // y0m.i
    public final f0 l() {
        return f0.f322471a;
    }
}
