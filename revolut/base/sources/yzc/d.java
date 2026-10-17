package yzc;

import java.io.File;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f318069c;
    public final gzc.a d;

    public d(String fileName, String fileDescription, File file, gzc.a aVar) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileDescription, "fileDescription");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f318067a = fileName;
        this.f318068b = fileDescription;
        this.f318069c = file;
        this.d = aVar;
    }

    @Override // yzc.f
    public final gzc.a a() {
        return this.d;
    }

    @Override // yzc.f
    public final String b() {
        return this.f318067a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f318067a, dVar.f318067a) && Intrinsics.f(this.f318068b, dVar.f318068b) && Intrinsics.f(this.f318069c, dVar.f318069c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f318069c.hashCode() + p.a.c(this.f318067a.hashCode() * 31, 31, this.f318068b)) * 31;
        gzc.a aVar = this.d;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
