package n5k;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k5k.h0;
import k5k.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f212627w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f212628x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f212628x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f212628x, continuation, 0);
                eVar.f212627w = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f212628x, continuation, 1);
                eVar2.f212627w = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f212628x, continuation, 2);
                eVar3.f212627w = obj2;
                return eVar3;
            default:
                e eVar4 = new e(this.f212628x, continuation, 3);
                eVar4.f212627w = obj2;
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB3;
        int i = this.u;
        p pVar = this.f212628x;
        switch (i) {
            case 0:
                Object obj3 = this.f212627w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Intrinsics.h(obj3);
                    this.f212627w = null;
                    this.v = 1;
                    if (pVar.b3(obj3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                ty0.a aVar2 = (ty0.a) this.f212627w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    Intrinsics.h(aVar2);
                    this.f212627w = null;
                    this.v = 1;
                    Object obj4 = aVar2.d;
                    if (obj4 == null) {
                        objB3 = Unit.f186387a;
                    } else if (obj4.equals("INTEREST_COMMON_DIALOG_PROMOTION_TERMS_ID")) {
                        pVar.A2(u0.c(new WebViewFeatureConfig(aVar2.f275445a, new TextClause(aVar2.f275446b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, false, true, false, 65436)));
                        objB3 = Unit.f186387a;
                    } else {
                        objB3 = pVar.b3(obj4, this);
                        if (objB3 != aVar3) {
                            objB3 = Unit.f186387a;
                        }
                    }
                    if (objB3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                Object obj5 = this.f212627w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    Intrinsics.h(obj5);
                    this.f212627w = null;
                    this.v = 1;
                    if (obj5 instanceof h0) {
                        if (((h0) obj5) instanceof x) {
                            j60.a.v(pVar.f212652r, false, null, 3);
                            ((r) pVar.f212657y).Z2();
                        } else {
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.b(rd0.c.WARNING, "TAG", "No handler", null, null, 16);
                        }
                    }
                    if (Unit.f186387a == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                y yVar = (y) this.f212627w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    j60.a aVar6 = pVar.f212652r;
                    Intrinsics.h(yVar);
                    efm.b bVarG = aVar6.G(yVar);
                    this.f212627w = null;
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
