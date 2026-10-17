package er;

import com.revolut.camerakit.client.api.models.PhotoCompressionQuality;

/* JADX INFO: loaded from: classes17.dex */
public abstract class f {
    public static final PhotoCompressionQuality a(Float f) {
        return f == null ? PhotoCompressionQuality.Default.f50729a : new PhotoCompressionQuality.Custom(kotlin.ranges.f.g((int) (f.floatValue() * 100), 1, 100));
    }
}
