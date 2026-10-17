package h0f;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputTextDelegate.TextData f148393a;

    public k(InputTextDelegate.TextData textData) {
        Intrinsics.checkNotNullParameter(textData, "textData");
        this.f148393a = textData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f148393a, ((k) obj2).f148393a);
    }

    public final int hashCode() {
        return this.f148393a.hashCode();
    }
}
