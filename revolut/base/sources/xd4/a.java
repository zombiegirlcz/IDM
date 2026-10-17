package xd4;

import com.revolut.data.model.Data;
import hs3.z1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f304255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f304256b;

    public a(z1 metadata, Data ticketProgression) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(ticketProgression, "ticketProgression");
        this.f304255a = metadata;
        this.f304256b = ticketProgression;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f304255a, aVar.f304255a) && Intrinsics.f(this.f304256b, aVar.f304256b);
    }

    public final int hashCode() {
        return this.f304256b.hashCode() + (this.f304255a.hashCode() * 31);
    }
}
