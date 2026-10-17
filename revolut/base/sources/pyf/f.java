package pyf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f240828c;
    public final h d;
    public final h e;

    public f(String experienceId, String currency, Map ageBandSelectionMap, h currentPaginationToken, h hVar) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(ageBandSelectionMap, "ageBandSelectionMap");
        Intrinsics.checkNotNullParameter(currentPaginationToken, "currentPaginationToken");
        this.f240826a = experienceId;
        this.f240827b = currency;
        this.f240828c = ageBandSelectionMap;
        this.d = currentPaginationToken;
        this.e = hVar;
    }

    public static f b(f fVar, h currentPaginationToken, h hVar) {
        String experienceId = fVar.f240826a;
        String currency = fVar.f240827b;
        Map ageBandSelectionMap = fVar.f240828c;
        fVar.getClass();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(ageBandSelectionMap, "ageBandSelectionMap");
        Intrinsics.checkNotNullParameter(currentPaginationToken, "currentPaginationToken");
        return new f(experienceId, currency, ageBandSelectionMap, currentPaginationToken, hVar);
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        return 50;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f240826a, fVar.f240826a) && Intrinsics.f(this.f240827b, fVar.f240827b) && Intrinsics.f(this.f240828c, fVar.f240828c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iA = y.a(p.a.e(p.a.c(this.f240826a.hashCode() * 31, 31, this.f240827b), 31, this.f240828c), 31, this.d.f240829a);
        h hVar = this.e;
        return Integer.hashCode(50) + ((iA + (hVar == null ? 0 : hVar.f240829a.hashCode())) * 31);
    }
}
