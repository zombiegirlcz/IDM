package lki;

import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitionAnimation.ViewDelegated f196452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.revolut.kompot.navigable.c f196453b;

    public a0(TransitionAnimation.ViewDelegated animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f196452a = animation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.view.View, java.lang.Object] */
    @Override // lki.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r17, android.view.View r18, boolean r19, lki.z r20) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lki.a0.e(android.view.View, android.view.View, boolean, lki.z):void");
    }

    @Override // lki.x
    public final void g() {
        com.revolut.kompot.navigable.c cVar = this.f196453b;
        if (cVar != null) {
            cVar.setTransitionListener(null);
        }
        this.f196453b = null;
    }
}
