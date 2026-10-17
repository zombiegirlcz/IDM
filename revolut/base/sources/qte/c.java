package qte;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends g implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249101c;
    public final String d;
    public final b e;
    public final b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dj0.d feeMoney, String str, String title, b fees, b taxes) {
        super(feeMoney);
        Intrinsics.checkNotNullParameter(feeMoney, "feeMoney");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f249100b = feeMoney;
        this.f249101c = str;
        this.d = title;
        this.e = fees;
        this.f = taxes;
    }

    @Override // qte.g
    public final String a() {
        return this.f249101c;
    }

    @Override // qte.g
    public final dj0.d b() {
        return this.f249100b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f249100b, cVar.f249100b) && Intrinsics.f(this.f249101c, cVar.f249101c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f249100b.hashCode() * 31;
        String str = this.f249101c;
        return this.f.hashCode() + ((this.e.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31);
    }
}
