package r93;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountId f252495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f252496c;

    public /* synthetic */ a(Object obj2, AccountId accountId, f0 f0Var, int i) {
        this.f252494a = i;
        this.f252495b = accountId;
        this.f252496c = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand topUpCommand = (NaviCommand) obj2;
        switch (this.f252494a) {
            case 0:
                Intrinsics.checkNotNullParameter(topUpCommand, "topUpCommand");
                return com.revolut.retail.core.navigation.a.c(c.a(this.f252495b, this.f252496c.f150110a), topUpCommand);
            default:
                Intrinsics.checkNotNullParameter(topUpCommand, "topUpCommand");
                return com.revolut.retail.core.navigation.a.c(k.c3(this.f252495b, this.f252496c.f150110a), topUpCommand);
        }
    }
}
