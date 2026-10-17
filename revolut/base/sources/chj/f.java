package chj;

import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.impl.ui.utils.EsimInstallationDialogBuilder;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVar = this.v;
        z1 z1Var = gVar.f24250p;
        boolean z = n1Var instanceof l1;
        a aVar2 = a.f24241a;
        if (z) {
            Parcelable parcelableA = ((l1) n1Var).f216190a.a();
            EsimInstallationDialogBuilder.TryAgainPayload tryAgainPayload = parcelableA instanceof EsimInstallationDialogBuilder.TryAgainPayload ? (EsimInstallationDialogBuilder.TryAgainPayload) parcelableA : null;
            if (tryAgainPayload != null) {
                String str = tryAgainPayload.f101488b;
                String str2 = tryAgainPayload.f101487a;
                if (str == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing eSIM activation code after handling installation error");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimInstallationControllerModelExtensionImpl", null, illegalStateException, h0Var);
                }
                if (str == null) {
                    str = "";
                }
                gVar.b3(str2, new EsimProfileDetails.InstallationType.ActivationCode(str));
            } else {
                z1Var.k(aVar2);
            }
        } else if (n1Var instanceof m1) {
            z1Var.k(b.f24243a);
        } else if (n1Var instanceof k1) {
            z1Var.k(aVar2);
        } else if (!(n1Var instanceof j1)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
