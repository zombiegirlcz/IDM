package b58;

import aii.u;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends gim.i implements Function2 {
    public com.revolut.feature.joint.impl.ui.invite_flow.d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f12472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.invite_flow.d f12473x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, com.revolut.feature.joint.impl.ui.invite_flow.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f12472w = str;
        this.f12473x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.f12472w, this.f12473x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.joint.impl.ui.invite_flow.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ProductAccountDescriptor$Value.Main main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(this.f12472w, null), ProductId.JOINT);
            com.revolut.feature.joint.impl.ui.invite_flow.d dVar2 = this.f12473x;
            zfe.e eVar = dVar2.f76581w;
            MainScreenTab mainScreenTab = ibb.c.f160140a;
            this.u = dVar2;
            this.v = 1;
            obj2 = ((cge.e) eVar).b(main, mainScreenTab, null, this);
            if (obj2 == aVar) {
                return aVar;
            }
            dVar = dVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.u;
            yhm.o.b(obj2);
        }
        dVar.C1((u) obj2);
        return Unit.f186387a;
    }
}
