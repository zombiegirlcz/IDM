package c9d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f22357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22358b;

    public h(Data content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f22357a = content;
        this.f22358b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f22357a, hVar.f22357a) && this.f22358b == hVar.f22358b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22358b) + (this.f22357a.hashCode() * 31);
    }
}
