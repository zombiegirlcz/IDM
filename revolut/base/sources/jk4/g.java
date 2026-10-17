package jk4;

import com.revolut.data.model.Data;
import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f175070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f175071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f175072c;
    public final boolean d;
    public final String e;

    public g(Data repaymentSource, dj0.d amount, ArrayList suggestions, boolean z, String str) {
        Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f175070a = repaymentSource;
        this.f175071b = amount;
        this.f175072c = suggestions;
        this.d = z;
        this.e = str;
    }

    public static g a(g gVar, Data data, dj0.d dVar, String str, int i) {
        if ((i & 1) != 0) {
            data = gVar.f175070a;
        }
        Data repaymentSource = data;
        if ((i & 2) != 0) {
            dVar = gVar.f175071b;
        }
        dj0.d amount = dVar;
        ArrayList suggestions = gVar.f175072c;
        boolean z = gVar.d;
        if ((i & 16) != 0) {
            str = gVar.e;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new g(repaymentSource, amount, suggestions, z, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f175070a, gVar.f175070a) && Intrinsics.f(this.f175071b, gVar.f175071b) && this.f175072c.equals(gVar.f175072c) && this.d == gVar.d && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f175072c, v7.c(this.f175070a.hashCode() * 31, 31, this.f175071b), 31), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
