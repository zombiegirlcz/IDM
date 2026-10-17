package ip0;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lo0 implements no0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f165246a;

    public lo0(LayerDrawable mediaForeground) {
        Intrinsics.checkNotNullParameter(mediaForeground, "mediaForeground");
        this.f165246a = mediaForeground;
    }

    @Override // ip0.no0
    public final boolean a() {
        return true;
    }

    @Override // ip0.no0
    public final Drawable b(boolean z) {
        if (z) {
            return null;
        }
        return this.f165246a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof lo0) && Intrinsics.f(this.f165246a, ((lo0) obj2).f165246a);
    }

    public final int hashCode() {
        return this.f165246a.hashCode();
    }
}
