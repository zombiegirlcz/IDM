package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import ip0.o50;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ic extends ProgressStepsDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o50 f54290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o50 f54291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o50 f54292c;

    public ic(o50 firstStep, o50 secondStep, o50 thirdStep) {
        Intrinsics.checkNotNullParameter(firstStep, "firstStep");
        Intrinsics.checkNotNullParameter(secondStep, "secondStep");
        Intrinsics.checkNotNullParameter(thirdStep, "thirdStep");
        this.f54290a = firstStep;
        this.f54291b = secondStep;
        this.f54292c = thirdStep;
    }

    @Override // com.revolut.core.ui_kit.delegates.ProgressStepsDelegate.a
    public final o50 a() {
        return this.f54290a;
    }

    @Override // com.revolut.core.ui_kit.delegates.ProgressStepsDelegate.a
    public final o50 b() {
        return this.f54291b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj2;
        return Intrinsics.f(this.f54290a, icVar.f54290a) && Intrinsics.f(this.f54291b, icVar.f54291b) && Intrinsics.f(this.f54292c, icVar.f54292c);
    }

    public final int hashCode() {
        return this.f54292c.hashCode() + ((this.f54291b.hashCode() + (this.f54290a.hashCode() * 31)) * 31);
    }
}
