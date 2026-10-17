package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import ip0.o50;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jc extends ProgressStepsDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o50 f54330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o50 f54331b;

    public jc(o50 firstStep, o50 secondStep) {
        Intrinsics.checkNotNullParameter(firstStep, "firstStep");
        Intrinsics.checkNotNullParameter(secondStep, "secondStep");
        this.f54330a = firstStep;
        this.f54331b = secondStep;
    }

    @Override // com.revolut.core.ui_kit.delegates.ProgressStepsDelegate.a
    public final o50 a() {
        return this.f54330a;
    }

    @Override // com.revolut.core.ui_kit.delegates.ProgressStepsDelegate.a
    public final o50 b() {
        return this.f54331b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj2;
        return Intrinsics.f(this.f54330a, jcVar.f54330a) && Intrinsics.f(this.f54331b, jcVar.f54331b);
    }

    public final int hashCode() {
        return this.f54331b.hashCode() + (this.f54330a.hashCode() * 31);
    }
}
