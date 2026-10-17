package hkb;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f152908a;

    public a(Data challengeAccount) {
        Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
        this.f152908a = challengeAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f152908a, ((a) obj2).f152908a);
    }

    public final int hashCode() {
        return this.f152908a.hashCode();
    }
}
