package ny7;

import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditResult;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$UpdateQuoteAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f220720b;

    public /* synthetic */ z(a0 a0Var, int i) {
        this.f220719a = i;
        this.f220720b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f220719a) {
            case 0:
                PetEditDetailsContract$PetEditResult it8 = (PetEditDetailsContract$PetEditResult) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f220720b.f.c0(new PetEditDetailsContract$UpdateQuoteAction(it8));
            case 1:
                a0 a0Var = this.f220720b;
                pfm.a aVar = new pfm.a(((ly7.h) a0Var.e).k3(), new j(new z(a0Var, 0), 3), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 2:
                ((rpi.b) this.f220720b.f220684c).N(false);
                return Unit.f186387a;
            case 3:
                return ((ly7.j) this.f220720b.d).a();
            case 4:
                ((rpi.b) this.f220720b.f220684c).N(false);
                return Unit.f186387a;
            case 5:
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                pfm.a aVarE = ue0.e.v(mVar).e(((ly7.j) this.f220720b.d).f200737a.a(u0.f(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), true))));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            default:
                ((rpi.b) this.f220720b.f220684c).N(false);
                return Unit.f186387a;
        }
    }
}
