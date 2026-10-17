package wua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300093b;

    public a(String id10, String currency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f300092a = id10;
        this.f300093b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f300092a, aVar.f300092a) && Intrinsics.f(this.f300093b, aVar.f300093b);
    }

    public final int hashCode() {
        return this.f300093b.hashCode() + (this.f300092a.hashCode() * 31);
    }
}
