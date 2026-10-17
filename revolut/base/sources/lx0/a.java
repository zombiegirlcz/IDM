package lx0;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f200502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f200503b;

    public a(ExoPlayer exoPlayer, b bVar) {
        this.f200502a = exoPlayer;
        this.f200503b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        this.f200502a.removeListener(this.f200503b);
        return Unit.f186387a;
    }
}
