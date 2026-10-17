package oll;

import cli.o;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f226460b;

    public i(String str, Image fallbackImage) {
        Intrinsics.checkNotNullParameter(fallbackImage, "fallbackImage");
        this.f226459a = str;
        this.f226460b = fallbackImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f226459a, iVar.f226459a) && Intrinsics.f(this.f226460b, iVar.f226460b);
    }

    public final int hashCode() {
        String str = this.f226459a;
        return this.f226460b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
