package pyc;

import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.impl.ui.stories.SotRemoteStoriesKey;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.IntentCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends qri.b implements h {

    @NotNull
    private static final e0 Companion = new e0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f240776c;
    public final t70.g d;
    public final s70.a e;
    public final hn.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g3l.a f240777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f presentationModel, t70.g localization, s70.a intentProvider, hn.h dialogConfigurationDispatcher, g3l.a statusDialogViewConfigurationDispatcher) {
        super(presentationModel);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(dialogConfigurationDispatcher, "dialogConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        this.f240776c = presentationModel;
        this.d = localization;
        this.e = intentProvider;
        this.f = dialogConfigurationDispatcher;
        this.f240777g = statusDialogViewConfigurationDispatcher;
    }

    @Override // swl.b
    public final void a() {
        this.f248734a.onNext(new IntentCommand(((s70.b) this.e).b(), null));
    }

    @Override // g3l.d
    public final efm.d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return ((t) this.f240776c).l3() != null ? q(j.SUMMARY).f(efm.d0.m(Boolean.TRUE)) : q(j.STATUS).f(efm.d0.m(Boolean.TRUE));
    }

    @Override // hn.a
    public final efm.d0 c(npi.e result) {
        efm.b bVarM;
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.f(result.f218229a, "CHANGE_INCOME_SOURCE_ID")) {
            return efm.d0.m(Boolean.FALSE);
        }
        if (result.f218230b) {
            t tVar = (t) this.f240776c;
            tVar.k3();
            Object obj2 = result.f218231c;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.selfserve.sot.api.models.IncomeSource");
            tVar.w3((IncomeSource) obj2);
            bVarM = m();
        } else {
            bVarM = pfm.m.f235744a;
        }
        return bVarM.f(efm.d0.m(Boolean.TRUE));
    }

    @Override // qri.b
    public final ufm.b e() {
        ufm.b bVarM = efm.d0.m(new FinishCommand(null, null, null, 7));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // qri.b
    public final ufm.b f() {
        ufm.b bVarM = efm.d0.m(DummyCommand.f98635a);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // qri.b
    public final /* bridge */ /* synthetic */ ufm.b h(Object obj2, Boolean bool) {
        return p((j) obj2);
    }

    @Override // qri.b
    public final efm.k j(Object obj2) {
        j jVar = (j) obj2;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        int i = f0.f240775a[jVar.ordinal()];
        f fVar = this.f240776c;
        switch (i) {
            case 1:
                return te0.w.f(j.STATUS);
            case 2:
                return ((t) fVar).l3() == null ? te0.w.f(j.EVIDENCE_TYPES) : te0.w.f(j.SUMMARY);
            case 3:
                t tVar = (t) fVar;
                IncomeSource incomeSourceM3 = tVar.m3();
                if (Intrinsics.f(incomeSourceM3 != null ? incomeSourceM3.f85873a : null, "OTHER_TRANSACTION")) {
                    return te0.w.f(j.EVIDENCE_DESCRIPTION);
                }
                m70.a.c(t0.f186434a);
                Intrinsics.checkNotNullParameter("", "description");
                ((h0) tVar.f240799b).y0().set("");
                boolean zP3 = ((t) fVar).p3();
                j jVar2 = j.DOCUMENT_TYPE;
                j jVar3 = j.EVIDENCE_LIST;
                if (!zP3) {
                    jVar2 = jVar3;
                }
                return te0.w.f(jVar2);
            case 4:
                boolean zP32 = ((t) fVar).p3();
                j jVar4 = j.DOCUMENT_TYPE;
                j jVar5 = j.EVIDENCE_LIST;
                if (!zP32) {
                    jVar4 = jVar5;
                }
                return te0.w.f(jVar4);
            case 5:
                rfm.d dVar = new rfm.d(new d0(this, 0), 1);
                Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
                return dVar;
            case 6:
                rfm.e eVar = new rfm.e(rfm.h.f253943a, ((t) fVar).f240802h.c(Unit.f186387a), 0);
                Intrinsics.checkNotNullExpressionValue(eVar, "andThen(...)");
                return eVar;
            case 7:
                return te0.w.f(j.SUMMARY);
            case 8:
                rfm.d dVar2 = new rfm.d(new d0(this, 1), 1);
                Intrinsics.checkNotNullExpressionValue(dVar2, "defer(...)");
                return dVar2;
            case 9:
                return te0.w.f(j.EVIDENCE_LIST);
            case 10:
                efm.k kVarW = new ufm.i(r(), new r(16, new p(10)), 1).w();
                Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
                return kVarW;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // qri.b
    public final efm.k k(Object obj2) {
        j jVar = (j) obj2;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        int i = f0.f240775a[jVar.ordinal()];
        rfm.h hVar = rfm.h.f253943a;
        f fVar = this.f240776c;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            case 2:
                if (((t) fVar).r3()) {
                    return te0.w.f(j.HOME);
                }
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            case 3:
                return te0.w.f(j.STATUS);
            case 4:
                return te0.w.f(j.EVIDENCE_TYPES);
            case 5:
                rfm.d dVar = new rfm.d(new d0(this, 2), 1);
                Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
                return dVar;
            case 6:
                return ((t) fVar).l3() == null ? te0.w.f(j.EVIDENCE_LIST) : te0.w.f(j.STATUS);
            case 7:
                return te0.w.f(j.SUMMARY);
            case 8:
                IncomeSource incomeSourceM3 = ((t) fVar).m3();
                boolean zF = Intrinsics.f(incomeSourceM3 != null ? incomeSourceM3.f85873a : null, "OTHER_TRANSACTION");
                j jVar2 = j.EVIDENCE_DESCRIPTION;
                j jVar3 = j.EVIDENCE_TYPES;
                if (!zF) {
                    jVar2 = jVar3;
                }
                return te0.w.f(jVar2);
            case 9:
                return te0.w.f(j.DOCUMENT_TYPE);
            case 10:
                return te0.w.f(j.HOME);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // qri.b
    public final efm.b l() {
        pfm.t tVarL = ((pfm.h) super.l()).l(new e8h.p(this, false, 5));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    @Override // qri.b
    public final efm.d0 n() {
        kza.a aVar = ((t) this.f240776c).f;
        efm.d0 d0VarFirstOrError = aVar.a(SotRemoteStoriesKey.SOT_HARD_LOCK).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        efm.d0 d0VarFirstOrError2 = aVar.a(SotRemoteStoriesKey.SOT_NON_LOCK).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
        pfm.z zVarO = new ufm.i(te0.w.H0(d0VarFirstOrError, d0VarFirstOrError2), new pva.c(26, new px0.a(25)), 1).o(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        ufm.i iVar = new ufm.i(te0.w.H0(zVarO, r()), new r(15, new p(9)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.b p(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        switch (f0.f240775a[jVar.ordinal()]) {
            case 1:
                zyc.g.Companion.getClass();
                ufm.b bVarM = efm.d0.m(new FragmentNavigateCommand(zyc.a.f326408b, null, false, 2046));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 2:
                bzc.e.Companion.getClass();
                ufm.b bVarM2 = efm.d0.m(new FragmentNavigateCommand(bzc.a.f19949b, null, false, 2046));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
            case 3:
                wyc.e.Companion.getClass();
                ufm.b bVarM3 = efm.d0.m(new FragmentNavigateCommand(wyc.a.f301204b, null, false, 2046));
                Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                return bVarM3;
            case 4:
                qyc.d.Companion.getClass();
                ufm.b bVarM4 = efm.d0.m(new FragmentNavigateCommand(qyc.a.f250272b, null, false, 2046));
                Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
                return bVarM4;
            case 5:
                uyc.d.Companion.getClass();
                ufm.b bVarM5 = efm.d0.m(new FragmentNavigateCommand(uyc.a.f284130b, null, true, 2042));
                Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
                return bVarM5;
            case 6:
                czc.i.Companion.getClass();
                ufm.b bVarM6 = efm.d0.m(new FragmentNavigateCommand(czc.a.f110181b, null, false, 2046));
                Intrinsics.checkNotNullExpressionValue(bVarM6, "just(...)");
                return bVarM6;
            case 7:
                azc.d.Companion.getClass();
                ufm.b bVarM7 = efm.d0.m(new FragmentNavigateCommand(azc.a.f11429b, null, false, 2046));
                Intrinsics.checkNotNullExpressionValue(bVarM7, "just(...)");
                return bVarM7;
            case 8:
                syc.o.Companion.getClass();
                ufm.b bVarM8 = efm.d0.m(new FragmentNavigateCommand(syc.k.f266657b, null, false, 2046));
                Intrinsics.checkNotNullExpressionValue(bVarM8, "just(...)");
                return bVarM8;
            case 9:
                tyc.p.Companion.getClass();
                ufm.b bVarM9 = efm.d0.m(new FragmentNavigateCommand(tyc.m.f275550b, null, false, 2046));
                Intrinsics.checkNotNullExpressionValue(bVarM9, "just(...)");
                return bVarM9;
            case 10:
                ufm.b bVarM10 = efm.d0.m(new FeatureCommand(new RemoteStoriesFeatureConfig.Key(((t) this.f240776c).r3() ? SotRemoteStoriesKey.SOT_HARD_LOCK : SotRemoteStoriesKey.SOT_NON_LOCK, null, new FinishCommand(null, null, null, 7), sza.a.ON_FIRST_PAGE_SHOWN, new FinishCommand(null, null, null, 7), null, 10001, 7626)));
                Intrinsics.checkNotNullExpressionValue(bVarM10, "just(...)");
                return bVarM10;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final pfm.h q(j jVar) {
        ((t) this.f240776c).c1(jVar);
        pfm.h hVar = new pfm.h(new ufm.f(new ufm.i(p(jVar), new r(17, new p(11)), 1), new r(18, new pth.l(this, 18)), 0), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }

    public final pfm.z r() {
        t tVar = (t) this.f240776c;
        pfm.z zVarO = m70.a.h(nim.a.w(tVar.d.i(), new p(1)), new pv7.t(4), null, null, 6).firstOrError().o(Boolean.valueOf(tVar.r3()));
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        return zVarO;
    }
}
