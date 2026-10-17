package vb2;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputTextDelegate.TextData f287369a;

    public m(InputTextDelegate.TextData textData) {
        Intrinsics.checkNotNullParameter(textData, "textData");
        this.f287369a = textData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f287369a, ((m) obj2).f287369a);
    }

    public final int hashCode() {
        return this.f287369a.hashCode();
    }
}
