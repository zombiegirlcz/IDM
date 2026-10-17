package yj8;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nj8.n;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ SingleChoiceDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f314437w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SingleChoiceDelegate.Model model, Continuation continuation, h hVar) {
        super(1, continuation);
        this.v = model;
        this.f314437w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, continuation, this.f314437w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        h hVar = this.f314437w;
        if (i == 0) {
            o.b(obj2);
            Object obj3 = this.v.f;
            if (obj3 instanceof bj0.b) {
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) ((c) ((j2) hVar.f314440q.f22677a).getValue()).f314435a.getContent();
                if (obj3 != (juniorBankingProfile != null ? juniorBankingProfile.d : null)) {
                    hj8.a aVar2 = hVar.f314439p;
                    String str = hVar.o.f314436a;
                    ij8.d dVar = new ij8.d((bj0.b) obj3, null, null, null, null, null, 126);
                    this.u = 1;
                    if (((n) aVar2).o(str, dVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        hVar.B2();
        return Unit.f186387a;
    }
}
