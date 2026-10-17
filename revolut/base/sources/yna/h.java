package yna;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f315342a;

    public h(Data campaignData) {
        Intrinsics.checkNotNullParameter(campaignData, "campaignData");
        this.f315342a = campaignData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f315342a, ((h) obj2).f315342a);
    }

    public final int hashCode() {
        return this.f315342a.hashCode();
    }
}
