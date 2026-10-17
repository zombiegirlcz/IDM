package com.onfido.android.sdk.capture.ui.camera.view;

import android.media.MediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/MediaPlayer;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class AutoPlayVideoView$mediaPlayer$2 extends u implements Function0<MediaPlayer> {
    public static final AutoPlayVideoView$mediaPlayer$2 INSTANCE = new AutoPlayVideoView$mediaPlayer$2();

    public AutoPlayVideoView$mediaPlayer$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MediaPlayer invoke() {
        return new MediaPlayer();
    }
}
