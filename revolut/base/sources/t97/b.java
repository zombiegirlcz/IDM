package t97;

import com.google.common.collect.ImmutableSet;
import efm.c0;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import njf.h;
import org.jetbrains.annotations.NotNull;
import t5e.m;
import t73.y2;
import t73.z2;
import tfm.c4;
import tfm.f4;
import tfm.n4;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f268954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f268955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile n4 f268956c;

    public b(ImmutableSet productSearchDelegates, ImmutableSet productCellVisibilityPolicies) {
        Intrinsics.checkNotNullParameter(productSearchDelegates, "productSearchDelegates");
        Intrinsics.checkNotNullParameter(productCellVisibilityPolicies, "productCellVisibilityPolicies");
        this.f268954a = productSearchDelegates;
        this.f268955b = productCellVisibilityPolicies;
    }

    public final d0 a(p97.a productCell) {
        Object next;
        d0 d0VarC;
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        Iterator it8 = this.f268954a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((p97.c) next).a(productCell.f234280a)) {
                break;
            }
        }
        p97.c cVar = (p97.c) next;
        if (cVar != null && (d0VarC = cVar.c(productCell)) != null) {
            return d0VarC;
        }
        ufm.b bVarM = d0.m(o97.e.f223096a);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final r b() {
        n4 n4Var = this.f268956c;
        if (n4Var != null) {
            return n4Var;
        }
        Set set = this.f268954a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            r rVarSwitchMap = ((p97.c) it8.next()).b().switchMap(new z2(new m(this, 17), 15));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f0 f0Var = f0.f322471a;
            r rVarPublish = rVarSwitchMap.publish(new onh.b(new h(f0Var)));
            Intrinsics.checkNotNullExpressionValue(rVarPublish, "publish(...)");
            arrayList.add(rVarPublish.defaultIfEmpty(f0Var).onErrorReturnItem(f0Var));
        }
        agm.a aVarReplay = te0.w.w(arrayList).map(new z2(new y2(28), 14)).replay(1);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        aVarReplay.getClass();
        c0 c0Var = hhm.f.f152430b;
        mfm.f.e(1, "subscriberCount");
        mfm.f.b(timeUnit2, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        n4 n4Var2 = new n4(aVarReplay instanceof c4 ? new f4(((c4) aVarReplay).f270387g) : aVarReplay, 1L, timeUnit2, c0Var);
        this.f268956c = n4Var2;
        Intrinsics.checkNotNullExpressionValue(n4Var2, "also(...)");
        return n4Var2;
    }
}
