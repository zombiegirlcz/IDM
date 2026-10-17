package vy3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f293126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f293127c;
    public final String d;
    public final String e;
    public final String f;

    public a(String id10, a1 a1Var, String title, String description, String value, String valueDescription) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(valueDescription, "valueDescription");
        this.f293125a = id10;
        this.f293126b = a1Var;
        this.f293127c = title;
        this.d = description;
        this.e = value;
        this.f = valueDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f293125a, aVar.f293125a) && this.f293126b == aVar.f293126b && Intrinsics.f(this.f293127c, aVar.f293127c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f293125a.hashCode() * 31;
        a1 a1Var = this.f293126b;
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c((iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31, 31, this.f293127c), 31, this.d), 31, this.e);
    }
}
