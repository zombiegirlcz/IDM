package nx7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends qri.b implements c {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ln.a f220482c;
    public final t70.g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ifm.b flowDisposable, b presentationModel, ln.a navigationCommandsDispatcher, t70.g localization) {
        super(presentationModel);
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f220482c = navigationCommandsDispatcher;
        this.d = localization;
        pfm.a aVar = new pfm.a(te0.w.D(o(), new nb6.p(1, navigationCommandsDispatcher, ln.a.class, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;", 0, 18)), new kl.b0(new ne0.e(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new ly7.g(9, y.f220481a), x.f220480a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(flowDisposable, hVarW);
    }

    @Override // qri.b
    public final ufm.b e() {
        ufm.b bVarM = d0.m(new FinishCommand(null, null, null, 7));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // qri.b
    public final ufm.b f() {
        ufm.b bVarM = d0.m(new FinishCommand(null, null, null, 7));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // qri.b
    public final ufm.b h(Object obj2, Boolean bool) {
        e eVar = (e) obj2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = w.f220479a[eVar.ordinal()];
        if (i == 1) {
            wx7.d.Companion.getClass();
            ufm.b bVarM = d0.m(new FragmentNavigateCommand(wx7.a.f300771b, null, false, 2046));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (i == 2) {
            ux7.e.Companion.getClass();
            ufm.b bVarM2 = d0.m(new FragmentNavigateCommand(ux7.a.f283893b, null, false, 2046));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (i == 3) {
            rx7.f.Companion.getClass();
            ufm.b bVarM3 = d0.m(new FragmentNavigateCommand(rx7.b.f258063b, null, false, 2046));
            Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
            return bVarM3;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        px7.d.Companion.getClass();
        ufm.b bVarM4 = d0.m(new FragmentNavigateCommand(px7.a.f240570b, null, false, 2046));
        Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
        return bVarM4;
    }

    @Override // qri.b
    public final efm.k j(Object obj2) {
        e eVar = (e) obj2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = w.f220479a[eVar.ordinal()];
        if (i == 1) {
            return te0.w.f(e.BASE_DETAILS);
        }
        if (i == 2) {
            return te0.w.f(e.BREED_SELECTION);
        }
        if (i == 3) {
            return te0.w.f(e.PET_AGE);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        rfm.h hVar = rfm.h.f253943a;
        Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
        return hVar;
    }

    @Override // qri.b
    public final efm.k k(Object obj2) {
        e eVar = (e) obj2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = w.f220479a[eVar.ordinal()];
        if (i == 1) {
            rfm.h hVar = rfm.h.f253943a;
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        if (i == 2) {
            return te0.w.f(e.PET_SELECTION);
        }
        if (i == 3) {
            return te0.w.f(e.BASE_DETAILS);
        }
        if (i == 4) {
            return te0.w.f(e.BREED_SELECTION);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // qri.b
    public final d0 n() {
        return te0.w.j(e.PET_SELECTION);
    }
}
