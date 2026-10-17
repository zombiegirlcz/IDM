package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements Serializable {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f232682c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f232683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f232684b;

    static {
        v vVar = w.Companion;
        vVar.getClass();
        w wVar = w.f232676c;
        vVar.getClass();
        f232682c = new y(wVar, wVar);
    }

    public y(w terminationInfo, w overdueInfo) {
        Intrinsics.checkNotNullParameter(terminationInfo, "terminationInfo");
        Intrinsics.checkNotNullParameter(overdueInfo, "overdueInfo");
        this.f232683a = terminationInfo;
        this.f232684b = overdueInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f232683a, yVar.f232683a) && Intrinsics.f(this.f232684b, yVar.f232684b);
    }

    public final int hashCode() {
        return this.f232684b.hashCode() + (this.f232683a.hashCode() * 31);
    }
}
