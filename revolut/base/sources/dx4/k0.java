package dx4;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 implements c1 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120645a;

    public k0(int i) {
        this.f120645a = i;
    }

    @Override // dx4.c1
    public final Image T1() {
        return com.revolut.core.ui_kit_core.displayers.image.models.a.b(this.f120645a, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && this.f120645a == ((k0) obj2).f120645a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120645a);
    }
}
