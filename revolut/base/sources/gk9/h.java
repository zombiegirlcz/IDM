package gk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f144356a;

    public h(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f144356a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f144356a, ((h) obj2).f144356a);
    }

    public final int hashCode() {
        return this.f144356a.hashCode();
    }
}
