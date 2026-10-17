package gvc;

import com.revolut.data.model.Data;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f147127c;
    public final Map d;
    public final Map e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f147128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f147129h;
    public final boolean i;

    public g() {
        this(null, 511);
    }

    public static g a(g gVar, List list, List list2, Data data, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, Map map, Integer num, boolean z, int i) {
        if ((i & 1) != 0) {
            list = gVar.f147125a;
        }
        List cards = list;
        if ((i & 2) != 0) {
            list2 = gVar.f147126b;
        }
        List devices = list2;
        if ((i & 4) != 0) {
            data = gVar.f147127c;
        }
        Data esims = data;
        Map map2 = linkedHashMap;
        if ((i & 8) != 0) {
            map2 = gVar.d;
        }
        Map expandedSection = map2;
        Map map3 = linkedHashMap2;
        if ((i & 16) != 0) {
            map3 = gVar.e;
        }
        Map selectedCards = map3;
        Map selectedDevices = (i & 32) != 0 ? gVar.f : linkedHashMap3;
        Map selectedEsims = (i & 64) != 0 ? gVar.f147128g : map;
        Integer num2 = (i & 128) != 0 ? gVar.f147129h : num;
        boolean z3 = (i & 256) != 0 ? gVar.i : z;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(devices, "devices");
        Intrinsics.checkNotNullParameter(esims, "esims");
        Intrinsics.checkNotNullParameter(expandedSection, "expandedSection");
        Intrinsics.checkNotNullParameter(selectedCards, "selectedCards");
        Intrinsics.checkNotNullParameter(selectedDevices, "selectedDevices");
        Intrinsics.checkNotNullParameter(selectedEsims, "selectedEsims");
        return new g(cards, devices, esims, expandedSection, selectedCards, selectedDevices, selectedEsims, num2, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f147125a, gVar.f147125a) && Intrinsics.f(this.f147126b, gVar.f147126b) && Intrinsics.f(this.f147127c, gVar.f147127c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f147128g, gVar.f147128g) && Intrinsics.f(this.f147129h, gVar.f147129h) && this.i == gVar.i;
    }

    public final int hashCode() {
        int iE = p.a.e(p.a.e(p.a.e(p.a.e(kii.e.c(this.f147127c, p.a.d(this.f147125a.hashCode() * 31, 31, this.f147126b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.f147128g);
        Integer num = this.f147129h;
        return Boolean.hashCode(this.i) + ((iE + (num == null ? 0 : num.hashCode())) * 31);
    }

    public g(List cards, List devices, Data esims, Map expandedSection, Map selectedCards, Map selectedDevices, Map selectedEsims, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(devices, "devices");
        Intrinsics.checkNotNullParameter(esims, "esims");
        Intrinsics.checkNotNullParameter(expandedSection, "expandedSection");
        Intrinsics.checkNotNullParameter(selectedCards, "selectedCards");
        Intrinsics.checkNotNullParameter(selectedDevices, "selectedDevices");
        Intrinsics.checkNotNullParameter(selectedEsims, "selectedEsims");
        this.f147125a = cards;
        this.f147126b = devices;
        this.f147127c = esims;
        this.d = expandedSection;
        this.e = selectedCards;
        this.f = selectedDevices;
        this.f147128g = selectedEsims;
        this.f147129h = num;
        this.i = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Map map, int i) {
        f0 f0Var = f0.f322471a;
        this(f0Var, f0Var, new Data(null, null, true, 3, null), (i & 8) != 0 ? r0.g() : map, r0.g(), r0.g(), r0.g(), null, false);
    }
}
