package mh8;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f205424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f205425b;

    public a(b matchResult, ArrayList consentMechanics) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(consentMechanics, "consentMechanics");
        this.f205424a = matchResult;
        this.f205425b = consentMechanics;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f205424a == aVar.f205424a && this.f205425b.equals(aVar.f205425b);
    }

    public final int hashCode() {
        return this.f205425b.hashCode() + (this.f205424a.hashCode() * 31);
    }
}
