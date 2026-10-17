package uf7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f279609a;

    public k() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f279609a, ((k) obj2).f279609a);
    }

    public final int hashCode() {
        return this.f279609a.hashCode();
    }

    public k(Data incentiveRewardDetailsContentData) {
        Intrinsics.checkNotNullParameter(incentiveRewardDetailsContentData, "incentiveRewardDetailsContentData");
        this.f279609a = incentiveRewardDetailsContentData;
    }

    public /* synthetic */ k(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
