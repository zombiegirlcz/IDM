package c1e;

import dj0.d;
import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f20460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f20461c;

    public a(String id10, d amount, DateTime completedAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(completedAt, "completedAt");
        this.f20459a = id10;
        this.f20460b = amount;
        this.f20461c = completedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f20459a, aVar.f20459a) && Intrinsics.f(this.f20460b, aVar.f20460b) && Intrinsics.f(this.f20461c, aVar.f20461c);
    }

    public final int hashCode() {
        return this.f20461c.hashCode() + v7.c(this.f20459a.hashCode() * 31, 31, this.f20460b);
    }
}
