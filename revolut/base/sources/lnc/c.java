package lnc;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f197140a;

    public c() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f197140a, ((c) obj2).f197140a);
    }

    public final int hashCode() {
        Data data = this.f197140a;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    public c(Data data) {
        this.f197140a = data;
    }
}
