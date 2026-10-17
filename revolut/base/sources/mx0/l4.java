package mx0;

import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.revolut.core.ui_kit.internal.views.chat.WaveformSeekBarView;
import com.revolut.core.ui_kit.views.ChatInputView;

/* JADX INFO: loaded from: classes20.dex */
public final class l4 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChatInputView f209800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f209801b;

    public l4(ChatInputView chatInputView, float f) {
        this.f209800a = chatInputView;
        this.f209801b = f;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        view.removeOnLayoutChangeListener(this);
        ChatInputView chatInputView = this.f209800a;
        WaveformSeekBarView waveformSeekBar = chatInputView.getWaveformSeekBar();
        float x3 = chatInputView.getWaveformSeekBar().getX();
        float f = this.f209801b;
        waveformSeekBar.setPivotX(-(x3 - f));
        ChatInputView.A(chatInputView, chatInputView.getWaveformSeekBar(), 300L, new OvershootInterpolator(), 2).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
        chatInputView.getWaveformSeekBarTimer().setPivotX(-(chatInputView.getWaveformSeekBarTimer().getX() - f));
        ChatInputView.A(chatInputView, chatInputView.getWaveformSeekBarTimer(), 300L, new OvershootInterpolator(), 2).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
    }
}
