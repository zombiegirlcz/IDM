package tw0;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f274824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Animator f274825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f274826c;

    public j0(m1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f274824a = callback;
    }
}
