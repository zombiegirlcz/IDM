package mh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv3.j f205387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv3.e f205388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv3.a f205389c;
    public final mv3.k d;

    public h(mv3.j jVar, mv3.e eVar, mv3.a creditToRefinanceContent, mv3.k parameters) {
        Intrinsics.checkNotNullParameter(creditToRefinanceContent, "creditToRefinanceContent");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f205387a = jVar;
        this.f205388b = eVar;
        this.f205389c = creditToRefinanceContent;
        this.d = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f205387a, hVar.f205387a) && Intrinsics.f(this.f205388b, hVar.f205388b) && Intrinsics.f(this.f205389c, hVar.f205389c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        mv3.j jVar = this.f205387a;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        mv3.e eVar = this.f205388b;
        return this.d.hashCode() + ((this.f205389c.hashCode() + ((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31)) * 31);
    }
}
