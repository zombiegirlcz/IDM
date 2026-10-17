package ov7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f229973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f229974b;

    public j(Data layout, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f229973a = layout;
        this.f229974b = z;
    }

    public static j a(j jVar, Data layout, boolean z, int i) {
        if ((i & 1) != 0) {
            layout = jVar.f229973a;
        }
        if ((i & 2) != 0) {
            z = jVar.f229974b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new j(layout, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f229973a, jVar.f229973a) && this.f229974b == jVar.f229974b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f229974b) + (this.f229973a.hashCode() * 31);
    }
}
