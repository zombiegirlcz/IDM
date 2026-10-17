package xy9;

import android.os.Parcelable;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import com.revolut.feature.pix.api.ui.PixAliasResolveErrorDialogProvider$ActionableErrorDialogType;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f309669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SendFromClipboardType.PixType f309670x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, SendFromClipboardType.PixType pixType, Continuation continuation) {
        super(2, continuation);
        this.f309669w = oVar;
        this.f309670x = pixType;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.f309669w, this.f309670x, continuation);
        nVar.v = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.v = null;
            this.u = 1;
            o oVar = this.f309669w;
            oVar.getClass();
            Parcelable parcelableA = n1Var.a().a();
            if (parcelableA == PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.SINGLE_BUTTON_TRY_AGAIN) {
                if (n1Var instanceof l1) {
                    oVar.Z2(this.f309670x);
                }
            } else if (parcelableA == PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.DOUBLE_BUTTON_DISMISS_AND_BANK_DETAILS && (n1Var instanceof m1)) {
                wi0.b.Companion.getClass();
                wi0.b bVar = wi0.b.A;
                xi0.b.Companion.getClass();
                oVar.A2(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar, xi0.b.D, u2j.b.OTHER, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.INTERNATIONAL_BENEFICIARY)))));
            }
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
