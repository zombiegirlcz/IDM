package ibd;

import h30.l;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f160146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f160147c;

    public a(String id10, xi0.b currency, b type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f160145a = id10;
        this.f160146b = currency;
        this.f160147c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f160145a, aVar.f160145a) && Intrinsics.f(this.f160146b, aVar.f160146b) && this.f160147c == aVar.f160147c;
    }

    public final int hashCode() {
        return this.f160147c.hashCode() + l.j(this.f160146b, this.f160145a.hashCode() * 31, 31);
    }
}
