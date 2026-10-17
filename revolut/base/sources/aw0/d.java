package aw0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f10272a;

    public d(ResourceImage icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f10272a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f10272a.equals(((d) obj2).f10272a);
    }

    public final int hashCode() {
        return org.bouncycastle.jcajce.provider.digest.a.b(this.f10272a, Boolean.hashCode(true) * 31, 31);
    }
}
