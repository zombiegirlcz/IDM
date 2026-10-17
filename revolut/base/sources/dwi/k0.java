package dwi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final svi.a f120436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120438c;
    public final String d;

    public k0(svi.a airport, String normalizedName, String normalizedCityName, String normalizedCountryName) {
        Intrinsics.checkNotNullParameter(airport, "airport");
        Intrinsics.checkNotNullParameter(normalizedName, "normalizedName");
        Intrinsics.checkNotNullParameter(normalizedCityName, "normalizedCityName");
        Intrinsics.checkNotNullParameter(normalizedCountryName, "normalizedCountryName");
        this.f120436a = airport;
        this.f120437b = normalizedName;
        this.f120438c = normalizedCityName;
        this.d = normalizedCountryName;
    }
}
