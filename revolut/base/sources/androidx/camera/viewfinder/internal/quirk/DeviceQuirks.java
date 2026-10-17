package androidx.camera.viewfinder.internal.quirk;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class DeviceQuirks {

    @NonNull
    private static final Quirks QUIRKS = new Quirks(DeviceQuirksLoader.loadQuirks());

    public static <T extends Quirk> T get(@NonNull Class<T> cls) {
        return (T) QUIRKS.get(cls);
    }
}
