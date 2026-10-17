package cue;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108990c;
    public final String d;

    public c(String success, String error, String str, String str2) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f108988a = success;
        this.f108989b = error;
        this.f108990c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f108988a, cVar.f108988a) && Intrinsics.f(this.f108989b, cVar.f108989b) && Intrinsics.f(this.f108990c, cVar.f108990c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f108988a.hashCode() * 31, 31, this.f108989b);
        String str = this.f108990c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
