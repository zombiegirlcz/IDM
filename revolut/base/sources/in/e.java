package in;

import com.google.common.collect.ImmutableSet;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class e extends nm.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f162570j = 2;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f162571l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ImmutableSet plugins, ImmutableSet screenshotHandlers, qm.e dispatcherFactory) {
        super(dispatcherFactory, new fsi.b("STORIES_SCREENSHOT_DELEGATE_ID"));
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        Intrinsics.checkNotNullParameter(screenshotHandlers, "screenshotHandlers");
        Intrinsics.checkNotNullParameter(dispatcherFactory, "dispatcherFactory");
        this.k = plugins;
        this.f162571l = screenshotHandlers;
    }

    @Override // nm.a
    public final List O() {
        switch (this.f162570j) {
            case 0:
                return (List) ((Lazy) this.f162571l).getValue();
            case 1:
                return (List) ((Lazy) this.f162571l).getValue();
            default:
                Set set = (Set) this.f162571l;
                ArrayList arrayList = new ArrayList(w.t(set, 10));
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    if (it8.next() != null) {
                        throw new ClassCastException();
                    }
                    arrayList.add(new an0.e(13));
                }
                return arrayList;
        }
    }

    @Override // nm.a
    public final r Q() {
        switch (this.f162570j) {
            case 0:
                return (r) ((Lazy) this.k).getValue();
            case 1:
                return (r) ((Lazy) this.k).getValue();
            default:
                for (d4e.b bVar : (Set) this.k) {
                }
                r rVarEmpty = r.empty();
                Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
                return rVarEmpty;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ImmutableSet backHandlers, om.c backObservableProvider, qm.e resultDispatcherFactory) {
        super(resultDispatcherFactory, new fsi.b("BACK_CLICK_MEDIATOR_DELEGATE"));
        Intrinsics.checkNotNullParameter(backHandlers, "backHandlers");
        Intrinsics.checkNotNullParameter(backObservableProvider, "backObservableProvider");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.k = j.b(new ite.d(backObservableProvider, 22));
        this.f162571l = j.b(new cn.c(3, backHandlers));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(um.c errorsObservable, ImmutableSet errorHandlers, qm.e resultDispatcherFactory) {
        super(resultDispatcherFactory, new fsi.b("COMMON_UI_ERRORS_DELEGATE"));
        Intrinsics.checkNotNullParameter(errorsObservable, "errorsObservable");
        Intrinsics.checkNotNullParameter(errorHandlers, "errorHandlers");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.k = j.b(new androidx.lifecycle.b(errorsObservable, 26));
        this.f162571l = j.b(new cn.c(2, errorHandlers));
    }
}
