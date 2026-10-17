package nsh;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.t;
import ish.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import tw0.m0;
import tw0.n0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f218875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f218876x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f218876x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f218876x, continuation, 0);
                hVar.f218875w = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f218876x, continuation, 1);
                hVar2.f218875w = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f218876x, continuation, 2);
                hVar3.f218875w = obj2;
                return hVar3;
            default:
                h hVar4 = new h(this.f218876x, continuation, 3);
                hVar4.f218875w = obj2;
                return hVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((m0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((n0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Unit unit;
        int i = this.u;
        o oVar = this.f218876x;
        Continuation continuation = null;
        switch (i) {
            case 0:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.f218875w;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        Intrinsics.h(popupMenuItem);
                        this.f218875w = null;
                        this.v = 1;
                        Object objJ = e0.J(p0.f264003c, new njj.n0(popupMenuItem, oVar, continuation, 15), this);
                        if (objJ != obj3) {
                            objJ = Unit.f186387a;
                        }
                        if (objJ == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                }
                return Unit.f186387a;
            case 1:
                m0 m0Var = (m0) this.f218875w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    kotlinx.coroutines.d dVar = p0.f264003c;
                    njj.n0 n0Var = new njj.n0(oVar, m0Var, continuation, 16);
                    this.f218875w = null;
                    this.v = 1;
                    if (e0.J(dVar, n0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                n0 n0Var2 = (n0) this.f218875w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    Object obj4 = n0Var2.f274857b;
                    WidgetContext widgetContextG3 = oVar.g3(obj4 instanceof WidgetContext ? (WidgetContext) obj4 : null);
                    if (widgetContextG3 == null) {
                        return Unit.f186387a;
                    }
                    if (n0Var2.f274856a) {
                        this.f218875w = null;
                        this.v = 1;
                        if (o.f3(oVar, widgetContextG3, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        ash.i iVar = oVar.f218889n;
                        this.f218875w = null;
                        this.v = 2;
                        Object objJ2 = ((gsh.n) ((z) iVar).c(widgetContextG3)).j(t.UNSEEN, t.SEEN, this);
                        if (objJ2 != aVar2) {
                            objJ2 = Unit.f186387a;
                        }
                        if (objJ2 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                a aVar3 = (a) this.f218875w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    oVar.f218895w.setValue(null);
                    this.f218875w = null;
                    this.v = 1;
                    ash.i iVar2 = oVar.f218889n;
                    WidgetContext widgetContext = aVar3.f218863a;
                    String str = aVar3.f218864b;
                    if (((z) iVar2).k(widgetContext)) {
                        IllegalStateException illegalStateException = new IllegalStateException("Widget limit reached, discarding event");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                        unit = Unit.f186387a;
                    } else if (oVar.f218890p.g(aVar3.f218863a, str)) {
                        oVar.f218887l.getP().i(new e(oVar, aVar3, 0));
                        unit = Unit.f186387a;
                    } else {
                        IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("Widget '", str, "' not supported, discarding event"));
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var3);
                        unit = Unit.f186387a;
                    }
                    if (unit == aVar4) {
                        return aVar4;
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
