package p01;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f231450a;

    public q(SpannableStringBuilder text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f231450a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f231450a.equals(((q) obj2).f231450a);
    }

    public final int hashCode() {
        return this.f231450a.hashCode();
    }
}
