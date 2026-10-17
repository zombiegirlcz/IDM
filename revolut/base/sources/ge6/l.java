package ge6;

import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe6.a f143240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f143241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jvh.a f143242c;

    public l(fe6.a interactor, c state, jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.f143240a = interactor;
        this.f143241b = state;
        this.f143242c = workflowInteractor;
    }

    public final d0 a() {
        ExtensionAuthRequestData extensionAuthRequestData = (ExtensionAuthRequestData) te0.w.O(((w) this.f143241b).w0());
        if (extensionAuthRequestData != null) {
            ufm.b bVarM = d0.m(extensionAuthRequestData);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        d0<be6.k> verificationCode = ((be6.j) this.f143240a.f134453a).f14687a.getVerificationCode("app");
        be6.h hVar = be6.h.f;
        a0.b bVar = new a0.b(29);
        verificationCode.getClass();
        ufm.i iVar = new ufm.i(verificationCode, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.f fVar = new ufm.f(new ufm.i(te0.w.i0(iVar), new g9j.v(new i(this, 0), 28), 0), new g9j.v(new i(this, 1), 29), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return fVar;
    }
}
