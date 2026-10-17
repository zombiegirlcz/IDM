package lhk;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f195342a;

    public g0(FeatureCommand kycPromptCommand) {
        Intrinsics.checkNotNullParameter(kycPromptCommand, "kycPromptCommand");
        this.f195342a = kycPromptCommand;
    }

    @Override // xfk.a
    public final /* bridge */ /* synthetic */ zfk.b a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && this.f195342a.equals(((g0) obj2).f195342a);
    }

    public final int hashCode() {
        return this.f195342a.f98638a.hashCode();
    }
}
