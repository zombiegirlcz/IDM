package lsj;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lnk.o;
import lr9.m;
import wim.z;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f199690b;

    public /* synthetic */ e(f fVar, int i) {
        this.f199689a = i;
        this.f199690b = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str;
        switch (this.f199689a) {
            case 0:
                String str2 = ((WalletId) obj2).f66106a;
                uzi.b value = (uzi.b) obj3;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(value, "value");
                ne0.d dVar = this.f199690b.f199692b;
                f.Companion.getClass();
                dVar.f(a.a(str2), value);
                return Unit.f186387a;
            case 1:
                String str3 = ((WalletId) obj2).f66106a;
                uzi.b analyticsCycle = (uzi.b) obj3;
                Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(analyticsCycle, "analyticsCycle");
                ue0.c cVar = this.f199690b.f199691a;
                f.Companion.getClass();
                String strA = a.a(str3);
                Intrinsics.checkNotNullParameter(analyticsCycle, "<this>");
                int i = msj.a.f208674a[analyticsCycle.f284679a.ordinal()];
                if (i == 1) {
                    str = "MONTHLY";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "WEEKLY";
                }
                cVar.G(new msj.b(str, analyticsCycle.f284680b), strA, z.d(o0.b(msj.b.class)));
                return Unit.f186387a;
            case 2:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                String str4 = ((WalletId) obj3).f66106a;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(str4, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(str4, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                f fVar = this.f199690b;
                d0 d0VarFirstOrError = m70.a.g(fVar.d.f(new WalletId(str4), false), null, new o(7), 1).map(new m(new loc.a(fVar, 23), 12)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return d0VarFirstOrError;
            default:
                String str5 = ((WalletId) obj2).f66106a;
                b value2 = (b) obj3;
                Intrinsics.checkNotNullParameter(str5, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(value2, "value");
                ne0.d dVar2 = this.f199690b.f199692b;
                f.Companion.getClass();
                Intrinsics.checkNotNullParameter(str5, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                dVar2.f("KEY_SELECTED_PERIOD_" + str5, value2);
                return Unit.f186387a;
        }
    }
}
