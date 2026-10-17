package fwj;

import az0.r1;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.t;
import skm.p0;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f138669b;

    public /* synthetic */ g(p pVar, int i) {
        this.f138668a = i;
        this.f138669b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        char c2;
        int i = this.f138668a;
        Continuation continuation = null;
        efm.b bVarV = pfm.m.f235744a;
        final p pVar = this.f138669b;
        final int i2 = 0;
        final int i3 = 1;
        int i5 = 2;
        switch (i) {
            case 0:
                Boolean isOnboarded = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isOnboarded, "isOnboarded");
                pfm.h hVarJ = ((ik3.c) pVar.f138687c).j();
                efm.b bVarIgnoreElements = mo3.a.n(((pza.g) pVar.d.f191079a).d.f(Unit.f186387a, true)).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                fpj.e eVar = pVar.e;
                pfm.h hVar = new pfm.h(new a08.d(eVar, 21), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                Continuation continuation2 = null;
                pfm.a aVarE = hVar.e(eVar.e.g(new fpj.d(null, true), true));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                pfm.a aVarV = ue0.e.v(aVarE);
                kotlinx.coroutines.d dVar = p0.f264003c;
                pfm.a aVarV2 = ue0.e.v(pd.b.n(dVar, new j(pVar, continuation2, 6)));
                pfm.a aVarV3 = ue0.e.v(pd.b.n(dVar, new j(pVar, continuation2, 7)));
                efm.b bVarL0 = pVar.f138689h.l0(true);
                pfm.h hVarI = pVar.f138686b.i();
                t tVarA = jte.c.a(pVar.f138692m, null, 3);
                mk0.p pVar2 = pVar.f138698t;
                elm.f coroutineContext = elm.f.f127540b;
                Intrinsics.checkNotNullParameter(pVar2, "<this>");
                Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
                efm.b bVarP = efm.b.p(tVarA, ue0.e.v(pd.b.n(coroutineContext, new r1(pVar2, null, 16))));
                pfm.h hVar2 = new pfm.h(new f(pVar, 4), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                pfm.a aVarE2 = bVarP.e(o70.a.d(hVar2));
                pfm.h hVar3 = new pfm.h(new f(pVar, 3), 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                if (isOnboarded.booleanValue()) {
                    c2 = 0;
                } else {
                    Continuation continuation3 = null;
                    c2 = 0;
                    pfm.d dVarQ = efm.b.q(pd.b.n(dVar, new j(pVar, continuation3, 4)), pd.b.n(dVar, new j(pVar, continuation3, 5)));
                    Intrinsics.checkNotNullExpressionValue(dVarQ, "mergeArrayDelayError(...)");
                    bVarV = ue0.e.v(dVarQ);
                }
                efm.b[] bVarArr = new efm.b[10];
                bVarArr[c2] = hVarJ;
                bVarArr[1] = bVarIgnoreElements;
                bVarArr[2] = aVarV;
                bVarArr[3] = aVarV2;
                bVarArr[4] = aVarV3;
                bVarArr[5] = bVarL0;
                bVarArr[6] = hVarI;
                bVarArr[7] = aVarE2;
                bVarArr[8] = hVar3;
                bVarArr[9] = bVarV;
                return efm.b.o(v.k(bVarArr));
            case 1:
                rl0.d primaryAuthCredentialsType = (rl0.d) obj2;
                Intrinsics.checkNotNullParameter(primaryAuthCredentialsType, "primaryAuthCredentialsType");
                int i6 = i.f138672a[primaryAuthCredentialsType.ordinal()];
                if (i6 == 1) {
                    return new pfm.h(new ufm.i(w.o0(p0.f264003c, new j(pVar, null, i5)), new fs5.d(29, new fwf.n(i3)), 1), 4);
                }
                if (i6 == 2) {
                    return bVarV;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                Boolean isOnboarded2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isOnboarded2, "isOnboarded");
                efm.b bVarG0 = !isOnboarded2.booleanValue() ? w.g0(((twj.f) pVar.f138685a).f275037a.activateUser()) : bVarV;
                boolean zBooleanValue = isOnboarded2.booleanValue();
                boolean z = !zBooleanValue;
                pVar.getClass();
                kotlinx.coroutines.d dVar2 = p0.f264003c;
                pfm.a aVar = new pfm.a(w.o0(dVar2, new j(pVar, continuation, i3)), new fs5.d(28, new g(pVar, i3)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                pfm.a aVarE3 = bVarG0.e(aVar);
                pfm.h hVar4 = new pfm.h(new f(pVar, i3), 2);
                Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                pfm.a aVarE4 = aVarE3.e(hVar4).e(pVar.f138696r.a(sd0.f.LAZY_RELOAD));
                pfm.a aVar2 = new pfm.a(d0.m(isOnboarded2), new fs5.d(27, new g(pVar, 0)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                pfm.a aVarE5 = aVarE4.e(aVar2).e(pd.b.n(elm.f.f127540b, new o(z, pVar, null)));
                pfm.a aVar3 = new pfm.a(w.o0(dVar2, new j(pVar, null, 0)), new fs5.d(26, new g(pVar, 5)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                pfm.a aVarE6 = aVarE5.e(aVar3);
                pfm.h hVar5 = new pfm.h(new f(pVar, i5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                pfm.a aVarE7 = aVarE6.e(hVar5).e(!zBooleanValue ? ue0.e.v(((noi.a) pVar.f138699w).a()) : bVarV);
                if (!zBooleanValue) {
                    bVarV = new pfm.h(new f(pVar, 0), 2);
                }
                pfm.a aVarE8 = aVarE7.e(bVarV).e(new pfm.h(new e8h.p(z, pVar), 2));
                ufm.b bVarM = d0.m(Boolean.valueOf(z));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return aVarE8.f(bVarM);
            case 3:
                final o0j.a it8 = (o0j.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new pfm.h(new kfm.a() { // from class: fwj.e
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                pVar.j(it8.f221214b);
                                break;
                            default:
                                pVar.j(it8.f221214b);
                                break;
                        }
                    }
                }, 2);
            case 4:
                final o0j.a createdRegisteredIdentity = (o0j.a) obj2;
                Intrinsics.checkNotNullParameter(createdRegisteredIdentity, "createdRegisteredIdentity");
                pfm.h hVar6 = new pfm.h(new kfm.a() { // from class: fwj.e
                    @Override // kfm.a
                    public final void run() {
                        switch (i3) {
                            case 0:
                                pVar.j(createdRegisteredIdentity.f221214b);
                                break;
                            default:
                                pVar.j(createdRegisteredIdentity.f221214b);
                                break;
                        }
                    }
                }, 2);
                if (Intrinsics.f(createdRegisteredIdentity.f221215c, Boolean.TRUE)) {
                    bVarV = ue0.e.v(pVar.i(true));
                }
                return hVar6.e(bVarV);
            default:
                rl0.d primaryAuthCredentialsType2 = (rl0.d) obj2;
                Intrinsics.checkNotNullParameter(primaryAuthCredentialsType2, "primaryAuthCredentialsType");
                return new pfm.h(new f0d.m(primaryAuthCredentialsType2, pVar, 17), 2);
        }
    }
}
