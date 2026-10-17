package p01;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements k01.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f231454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k01.c f231455b;

    public t(SpannableStringBuilder text, k01.c cVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f231454a = text;
        this.f231455b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f231454a.equals(tVar.f231454a) && this.f231455b.equals(tVar.f231455b);
    }

    public final int hashCode() {
        return this.f231455b.f179898a.hashCode() + (this.f231454a.hashCode() * 31);
    }
}
