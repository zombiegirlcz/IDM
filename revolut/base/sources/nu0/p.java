package nu0;

import android.widget.SeekBar;
import com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView;
import nu0.g;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RichVideoPlayerControlsView f219190a;

    public p(RichVideoPlayerControlsView richVideoPlayerControlsView) {
        this.f219190a = richVideoPlayerControlsView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f219190a.k.onNext(new f(i, z, false));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f219190a.k.onNext(g.a.f219184a);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f219190a.k.onNext(g.b.f219185a);
    }
}
