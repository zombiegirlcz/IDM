package ht3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f155304b;

    public r(String str, ArrayList images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f155303a = str;
        this.f155304b = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f155303a, rVar.f155303a) && this.f155304b.equals(rVar.f155304b);
    }

    public final int hashCode() {
        String str = this.f155303a;
        return this.f155304b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
