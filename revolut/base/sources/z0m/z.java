package z0m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f318695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jem.b f318696c;
    public final ArrayList d;
    public final UUID e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f318697g;

    public z(f1m.a event, jem.b bVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        this.e = uuidRandomUUID;
        this.f = System.currentTimeMillis();
        ArrayList arrayListF1 = d0.f1(event.f131307a);
        Intrinsics.checkNotNullParameter(arrayListF1, "<set-?>");
        this.d = arrayListF1;
        HashMap map = new HashMap(r0.u(event.a()));
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f318695b = map;
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f318696c = bVar;
        this.f318697g = event instanceof f1m.k;
        event = event instanceof f1m.a ? event : null;
        this.f318694a = event != null ? event.b() : null;
    }

    public final void a(h1m.a entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        ((ArrayList) b()).add(entity);
    }

    public final List b() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.r("entities");
        throw null;
    }

    public final Map c() {
        HashMap map = this.f318695b;
        if (map != null) {
            return map;
        }
        Intrinsics.r("payload");
        throw null;
    }
}
