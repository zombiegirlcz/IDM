package cob;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import djb.q;
import go.g;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rnb.v;
import tof.i7;
import vf0.h;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f25517b;

    public /* synthetic */ a(e eVar, int i) {
        this.f25516a = i;
        this.f25517b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f25516a) {
            case 0:
                h hVar = (h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return this.f25517b.a((i7) hVar.f288433a, (List) hVar.f288434b, (AccountId) hVar.f288435c, (ProductAccountId) hVar.d);
            default:
                AccountId.Joint accountId = (AccountId.Joint) obj2;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                q qVar = this.f25517b.f25523a;
                Flow flowB = ((v) qVar).b(accountId);
                g gVarA = ((v) qVar).a(accountId);
                g gVarI = zi0.c.i(accountId);
                nib.c.Companion.getClass();
                return nim.a.u(new a2c.c(2, 23, null), u0.m(u0.i(flowB, gVarA, gVarI), zi0.c.i(new ProductAccountId(nib.b.f215668c, null))));
        }
    }
}
