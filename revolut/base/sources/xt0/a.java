package xt0;

import androidx.lifecycle.LifecycleObserver;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f308736a = new LinkedHashSet();

    public final void a(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.f308736a.add(player);
    }
}
