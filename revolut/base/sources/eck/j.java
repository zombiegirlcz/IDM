package eck;

import cli.n;
import cli.y;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.birthday.enable_sharing.EnableBirthdaySharingScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends oki.h implements dli.b {
    public final y21.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f124764p;

    public j(n stateMapper, y21.c optOutRepository, EnableBirthdaySharingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = optOutRepository;
        this.f124764p = mra.d.b(this, new d(inputData.f102498a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f124764p;
    }
}
