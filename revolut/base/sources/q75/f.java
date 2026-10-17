package q75;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f242745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f242746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f242747c;

    public f(Data screenContent, Data terms, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f242745a = screenContent;
        this.f242746b = terms;
        this.f242747c = dVar;
    }

    public static f a(f fVar, Data screenContent, Data terms, dj0.d dVar, int i) {
        if ((i & 1) != 0) {
            screenContent = fVar.f242745a;
        }
        if ((i & 2) != 0) {
            terms = fVar.f242746b;
        }
        if ((i & 4) != 0) {
            dVar = fVar.f242747c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        Intrinsics.checkNotNullParameter(terms, "terms");
        return new f(screenContent, terms, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f242745a, fVar.f242745a) && Intrinsics.f(this.f242746b, fVar.f242746b) && Intrinsics.f(this.f242747c, fVar.f242747c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f242746b, this.f242745a.hashCode() * 31, 31);
        dj0.d dVar = this.f242747c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
