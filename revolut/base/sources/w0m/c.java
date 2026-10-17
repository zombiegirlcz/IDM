package w0m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y0m.i;
import z0m.z;
import zhm.f0;
import zhm.u;

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
        return u.c("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
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
    public final y0m.g e(f1m.a event, y0m.g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        f1m.h hVar = event instanceof f1m.h ? (f1m.h) event : null;
        if (hVar == null) {
            return null;
        }
        return new a(hVar.f131310b, hVar.d, hVar.f131311c, hVar.e, hVar.f, gVar instanceof a ? (a) gVar : null);
    }

    @Override // y0m.i
    public final List f() {
        return f0.f322471a;
    }

    @Override // y0m.i
    public final Map g(z event, y0m.g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(gVar instanceof a)) {
            return null;
        }
        HashMap map = new HashMap();
        a aVar = ((a) gVar).f;
        String str = aVar != null ? aVar.f293770a : null;
        if (str != null && str.length() > 0) {
            map.put("previousName", str);
        }
        String str2 = aVar != null ? aVar.f293772c : null;
        if (str2 != null && str2.length() > 0) {
            map.put("previousId", str2);
        }
        String str3 = aVar != null ? aVar.f293771b : null;
        if (str3 != null && str3.length() > 0) {
            map.put("previousType", str3);
        }
        return map;
    }

    @Override // y0m.i
    public final String getIdentifier() {
        Companion.getClass();
        return "ScreenContext";
    }

    @Override // y0m.i
    public final List h(z event, y0m.g gVar) {
        h1m.a aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (gVar == null) {
            return new ArrayList();
        }
        a aVar2 = gVar instanceof a ? (a) gVar : null;
        if (aVar2 != null) {
            h1m.b bVar = new h1m.b();
            bVar.a("id", aVar2.f293772c);
            bVar.a("name", aVar2.f293770a);
            bVar.a("type", aVar2.f293771b);
            bVar.a("fragment", null);
            String str = aVar2.d;
            String str2 = aVar2.e;
            if (str == null || str.length() <= 0) {
                str = (str2 == null || str2.length() <= 0) ? null : str2;
            }
            bVar.a("activity", str);
            aVar = new h1m.a(bVar);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return u.c(aVar);
        }
        return null;
    }

    @Override // y0m.i
    public final List i() {
        return u.c("*");
    }

    @Override // y0m.i
    public final List j() {
        return u.c("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
    }

    @Override // y0m.i
    public final Boolean k(z event, y0m.g gVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    @Override // y0m.i
    public final f0 l() {
        return f0.f322471a;
    }
}
