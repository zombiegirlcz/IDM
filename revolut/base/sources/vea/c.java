package vea;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f288180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountId f288181c;

    public /* synthetic */ c(l lVar, AccountId accountId, int i) {
        this.f288179a = i;
        this.f288180b = lVar;
        this.f288181c = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f288179a) {
            case 0:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return te0.w.o0(skm.p0.f264003c, new j(this.f288180b, this.f288181c, pocket, null));
            case 1:
                String pocketId = (String) obj2;
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                wsg.n nVar = this.f288180b.f288204a;
                AccountId accountId = this.f288181c;
                efm.d0 d0VarW = nVar.w(accountId);
                d0VarW.getClass();
                return new pfm.h(d0VarW, 4).f(nVar.z(accountId, pocketId));
            default:
                io3.d pocket2 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket2, "pocket");
                return te0.w.o0(skm.p0.f264003c, new j(this.f288180b, this.f288181c, pocket2, null));
        }
    }
}
