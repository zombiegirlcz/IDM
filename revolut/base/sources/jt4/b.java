package jt4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f178338a;

    public b(Data dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f178338a = dialog;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f178338a, ((b) obj2).f178338a);
    }

    public final int hashCode() {
        return this.f178338a.hashCode();
    }
}
