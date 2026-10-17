package pi3;

import com.revolut.feature.checkout.models.PreorderPreconditions;
import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements Serializable {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f236410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f236411c;
    public final p d;
    public final Instant e;
    public final PreorderPreconditions f;

    static {
        new l("", s.CARD, new n("", null), null, null, null);
    }

    public l(String id10, s type, n nVar, p pVar, Instant instant, PreorderPreconditions preorderPreconditions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f236409a = id10;
        this.f236410b = type;
        this.f236411c = nVar;
        this.d = pVar;
        this.e = instant;
        this.f = preorderPreconditions;
    }

    public final s a() {
        return this.f236410b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f236409a, lVar.f236409a) && this.f236410b == lVar.f236410b && Intrinsics.f(this.f236411c, lVar.f236411c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final String getId() {
        return this.f236409a;
    }

    public final int hashCode() {
        int iHashCode = (this.f236410b.hashCode() + (this.f236409a.hashCode() * 31)) * 31;
        n nVar = this.f236411c;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        p pVar = this.d;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Instant instant = this.e;
        int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
        PreorderPreconditions preorderPreconditions = this.f;
        return iHashCode4 + (preorderPreconditions != null ? preorderPreconditions.hashCode() : 0);
    }
}
