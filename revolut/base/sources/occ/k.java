package occ;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f224217a = new k();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r0 optInState = (r0) obj2;
        Intrinsics.checkNotNullParameter(optInState, "optInState");
        int i = j.f224216a[optInState.f201447a.ordinal()];
        if (i == 1) {
            return new go.g(d.f224210a, 2);
        }
        if (i == 2) {
            return new go.g(e.f224211a, 2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
