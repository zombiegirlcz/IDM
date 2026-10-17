package f2k;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f131839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f131840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f131841c;

    public a(Clause clause, boolean z, h hVar) {
        this.f131839a = clause;
        this.f131840b = z;
        this.f131841c = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f131839a, aVar.f131839a) && this.f131840b == aVar.f131840b && Intrinsics.f(this.f131841c, aVar.f131841c);
    }

    public final int hashCode() {
        Clause clause = this.f131839a;
        int iC = j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f131840b);
        h hVar = this.f131841c;
        return iC + (hVar != null ? hVar.hashCode() : 0);
    }
}
