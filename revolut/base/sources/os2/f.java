package os2;

import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import cqi.j;
import efm.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import rfm.u;
import rp0.p0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f229222b;

    public /* synthetic */ f(h hVar, int i) {
        this.f229221a = i;
        this.f229222b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f229221a) {
            case 0:
                p0.a it8 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (i) ((ks2.d) this.f229222b.f229225h).E0().get();
            case 1:
                p0.a it9 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (i) ((ks2.d) this.f229222b.f229225h).I0().get();
            case 2:
                p0.a it10 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (i) ((ks2.d) this.f229222b.f229225h).D0().get();
            case 3:
                p0.b it11 = (p0.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (i) ((ks2.d) this.f229222b.f229225h).y0().get();
            default:
                i iVar = (i) obj2;
                if (!iVar.d()) {
                    return rfm.h.f253943a;
                }
                NaviCommand naviCommand = (NaviCommand) iVar.c();
                if (!(naviCommand instanceof FinishCommand)) {
                    if (naviCommand instanceof CompositeCommand) {
                        List list = ((CompositeCommand) naviCommand).f98629a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it12 = list.iterator();
                            while (it12.hasNext()) {
                                if (((NaviCommand) it12.next()) instanceof FinishCommand) {
                                }
                            }
                        }
                    }
                    u uVarG = k.g(naviCommand);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                efm.b bVarC = ((j) this.f229222b.i).i.f256147a.c();
                u uVarG2 = k.g(naviCommand);
                Intrinsics.checkNotNullExpressionValue(uVarG2, "just(...)");
                return new rfm.e(uVarG2, bVarC, 0);
        }
    }
}
