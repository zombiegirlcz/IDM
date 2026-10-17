package ang;

import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements hpa.a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f7776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.c f7777b;

    public j(f userInteractor, lfm.c compositeDisposable) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f7776a = userInteractor;
        this.f7777b = compositeDisposable;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(k.b(message), "user_update")) {
            return false;
        }
        pfm.a aVar = new pfm.a(this.f7776a.i(), new o7.d(new a2i.j(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new s(2, i.f7775a), h.f7774a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f7777b, hVarW);
        return true;
    }
}
