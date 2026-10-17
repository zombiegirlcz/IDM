package g48;

import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f140383b;

    public /* synthetic */ k(int i, Function1 function1) {
        this.f140382a = i;
        this.f140383b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f140382a) {
            case 13:
                ((j) this.f140383b).invoke(obj2);
                break;
            case 22:
                ((g9i.r) this.f140383b).invoke(obj2);
                break;
            default:
                ((g9i.r) this.f140383b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f140382a) {
            case 0:
                j jVar = (j) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) jVar.invoke(p0);
            case 1:
                h hVar = (h) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) hVar.invoke(p0);
            case 2:
                j jVar2 = (j) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) jVar2.invoke(p0);
            case 3:
                j jVar3 = (j) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) jVar3.invoke(p0);
            case 4:
                a6j.a aVar = (a6j.a) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) aVar.invoke(p0);
            case 5:
                ec9.a aVar2 = (ec9.a) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) aVar2.invoke(p0);
            case 6:
                g3e.h hVar2 = (g3e.h) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) hVar2.invoke(p0);
            case 7:
                j jVar4 = (j) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) jVar4.invoke(p0);
            case 8:
                g gVar = (g) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) gVar.invoke(p0);
            case 9:
                a32.z zVar = (a32.z) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) zVar.invoke(p0);
            case 10:
                g4k.e eVar = (g4k.e) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) eVar.invoke(p0);
            case 11:
                return (List) ((dqd.a) this.f140383b).invoke(p0);
            case 12:
                j jVar5 = (j) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) jVar5.invoke(p0);
            case 13:
            case 22:
            case 24:
            default:
                j jVar6 = (j) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) jVar6.invoke(p0);
            case 14:
                b7j.e eVar2 = (b7j.e) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (rp0.y) eVar2.invoke(p0);
            case 15:
                g64.n nVar = (g64.n) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FeatureCommand) nVar.invoke(p0);
            case 16:
                g64.n nVar2 = (g64.n) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FeatureCommand) nVar2.invoke(p0);
            case 17:
                g4k.e eVar3 = (g4k.e) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar3.invoke(p0);
            case 18:
                g9i.c cVar = (g9i.c) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) cVar.invoke(p0);
            case 19:
                g9i.c cVar2 = (g9i.c) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) cVar2.invoke(p0);
            case 20:
                g9i.c cVar3 = (g9i.c) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) cVar3.invoke(p0);
            case 21:
                g9i.r rVar = (g9i.r) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) rVar.invoke(p0);
            case 23:
                g9i.r rVar2 = (g9i.r) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) rVar2.invoke(p0);
            case 25:
                g9i.r rVar3 = (g9i.r) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) rVar3.invoke(p0);
            case 26:
                g64.c cVar4 = (g64.c) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar4.invoke(p0);
            case 27:
                g9j.j jVar7 = (g9j.j) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) jVar7.invoke(p0);
            case 28:
                g4k.e eVar4 = (g4k.e) this.f140383b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g9j.k) eVar4.invoke(p0);
        }
    }
}
