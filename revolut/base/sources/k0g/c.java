package k0g;

import elm.f;
import jkc.g;
import jsl.t0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f180042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f180043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f180044c;

    public c(j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f180042a = storage;
        this.f180043b = memoryCache;
        this.f180044c = q.b(0, 7, null);
    }

    public final Object a(gim.c cVar) {
        kyf.a aVar = (kyf.a) this.f180043b.get("KEY_EXPERIENCES_CONFIG");
        if (aVar != null) {
            return aVar;
        }
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, new g(this, null, 27), cVar);
    }

    public final Object b(kyf.a aVar, gim.c cVar) throws Throwable {
        this.f180043b.f("KEY_EXPERIENCES_CONFIG", aVar);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, new t0(this, aVar, null, 18), cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
