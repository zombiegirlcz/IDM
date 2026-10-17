package gw0;

import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileImage f147235a;

    public d(FileImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f147235a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f147235a.equals(((d) obj2).f147235a);
    }

    public final int hashCode() {
        return this.f147235a.hashCode();
    }
}
