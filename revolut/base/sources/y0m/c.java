package y0m;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0m.z;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements i {

    @NotNull
    public static final b Companion = new b();

    @Override // y0m.i
    public final void a(z event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // y0m.i
    public final List b() {
        return v.k("iglu:com.snowplowanalytics.mobile/deep_link_received/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
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
        if (gVar != null && (gVar instanceof a)) {
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
        return "DeepLinkContext";
    }

    @Override // y0m.i
    public final List h(z event, g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (gVar != null && (gVar instanceof a)) {
        }
        return null;
    }

    @Override // y0m.i
    public final List i() {
        return u.c("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
    }

    @Override // y0m.i
    public final List j() {
        return new ArrayList();
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
