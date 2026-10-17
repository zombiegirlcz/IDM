package zve;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325667c;
    public final String d;

    public a(String success, String error, String str, String str2) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f325665a = success;
        this.f325666b = error;
        this.f325667c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f325665a, aVar.f325665a) && Intrinsics.f(this.f325666b, aVar.f325666b) && Intrinsics.f(this.f325667c, aVar.f325667c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f325665a.hashCode() * 31, 31, this.f325666b);
        String str = this.f325667c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
