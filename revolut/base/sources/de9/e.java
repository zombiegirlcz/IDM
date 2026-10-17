package de9;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import aw0.v1;
import aw0.x8;
import aw0.y9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.feature.passcode.PasscodeScreen;
import ix0.n1;
import ix0.o1;
import ix0.r1;
import javax.crypto.Cipher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PasscodeScreen f113321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PasscodeScreen passcodeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f113321w = passcodeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f113321w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f113321w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f113321w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e(this.f113321w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            default:
                e eVar5 = new e(this.f113321w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((x8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((wl0.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ee9.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h30.q qVar;
        Window window;
        View decorView;
        int i = this.u;
        PasscodeScreen passcodeScreen = this.f113321w;
        switch (i) {
            case 0:
                String value = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT2 = passcodeScreen.T2();
                Intrinsics.h(value);
                x xVar = (x) nVarT2;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                xVar.x2(new d7a.p(value, 11));
                break;
            case 1:
                x8 x8Var = (x8) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i2 = x8Var.f10611c;
                int i3 = x8Var.e;
                KProperty[] kPropertyArr = PasscodeScreen.c0;
                v1 v1Var = yx0.h.f317529a;
                passcodeScreen.a3().f143271a.setBackgroundColor(i3);
                passcodeScreen.a3().d.r(v1Var, v1Var.a(), i2, i3);
                n1 n1Var = passcodeScreen.Y;
                if (n1Var == null) {
                    Context context = passcodeScreen.D2().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    int i5 = R$id.internal_status_bar_controller_tag;
                    y9 y9Var = y9.THEME;
                    a5.a styleApplicator = new a5.a(19);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
                    Activity activityI = z92.f.i(context);
                    View viewFindViewById = (activityI == null || (window = activityI.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
                    if (activityI == null || viewFindViewById == null) {
                        qVar = null;
                    } else {
                        Object tag2 = viewFindViewById.getTag(i5);
                        r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
                        if (r1Var == null) {
                            r1Var = new r1();
                            viewFindViewById.setTag(i5, r1Var);
                        }
                        qVar = new h30.q(y9Var, styleApplicator, r1Var, context);
                    }
                    o1 priority = o1.OVERLAY;
                    Intrinsics.checkNotNullParameter(priority, "priority");
                    n1 n1Var2 = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority)) : null);
                    passcodeScreen.Y = n1Var2;
                    n1Var = n1Var2;
                }
                n1Var.a(v1Var.c());
                break;
            case 2:
                String value2 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarT22 = passcodeScreen.T2();
                Intrinsics.h(value2);
                x xVar2 = (x) nVarT22;
                xVar2.getClass();
                Intrinsics.checkNotNullParameter(value2, "value");
                xVar2.v2(new j(value2));
                break;
            case 3:
                wl0.n value3 = (wl0.n) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar3 = (x) passcodeScreen.T2();
                xVar3.getClass();
                Intrinsics.checkNotNullParameter(value3, "value");
                xVar3.f113342r.f3(value3);
                if (value3 instanceof wl0.m) {
                    wl0.m mVar = (wl0.m) value3;
                    xVar3.v2(new k((Cipher) mVar.f298358a, mVar.f298359b));
                }
                break;
            default:
                ee9.g gVar = (ee9.g) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr2 = PasscodeScreen.c0;
                ((fe9.e) ((fe9.a) passcodeScreen.N.getValue())).R(gVar);
                break;
        }
        return Unit.f186387a;
    }
}
