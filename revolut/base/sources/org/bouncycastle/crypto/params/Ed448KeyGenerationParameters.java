package org.bouncycastle.crypto.params;

import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes14.dex */
public class Ed448KeyGenerationParameters extends KeyGenerationParameters {
    public Ed448KeyGenerationParameters(SecureRandom secureRandom) {
        super(secureRandom, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }
}
