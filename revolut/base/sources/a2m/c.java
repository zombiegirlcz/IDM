package a2m;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2m.b f944a;

    public c(m2m.b fileStorageRepository) {
        Intrinsics.checkNotNullParameter(fileStorageRepository, "fileStorageRepository");
        this.f944a = fileStorageRepository;
    }

    public final File a() {
        File fileA;
        m2m.b bVar = this.f944a;
        synchronized (bVar) {
            fileA = bVar.a();
            fileA.deleteOnExit();
        }
        return fileA;
    }
}
