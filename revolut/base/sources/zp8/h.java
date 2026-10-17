package zp8;

import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$InputData;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp8.b f324194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.h f324195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f324196c;
    public final Lazy d;

    public h(ChallengesOverviewContract$InputData inputData, CoroutineScope scope, hp8.b juniorTasksInteractor, ao.h juniorCoparentInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(juniorTasksInteractor, "juniorTasksInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        this.f324194a = juniorTasksInteractor;
        this.f324195b = juniorCoparentInteractor;
        this.f324196c = inputData.f77385a;
        this.d = j.b(new zk7.a(this, scope, 11));
    }
}
