package lte;

import com.revolut.utils.tracking.ab_testing.experiments.FirebaseExperiment;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f199856a;

    public c(Lazy configLazy) {
        Intrinsics.checkNotNullParameter(configLazy, "configLazy");
        this.f199856a = configLazy;
    }

    public final ih0.b a() {
        return (ih0.b) this.f199856a.getValue();
    }

    public final r81.c b(FirebaseExperiment firebaseExperiment) {
        Intrinsics.checkNotNullParameter(firebaseExperiment, "firebaseExperiment");
        try {
            String strE = ((ii0.b) a()).e(firebaseExperiment.getF60553a());
            b0m.b.Companion.getClass();
            b0m.b bVarA = b0m.a.a(strE);
            return bVarA != null ? bVarA : firebaseExperiment.getDefaultValue();
        } catch (Exception unused) {
            return firebaseExperiment.getDefaultValue();
        }
    }
}
