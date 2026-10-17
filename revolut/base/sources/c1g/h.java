package c1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0g.j f20486a;

    public h(j0g.j repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f20486a = repository;
    }

    public final vkm.d a(String bookingId, boolean z) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        j0g.j jVar = this.f20486a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        return rd0.e.b(jVar.f170037h.f(bookingId, z));
    }
}
