package dml;

import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentChallenge.Qr.Delegated.Selection.Identity f116195a;

    public f(ConsentChallenge.Qr.Delegated.Selection.Identity chosenIndividualIdentity) {
        Intrinsics.checkNotNullParameter("TAG_BUTTON_CONTINUE", "buttonLoadingTag");
        Intrinsics.checkNotNullParameter(chosenIndividualIdentity, "chosenIndividualIdentity");
        this.f116195a = chosenIndividualIdentity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f116195a, ((f) obj2).f116195a);
    }

    public final int hashCode() {
        return this.f116195a.hashCode() - 52168303;
    }
}
