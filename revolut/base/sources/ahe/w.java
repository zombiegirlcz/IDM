package ahe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yfe.h f5037a;

    public w(yfe.h hVar) {
        this.f5037a = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f5037a, ((w) obj2).f5037a);
    }

    public final int hashCode() {
        yfe.h hVar = this.f5037a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}
