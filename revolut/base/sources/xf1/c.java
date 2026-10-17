package xf1;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.time.b;
import kotlinx.serialization.SerializationException;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import wim.z;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f304762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f304763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f304764c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        d = kotlin.time.c.h(10000L, pkm.e.MILLISECONDS);
    }

    public c(j memoryCache, ue0.c storage, Map itemSources) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(itemSources, "itemSources");
        this.f304762a = memoryCache;
        this.f304763b = storage;
        this.f304764c = itemSources;
    }

    public static void a(ue0.c cVar, String str, qf1.d dVar) {
        try {
            cVar.G(dVar, str, z.d(o0.b(qf1.d.class)));
        } catch (SerializationException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            cVar.I0(str);
        } catch (Throwable th10) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var2);
        }
    }

    public final mf1.a b(qf1.f fVar) {
        Object obj2 = this.f304764c.get(fVar);
        if (obj2 != null) {
            return (mf1.a) obj2;
        }
        throw new IllegalArgumentException(j6.a.q("Item source was not found for the ", fVar.getId()).toString());
    }
}
