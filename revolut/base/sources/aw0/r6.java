package aw0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class r6 {

    @NotNull
    public static final q6 Companion = new q6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f10513a;

    public r6(ResourceImage resourceImage) {
        this.f10513a = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r6) && this.f10513a.equals(((r6) obj2).f10513a);
    }

    public final int hashCode() {
        return this.f10513a.hashCode() * 961;
    }
}
