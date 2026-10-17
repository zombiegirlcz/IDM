package jn;

import com.google.common.collect.ImmutableSet;
import efm.d0;
import hn.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import jlh.g;
import kotlin.jvm.internal.Intrinsics;
import mp.r;
import okl.m;
import qfm.f0;
import qfm.j0;
import ufm.i;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class e extends vm.c implements hn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f176641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f176642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f176643c;
    public final Set d;

    public e(ln.a navigationCommandsDispatcher, h dialogConfigurationDispatcher, r dialogConfigurationFactory, ImmutableSet unrecoverableConditions) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(dialogConfigurationDispatcher, "dialogConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(dialogConfigurationFactory, "dialogConfigurationFactory");
        Intrinsics.checkNotNullParameter(unrecoverableConditions, "unrecoverableConditions");
        this.f176641a = navigationCommandsDispatcher;
        this.f176642b = dialogConfigurationDispatcher;
        this.f176643c = dialogConfigurationFactory;
        this.d = unrecoverableConditions;
    }

    @Override // hn.a
    public final d0 c(npi.e result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.f(result.a(), "UNRECOVERABLE_ERROR_HAPPENED_DIALOG_ID")) {
            return m.w(null, null, null, 7, this.f176641a).f(d0.m(Boolean.TRUE));
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        Set set = this.d;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((xc0.b) it8.next()).a(errorData));
        }
        i iVar = new i(new f0(new j0(d0.h(efm.i.h(arrayList)), new jeg.h(new jj3.a(29), 24), 0), Boolean.FALSE), new jeg.h(new g(this, 4), 25), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
