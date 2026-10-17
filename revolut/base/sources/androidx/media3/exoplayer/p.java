package androidx.media3.exoplayer;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.MediaPeriodHolder;
import androidx.media3.exoplayer.StreamVolumeManager;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class p implements ListenerSet.Event, MediaPeriodHolder.Factory, BackgroundThreadStateHandler.StateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7567b;

    public /* synthetic */ p(Object obj2, int i) {
        this.f7566a = i;
        this.f7567b = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        switch (this.f7566a) {
            case 0:
                ((Player.Listener) obj2).onTrackSelectionParametersChanged((TrackSelectionParameters) this.f7567b);
                break;
            case 1:
                ((Player.Listener) obj2).onAudioAttributesChanged((AudioAttributes) this.f7567b);
                break;
            case 2:
                ((Player.Listener) obj2).onCues((CueGroup) this.f7567b);
                break;
            case 3:
                ((ExoPlayerImpl.ComponentListener) this.f7567b).lambda$onMetadata$6((Player.Listener) obj2);
                break;
            case 4:
                ((Player.Listener) obj2).onMetadata((Metadata) this.f7567b);
                break;
            case 5:
                ((Player.Listener) obj2).onCues((List<Cue>) this.f7567b);
                break;
            default:
                ((Player.Listener) obj2).onDeviceInfoChanged((DeviceInfo) this.f7567b);
                break;
        }
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(Object obj2, Object obj3) {
        ((StreamVolumeManager) this.f7567b).onStreamVolumeStateChanged((StreamVolumeManager.StreamVolumeState) obj2, (StreamVolumeManager.StreamVolumeState) obj3);
    }
}
