package mf4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ma2.s f204839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f204840x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ma2.s sVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f204839w = sVar;
        this.f204840x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f204839w, this.f204840x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            nii.c0 c0Var = new nii.c0(new TextLocalisedClause(R$string.credit_application_offer_document_loading_progress_title, null, null, 14), null, null, false, null, false, false, null, 2046);
            al6.c cVar = new al6.c(26);
            ku1.v vVar = new ku1.v(5);
            lai.d dVar = new lai.d(this.v, this.f204840x, null, 27);
            this.u = 1;
            bVar = this;
            obj2 = n14.k.U(this.v, c0Var, cVar, vVar, dVar, bVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            bVar = this;
        }
        nii.h hVar = (nii.h) obj2;
        if (hVar instanceof nii.g) {
            bVar.f204839w.invoke(((nii.g) hVar).f216152a);
        }
        return Unit.f186387a;
    }
}
