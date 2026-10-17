package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn;

import android.graphics.Color;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toRgbString", "", "", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OnfidoAnimWebViewKt {
    @NotNull
    public static final String toRgbString(int i) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Color.red(i));
        sb6.append(CoreConstants.COMMA_CHAR);
        sb6.append(Color.green(i));
        sb6.append(CoreConstants.COMMA_CHAR);
        sb6.append(Color.blue(i));
        return sb6.toString();
    }
}
