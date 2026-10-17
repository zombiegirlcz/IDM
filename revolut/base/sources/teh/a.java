package teh;

import h30.l;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f270097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f270098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f270099c;
    public final ArrayList d;
    public final String e;
    public final String f;

    public a(String instrumentRef, LocalDate expirationDate, xi0.b currency, ArrayList options, String str, String str2) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f270097a = instrumentRef;
        this.f270098b = expirationDate;
        this.f270099c = currency;
        this.d = options;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f270097a, aVar.f270097a) && this.f270098b.equals(aVar.f270098b) && this.f270099c.equals(aVar.f270099c) && this.d.equals(aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, l.j(this.f270099c, y.a(this.f270097a.hashCode() * 31, 31, this.f270098b), 31), 31);
        String str = this.e;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
