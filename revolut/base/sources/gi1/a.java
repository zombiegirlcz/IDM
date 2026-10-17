package gi1;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreen;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddAddressScreen f144023b;

    public /* synthetic */ a(AddAddressScreen addAddressScreen, int i) {
        this.f144022a = i;
        this.f144023b = addAddressScreen;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f144022a;
        AddAddressScreen addAddressScreen = this.f144023b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = AddAddressScreen.V;
                qji.b bVarU2 = addAddressScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.screen.add.di.AddAddressScreenInjector");
                yh1.d dVar = (yh1.d) ((ii1.a) bVarU2);
                yh1.e eVar = dVar.f313704c;
                yh1.d dVar2 = dVar.d;
                AddAddressScreenContract$InputData addAddressScreenContract$InputData = addAddressScreen.K;
                addAddressScreenContract$InputData.getClass();
                return new yh1.a(eVar, dVar2, addAddressScreenContract$InputData);
            case 1:
                KProperty[] kPropertyArr2 = AddAddressScreen.V;
                return (m) ((yh1.a) addAddressScreen.P.getValue()).f313695j.get();
            case 2:
                KProperty[] kPropertyArr3 = AddAddressScreen.V;
                AddAddressScreen addAddressScreen2 = this.f144023b;
                return dli.f.a(addAddressScreen2, addAddressScreen2.d(), zhm.v.k(addAddressScreen2.R, addAddressScreen2.S, new TextDelegate(), addAddressScreen2.T), 0, null, null, new a(addAddressScreen2, 3), 28);
            default:
                return rd0.e.b(addAddressScreen.R.e.f121375b);
        }
    }
}
