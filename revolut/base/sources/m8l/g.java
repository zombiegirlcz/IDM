package m8l;

import com.revolut.shared.feature.move_money.impl.data.MoveMoneyService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t7i.p;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyService f203580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj0.a f203581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f203582c;

    public g(MoveMoneyService service, wj0.a idempotencyKeyHolder, p savingsMoveMoneyDelegate) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(savingsMoveMoneyDelegate, "savingsMoveMoneyDelegate");
        this.f203580a = service;
        this.f203581b = idempotencyKeyHolder;
        this.f203582c = savingsMoveMoneyDelegate;
    }

    public static final j a(g gVar, j8l.d dVar) {
        int i = f.f203579a[dVar.ordinal()];
        if (i == 1) {
            return j.BUY;
        }
        if (i == 2) {
            return j.SELL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
