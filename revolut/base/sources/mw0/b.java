package mw0;

import com.revolut.core.ui_kit_core.displayers.image.models.EmojiImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmojiImage f209281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu9.h f209283c;

    public b(EmojiImage image, boolean z, fu9.h hVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f209281a = image;
        this.f209282b = z;
        this.f209283c = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f209281a.equals(bVar.f209281a) && this.f209282b == bVar.f209282b && this.f209283c.equals(bVar.f209283c);
    }

    public final int hashCode() {
        return this.f209283c.hashCode() + j6.a.c(this.f209281a.hashCode() * 31, 31, this.f209282b);
    }
}
