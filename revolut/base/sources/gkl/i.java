package gkl;

import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.impl.domain.models.Claim;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Claim f144455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Evidence f144456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f144457c;

    public i(Claim claim, Evidence evidence, Set set) {
        this.f144455a = claim;
        this.f144456b = evidence;
        this.f144457c = set;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f144455a, iVar.f144455a) && Intrinsics.f(this.f144456b, iVar.f144456b) && Intrinsics.f(this.f144457c, iVar.f144457c);
    }

    public final int hashCode() {
        Claim claim = this.f144455a;
        int iHashCode = (claim == null ? 0 : claim.hashCode()) * 31;
        Evidence evidence = this.f144456b;
        int iHashCode2 = (iHashCode + (evidence == null ? 0 : evidence.hashCode())) * 31;
        Set set = this.f144457c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }
}
