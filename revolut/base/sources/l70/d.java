package l70;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements b60.b, od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v70.b f192429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f192430b;

    public d(v70.b migrationRepository, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(migrationRepository, "migrationRepository");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f192429a = migrationRepository;
        this.f192430b = fileSystemRepository;
    }

    @Override // od0.e
    public final void clear() {
        this.f192429a.f286524b.edit().clear().commit();
        a80.h hVar = (a80.h) this.f192430b;
        hVar.getClass();
        zk0.a aVar = zk0.a.INTERNAL_CACHE;
        if (hVar.h(aVar).exists()) {
            lim.o.m(hVar.h(aVar));
        }
    }
}
