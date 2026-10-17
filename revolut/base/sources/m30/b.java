package m30;

import afa.s;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import efm.h0;
import efm.w;
import java.util.List;
import k50.n0;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m62.l;
import w30.n;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements o, p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f202261b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f202260a = i;
        this.f202261b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((m78.b) this.f202261b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f202260a) {
            case 0:
                a aVar = (a) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar.invoke(p0);
            case 1:
                d dVar = (d) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) dVar.invoke(p0);
            case 2:
                d dVar2 = (d) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) dVar2.invoke(p0);
            case 3:
                d dVar3 = (d) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) dVar3.invoke(p0);
            case 4:
                a aVar2 = (a) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar2.invoke(p0);
            case 5:
                d dVar4 = (d) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) dVar4.invoke(p0);
            case 6:
                a aVar3 = (a) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar3.invoke(p0);
            case 7:
                lul.d dVar5 = (lul.d) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.Model) dVar5.invoke(p0);
            case 8:
                m11.h hVar = (m11.h) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) hVar.invoke(p0);
            case 9:
                li8.n nVar = (li8.n) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) nVar.invoke(p0);
            case 10:
                lul.d dVar6 = (lul.d) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar6.invoke(p0);
            case 11:
                c cVar = (c) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar.invoke(p0);
            case 12:
                c cVar2 = (c) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar2.invoke(p0);
            case 13:
                c cVar3 = (c) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar3.invoke(p0);
            case 14:
                c cVar4 = (c) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar4.invoke(p0);
            case 15:
                m11.h hVar2 = (m11.h) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) hVar2.invoke(p0);
            case 16:
                li8.n nVar2 = (li8.n) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) nVar2.invoke(p0);
            case 17:
                lul.d dVar7 = (lul.d) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar7.invoke(p0);
            case 18:
                lul.d dVar8 = (lul.d) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar8.invoke(p0);
            case 19:
            default:
                l lVar = (l) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i67.a) lVar.invoke(p0);
            case 20:
                m11.h hVar3 = (m11.h) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n0.a) hVar3.invoke(p0);
            case 21:
                m11.h hVar4 = (m11.h) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar4.invoke(p0);
            case 22:
                m58.i iVar = (m58.i) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar.invoke(p0);
            case 23:
                return (h0) ((m58.i) this.f202261b).invoke(p0);
            case 24:
                return (od0.i) ((c) this.f202261b).invoke(p0);
            case 25:
                return (Pair) ((s) this.f202261b).invoke(p0);
            case 26:
                c cVar5 = (c) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar5.invoke(p0);
            case 27:
                c cVar6 = (c) this.f202261b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dj0.d) cVar6.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        c cVar = (c) this.f202261b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) cVar.invoke(p0)).booleanValue();
    }
}
