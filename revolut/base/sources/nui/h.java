package nui;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f219315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f219316b;

    public h(Data passData, Data termsUrlData) {
        Intrinsics.checkNotNullParameter(passData, "passData");
        Intrinsics.checkNotNullParameter(termsUrlData, "termsUrlData");
        this.f219315a = passData;
        this.f219316b = termsUrlData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f219315a, hVar.f219315a) && Intrinsics.f(this.f219316b, hVar.f219316b);
    }

    public final int hashCode() {
        return this.f219316b.hashCode() + (this.f219315a.hashCode() * 31);
    }
}
