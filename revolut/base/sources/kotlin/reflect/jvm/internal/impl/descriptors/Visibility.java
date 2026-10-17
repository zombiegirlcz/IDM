package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Visibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f186545b;

    public Visibility(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f186544a = name;
        this.f186545b = z;
    }

    public Integer compareTo(@NotNull Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    @NotNull
    public String getInternalDisplayName() {
        return this.f186544a;
    }

    public final boolean isPublicAPI() {
        return this.f186545b;
    }

    @NotNull
    public Visibility normalize() {
        return this;
    }

    @NotNull
    public final String toString() {
        return getInternalDisplayName();
    }
}
