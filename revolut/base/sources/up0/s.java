package up0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f281758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f281759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f281760c;
    public final int[] d;
    public float e;
    public float f;

    public s(q0 particlesView) {
        Intrinsics.checkNotNullParameter(particlesView, "particlesView");
        this.f281758a = particlesView;
        this.f281760c = new int[2];
        this.d = new int[2];
    }
}
