package k24;

import a3i.w;
import efm.d0;
import jyk.g0;
import kotlin.jvm.internal.Intrinsics;
import om4.s3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements o {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.j f180322a;

    public e(al4.j creditCardEntryPointDetailsInteractor) {
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        this.f180322a = creditCardEntryPointDetailsInteractor;
    }

    @Override // k24.o
    public final d0 a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(((s3) this.f180322a).v(), null, new k1f.n(2), 1), kotlin.coroutines.g.f186406a).firstOrError();
        g0 g0Var = new g0(new w(this, countryCode), 17);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, g0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
