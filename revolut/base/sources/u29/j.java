package u29;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.y;
import m1c.z;
import x19.a;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f276573a = new j();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        z revPointsAccountStatus = (z) obj2;
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        if (revPointsAccountStatus instanceof y) {
            return new x19.b(((y) revPointsAccountStatus).f201475a);
        }
        if (revPointsAccountStatus instanceof z.a) {
            return a.b.f302353a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
