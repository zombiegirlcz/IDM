package pp5;

import eq5.o0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mp6.j;
import rd0.e;
import vkm.v1;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements i1j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f238273a;

    public a(n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f238273a = walletInteractor;
    }

    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        return e.e(new v1(new j(this, balanceGroupList, (Continuation) null, 15)), h0.f322473a, new o0(balanceGroupList, 1, null));
    }
}
