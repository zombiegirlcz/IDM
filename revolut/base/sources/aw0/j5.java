package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j5 implements k5 {

    @NotNull
    public static final i5 Companion = new i5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f10371a;

    public j5(Image image) {
        this.f10371a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j5) && this.f10371a.equals(((j5) obj2).f10371a);
    }

    @Override // aw0.k5
    public final Clause getContentDescription() {
        return null;
    }

    public final int hashCode() {
        return this.f10371a.hashCode() * 31;
    }
}
