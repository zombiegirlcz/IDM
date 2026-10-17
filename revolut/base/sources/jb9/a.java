package jb9;

import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeCollectionScreenContract$PasscodeScreenMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasscodeCollectionScreenContract$PasscodeScreenMode f172610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f172611b;

    public a(PasscodeCollectionScreenContract$PasscodeScreenMode mode, boolean z) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f172610a = mode;
        this.f172611b = z;
    }

    public static a a(a aVar, boolean z) {
        PasscodeCollectionScreenContract$PasscodeScreenMode mode = aVar.f172610a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new a(mode, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f172610a, aVar.f172610a) && this.f172611b == aVar.f172611b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172611b) + (this.f172610a.hashCode() * 31);
    }
}
