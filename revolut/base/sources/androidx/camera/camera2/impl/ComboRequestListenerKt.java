package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.impl.TagBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"containsTag", "", "Landroidx/camera/camera2/pipe/RequestMetadata;", "tagKey", "", "tagValue", "", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class ComboRequestListenerKt {
    public static final boolean containsTag(@NotNull RequestMetadata requestMetadata, @NotNull String tagKey, @NotNull Object tagValue) {
        Intrinsics.checkNotNullParameter(requestMetadata, "<this>");
        Intrinsics.checkNotNullParameter(tagKey, "tagKey");
        Intrinsics.checkNotNullParameter(tagValue, "tagValue");
        return Intrinsics.f(((TagBundle) requestMetadata.getOrDefault(TagsKt.getCAMERAX_TAG_BUNDLE(), TagBundle.emptyBundle())).getTag(tagKey), tagValue);
    }
}
