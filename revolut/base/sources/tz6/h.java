package tz6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f275876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275877b;

    public h() {
        this(0);
    }

    public static h a(h hVar, Data rewardData, boolean z, int i) {
        if ((i & 1) != 0) {
            rewardData = hVar.f275876a;
        }
        if ((i & 2) != 0) {
            z = hVar.f275877b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(rewardData, "rewardData");
        return new h(rewardData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f275876a, hVar.f275876a) && this.f275877b == hVar.f275877b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275877b) + (this.f275876a.hashCode() * 31);
    }

    public h(Data rewardData, boolean z) {
        Intrinsics.checkNotNullParameter(rewardData, "rewardData");
        this.f275876a = rewardData;
        this.f275877b = z;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null), false);
    }
}
