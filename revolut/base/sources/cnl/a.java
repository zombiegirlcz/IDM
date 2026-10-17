package cnl;

import com.revolut.sso.impl.ui.face_challenge.face_wait_confirm.FaceWaitConfirmScreen;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.z;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25466a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FaceWaitConfirmScreen f25467b;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25466a) {
            case 0:
                qji.b bVarQ2 = this.f25467b.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.face_challenge.face_wait_confirm.di.FaceWaitConfirmScreenInjector");
                ljl.c cVar = (ljl.c) bVarQ2;
                return new z(cVar.f, cVar.f195894g);
            default:
                return (c) ((z) this.f25467b.W.getValue()).f196149c.get();
        }
    }
}
