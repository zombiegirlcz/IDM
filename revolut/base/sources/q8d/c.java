package q8d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f243054a;

    public c(Data actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f243054a = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f243054a, ((c) obj2).f243054a);
    }

    public final int hashCode() {
        return this.f243054a.hashCode();
    }
}
