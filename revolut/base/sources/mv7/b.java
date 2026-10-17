package mv7;

import aw0.n6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreen;
import gu7.a4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EmbeddedBottomSheetScreen f209157w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(EmbeddedBottomSheetScreen embeddedBottomSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f209157w = embeddedBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f209157w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f209157w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            default:
                b bVar3 = new b(this.f209157w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EmbeddedBottomSheetScreen embeddedBottomSheetScreen = this.f209157w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) embeddedBottomSheetScreen.m3()).I2(n6Var.k);
                break;
            case 1:
                n6 n6Var2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) embeddedBottomSheetScreen.m3()).I2(n6Var2.k);
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Clause clause = aVar3.f275447c;
                Object obj3 = aVar3.d;
                String str = aVar3.f275445a;
                if (clause instanceof HtmlClause) {
                    g gVarM3 = embeddedBottomSheetScreen.m3();
                    String str2 = aVar3.f275446b;
                    ((j) gVarM3).J2(new a4(obj3, str2, str), str2);
                } else {
                    ((j) embeddedBottomSheetScreen.m3()).J2(obj3, str);
                }
                break;
        }
        return Unit.f186387a;
    }
}
