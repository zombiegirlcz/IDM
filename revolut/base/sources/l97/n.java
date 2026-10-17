package l97;

import com.google.common.collect.ImmutableSet;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$GlobalSearchMergeCrypto;
import com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$GlobalSearchRecentQueries;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.CharsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o97.m0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.t0;
import vkm.z1;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements h {

    @NotNull
    public static final j Companion = new j();
    public final z1 A;
    public final j2 B;
    public r C;
    public o97.f D;
    public final j2 E;
    public final j2 F;
    public final cli.y G;
    public final GlobalSearchContext o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b97.f f193085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xn.b f193086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i97.d f193087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jul.o f193088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wli.x f193089t;
    public final j60.a u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i97.a f193090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z87.g f193091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final aim.f f193092y;
    public final Set z;

    public n(GlobalSearchContext context, b97.f preferencesRepository, xn.b adsTrackingInteractor, i97.d remoteSearchRepository, jul.o sessionFactory, wli.x deeplinkHandler, j60.a bottomSheetApi, gte.a featureToggleInteractor, i97.a recentQueriesInteractor, z87.g searchSourceControllerModelExtensionSet, aim.f searchSources, ImmutableSet controllerExtensions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(adsTrackingInteractor, "adsTrackingInteractor");
        Intrinsics.checkNotNullParameter(remoteSearchRepository, "remoteSearchRepository");
        Intrinsics.checkNotNullParameter(sessionFactory, "sessionFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(bottomSheetApi, "bottomSheetApi");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(recentQueriesInteractor, "recentQueriesInteractor");
        Intrinsics.checkNotNullParameter(searchSourceControllerModelExtensionSet, "searchSourceControllerModelExtensionSet");
        Intrinsics.checkNotNullParameter(searchSources, "searchSources");
        Intrinsics.checkNotNullParameter(controllerExtensions, "controllerExtensions");
        this.o = context;
        this.f193085p = preferencesRepository;
        this.f193086q = adsTrackingInteractor;
        this.f193087r = remoteSearchRepository;
        this.f193088s = sessionFactory;
        this.f193089t = deeplinkHandler;
        this.u = bottomSheetApi;
        this.v = featureToggleInteractor;
        this.f193090w = recentQueriesInteractor;
        this.f193091x = searchSourceControllerModelExtensionSet;
        this.f193092y = searchSources;
        this.z = controllerExtensions;
        this.A = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
        this.B = vkm.q.c(null);
        this.E = vkm.q.c(null);
        this.F = vkm.q.c("");
        o oVar = new o();
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.G = mra.d.b(this, new i("", f0Var, null, null, f0Var, null), new a54.b(18), oVar, false, 8);
    }

    public static final ArrayList I2(n nVar, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            m0 m0Var = (m0) obj2;
            gte.a aVar = nVar.v;
            if (m0Var == o97.r.RECENT_QUERIES) {
                if (((jte.d) aVar).c(GlobalSearchApi$Toggles$GlobalSearchRecentQueries.f74615c)) {
                    arrayList.add(obj2);
                }
            } else {
                if (m0Var == o97.r.YOUR_CRYPTOCURRENCIES && nVar.o != RetailGlobalSearchContext.REVX_HOME) {
                    if (((jte.d) aVar).c(GlobalSearchApi$Toggles$GlobalSearchMergeCrypto.f74614c)) {
                    }
                }
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            z87.f fVar = (z87.f) nVar.f193092y.get((m0) it8.next());
            if (fVar != null) {
                fVar.g(nVar.f193091x.f320047a);
                fVar.c(nVar.z);
                Iterator it9 = fVar.j().iterator();
                while (it9.hasNext()) {
                    nVar.v1((yji.n) it9.next(), null);
                }
            } else {
                fVar = null;
            }
            if (fVar != null) {
                arrayList2.add(fVar);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(l97.n r6, kotlinx.coroutines.CoroutineScope r7, z87.f r8, kotlin.jvm.functions.Function1 r9, gim.c r10) throws java.lang.Exception {
        /*
            boolean r0 = r10 instanceof l97.l
            if (r0 == 0) goto L13
            r0 = r10
            l97.l r0 = (l97.l) r0
            int r1 = r0.f193081x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193081x = r1
            goto L18
        L13:
            l97.l r0 = new l97.l
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f193081x
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            z87.f r8 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2b
            goto L57
        L2b:
            r7 = move-exception
            goto L5d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r10)
            skm.d0 r10 = skm.d0.UNDISPATCHED     // Catch: java.lang.Exception -> L5b
            l97.m r2 = new l97.m     // Catch: java.lang.Exception -> L5b
            r2.<init>(r9, r6, r8, r5)     // Catch: java.lang.Exception -> L5b
            skm.h0 r7 = skm.e0.g(r7, r5, r10, r2, r3)     // Catch: java.lang.Exception -> L5b
            boolean r9 = r7.isCompleted()     // Catch: java.lang.Exception -> L5b
            if (r9 != 0) goto L85
            r6.d0(r3, r4)     // Catch: java.lang.Exception -> L5b
            r0.u = r8     // Catch: java.lang.Throwable -> L2b
            r0.f193081x = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.y(r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L57
            return r1
        L57:
            r6.d0(r4, r4)     // Catch: java.lang.Exception -> L5b
            goto L85
        L5b:
            r6 = move-exception
            goto L61
        L5d:
            r6.d0(r4, r4)     // Catch: java.lang.Exception -> L5b
            throw r7     // Catch: java.lang.Exception -> L5b
        L61:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L88
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            o97.r r8 = r8.h()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Error in event handling by "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8, r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            rd0.d.a(r8, r5, r5, r7, r6)
        L85:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L88:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l97.n.J2(l97.n, kotlinx.coroutines.CoroutineScope, z87.f, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public static o97.y L2(Object obj2) {
        if (obj2 instanceof o97.y) {
            return (o97.y) obj2;
        }
        if (obj2 instanceof o97.z) {
            return ((zkh.i) ((o97.z) obj2)).f323000a;
        }
        return null;
    }

    public static String N2(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (CharsKt.e(str.charAt(i))) {
                int length2 = str.length();
                StringBuilder sb6 = new StringBuilder(length2);
                int i2 = 0;
                while (i2 < length2 && CharsKt.e(str.charAt(i2))) {
                    i2++;
                }
                boolean z = false;
                while (i2 < length2) {
                    char cCharAt = str.charAt(i2);
                    if (!CharsKt.e(cCharAt)) {
                        sb6.append(cCharAt);
                        z = false;
                    } else if (!z) {
                        sb6.append(zsc.p.SPACE_CHAR);
                        z = true;
                    }
                    i2++;
                }
                int length3 = sb6.length();
                if (length3 > 0) {
                    int i3 = length3 - 1;
                    if (sb6.charAt(i3) == ' ') {
                        sb6.setLength(i3);
                    }
                }
                String string = sb6.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
        }
        return str;
    }

    @Override // yji.l
    public final void I1() {
        String str = ((i) ((j2) this.G.f22677a).getValue()).f193059a;
        boolean zW = kotlin.text.d0.W(str);
        j2 j2Var = this.F;
        if (!zW) {
            j2Var.setValue(N2(str));
        }
        b97.f fVar = this.f193085p;
        fVar.getClass();
        GlobalSearchContext context = this.o;
        Intrinsics.checkNotNullParameter(context, "context");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar = fVar.f13687g;
        Unit unit = Unit.f186387a;
        Continuation continuation = null;
        yji.l.a1(this, c8g.a.D(new ahd.y(cVar.b(unit, loadingStrategy), fVar, context, 5)), null, null, new l1g.e(this, continuation, 15), 3);
        cbh.f fVarG = t1.g(j2Var, 300L);
        t0 t0Var = new t0(this.B, 1);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, ta6.a.h(fVarG, t0Var, mo3.a.g(n14.k.s(fVar.f13688h.b(unit, loadingStrategy), o97.b0.f223090a), null, new l2c.v(25), 1), new ate.b(this, continuation, 6)), null, null, new jl6.b(2, this.E, MutableStateFlow.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12, 16), 3);
        yji.l.a1(this, this.A, null, null, new knd.h0(this, new Ref$ObjectRef(), continuation, 26), 3);
    }

    @Override // yji.l
    public final void K1() {
        this.f193087r.f159589b.i(-1);
    }

    public final void K2(l0 l0Var) {
        Object k0Var;
        r rVar = (r) this.E.getValue();
        o97.y yVarA = l0Var.a();
        if (yVarA == null) {
            yVarA = null;
        }
        if (yVarA != null) {
            this.f193086q.d(yVarA);
        }
        if (rVar != null) {
            o97.y payload = o97.y.a(l0Var.a(), null, this.o, null, 55);
            if (l0Var instanceof j0) {
                j0 j0Var = (j0) l0Var;
                String listId = j0Var.f193074a;
                String query = j0Var.f193076c;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(payload, "payload");
                Intrinsics.checkNotNullParameter(query, "query");
                k0Var = new j0(listId, payload, query);
            } else {
                if (!(l0Var instanceof k0)) {
                    throw new NoWhenBranchMatchedException();
                }
                String listId2 = ((k0) l0Var).f193078a;
                Intrinsics.checkNotNullParameter(listId2, "listId");
                Intrinsics.checkNotNullParameter(payload, "payload");
                k0Var = new k0(listId2, payload);
            }
            this.A.k(k0Var);
        }
    }

    public final j0 M2(String str, o97.y yVar) {
        String str2 = ((i) ((j2) this.G.f22677a).getValue()).d;
        if (str2 == null) {
            str2 = "";
        }
        return new j0(str, yVar, str2);
    }

    @Override // yji.l
    public final void P1() {
        this.f193086q.a();
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new kze.h(this, null, 4), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.G;
    }
}
