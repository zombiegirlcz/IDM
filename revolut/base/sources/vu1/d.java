package vu1;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f292191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292193c;
    public final String d;

    public d(Data termsData, int i, String title, String str) {
        Intrinsics.checkNotNullParameter(termsData, "termsData");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f292191a = termsData;
        this.f292192b = i;
        this.f292193c = title;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f292191a, dVar.f292191a) && this.f292192b == dVar.f292192b && Intrinsics.f(this.f292193c, dVar.f292193c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.b(this.f292192b, this.f292191a.hashCode() * 31, 31), 31, this.f292193c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
