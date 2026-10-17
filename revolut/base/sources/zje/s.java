package zje;

import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoRootFlowV2Contract$Step;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.picker.CryptoAccountPickerScreen;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.picker.CryptoAccountPickerScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.crypto.impl.ui.v2.a f322818b;

    public /* synthetic */ s(com.revolut.feature.tab.crypto.impl.ui.v2.a aVar, int i) {
        this.f322817a = i;
        this.f322818b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f322817a) {
            case 0:
                yki.l FlowCoordinator = (yki.l) obj2;
                TabCryptoRootFlowV2Contract$Step step = (TabCryptoRootFlowV2Contract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean zF = Intrinsics.f(step, TabCryptoRootFlowV2Contract$Step.Home.f89815a);
                com.revolut.feature.tab.crypto.impl.ui.v2.a aVar = this.f322818b;
                if (!zF) {
                    if (!(step instanceof TabCryptoRootFlowV2Contract$Step.AccountPicker)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TabCryptoRootFlowV2Contract$Step.AccountPicker accountPicker = (TabCryptoRootFlowV2Contract$Step.AccountPicker) step;
                    CryptoAccountPickerScreen cryptoAccountPickerScreen = new CryptoAccountPickerScreen(new CryptoAccountPickerScreenContract$InputData(accountPicker.f89813a, accountPicker.f89814b));
                    aVar.a(cryptoAccountPickerScreen, new s(aVar, 1));
                    return cryptoAccountPickerScreen;
                }
                TabCryptoFlowV2 tabCryptoFlowV2 = new TabCryptoFlowV2(aVar.o);
                zg8.d block = new zg8.d(1, aVar, com.revolut.feature.tab.crypto.impl.ui.v2.a.class, "openAccountPicker", "openAccountPicker(Lcom/revolut/feature/tab/crypto/impl/ui/v2/TabCryptoFlowV2Contract$OutputData;)V", 0, 2);
                Intrinsics.checkNotNullParameter(block, "block");
                tabCryptoFlowV2.H = block;
                return tabCryptoFlowV2;
            default:
                oki.g onResult = (oki.g) obj2;
                cke.f output = (cke.f) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(output, "output");
                a aVar2 = this.f322818b.o;
                String accountId = output.f24823a;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                aVar2.f322790a.mo3647trySendJP2dKIU(accountId);
                onResult.pop();
                return Unit.f186387a;
        }
    }
}
