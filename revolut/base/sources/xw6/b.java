package xw6;

import com.revolut.core.ui_kit.views.navbar.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f309333a;

    public b(z story) {
        Intrinsics.checkNotNullParameter(story, "story");
        this.f309333a = story;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f309333a.equals(((b) obj2).f309333a);
    }

    public final int hashCode() {
        return this.f309333a.hashCode();
    }
}
