package bke;

import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.defi.accounts.impl.ui.extension.DeFiAccountsExtensionState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PersistedBackground f16366b;

    public /* synthetic */ m(PersistedBackground persistedBackground, int i) {
        this.f16365a = i;
        this.f16366b = persistedBackground;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f16365a) {
            case 0:
                return ake.a.a((ake.a) obj2, null, null, this.f16366b.f63743a, null, null, null, null, null, null, null, 1019);
            default:
                return DeFiAccountsExtensionState.a((DeFiAccountsExtensionState) obj2, null, null, null, null, this.f16366b.f63743a, null, 47);
        }
    }
}
