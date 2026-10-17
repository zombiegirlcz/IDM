package c86;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import pfm.t;
import sri.m;
import te0.w;
import tpi.j;
import ufm.i;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends fsi.c {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final fsi.b f22128q = new fsi.b("ID_DEVICE_LOCK_PROTECTION_CHECKER_ACTIVITY_DELEGATE");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f22129h;
    public final xge.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.b f22130j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f22131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f86.a f22132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ue0.c f22133n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ofm.h f22134p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h clearAccountsAction, xge.h isUserAuthorized, efm.b logoutAction, m navigator, i navigateCommand, f86.a deviceLockProtectionChecker, ue0.c deviceLockProtectionStorage, j progressView) {
        super(f22128q);
        Intrinsics.checkNotNullParameter(clearAccountsAction, "clearAccountsAction");
        Intrinsics.checkNotNullParameter(isUserAuthorized, "isUserAuthorized");
        Intrinsics.checkNotNullParameter(logoutAction, "logoutAction");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigateCommand, "navigateCommand");
        Intrinsics.checkNotNullParameter(deviceLockProtectionChecker, "deviceLockProtectionChecker");
        Intrinsics.checkNotNullParameter(deviceLockProtectionStorage, "deviceLockProtectionStorage");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f22129h = clearAccountsAction;
        this.i = isUserAuthorized;
        this.f22130j = logoutAction;
        this.k = navigator;
        this.f22131l = navigateCommand;
        this.f22132m = deviceLockProtectionChecker;
        this.f22133n = deviceLockProtectionStorage;
        this.o = progressView;
    }

    public static t N(efm.b bVar, String name) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        c64.a aVar = new c64.a(new bd2.b(name, 29), 2);
        dfm.c cVar = mfm.f.d;
        en.a aVar2 = mfm.f.f205043c;
        bVar.getClass();
        t tVarM = new t(bVar, aVar, cVar, aVar2, aVar2, aVar2, aVar2).l(new b(name, 0)).m(new c64.a(new c(name, 0), 3));
        Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
        return tVarM;
    }

    @Override // fsi.a
    public final void onStart() {
        ofm.h hVar = this.f22134p;
        if ((hVar == null || hVar.isDisposed()) && ((Boolean) this.i.invoke()).booleanValue()) {
            d0 d0VarFirstOrError = w.f0(rd0.e.c(this.f22133n.C0("LOCK_PROTECTION_KEY", Boolean.TYPE), kotlin.coroutines.g.f186406a)).firstOrError();
            ag.j jVar = new ag.j(new a(this, 0), 4);
            d0VarFirstOrError.getClass();
            pfm.a aVar = new pfm.a(new i(d0VarFirstOrError, jVar, 0), new ag.j(new a(this, 1), 5), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            Function0 function0L = L();
            Function1 function1M = M();
            pfm.a aVar2 = new pfm.a(aVar, new a31.a(new c0d.j(new BreadcrumbException(), 7)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
            ofm.h hVarW = aVar2.w(new bo.e(1, function1M), new f(0, function0L));
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            w.j0(this.d, hVarW);
            this.f22134p = hVarW;
        }
    }
}
