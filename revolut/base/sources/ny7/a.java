package ny7;

import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditAction;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f220681b;

    public /* synthetic */ a(b bVar, int i) {
        this.f220680a = i;
        this.f220681b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f220680a) {
            case 0:
                PetEditDetailsContract$PetEditResult it8 = (PetEditDetailsContract$PetEditResult) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f220681b.f.c0(new PetEditDetailsContract$PetEditAction(it8));
            case 1:
                ((rpi.b) this.f220681b.f220687c).N(false);
                return Unit.f186387a;
            case 2:
                b bVar = this.f220681b;
                ly7.a aVar = bVar.e;
                ((ly7.h) aVar).i.getClass();
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                pfm.a aVar2 = new pfm.a(ue0.e.v(mVar).f(((ly7.h) aVar).k3()), new nx7.i(new a(bVar, 0), 15), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            case 3:
                ((rpi.b) this.f220681b.f220687c).N(false);
                return Unit.f186387a;
            default:
                return ((ly7.j) this.f220681b.d).a();
        }
    }
}
