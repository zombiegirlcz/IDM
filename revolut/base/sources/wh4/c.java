package wh4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f297396a;

    public c(Data screenContent) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        this.f297396a = screenContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f297396a, ((c) obj2).f297396a);
    }

    public final int hashCode() {
        return this.f297396a.hashCode();
    }
}
