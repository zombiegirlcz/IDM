package rd4;

import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingIntroScreenContent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualUnderwritingIntroScreenContent f253333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f253334b;

    public d(ManualUnderwritingIntroScreenContent introScreen, ArrayList referralFlags) {
        Intrinsics.checkNotNullParameter(introScreen, "introScreen");
        Intrinsics.checkNotNullParameter(referralFlags, "referralFlags");
        this.f253333a = introScreen;
        this.f253334b = referralFlags;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f253333a, dVar.f253333a) && this.f253334b.equals(dVar.f253334b);
    }

    public final int hashCode() {
        return this.f253334b.hashCode() + (this.f253333a.hashCode() * 31);
    }
}
