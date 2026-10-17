package r70;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vibrator f251971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager f251972b;

    public e(Vibrator vibrator, AudioManager audioManager, n80.b buildInfo) {
        Intrinsics.checkNotNullParameter(vibrator, "vibrator");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        this.f251971a = vibrator;
        this.f251972b = audioManager;
    }

    public final void c(b effect, boolean z) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        int ringerMode = this.f251972b.getRingerMode();
        if (ringerMode == 1 || ringerMode == 2) {
            Vibrator vibrator = this.f251971a;
            if (!z) {
                if (Build.VERSION.SDK_INT <= 29) {
                    return;
                }
                int iAreAllEffectsSupported = vibrator.areAllEffectsSupported(2);
                if (iAreAllEffectsSupported != 1 && iAreAllEffectsSupported != 0) {
                    return;
                }
            }
            int i = Build.VERSION.SDK_INT;
            int i2 = d.f251970a[effect.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 100, 300, 100}, -1));
                    return;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vibrator.vibrate(VibrationEffect.createOneShot(300L, -1));
                    return;
                }
            }
            Activity activityC = h80.c.c();
            if (i < 29) {
                vibrator.vibrate(VibrationEffect.createOneShot(1L, -1));
            } else if (activityC != null) {
                activityC.getWindow().getDecorView().performHapticFeedback(3, 2);
            } else {
                vibrator.vibrate(VibrationEffect.createPredefined(2));
            }
        }
    }
}
