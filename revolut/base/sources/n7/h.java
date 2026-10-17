package n7;

import com.google.firebase.messaging.u;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f212948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.j f212949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f212950c;
    public final long d;
    public final f e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f212951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f212952h;
    public final l7.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f212953j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f212954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f212955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f212956n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f212957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l7.a f212958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cpi.g f212959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l7.b f212960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f212961t;
    public final g u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yf.c f212962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u f212963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m7.h f212964y;

    public h(List list, d7.j jVar, String str, long j2, f fVar, long j3, String str2, List list2, l7.f fVar2, int i, int i2, int i3, float f, float f4, float f5, float f6, l7.a aVar, cpi.g gVar, List list3, g gVar2, l7.b bVar, boolean z, yf.c cVar, u uVar, m7.h hVar) {
        this.f212948a = list;
        this.f212949b = jVar;
        this.f212950c = str;
        this.d = j2;
        this.e = fVar;
        this.f = j3;
        this.f212951g = str2;
        this.f212952h = list2;
        this.i = fVar2;
        this.f212953j = i;
        this.k = i2;
        this.f212954l = i3;
        this.f212955m = f;
        this.f212956n = f4;
        this.o = f5;
        this.f212957p = f6;
        this.f212958q = aVar;
        this.f212959r = gVar;
        this.f212961t = list3;
        this.u = gVar2;
        this.f212960s = bVar;
        this.v = z;
        this.f212962w = cVar;
        this.f212963x = uVar;
        this.f212964y = hVar;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbS = p.a.s(str);
        sbS.append(this.f212950c);
        sbS.append("\n");
        long j2 = this.f;
        d7.j jVar = this.f212949b;
        h hVar = (h) jVar.i.get(j2);
        if (hVar != null) {
            sbS.append("\t\tParents: ");
            sbS.append(hVar.f212950c);
            for (h hVar2 = (h) jVar.i.get(hVar.f); hVar2 != null; hVar2 = (h) jVar.i.get(hVar2.f)) {
                sbS.append("->");
                sbS.append(hVar2.f212950c);
            }
            sbS.append(str);
            sbS.append("\n");
        }
        List list = this.f212952h;
        if (!list.isEmpty()) {
            sbS.append(str);
            sbS.append("\tMasks: ");
            sbS.append(list.size());
            sbS.append("\n");
        }
        int i2 = this.f212953j;
        if (i2 != 0 && (i = this.k) != 0) {
            sbS.append(str);
            sbS.append("\tBackground: ");
            sbS.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f212954l)));
        }
        List list2 = this.f212948a;
        if (!list2.isEmpty()) {
            sbS.append(str);
            sbS.append("\tShapes:\n");
            for (Object obj2 : list2) {
                sbS.append(str);
                sbS.append("\t\t");
                sbS.append(obj2);
                sbS.append("\n");
            }
        }
        return sbS.toString();
    }

    public final String toString() {
        return a("");
    }
}
