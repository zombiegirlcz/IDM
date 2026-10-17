package kn;

import android.os.Bundle;
import com.google.common.collect.ImmutableSet;
import efm.r;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends nm.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f185962j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashSet f185963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f185964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f185965n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ImmutableSet loadingHandlers, ym.d loadingObservableProvider, qm.e resultDispatcherFactory) {
        super(resultDispatcherFactory, new fsi.b("COMMON_UI_LOADING_DELEGATE"));
        Intrinsics.checkNotNullParameter(loadingHandlers, "loadingHandlers");
        Intrinsics.checkNotNullParameter(loadingObservableProvider, "loadingObservableProvider");
        Intrinsics.checkNotNullParameter(resultDispatcherFactory, "resultDispatcherFactory");
        this.f185962j = loadingHandlers;
        this.f185963l = new HashSet();
        this.f185964m = j.b(new ite.d(loadingObservableProvider, 6));
        this.f185965n = j.b(new ite.d(this, 7));
    }

    @Override // nm.a
    public final List O() {
        return (List) this.f185965n.getValue();
    }

    @Override // nm.a
    public final r Q() {
        return (r) this.f185964m.getValue();
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            this.k = System.nanoTime();
            this.f185963l = new HashSet();
            return;
        }
        this.k = bundle.getLong("LoadingDelegate_uuid", System.nanoTime());
        Serializable serializable = bundle.getSerializable("LoadingDelegate_cachedStatuses");
        HashSet hashSet = serializable instanceof HashSet ? (HashSet) serializable : null;
        if (hashSet != null) {
            this.f185963l = hashSet;
        }
    }

    @Override // fsi.a
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putLong("LoadingDelegate_uuid", this.k);
        outState.putSerializable("LoadingDelegate_cachedStatuses", this.f185963l);
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        Iterator it8 = this.f185962j.iterator();
        while (it8.hasNext()) {
            ((ym.c) it8.next()).J2();
        }
    }
}
