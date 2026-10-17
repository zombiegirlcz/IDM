package e80;

import android.text.style.BulletSpan;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f123553a;

    public m(Function0 toSpanInstanceProvider) {
        Intrinsics.checkNotNullParameter(BulletSpan.class, "fromSpanClass");
        Intrinsics.checkNotNullParameter(toSpanInstanceProvider, "toSpanInstanceProvider");
        this.f123553a = toSpanInstanceProvider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof m) {
            return BulletSpan.class.equals(BulletSpan.class) && this.f123553a.equals(((m) obj2).f123553a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f123553a.hashCode() + (BulletSpan.class.hashCode() * 31);
    }
}
