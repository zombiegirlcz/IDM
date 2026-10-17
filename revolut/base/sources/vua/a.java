package vua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292281c;
    public final String d;
    public final String e;
    public final String f;

    public a(String id10, String firstName, String lastName, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f292279a = id10;
        this.f292280b = firstName;
        this.f292281c = lastName;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final String a() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f292280b, " ", this.f292281c);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f292279a, aVar.f292279a) && Intrinsics.f(this.f292280b, aVar.f292280b) && Intrinsics.f(this.f292281c, aVar.f292281c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final String getCode() {
        return this.f;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f292279a.hashCode() * 31, 31, this.f292280b), 31, this.f292281c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
