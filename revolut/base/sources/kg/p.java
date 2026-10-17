package kg;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import mg.c1;
import mg.n1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.gson.internal.f f183880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f183881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f183882c;
    public final HashMap d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f183883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f183884h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f183885j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f183886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j0 f183887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j0 f183888n;
    public final ArrayDeque o;

    public p() {
        this.f183880a = com.google.gson.internal.f.f49633c;
        this.f183881b = c0.DEFAULT;
        this.f183882c = i.IDENTITY;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        j jVar = o.u;
        this.f183883g = 2;
        this.f183884h = 2;
        this.i = false;
        this.f183885j = true;
        this.k = o.u;
        this.f183886l = true;
        this.f183887m = o.f183864w;
        this.f183888n = o.f183865x;
        this.o = new ArrayDeque();
    }

    public final void a(a aVar) {
        com.google.gson.internal.f fVar = this.f183880a;
        com.google.gson.internal.f fVarB = fVar.clone();
        ArrayList arrayList = new ArrayList(fVar.f49634a);
        fVarB.f49634a = arrayList;
        arrayList.add(aVar);
        this.f183880a = fVarB;
    }

    public final o b() {
        c1 c1Var;
        c1 c1Var2;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = pg.f.f235788a;
        int i = this.f183883g;
        int i2 = this.f183884h;
        if (i != 2 || i2 != 2) {
            mg.h hVar = new mg.h(mg.g.f205074b, i, i2);
            c1 c1Var3 = n1.f205095a;
            int i3 = 0;
            c1 c1Var4 = new c1(Date.class, hVar, i3);
            if (z) {
                pg.e eVar = pg.f.f235790c;
                eVar.getClass();
                c1Var = new c1(eVar.f205075a, new mg.h(eVar, i, i2), i3);
                pg.e eVar2 = pg.f.f235789b;
                eVar2.getClass();
                c1Var2 = new c1(eVar2.f205075a, new mg.h(eVar2, i, i2), i3);
            } else {
                c1Var = null;
                c1Var2 = null;
            }
            arrayList3.add(c1Var4);
            if (z) {
                arrayList3.add(c1Var);
                arrayList3.add(c1Var2);
            }
        }
        return new o(this.f183880a, this.f183882c, new HashMap(this.d), this.f183885j, this.k, this.i, this.f183886l, this.f183881b, this.f183883g, this.f183884h, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f183887m, this.f183888n, new ArrayList(this.o));
    }

    public final void c(Object obj2, Type type) {
        Objects.requireNonNull(type);
        boolean z = obj2 instanceof z;
        com.google.gson.internal.j.c(z || (obj2 instanceof t) || (obj2 instanceof q) || (obj2 instanceof l0));
        if (type == Object.class) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj2 instanceof q) {
            this.d.put(type, (q) obj2);
        }
        ArrayList arrayList = this.e;
        if (z || (obj2 instanceof t)) {
            TypeToken<?> typeToken = TypeToken.get(type);
            arrayList.add(new mg.h0(obj2, typeToken, typeToken.getType() == typeToken.getRawType()));
        }
        if (obj2 instanceof l0) {
            c1 c1Var = n1.f205095a;
            arrayList.add(new c1(TypeToken.get(type), (l0) obj2, 2));
        }
    }

    public p(o oVar) {
        this.f183880a = com.google.gson.internal.f.f49633c;
        this.f183881b = c0.DEFAULT;
        this.f183882c = i.IDENTITY;
        HashMap map = new HashMap();
        this.d = map;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        j jVar = o.u;
        this.f183883g = 2;
        this.f183884h = 2;
        this.i = false;
        this.f183885j = true;
        this.k = o.u;
        this.f183886l = true;
        this.f183887m = o.f183864w;
        this.f183888n = o.f183865x;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.o = arrayDeque;
        this.f183880a = oVar.f;
        this.f183882c = oVar.f183869g;
        map.putAll(oVar.f183870h);
        this.f183885j = oVar.i;
        this.k = oVar.f183871j;
        this.i = oVar.k;
        this.f183881b = oVar.o;
        this.f183883g = oVar.f183873m;
        this.f183884h = oVar.f183874n;
        arrayList.addAll(oVar.f183875p);
        arrayList2.addAll(oVar.f183876q);
        this.f183886l = oVar.f183872l;
        this.f183887m = oVar.f183877r;
        this.f183888n = oVar.f183878s;
        arrayDeque.addAll(oVar.f183879t);
    }
}
