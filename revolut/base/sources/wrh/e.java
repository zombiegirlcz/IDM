package wrh;

import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f299581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebSignInConfirmationScreenContract$InputData f299582b;

    public e(long j2, WebSignInConfirmationScreenContract$InputData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f299581a = j2;
        this.f299582b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f299581a == eVar.f299581a && Intrinsics.f(this.f299582b, eVar.f299582b);
    }

    public final int hashCode() {
        return this.f299582b.hashCode() + (Long.hashCode(this.f299581a) * 31);
    }
}
