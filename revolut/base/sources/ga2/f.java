package ga2;

import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.apm.payid.api.navigation.PayIdCreateContactDestination;
import com.revolut.feature.apm.payid.impl.extension.dialog.NewBeneficiaryNameParcel;
import gim.i;
import jli.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ResolveAlias f142052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f142053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ba2.f f142054y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ResolveAlias resolveAlias, Function1 function1, ba2.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f142052w = resolveAlias;
        this.f142053x = function1;
        this.f142054y = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, this.f142052w, this.f142053x, this.f142054y, continuation);
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
        o.b(obj2);
        Parcelable parcelableA = n1Var.a().a();
        if (parcelableA instanceof NewBeneficiaryNameParcel) {
            boolean z = n1Var instanceof l1;
            g gVar = this.v;
            if (z) {
                ba2.e.b3(gVar, null, ResolveAlias.a(this.f142052w, new ResolveAlias.ExpectedOverrides(((NewBeneficiaryNameParcel) parcelableA).f62696a)), this.f142053x, 1);
            } else if (!(n1Var instanceof m1)) {
                int i = h.f175850a;
            } else if (this.f142054y == ba2.f.CLIPBOARD) {
                gVar.A2(PayIdCreateContactDestination.f62692a);
            }
        }
        return Unit.f186387a;
    }
}
