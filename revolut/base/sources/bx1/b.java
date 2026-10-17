package bx1;

import com.revolut.feature.apm.core.models.payments_authorisations.FieldChange;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final a a(FieldChange fieldChange, Object obj2) {
        if (fieldChange instanceof FieldChange.ValueUpdated) {
            Object obj3 = ((FieldChange.ValueUpdated) fieldChange).f62021a;
            return !Intrinsics.f(obj2, obj3) ? new a(obj3, obj2, true) : new a(obj2, null, false);
        }
        if (Intrinsics.f(fieldChange, FieldChange.Removed.f62020a)) {
            if (obj2 != null) {
                return new a(null, obj2, true);
            }
            return null;
        }
        if (!Intrinsics.f(fieldChange, FieldChange.NoChange.f62019a) && fieldChange != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (obj2 != null) {
            return new a(obj2, null, false);
        }
        return null;
    }
}
