package wsg;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f299728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountId f299729c;

    public /* synthetic */ i(n nVar, AccountId accountId, int i) {
        this.f299727a = i;
        this.f299728b = nVar;
        this.f299729c = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        fo3.c wallet = (fo3.c) obj2;
        switch (this.f299727a) {
            case 0:
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                return osg.b.r(this.f299728b, wallet.d, null, io3.i.INTERNAL, this.f299729c, 22);
            default:
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                return osg.b.o(this.f299728b, wallet.d, null, io3.i.INTERNAL, this.f299729c, w4l.h.f294642c, 22);
        }
    }
}
