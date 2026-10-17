package la6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193330c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f193331g;

    public f(String charityId, String id10, String type, String cardDesignCode, String cardDesignUrl, List minDonationsToUnlock, String status) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(cardDesignCode, "cardDesignCode");
        Intrinsics.checkNotNullParameter(cardDesignUrl, "cardDesignUrl");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(minDonationsToUnlock, "minDonationsToUnlock");
        this.f193328a = charityId;
        this.f193329b = id10;
        this.f193330c = type;
        this.d = cardDesignCode;
        this.e = cardDesignUrl;
        this.f = status;
        this.f193331g = minDonationsToUnlock;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f193328a, fVar.f193328a) && Intrinsics.f(this.f193329b, fVar.f193329b) && Intrinsics.f(this.f193330c, fVar.f193330c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f193331g, fVar.f193331g);
    }

    public final int hashCode() {
        return this.f193331g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f193328a.hashCode() * 31, 31, this.f193329b), 31, this.f193330c), 31, this.d), 31, this.e), 31, this.f);
    }
}
