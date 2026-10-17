package k6a;

import com.revolut.data.model.Data;
import h93.g0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f181655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f181656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181657c;
    public final String d;
    public final g0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f181658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f181659h;

    public j() {
        this(false, 255);
    }

    public static j a(j jVar, Data data, List list, String str, String str2, g0 g0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            data = jVar.f181655a;
        }
        Data cardsContent = data;
        if ((i & 2) != 0) {
            list = jVar.f181656b;
        }
        List cardsDesigns = list;
        if ((i & 4) != 0) {
            str = jVar.f181657c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = jVar.d;
        }
        String str4 = str2;
        g0 g0Var2 = (i & 16) != 0 ? jVar.e : g0Var;
        boolean z3 = (i & 32) != 0 ? jVar.f : true;
        boolean z4 = (i & 64) != 0 ? jVar.f181658g : z;
        boolean z6 = jVar.f181659h;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(cardsContent, "cardsContent");
        Intrinsics.checkNotNullParameter(cardsDesigns, "cardsDesigns");
        return new j(cardsContent, cardsDesigns, str3, str4, g0Var2, z3, z4, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f181655a, jVar.f181655a) && Intrinsics.f(this.f181656b, jVar.f181656b) && Intrinsics.f(this.f181657c, jVar.f181657c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f && this.f181658g == jVar.f181658g && this.f181659h == jVar.f181659h;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f181655a.hashCode() * 31, 31, this.f181656b);
        String str = this.f181657c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        g0 g0Var = this.e;
        return Boolean.hashCode(this.f181659h) + j6.a.c(j6.a.c((iHashCode2 + (g0Var != null ? g0Var.hashCode() : 0)) * 31, 31, this.f), 31, this.f181658g);
    }

    public j(Data cardsContent, List cardsDesigns, String str, String str2, g0 g0Var, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(cardsContent, "cardsContent");
        Intrinsics.checkNotNullParameter(cardsDesigns, "cardsDesigns");
        this.f181655a = cardsContent;
        this.f181656b = cardsDesigns;
        this.f181657c = str;
        this.d = str2;
        this.e = g0Var;
        this.f = z;
        this.f181658g = z3;
        this.f181659h = z4;
    }

    public j(boolean z, int i) {
        this(new Data(null, null, true, 3, null), f0.f322471a, null, null, null, false, false, (i & 128) != 0 ? false : z);
    }
}
