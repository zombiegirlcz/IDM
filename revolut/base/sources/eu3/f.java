package eu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f129494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5l.c f129495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu3.c f129496c;

    public f(c calculatorContent, p5l.c cardConfig, fu3.c cVar) {
        Intrinsics.checkNotNullParameter(calculatorContent, "calculatorContent");
        Intrinsics.checkNotNullParameter(cardConfig, "cardConfig");
        this.f129494a = calculatorContent;
        this.f129495b = cardConfig;
        this.f129496c = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f129494a, fVar.f129494a) && Intrinsics.f(this.f129495b, fVar.f129495b) && Intrinsics.f(this.f129496c, fVar.f129496c);
    }

    public final int hashCode() {
        int iHashCode = (this.f129495b.f233195a.hashCode() + (this.f129494a.hashCode() * 31)) * 31;
        fu3.c cVar = this.f129496c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
