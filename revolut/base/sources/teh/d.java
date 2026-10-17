package teh;

import h30.l;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f270103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f270104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f270105c;
    public final ArrayList d;
    public final String e;
    public final String f;

    public d(String instrumentRef, LocalDate expirationDate, xi0.b currency, ArrayList options, String str, String str2) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f270103a = instrumentRef;
        this.f270104b = expirationDate;
        this.f270105c = currency;
        this.d = options;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f270103a, dVar.f270103a) && this.f270104b.equals(dVar.f270104b) && this.f270105c.equals(dVar.f270105c) && this.d.equals(dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, l.j(this.f270105c, y.a(this.f270103a.hashCode() * 31, 31, this.f270104b), 31), 31);
        String str = this.e;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
