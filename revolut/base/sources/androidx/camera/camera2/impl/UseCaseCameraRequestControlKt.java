package androidx.camera.camera2.impl;

import androidx.camera.core.impl.TagBundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/camera/core/impl/TagBundle;", "", "", "", "toMap", "(Landroidx/camera/core/impl/TagBundle;)Ljava/util/Map;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class UseCaseCameraRequestControlKt {
    @NotNull
    public static final Map<String, Object> toMap(@NotNull TagBundle tagBundle) {
        Intrinsics.checkNotNullParameter(tagBundle, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setListKeys = tagBundle.listKeys();
        Intrinsics.checkNotNullExpressionValue(setListKeys, "listKeys(...)");
        for (String str : setListKeys) {
            Object tag2 = tagBundle.getTag(str);
            Intrinsics.i(tag2, "null cannot be cast to non-null type kotlin.Any");
            linkedHashMap.put(str, tag2);
        }
        return linkedHashMap;
    }
}
