package fqj;

import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.i;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jqj.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.e1;
import qfm.j1;
import te0.w;
import tof.hc;
import tof.i1;
import tof.q6;
import wsg.n;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements a {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b80.c f137272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f137273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f137274c;
    public final wif.a d;
    public final ConcurrentHashMap e;

    public h(lfm.c disposableContainer, b80.c connectionRepository, l analyticsUpdatesRepository, n walletInteractor, wif.a userFeaturesChecker) {
        Intrinsics.checkNotNullParameter(disposableContainer, "disposableContainer");
        Intrinsics.checkNotNullParameter(connectionRepository, "connectionRepository");
        Intrinsics.checkNotNullParameter(analyticsUpdatesRepository, "analyticsUpdatesRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        this.f137272a = connectionRepository;
        this.f137273b = analyticsUpdatesRepository;
        this.f137274c = walletInteractor;
        this.d = userFeaturesChecker;
        this.e = new ConcurrentHashMap();
        w.j0(disposableContainer, new c(this, 0));
    }

    public final synchronized void a(List transactionScopes) {
        try {
            Intrinsics.checkNotNullParameter(transactionScopes, "transactionScopes");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj2 : transactionScopes) {
                q6 q6Var = (q6) obj2;
                if ((q6Var instanceof hc) || (q6Var instanceof i1)) {
                    linkedHashSet.add(obj2);
                }
            }
            ArrayList<q6> arrayList = new ArrayList();
            for (Object obj3 : linkedHashSet) {
                ifm.c cVar = (ifm.c) this.e.get((q6) obj3);
                if (cVar == null || !cVar.isDisposed()) {
                    arrayList.add(obj3);
                }
            }
            for (q6 q6Var2 : arrayList) {
                i iVarP = this.d.d(wog.a.ANALYTICS).toFlowable(efm.a.LATEST).p(new fjj.b(new fpk.b(q6Var2, this, 2), 26));
                Intrinsics.checkNotNullExpressionValue(iVarP, "switchMap(...)");
                ConcurrentHashMap concurrentHashMap = this.e;
                j1 j1Var = new j1(iVarP, new fn2.c(new fa9.c(new BreadcrumbException(), 11)), 1);
                Intrinsics.checkNotNullExpressionValue(j1Var, "onErrorResumeNext(...)");
                ifm.c cVarM = j1Var.m(new p0(12, f.f137270a), new p0(12, g.f137271a), mfm.f.f205043c, e1.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(cVarM, "subscribe(...)");
                concurrentHashMap.put(q6Var2, cVarM);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
