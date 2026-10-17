package sy;

import android.net.Uri;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f266539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f266540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Locale f266541c;
    public final boolean d;

    public d(Uri fileUri, boolean z, Locale locale, boolean z3) {
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        this.f266539a = fileUri;
        this.f266540b = z;
        this.f266541c = locale;
        this.d = z3;
    }

    public static d a(d dVar, boolean z, int i) {
        Uri fileUri = dVar.f266539a;
        boolean z3 = (i & 2) != 0 ? dVar.f266540b : false;
        Locale locale = dVar.f266541c;
        if ((i & 8) != 0) {
            z = dVar.d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        return new d(fileUri, z3, locale, z);
    }

    @Override // sy.e
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f266539a, dVar.f266539a) && this.f266540b == dVar.f266540b && Intrinsics.f(this.f266541c, dVar.f266541c) && this.d == dVar.d;
    }

    @Override // sy.e
    public final Locale f0() {
        return this.f266541c;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f266539a.hashCode() * 31, 31, this.f266540b);
        Locale locale = this.f266541c;
        return Boolean.hashCode(this.d) + ((iC + (locale == null ? 0 : locale.hashCode())) * 31);
    }
}
