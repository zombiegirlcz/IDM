package cd0;

import cd7.h;
import cd7.i;
import ce9.j;
import ce9.n;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import efm.f;
import efm.w;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements o, g, kfm.c, kfm.d, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23143b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f23142a = i;
        this.f23143b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f23142a) {
            case 2:
                ((a) this.f23143b).invoke(obj2);
                break;
            case 13:
                ((j) this.f23143b).d.onNext((n) obj2);
                break;
            case 20:
                ((ce9.b) this.f23143b).invoke(obj2);
                break;
            default:
                ((c1g.o) this.f23143b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f23142a) {
            case 0:
                ccg.c cVar = (ccg.c) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) cVar.invoke(p0);
            case 1:
                c1g.o oVar = (c1g.o) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) oVar.invoke(p0);
            case 2:
            case 13:
            case 14:
            case 18:
            case 20:
            case 22:
            case 25:
            default:
                ccg.c cVar2 = (ccg.c) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar2.invoke(p0);
            case 3:
                ccg.c cVar3 = (ccg.c) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) cVar3.invoke(p0);
            case 4:
                cd7.a aVar = (cd7.a) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar.invoke(p0);
            case 5:
                cd7.b bVar = (cd7.b) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.Model) bVar.invoke(p0);
            case 6:
                c1g.o oVar2 = (c1g.o) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) oVar2.invoke(p0);
            case 7:
                cd7.e eVar = (cd7.e) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) eVar.invoke(p0);
            case 8:
                cd7.f fVar = (cd7.f) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) fVar.invoke(p0);
            case 9:
                cd7.g gVar = (cd7.g) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) gVar.invoke(p0);
            case 10:
                h hVar = (h) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) hVar.invoke(p0);
            case 11:
                i iVar = (i) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) iVar.invoke(p0);
            case 12:
                cd7.j jVar = (cd7.j) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) jVar.invoke(p0);
            case 15:
                ce9.a aVar2 = (ce9.a) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ce9.d) aVar2.invoke(p0);
            case 16:
                ccg.c cVar4 = (ccg.c) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ce9.d) cVar4.invoke(p0);
            case 17:
                ccg.c cVar5 = (ccg.c) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ce9.d) cVar5.invoke(p0);
            case 19:
                ccg.c cVar6 = (ccg.c) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ce9.d) cVar6.invoke(p0);
            case 21:
                ccg.c cVar7 = (ccg.c) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) cVar7.invoke(p0);
            case 23:
                ce9.b bVar2 = (ce9.b) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) bVar2.invoke(p0);
            case 24:
                ccg.c cVar8 = (ccg.c) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) cVar8.invoke(p0);
            case 26:
                ccg.c cVar9 = (ccg.c) this.f23143b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) cVar9.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f23142a;
        Object obj2 = this.f23143b;
        switch (i) {
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                CreateMandateScreen.Companion aVar = CreateMandateScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                CreateMandateScreen.Companion aVar2 = CreateMandateScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((cge.g) obj2).invoke(p0)).booleanValue();
    }

    @Override // kfm.d
    public boolean test(Object p0, Object p17) {
        ccg.a aVar = (ccg.a) this.f23143b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((Boolean) aVar.invoke(p0, p17)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object obj2, Object p17) {
        c9f.c cVar = (c9f.c) this.f23143b;
        ce9.p p0 = (ce9.p) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (ce9.p) cVar.invoke(p0, p17);
    }
}
