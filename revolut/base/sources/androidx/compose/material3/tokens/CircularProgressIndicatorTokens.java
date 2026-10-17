package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/tokens/CircularProgressIndicatorTokens;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "ActiveThickness", "F", "getActiveThickness-D9Ej5fM", "()F", "ActiveWaveAmplitude", "getActiveWaveAmplitude-D9Ej5fM", "ActiveWaveWavelength", "getActiveWaveWavelength-D9Ej5fM", "Size", "getSize-D9Ej5fM", "TrackActiveSpace", "getTrackActiveSpace-D9Ej5fM", "TrackThickness", "getTrackThickness-D9Ej5fM", "WaveSize", "getWaveSize-D9Ej5fM", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CircularProgressIndicatorTokens {
    private static final float ActiveThickness;
    private static final float TrackActiveSpace;
    private static final float TrackThickness;

    @NotNull
    public static final CircularProgressIndicatorTokens INSTANCE = new CircularProgressIndicatorTokens();
    private static final float ActiveWaveAmplitude = Dp.m3297constructorimpl((float) 1.6d);
    private static final float ActiveWaveWavelength = Dp.m3297constructorimpl((float) 15.0d);
    private static final float Size = Dp.m3297constructorimpl((float) 40.0d);
    private static final float WaveSize = Dp.m3297constructorimpl((float) 48.0d);

    static {
        float f = (float) 4.0d;
        ActiveThickness = Dp.m3297constructorimpl(f);
        TrackActiveSpace = Dp.m3297constructorimpl(f);
        TrackThickness = Dp.m3297constructorimpl(f);
    }

    private CircularProgressIndicatorTokens() {
    }

    /* JADX INFO: renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m1437getSizeD9Ej5fM() {
        return Size;
    }

    /* JADX INFO: renamed from: getTrackActiveSpace-D9Ej5fM, reason: not valid java name */
    public final float m1438getTrackActiveSpaceD9Ej5fM() {
        return TrackActiveSpace;
    }

    /* JADX INFO: renamed from: getTrackThickness-D9Ej5fM, reason: not valid java name */
    public final float m1439getTrackThicknessD9Ej5fM() {
        return TrackThickness;
    }
}
