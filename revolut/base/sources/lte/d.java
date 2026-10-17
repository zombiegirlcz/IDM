package lte;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import od0.e;
import wim.z;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f199857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f199858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f199859c;
    public volatile Map d;

    public d(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter("mutableToggles", "key");
        this.f199857a = storage;
        this.f199858b = new Object();
        this.f199859c = new Object();
    }

    public final Map a() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapG = (Map) this.f199857a.T2("mutableToggles", Map.class);
        if (mapG == null) {
            mapG = r0.g();
        }
        synchronized (this.f199859c) {
            try {
                if (this.d == null) {
                    this.d = mapG;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return mapG;
    }

    @Override // od0.e
    public final void clear() {
        synchronized (this.f199859c) {
            this.d = r0.g();
            Unit unit = Unit.f186387a;
        }
        synchronized (this.f199858b) {
            try {
                Map map = this.d;
                if (map != null) {
                    if (map.isEmpty()) {
                        this.f199857a.I0("mutableToggles");
                    } else {
                        ue0.c cVar = this.f199857a;
                        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                        KType kTypeB = o0.b(String.class);
                        companion.getClass();
                        cVar.G(map, "mutableToggles", z.d(o0.d(KTypeProjection.Companion.a(kTypeB), KTypeProjection.Companion.a(o0.b(Object.class)))));
                    }
                }
                Unit unit2 = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
