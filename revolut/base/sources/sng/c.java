package sng;

import aw0.n6;
import com.revolut.feature.user_declarations.shared.flows.date_of_birth.screen.DateOfBirthScreen;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$OutputData;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DateOfBirthScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DateOfBirthScreen dateOfBirthScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = dateOfBirthScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DateOfBirthScreen dateOfBirthScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) dateOfBirthScreen.P.getValue();
                LocalDate localDate = ((d) ((j2) iVar.o.f22677a).getValue()).f264608a;
                if (localDate == null) {
                    throw new IllegalStateException("Submission of empty date");
                }
                iVar.C2(new DateOfBirthControllerDescriptor$OutputData(localDate));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dateOfBirthScreen.m2().onBackPressed();
                return Unit.f186387a;
        }
    }
}
