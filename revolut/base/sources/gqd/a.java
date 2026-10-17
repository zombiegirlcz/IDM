package gqd;

import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f145673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IncomeSorterDestinationInfo f145674c;

    public a(boolean z, dj0.d value, IncomeSorterDestinationInfo destinationInfo) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(destinationInfo, "destinationInfo");
        this.f145672a = z;
        this.f145673b = value;
        this.f145674c = destinationInfo;
    }

    @Override // gqd.c
    public final boolean a() {
        return this.f145672a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f145672a == aVar.f145672a && Intrinsics.f(this.f145673b, aVar.f145673b) && Intrinsics.f(this.f145674c, aVar.f145674c);
    }

    @Override // gqd.c
    public final dj0.d getValue() {
        return this.f145673b;
    }

    public final int hashCode() {
        return this.f145674c.hashCode() + v7.c(Boolean.hashCode(this.f145672a) * 31, 31, this.f145673b);
    }
}
