package com.onfido.android.sdk.capture.ui.camera.liveness.turn;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.MovementType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/turn/LivenessProgressManager;", "", "()V", "isFirstMovementHalf", "", "angleToProgress", "", "angle", "movementType", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/MovementType;", "isFirstHalf", "updateStateIfNeeded", "", "progress", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LivenessProgressManager {
    private static final int ANGLE_MULTIPLIER = 2;
    public static final float FIRST_HALF_TURN_LEFT_MAX_ANGLE = -60.0f;
    public static final float FIRST_HALF_TURN_RIGHT_MAX_ANGLE = 60.0f;
    private static final float HALF_MAX_PROGRESS = 1.0f;
    private static final float SECOND_HALF_TURN_LEFT_MAX_ANGLE = -30.0f;
    private static final float SECOND_HALF_TURN_RIGHT_MAX_ANGLE = 30.0f;
    private boolean isFirstMovementHalf = true;

    public float angleToProgress(float angle, @NotNull MovementType movementType) {
        Intrinsics.checkNotNullParameter(movementType, "movementType");
        boolean z = this.isFirstMovementHalf;
        return (z && movementType == MovementType.TURN_RIGHT) ? Math.min((angle * 2) / 60.0f, 1.0f) : (z && movementType == MovementType.TURN_LEFT) ? Math.min((angle * 2) / (-60.0f), 1.0f) : (z || movementType != MovementType.TURN_RIGHT) ? (z || movementType != MovementType.TURN_LEFT) ? BitmapDescriptorFactory.HUE_RED : Math.min(Math.max((-60.0f) - Math.max(angle * 2, -60.0f), SECOND_HALF_TURN_LEFT_MAX_ANGLE) / SECOND_HALF_TURN_LEFT_MAX_ANGLE, 1.0f) : Math.min(Math.min(60.0f - Math.min(angle * 2, 60.0f), 30.0f) / 30.0f, 1.0f);
    }

    /* JADX INFO: renamed from: isFirstHalf, reason: from getter */
    public boolean getIsFirstMovementHalf() {
        return this.isFirstMovementHalf;
    }

    public void updateStateIfNeeded(float progress) {
        if (progress == 1.0f && getIsFirstMovementHalf()) {
            this.isFirstMovementHalf = false;
        }
    }
}
