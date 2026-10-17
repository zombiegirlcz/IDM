package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util;

import android.media.AudioManager;
import androidx.media3.common.audio.AudioFocusManager;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49899b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f49898a = i;
        this.f49899b = obj2;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        switch (this.f49898a) {
            case 0:
                AudioFocusHelper.audioChangeListener$lambda$0((AudioFocusHelper) this.f49899b, i);
                break;
            default:
                ((AudioFocusManager) this.f49899b).handlePlatformAudioFocusChange(i);
                break;
        }
    }
}
