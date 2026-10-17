package j0i;

import com.revolut.feature.crypto.onboarding.api.disclaimer.CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink;
import com.revolut.feature_crypto_picker.impl.ui.picker.CryptoPickerContract$ModalStep;
import com.revolut.feature_crypto_picker.impl.ui.picker.CryptoPickerController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoPickerController f170050w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CryptoPickerController cryptoPickerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f170050w = cryptoPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f170050w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f170050w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoPickerController cryptoPickerController = this.f170050w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE3 = cryptoPickerController.d();
                Intrinsics.h(clickData);
                com.revolut.feature_crypto_picker.impl.ui.picker.a aVar2 = (com.revolut.feature_crypto_picker.impl.ui.picker.a) bVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink cryptoFcaDisclaimerWidget$Parcel$DisclaimerLink = obj3 instanceof CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink ? (CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink) obj3 : null;
                if (cryptoFcaDisclaimerWidget$Parcel$DisclaimerLink != null) {
                    oki.h.v2(aVar2.v, new CryptoPickerContract$ModalStep.FcaLearnMoreStep(cryptoFcaDisclaimerWidget$Parcel$DisclaimerLink.f70886a), ModalDestination.Style.POPUP.f98311a);
                }
                break;
            default:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE32 = cryptoPickerController.d();
                Intrinsics.h(query);
                com.revolut.feature_crypto_picker.impl.ui.picker.a aVar4 = (com.revolut.feature_crypto_picker.impl.ui.picker.a) bVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                aVar4.H2(aVar4.u, new ik3.a(query, 15));
                break;
        }
        return Unit.f186387a;
    }
}
