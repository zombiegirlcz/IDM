package v8i;

import com.revolut.shared.feature.move_money.api.model.MoveMoneyReason;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import krf.d;
import krf.e;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final MoveMoneyReason a(krf.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof e) {
            e eVar = (e) cVar;
            return new MoveMoneyReason.Predefined(eVar.f188861a, eVar.f188862b);
        }
        if (cVar instanceof d) {
            return new MoveMoneyReason.Custom(((d) cVar).f188860a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
