package er;

import com.revolut.camerakit.client.api.models.PhotoMaximumResolution;

/* JADX INFO: loaded from: classes17.dex */
public abstract class g {
    public static final PhotoMaximumResolution a(Integer num) {
        return num == null ? PhotoMaximumResolution.Default.f50731a : new PhotoMaximumResolution.Custom(num.intValue());
    }
}
