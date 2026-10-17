package p01;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f231447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f231448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f231449c;

    public p(SpannableStringBuilder text, int i, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f231447a = i;
        this.f231448b = text;
        this.f231449c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f231447a == pVar.f231447a && this.f231448b.equals(pVar.f231448b) && this.f231449c == pVar.f231449c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f231449c) + ((this.f231448b.hashCode() + (Integer.hashCode(this.f231447a) * 31)) * 31);
    }
}
