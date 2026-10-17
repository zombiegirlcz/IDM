package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.core.impl.TagBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"CAMERAX_TAG_BUNDLE", "Landroidx/camera/camera2/pipe/Metadata$Key;", "Landroidx/camera/core/impl/TagBundle;", "getCAMERAX_TAG_BUNDLE", "()Landroidx/camera/camera2/pipe/Metadata$Key;", "USE_CASE_CAMERA_STATE_CUSTOM_TAG", "", "getUSE_CASE_CAMERA_STATE_CUSTOM_TAG", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class TagsKt {

    @NotNull
    private static final Metadata.Key<TagBundle> CAMERAX_TAG_BUNDLE;

    @NotNull
    private static final Metadata.Key<Integer> USE_CASE_CAMERA_STATE_CUSTOM_TAG;

    static {
        Metadata.Key.Companion companion = Metadata.Key.INSTANCE;
        p0 p0Var = o0.f186429a;
        CAMERAX_TAG_BUNDLE = companion.create("camerax.tag_bundle", p0Var.b(TagBundle.class));
        USE_CASE_CAMERA_STATE_CUSTOM_TAG = companion.create("use_case_camera_state.tag", p0Var.b(Integer.class));
    }

    @NotNull
    public static final Metadata.Key<TagBundle> getCAMERAX_TAG_BUNDLE() {
        return CAMERAX_TAG_BUNDLE;
    }

    @NotNull
    public static final Metadata.Key<Integer> getUSE_CASE_CAMERA_STATE_CUSTOM_TAG() {
        return USE_CASE_CAMERA_STATE_CUSTOM_TAG;
    }
}
