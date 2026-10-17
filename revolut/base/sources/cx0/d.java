package cx0;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements jq0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Animator f109880a;

    public d(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f109880a = animator;
    }

    @Override // jq0.d
    public final Animator a() {
        return this.f109880a;
    }
}
