package o46;

import aii.u;
import kotlin.jvm.internal.Intrinsics;
import p46.d;
import rhf.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements sr5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f222163a;

    public b(d eventDispatcher) {
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        this.f222163a = eventDispatcher;
    }

    @Override // sr5.a
    public final void a(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        k46.a event = new k46.a(descriptor);
        d dVar = this.f222163a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        dVar.f232838a.k(event);
    }

    @Override // sr5.a
    public final void b(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        k46.b event = new k46.b(destination);
        d dVar = this.f222163a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        dVar.f232838a.k(event);
    }
}
