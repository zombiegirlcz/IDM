package jf2;

import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.apm.core.models.alias.error.AliasBeneficiaryNameChangedException;
import com.revolut.feature.apm.upi.impl.provider.UpiAliasDialogProvider;
import com.revolut.feature.shared.beneficiary.api.navigation.BeneficiaryCreationKompotFinishMode;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import f5j.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ Throwable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f173645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ResolveAlias f173646x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Throwable th10, i iVar, ResolveAlias resolveAlias, Continuation continuation) {
        super(2, continuation);
        this.v = th10;
        this.f173645w = iVar;
        this.f173646x = resolveAlias;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, this.f173645w, this.f173646x, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Parcelable parcelableA = n1Var.a().a();
        UpiAliasDialogProvider.ActionableErrorDialogType actionableErrorDialogType = UpiAliasDialogProvider.ActionableErrorDialogType.DOUBLE_BUTTON_CONFIRM_ALIAS_CHANGE;
        ResolveAlias resolveAlias = this.f173646x;
        i iVar = this.f173645w;
        if (parcelableA == actionableErrorDialogType) {
            if (n1Var instanceof l1) {
                Throwable th10 = this.v;
                AliasBeneficiaryNameChangedException aliasBeneficiaryNameChangedException = th10 instanceof AliasBeneficiaryNameChangedException ? (AliasBeneficiaryNameChangedException) th10 : null;
                if (aliasBeneficiaryNameChangedException != null && (str = aliasBeneficiaryNameChangedException.f61907a) != null) {
                    iVar.Z2(ResolveAlias.a(resolveAlias, new ResolveAlias.ExpectedOverrides(str)));
                }
            }
        } else if (parcelableA == UpiAliasDialogProvider.ActionableErrorDialogType.SINGLE_BUTTON_TRY_AGAIN) {
            if (n1Var instanceof l1) {
                iVar.Z2(resolveAlias);
            }
        } else if (parcelableA == UpiAliasDialogProvider.ActionableErrorDialogType.DOUBLE_BUTTON_TRY_AGAIN_AND_BANK_DETAILS && (n1Var instanceof m1)) {
            iVar.getClass();
            BeneficiaryCreationKompotFinishMode.NavigateToTransfer.Default r06 = new BeneficiaryCreationKompotFinishMode.NavigateToTransfer.Default((TransferMoneyPocket) null, (ScannedBillDetails) null, (String) null, 15);
            wi0.b.Companion.getClass();
            wi0.b bVar = wi0.b.O0;
            xi0.b.Companion.getClass();
            iVar.A2(new BeneficiaryCreationDestination(r06, new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar, xi0.b.E, u2j.b.OTHER, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(l.INTERNATIONAL_BENEFICIARY)))));
        }
        return Unit.f186387a;
    }
}
