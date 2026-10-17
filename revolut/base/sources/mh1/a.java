package mh1;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements i1j.a {

    @NotNull
    public static final C1164a Companion = new C1164a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f205345a;

    /* JADX INFO: renamed from: mh1.a$a, reason: collision with other inner class name */
    public static final class C1164a {
        private C1164a() {
        }
    }

    static {
        k1j.c[] elements = {k1j.c.SUBACCOUNTS, k1j.c.PRO_VAULTS, k1j.c.JOINT_SUBACCOUNTS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f205345a = kotlin.collections.d.y0(elements);
    }

    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        return zi0.c.i(balanceGroupList);
    }

    @Override // i1j.a
    public final boolean b(k1j.c balanceGroupType) {
        Intrinsics.checkNotNullParameter(balanceGroupType, "balanceGroupType");
        return !f205345a.contains(balanceGroupType);
    }
}
