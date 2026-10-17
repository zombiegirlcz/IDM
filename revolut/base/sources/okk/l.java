package okk;

import cli.n;
import cli.y;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends oki.h implements dli.b {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f226143p;

    public l(MoreForFamilyScreenContract$InputData inputData, n stateMapper, i moreForFamilyExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(moreForFamilyExtension, "moreForFamilyExtension");
        this.o = moreForFamilyExtension;
        this.f226143p = mra.d.b(this, new j(inputData.f103426a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f226143p;
    }
}
