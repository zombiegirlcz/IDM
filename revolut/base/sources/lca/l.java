package lca;

import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.pix.api.ui.PixAliasResolveErrorDialogProvider$ActionableErrorDialogType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lx1.d f193815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i8a.a f193816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j8a.b f193817n;

    public l(lx1.d apmContactsInteractor, i8a.a aliasResolveErrorDialogProvider, j8a.b keyTypeMapper) {
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(aliasResolveErrorDialogProvider, "aliasResolveErrorDialogProvider");
        Intrinsics.checkNotNullParameter(keyTypeMapper, "keyTypeMapper");
        this.f193815l = apmContactsInteractor;
        this.f193816m = aliasResolveErrorDialogProvider;
        this.f193817n = keyTypeMapper;
    }

    public static final void b3(l lVar, n1 n1Var, PixTransferNavigation$InputData.ApmTransfer apmTransfer, Function1 function1) {
        boolean z = false;
        boolean z3 = n1Var.a().a() == PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.SINGLE_BUTTON_TRY_AGAIN && (n1Var instanceof l1);
        if (n1Var.a().a() == PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.DOUBLE_BUTTON_DISMISS_AND_BANK_DETAILS && (n1Var instanceof m1)) {
            z = true;
        }
        if (z3) {
            lVar.T2(new k(lVar, apmTransfer, function1, null), new yi5.b(27));
        } else if (z) {
            function1.invoke(c.f193805a);
        } else {
            function1.invoke(d.f193806a);
        }
    }

    @Override // lca.f
    public final void Z2(PixTransferNavigation$InputData.ApmTransfer inputData, Function1 onResult) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        PixContact pixContact = inputData.f80526a;
        if (pixContact.f62143g == null && pixContact.f62144h == null) {
            T2(new k(this, inputData, onResult, null), new yi5.b(27));
        } else {
            onResult.invoke(new b(pixContact));
        }
    }
}
