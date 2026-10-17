package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f166848a;

    public vm(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f166848a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vm) && this.f166848a.equals(((vm) obj2).f166848a);
    }

    public final int hashCode() {
        return this.f166848a.hashCode();
    }
}
