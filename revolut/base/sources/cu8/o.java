package cu8;

import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.c f108878b;

    public /* synthetic */ o(com.revolut.feature.kyc.impl.c cVar, int i) {
        this.f108877a = i;
        this.f108878b = cVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f108877a) {
            case 0:
                this.f108878b.f77577p.c(new FinishCommand(0, zhm.q0.c(new Pair("SUGGESTED_CITIZENSHIP_DECLINED", Boolean.TRUE)), null, 4));
                break;
            default:
                this.f108878b.f77577p.c(new FinishCommand(-1, null, null, 6));
                break;
        }
    }
}
