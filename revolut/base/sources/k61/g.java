package k61;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f181607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountId f181608c;

    public /* synthetic */ g(i iVar, AccountId accountId, int i) {
        this.f181606a = i;
        this.f181607b = iVar;
        this.f181608c = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        y71.b result = (y71.b) obj2;
        switch (this.f181606a) {
            case 0:
                Intrinsics.checkNotNullParameter(result, "result");
                break;
            default:
                Intrinsics.checkNotNullParameter(result, "result");
                break;
        }
        return this.f181607b.f181612b.k0(this.f181608c).f(d0.m(result));
    }
}
