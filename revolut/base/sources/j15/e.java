package j15;

import k15.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g15.a f170122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f170123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f170124c;

    public e(g15.a getHelpDialogFactory, f forbearanceAvailabilityInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(getHelpDialogFactory, "getHelpDialogFactory");
        Intrinsics.checkNotNullParameter(forbearanceAvailabilityInteractor, "forbearanceAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f170122a = getHelpDialogFactory;
        this.f170123b = forbearanceAvailabilityInteractor;
        this.f170124c = userInteractor;
    }

    public final d a() {
        return new d(this.f170122a, this.f170123b, this.f170124c);
    }
}
