package bta;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18486c;
    public final String d;

    public /* synthetic */ d(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(b.f18483a.getDescriptor(), i, 15);
            throw null;
        }
        this.f18484a = str;
        this.f18485b = str2;
        this.f18486c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f18484a, dVar.f18484a) && Intrinsics.f(this.f18485b, dVar.f18485b) && Intrinsics.f(this.f18486c, dVar.f18486c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f18484a.hashCode() * 31, 31, this.f18485b);
        String str = this.f18486c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public d(String assetUrl, String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18484a = assetUrl;
        this.f18485b = title;
        this.f18486c = str;
        this.d = str2;
    }
}
