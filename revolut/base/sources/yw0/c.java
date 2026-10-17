package yw0;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends n14.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f317251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f317252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f317253c;

    public c(long j2, UrlImage image, boolean z) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f317251a = z;
        this.f317252b = image;
        this.f317253c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f317251a == cVar.f317251a && this.f317252b.equals(cVar.f317252b) && kotlin.time.b.d(this.f317253c, cVar.f317253c);
    }

    public final int hashCode() {
        int iG = v7.g(this.f317252b, Boolean.hashCode(this.f317251a) * 31, 31);
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f317253c) + iG;
    }

    @Override // n14.e
    public final boolean q() {
        return this.f317251a;
    }
}
