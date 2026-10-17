package or2;

import bs9.d0;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.buttons.ActionsRowView;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import efm.h0;
import efm.w;
import ip0.jl;
import java.util.List;
import java.util.Map;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od0.i;
import ood.k;
import ood.o0;
import or4.h;
import os9.t;
import ox5.t0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements o, p, kfm.g, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f228046b;

    public /* synthetic */ e(Function function, int i) {
        this.f228045a = i;
        this.f228046b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f228045a;
        Function function = this.f228046b;
        switch (i) {
            case 13:
                ((oqk.c) function).invoke(obj2);
                return;
            case 23:
                int i2 = ActionFooterView.z;
                ((ox0.a) function).invoke(obj2);
                return;
            case 24:
                int i3 = ActionsRowView.f;
                ((ou6.o) function).invoke(obj2);
                throw null;
            default:
                ((oqk.c) function).invoke(obj2);
                return;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f228045a) {
            case 0:
                o0 o0Var = (o0) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) o0Var.invoke(p0);
            case 1:
                c cVar = (c) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kr2.e) cVar.invoke(p0);
            case 2:
                d0 d0Var = (d0) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) d0Var.invoke(p0);
            case 3:
                d0 d0Var2 = (d0) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) d0Var2.invoke(p0);
            case 4:
                oqk.c cVar2 = (oqk.c) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar2.invoke(p0);
            case 5:
                h hVar = (h) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) hVar.invoke(p0);
            case 6:
                h hVar2 = (h) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) hVar2.invoke(p0);
            case 7:
                os2.f fVar = (os2.f) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) fVar.invoke(p0);
            case 8:
                os2.f fVar2 = (os2.f) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) fVar2.invoke(p0);
            case 9:
                os2.f fVar3 = (os2.f) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) fVar3.invoke(p0);
            case 10:
                os2.f fVar4 = (os2.f) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) fVar4.invoke(p0);
            case 11:
            case 12:
            case 13:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                njf.e eVar = (njf.e) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) eVar.invoke(p0);
            case 14:
                oqk.c cVar3 = (oqk.c) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) cVar3.invoke(p0);
            case 15:
                h hVar3 = (h) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (os9.a) hVar3.invoke(p0);
            case 16:
                h hVar4 = (h) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) hVar4.invoke(p0);
            case 17:
                oqk.c cVar4 = (oqk.c) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar4.invoke(p0);
            case 18:
                k kVar = (k) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (os9.k) kVar.invoke(p0);
            case 19:
                os9.f fVar5 = (os9.f) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) fVar5.invoke(p0);
            case 20:
                os9.f fVar6 = (os9.f) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) fVar6.invoke(p0);
            case 21:
                os9.f fVar7 = (os9.f) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) fVar7.invoke(p0);
            case 22:
                t tVar = (t) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) tVar.invoke(p0);
            case 27:
                oqk.c cVar5 = (oqk.c) this.f228046b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) cVar5.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f228045a;
        Function function = this.f228046b;
        switch (i) {
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((h) function).invoke(p0)).booleanValue();
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((h) function).invoke(p0)).booleanValue();
            default:
                KProperty[] kPropertyArr = InvoiceDetailsScreen.Z;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((t0) function).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        jl jlVar = (jl) this.f228046b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Data) jlVar.invoke(p0, p17);
    }
}
