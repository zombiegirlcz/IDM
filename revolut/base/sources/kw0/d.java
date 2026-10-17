package kw0;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground.ImageBackground f190186a;

    public d(NavBarWithContainerBackground.ImageBackground background) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f190186a = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f190186a.equals(((d) obj2).f190186a);
    }

    @Override // kw0.f
    public final NavBarWithContainerBackground getBackground() {
        return this.f190186a;
    }

    public final int hashCode() {
        return this.f190186a.hashCode();
    }

    @Override // kw0.f
    public final AvatarModel v() {
        ColorImage.INSTANCE.getClass();
        return new AvatarModel.Default(ColorImage.Companion.a(), null, null, null, null, null, 126);
    }
}
