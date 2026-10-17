package gkl;

import com.revolut.sso.impl.domain.models.Challenge;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n1 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Challenge f144468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f144469b;

    public n1(Challenge challenge, ArrayList availableMethods) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
        this.f144468a = challenge;
        this.f144469b = availableMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return this.f144468a.equals(n1Var.f144468a) && this.f144469b.equals(n1Var.f144469b);
    }

    public final int hashCode() {
        return this.f144469b.hashCode() + (this.f144468a.hashCode() * 31);
    }
}
