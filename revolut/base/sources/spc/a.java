package spc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextDelegate f264943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButtonDelegate f264944b;

    public a(TextDelegate textDelegate, LargeActionButtonDelegate largeActionButtonDelegate) {
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(largeActionButtonDelegate, "largeActionButtonDelegate");
        this.f264943a = textDelegate;
        this.f264944b = largeActionButtonDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f264943a, aVar.f264943a) && Intrinsics.f(this.f264944b, aVar.f264944b);
    }

    public final int hashCode() {
        return this.f264944b.hashCode() + (this.f264943a.hashCode() * 31);
    }
}
