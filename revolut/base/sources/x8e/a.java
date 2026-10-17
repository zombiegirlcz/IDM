package x8e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import do3.n;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import opg.c;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final List a(Subaccount subaccount) {
        Intrinsics.checkNotNullParameter(subaccount, "<this>");
        if ((subaccount instanceof Subaccount.Personal) || (subaccount instanceof Subaccount.Joint)) {
            List list = subaccount.getF88959a().f234888m;
            return list == null ? f0.f322471a : list;
        }
        if ((subaccount instanceof Subaccount.Group) || (subaccount instanceof Subaccount.Junior) || (subaccount instanceof Subaccount.Pro) || (subaccount instanceof Subaccount.Teen) || (subaccount instanceof Subaccount.ProTax)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(Subaccount subaccount) {
        Intrinsics.checkNotNullParameter(subaccount, "<this>");
        return subaccount.getF88959a().f();
    }

    public static final boolean c(Subaccount subaccount, n user) {
        Intrinsics.checkNotNullParameter(subaccount, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        if (subaccount instanceof Subaccount.Group) {
            return !c.e(user.f116408a, ((Subaccount.Group) subaccount).f88953a);
        }
        return true;
    }
}
