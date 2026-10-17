package g5b;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.R$string;
import java.util.Collection;
import k4l.m0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.y0;
import nii.z;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f140726w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140726w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f140726w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f140726w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j jVar = this.f140726w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m0 m0Var = (m0) pair.f186385a;
                m0 m0Var2 = (m0) pair.f186386b;
                if (m0Var == m0.PENDING) {
                    if (m0Var2 == m0.SUCCESS) {
                        jVar.c3();
                    } else if (m0Var2 == m0.FAILURE) {
                        jVar.L2(new y0(null, new z(new TextLocalisedClause(R$string.common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                    }
                }
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j2 j2Var = jVar.f140732p;
                Collection collection = (Collection) data.getContent();
                Boolean boolValueOf = Boolean.valueOf(!(collection == null || collection.isEmpty()));
                j2Var.getClass();
                j2Var.g(null, boolValueOf);
                break;
        }
        return Unit.f186387a;
    }
}
