package sf9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f262383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f262384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f262385c;
    public final List d;
    public final Map e;

    public j() {
        this(0);
    }

    public static j a(j jVar, Biller biller, List list, HashMap map, int i) {
        jVar.getClass();
        if ((i & 2) != 0) {
            biller = jVar.f262383a;
        }
        Biller biller2 = biller;
        String label = jVar.f262384b;
        String str = (i & 8) != 0 ? jVar.f262385c : "LABEL";
        if ((i & 16) != 0) {
            list = jVar.d;
        }
        List additionalDefinitions = list;
        Map map2 = map;
        if ((i & 32) != 0) {
            map2 = jVar.e;
        }
        Map additionalValues = map2;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(additionalDefinitions, "additionalDefinitions");
        Intrinsics.checkNotNullParameter(additionalValues, "additionalValues");
        return new j(biller2, label, str, additionalDefinitions, additionalValues);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f262383a, jVar.f262383a) && Intrinsics.f(this.f262384b, jVar.f262384b) && Intrinsics.f(this.f262385c, jVar.f262385c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        Biller biller = this.f262383a;
        int iC = p.a.c((biller == null ? 0 : biller.hashCode()) * 31, 31, this.f262384b);
        String str = this.f262385c;
        return this.e.hashCode() + p.a.d((iC + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }

    public j(Biller biller, String label, String str, List additionalDefinitions, Map additionalValues) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(additionalDefinitions, "additionalDefinitions");
        Intrinsics.checkNotNullParameter(additionalValues, "additionalValues");
        this.f262383a = biller;
        this.f262384b = label;
        this.f262385c = str;
        this.d = additionalDefinitions;
        this.e = additionalValues;
    }

    public j(int i) {
        this(null, "", null, f0.f322471a, r0.g());
    }
}
