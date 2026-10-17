package udj;

import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements wli.f {

    @NotNull
    private static final a Companion = new a();
    public static final Set d = y0.b("chat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onh.b f279229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final asi.d f279230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fwj.p f279231c;

    public d(onh.b postActivationStatusProvider, asi.d sessionInteractor, fwj.p userOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(postActivationStatusProvider, "postActivationStatusProvider");
        Intrinsics.checkNotNullParameter(sessionInteractor, "sessionInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        this.f279229a = postActivationStatusProvider;
        this.f279230b = sessionInteractor;
        this.f279231c = userOnboardingInteractor;
    }

    @Override // wli.f
    public final Object b(zli.b bVar, Continuation continuation) {
        c cVar = new c(this, bVar, null);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, cVar, continuation);
    }
}
