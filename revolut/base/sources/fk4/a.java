package fk4;

import com.revolut.feature.credit.autopay.ui.screen.account_selection.screen.AccountSelectionScreen;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.screen.AccountSelectionScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135706a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountSelectionScreen f135707b;

    public /* synthetic */ a(AccountSelectionScreen accountSelectionScreen) {
        this.f135707b = accountSelectionScreen;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f135706a;
        AccountSelectionScreen accountSelectionScreen = this.f135707b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = AccountSelectionScreen.f68581e0;
                qji.b bVarQ2 = accountSelectionScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.ui.screen.account_selection.screen.di.AutopayExternalAccountScreenInjector");
                yj4.b bVar = ((yj4.a) bVarQ2).f314408b;
                yj4.c cVar = new yj4.c();
                cVar.f314414a = e4m.b.b(e4m.c.a(accountSelectionScreen));
                int i2 = 28;
                cVar.f314415b = e4m.b.b(new xsl.q(bVar, cVar, 2, i2));
                cVar.f314416c = e4m.b.b(new xsl.q(bVar, cVar, 1, i2));
                cVar.d = e4m.b.b(new xsl.q(bVar, cVar, 0, i2));
                cVar.e = e4m.b.b(new xsl.q(bVar, cVar, 4, i2));
                cVar.f = e4m.b.b(new xsl.q(bVar, cVar, 3, i2));
                return cVar;
            default:
                KProperty[] kPropertyArr2 = AccountSelectionScreen.f68581e0;
                return (i) ((yj4.c) accountSelectionScreen.Y.getValue()).f.get();
        }
    }

    public /* synthetic */ a(AccountSelectionScreen accountSelectionScreen, AccountSelectionScreenContract$InputData accountSelectionScreenContract$InputData) {
        this.f135707b = accountSelectionScreen;
    }
}
