package e85;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f123582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f123583c;

    public g(String loanId, Data screenContent, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        this.f123581a = loanId;
        this.f123582b = screenContent;
        this.f123583c = dVar;
    }

    public static g a(g gVar, Data screenContent, dj0.d dVar, int i) {
        String loanId = gVar.f123581a;
        if ((i & 2) != 0) {
            screenContent = gVar.f123582b;
        }
        if ((i & 4) != 0) {
            dVar = gVar.f123583c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        return new g(loanId, screenContent, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f123581a, gVar.f123581a) && Intrinsics.f(this.f123582b, gVar.f123582b) && Intrinsics.f(this.f123583c, gVar.f123583c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f123582b, this.f123581a.hashCode() * 31, 31);
        dj0.d dVar = this.f123583c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
