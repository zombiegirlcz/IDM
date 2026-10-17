package c34;

import bzg.t;
import com.revolut.core.model.account.AccountId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pu3.g;
import ufm.i;
import wsg.n;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20866b;

    public /* synthetic */ a(e eVar, int i) {
        this.f20865a = i;
        this.f20866b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20865a) {
            case 0:
                r04.c response = (r04.c) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                return new i(((n) this.f20866b.f20874c).x(AccountId.Personal.f51414a), new c2i.c(new t(response, 14), 12), 1);
            default:
                js3.a params = (js3.a) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (g) this.f20866b.d.get(params.a());
        }
    }
}
