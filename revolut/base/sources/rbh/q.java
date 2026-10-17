package rbh;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.trading.core.domain.PocketInfo;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xi0.b f253090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f253091b;

    public q(r rVar, xi0.b bVar, AccountId.Joint joint) {
        this.f253090a = bVar;
        this.f253091b = joint;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        io3.d dVarA = s.a(this.f253090a, (Pair) pair.f186385a, (Set) pair.f186386b);
        return new PocketInfo.Joint(dVarA.f163145a, io3.h.e(dVarA), null, null, this.f253091b);
    }
}
