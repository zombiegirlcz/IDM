package scl;

import dcl.d0;
import hcl.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import tcl.l;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f261761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f261762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f261763c;
    public final ne0.d d;
    public final s e;

    public c(d4m.a instrumentTickerService, d4m.a instrumentsDao, b80.c networkStateRepository, ue0.c storage, ne0.d instrumentsMemoryCache, s forceReloadStrategy) {
        Intrinsics.checkNotNullParameter(instrumentTickerService, "instrumentTickerService");
        Intrinsics.checkNotNullParameter(instrumentsDao, "instrumentsDao");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(instrumentsMemoryCache, "instrumentsMemoryCache");
        Intrinsics.checkNotNullParameter(forceReloadStrategy, "forceReloadStrategy");
        this.f261761a = instrumentTickerService;
        this.f261762b = instrumentsDao;
        this.f261763c = storage;
        this.d = instrumentsMemoryCache;
        this.e = forceReloadStrategy;
    }

    public final ArrayList a() {
        List listB = ((d0) this.f261762b.get()).b();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        Iterator it8 = listB.iterator();
        while (it8.hasNext()) {
            arrayList.add(l.a((k0) it8.next()));
        }
        return arrayList;
    }
}
