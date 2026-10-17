package kvl;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import java.util.Optional;
import klf.a3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ku1.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f190174w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(a0 a0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f190174w = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f190174w, continuation, 0);
            case 1:
                return new u(this.f190174w, continuation, 1);
            case 2:
                return new u(this.f190174w, continuation, 2);
            default:
                return new u(this.f190174w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objX;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f190174w.i3(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                a0 a0Var = this.f190174w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    a0Var.o.Q();
                    jhi.b bVarG = mo3.a.g(vkm.q.Q(a0Var.f190161s, new a3(continuation, a0Var, 11)), null, new f0(14), 1);
                    this.v = 1;
                    objX = vkm.q.x(bVarG, this);
                    if (objX == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                if (((Optional) objX).isPresent()) {
                    j60.a aVar3 = a0Var.f190158p;
                    lvl.a aVar4 = (lvl.a) a0Var.f190156m;
                    int i3 = R$drawable.uikit_icn_24_pencil;
                    aVar4.getClass();
                    List listK = zhm.v.k(new RowDelegate.Model("AUTO_TOP_UP_ACTIONS_DIALOG_BUTTON_EDIT", lvl.a.a(i3), new TextLocalisedClause(R.string.common_action_edit, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("LIST_ID_AUTO_TOP_UP_EDIT_DIALOG_BUTTON_DELETE", lvl.a.a(R$drawable.uikit_icn_24_delete), new TextLocalisedClause(R.string.common_action_delete, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                    yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, 28);
                    aVar3.x(new rp0.y(listK, null, rp0.l.WINDOW, null, null, null, 1018));
                } else {
                    u uVar = new u(a0Var, continuation, 0);
                    this.v = 2;
                    if (a0Var.Y2(this, uVar) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f190174w.i3(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    a0 a0Var2 = this.f190174w;
                    u uVar2 = new u(a0Var2, null, 2);
                    this.v = 1;
                    if (a0Var2.Y2(this, uVar2) == aVar6) {
                        return aVar6;
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
