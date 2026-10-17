package gkl;

import com.revolut.sso.impl.domain.models.Challenge;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Challenge f144453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f144454b;

    public h1(Challenge challenge, ArrayList availableMethods) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
        this.f144453a = challenge;
        this.f144454b = availableMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return this.f144453a.equals(h1Var.f144453a) && this.f144454b.equals(h1Var.f144454b);
    }

    public final int hashCode() {
        return this.f144454b.hashCode() + (this.f144453a.hashCode() * 31);
    }
}
