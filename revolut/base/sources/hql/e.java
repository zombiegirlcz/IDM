package hql;

import com.revolut.sso.impl.ui.signin_with_revolut_id.SignInWithRevolutIdFlowContract$InputData;
import com.revolut.sso.impl.ui.signin_with_revolut_id.SignInWithRevolutIdFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends h implements b {

    @NotNull
    public static final c Companion = new c();
    public final SignInWithRevolutIdFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nkl.b f154742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f154743q;

    public e(SignInWithRevolutIdFlowContract$InputData inputData, nkl.b revolutSsoFlowsFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        this.o = inputData;
        this.f154742p = revolutSsoFlowsFactory;
        hfb.d dVar = new hfb.d(this, 16);
        this.f154743q = cp5.d.a(this, SignInWithRevolutIdFlowContract$Step.f106753a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f154743q;
    }
}
