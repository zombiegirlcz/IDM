package bba;

import android.os.Parcelable;
import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.pix.api.ui.PixAliasResolveErrorDialogProvider$ActionableErrorDialogType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f14210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
        this.f14210w = valid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, this.f14210w, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Parcelable parcelableA = n1Var.a().a();
        PixAliasResolveErrorDialogProvider$ActionableErrorDialogType pixAliasResolveErrorDialogProvider$ActionableErrorDialogType = PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.SINGLE_BUTTON_TRY_AGAIN;
        s sVar = this.v;
        if (parcelableA == pixAliasResolveErrorDialogProvider$ActionableErrorDialogType) {
            if (n1Var instanceof l1) {
                sVar.I2(this.f14210w);
            }
        } else if (parcelableA == PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.DOUBLE_BUTTON_DISMISS_AND_BANK_DETAILS && (n1Var instanceof m1)) {
            sVar.C2(e.f14202a);
        }
        return Unit.f186387a;
    }
}
