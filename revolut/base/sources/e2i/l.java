package e2i;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f122112b;

    public /* synthetic */ l(m mVar, int i) {
        this.f122111a = i;
        this.f122112b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f122111a) {
            case 0:
                p it8 = (p) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f122112b.d.k0(AccountId.Personal.f51414a).f(d0.m(it8));
            default:
                b action = (b) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                m mVar = this.f122112b;
                ufm.i iVar = new ufm.i(eda.f.a(mVar.f122113a, action.f122101c, null, null, 6), new e0f.k(new e1.b(action, mVar, 8), 24), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
        }
    }
}
