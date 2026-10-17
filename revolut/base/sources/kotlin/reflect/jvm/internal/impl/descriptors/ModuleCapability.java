package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ModuleCapability<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186528a;

    public ModuleCapability(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f186528a = name;
    }

    @NotNull
    public String toString() {
        return this.f186528a;
    }
}
