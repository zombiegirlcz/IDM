package dej;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f113682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f113683c;
    public final Boolean d;

    public w2(String str, Instant dueDate, dj0.d dVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        this.f113681a = str;
        this.f113682b = dueDate;
        this.f113683c = dVar;
        this.d = bool;
    }

    public static w2 a(w2 w2Var, String str, Boolean bool, int i) {
        if ((i & 1) != 0) {
            str = w2Var.f113681a;
        }
        Instant dueDate = w2Var.f113682b;
        dj0.d dVar = w2Var.f113683c;
        if ((i & 8) != 0) {
            bool = w2Var.d;
        }
        w2Var.getClass();
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        return new w2(str, dueDate, dVar, bool);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.f113681a, w2Var.f113681a) && Intrinsics.f(this.f113682b, w2Var.f113682b) && Intrinsics.f(this.f113683c, w2Var.f113683c) && Intrinsics.f(this.d, w2Var.d);
    }

    public final int hashCode() {
        String str = this.f113681a;
        int iC = r6.b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f113682b);
        dj0.d dVar = this.f113683c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
