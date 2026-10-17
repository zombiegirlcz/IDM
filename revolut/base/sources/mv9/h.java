package mv9;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.AmountInputView;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import com.revolut.data.model.Data;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.m1;
import mx0.p2;
import mx0.t1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements o, kfm.g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f209185b;

    public /* synthetic */ h(int i, Function1 function1) {
        this.f209184a = i;
        this.f209185b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f209184a;
        Function1 function1 = this.f209185b;
        switch (i) {
            case 12:
                int i2 = mx0.a.f209559j;
                ((mqi.a) function1).invoke(obj2);
                break;
            case 13:
            case 16:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                int i3 = ButtonsActionsView.f58369h;
                ((p2) function1).invoke(obj2);
                break;
            case 14:
                ActionsView.Companion companion = ActionsView.INSTANCE;
                ((mx0.b) function1).invoke(obj2);
                break;
            case 15:
                ActionsView.Companion companion2 = ActionsView.INSTANCE;
                ((mx0.b) function1).invoke(obj2);
                break;
            case 17:
                AmountInputView.Companion aVar = AmountInputView.INSTANCE;
                ((mqi.a) function1).invoke(obj2);
                break;
            case 18:
                BackgroundWallpaperView.Companion aVar2 = BackgroundWallpaperView.INSTANCE;
                ((mqi.a) function1).invoke(obj2);
                break;
            case 19:
                ((m1) function1).invoke(obj2);
                break;
            case 20:
                ((m1) function1).invoke(obj2);
                break;
            case 21:
                ((mm7.h) function1).invoke(obj2);
                break;
            case 26:
                int i5 = ButtonsActionsView.f58369h;
                ((p2) function1).invoke(obj2);
                break;
            case 27:
                int i6 = ButtonsActionsView.f58369h;
                ((p2) function1).invoke(obj2);
                break;
            case 28:
                int i21 = ButtonsActionsView.f58369h;
                ((p2) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f209184a) {
            case 0:
                g gVar = (g) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) gVar.invoke(p0);
            case 1:
                c cVar = (c) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar.invoke(p0);
            case 2:
                g gVar2 = (g) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) gVar2.invoke(p0);
            case 3:
                e eVar = (e) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) eVar.invoke(p0);
            case 4:
                moe.c cVar2 = (moe.c) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar2.invoke(p0);
            case 5:
                mul.k kVar = (mul.k) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar.invoke(p0);
            case 6:
                mul.k kVar2 = (mul.k) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar2.invoke(p0);
            case 7:
                e eVar2 = (e) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) eVar2.invoke(p0);
            case 8:
                e eVar3 = (e) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar3.invoke(p0);
            case 9:
                c cVar3 = (c) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar3.invoke(p0);
            case 10:
                l3d.f fVar = (l3d.f) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar.invoke(p0);
            case 11:
                mul.k kVar3 = (mul.k) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) kVar3.invoke(p0);
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                m1 m1Var = (m1) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) m1Var.invoke(p0);
            case 16:
                moe.c cVar4 = (moe.c) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ActionsView.Item) cVar4.invoke(p0);
            case 22:
                mul.k kVar4 = (mul.k) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                kVar4.invoke(p0);
                return t1.a.f210006a;
            case 23:
                mul.k kVar5 = (mul.k) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Integer) kVar5.invoke(p0);
            case 24:
                mul.k kVar6 = (mul.k) this.f209185b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (t1) kVar6.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        mx0.b bVar = (mx0.b) this.f209185b;
        ActionsView.Companion companion = ActionsView.INSTANCE;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) bVar.invoke(p0)).booleanValue();
    }
}
