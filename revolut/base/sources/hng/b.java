package hng;

import dp4.z0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f154092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f154093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f154094c;

    public b(ne0.j memoryCache, ue0.c registeredIdentityStorage) {
        Intrinsics.checkNotNullParameter(registeredIdentityStorage, "registeredIdentityStorage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f154092a = registeredIdentityStorage;
        this.f154093b = memoryCache;
        Continuation continuation = null;
        this.f154094c = new x4l.c(new eci.a(3, 17, continuation), new hg4.a(this, 21), new hfb.d(this, 13), new hbg.h(this, continuation, 15), new z0(this, continuation, 27));
    }

    public final vkm.d a() {
        return this.f154094c.b(Unit.f186387a, w4l.j.f294644c);
    }
}
