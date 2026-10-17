package bj8;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f15583a;

    public b(Data cardProfile) {
        Intrinsics.checkNotNullParameter(cardProfile, "cardProfile");
        this.f15583a = cardProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f15583a, ((b) obj2).f15583a);
    }

    public final int hashCode() {
        return this.f15583a.hashCode();
    }
}
