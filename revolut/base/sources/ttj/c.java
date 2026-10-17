package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f274326c;

    public /* synthetic */ c(int i, Boolean bool, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f274319a.getDescriptor(), i, 3);
            throw null;
        }
        this.f274324a = str;
        this.f274325b = str2;
        if ((i & 4) == 0) {
            this.f274326c = null;
        } else {
            this.f274326c = bool;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f274324a, cVar.f274324a) && Intrinsics.f(this.f274325b, cVar.f274325b) && Intrinsics.f(this.f274326c, cVar.f274326c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f274324a.hashCode() * 31, 31, this.f274325b);
        Boolean bool = this.f274326c;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    public c(String campaignId, String userChallengeId, Boolean bool) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(userChallengeId, "userChallengeId");
        this.f274324a = campaignId;
        this.f274325b = userChallengeId;
        this.f274326c = bool;
    }
}
