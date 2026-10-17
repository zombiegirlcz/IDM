package yca;

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
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f312590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(2, continuation);
        this.v = tVar;
        this.f312590w = valid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, this.f312590w, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Parcelable parcelableA = n1Var.a().a();
        PixAliasResolveErrorDialogProvider$ActionableErrorDialogType pixAliasResolveErrorDialogProvider$ActionableErrorDialogType = PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.SINGLE_BUTTON_TRY_AGAIN;
        t tVar = this.v;
        if (parcelableA == pixAliasResolveErrorDialogProvider$ActionableErrorDialogType) {
            if (n1Var instanceof l1) {
                tVar.I2(this.f312590w);
            }
        } else if (parcelableA == PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.DOUBLE_BUTTON_DISMISS_AND_BANK_DETAILS && (n1Var instanceof m1)) {
            tVar.J2();
        }
        return Unit.f186387a;
    }
}
