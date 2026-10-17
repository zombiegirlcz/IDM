package e60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f122839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f122840b;

    public c(i iVar, l outputData) {
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        this.f122839a = iVar;
        this.f122840b = outputData;
    }

    @Override // e60.h
    public final i a() {
        return this.f122839a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f122839a, cVar.f122839a) && Intrinsics.f(this.f122840b, cVar.f122840b);
    }

    public final int hashCode() {
        i iVar = this.f122839a;
        return this.f122840b.hashCode() + ((iVar == null ? 0 : iVar.hashCode()) * 31);
    }
}
