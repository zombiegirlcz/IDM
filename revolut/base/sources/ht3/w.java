package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f155314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155315b;

    public w(a action, String title) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f155314a = action;
        this.f155315b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f155314a, wVar.f155314a) && Intrinsics.f(this.f155315b, wVar.f155315b);
    }

    public final int hashCode() {
        return this.f155315b.hashCode() + (this.f155314a.hashCode() * 31);
    }
}
