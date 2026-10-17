package d7;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f111679c;
    public HashMap d;
    public float e;
    public HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f111680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseArrayCompat f111681h;
    public LongSparseArray i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f111682j;
    public Rect k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f111683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f111684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f111685n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f111686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f111687q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f111677a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f111678b = new HashSet();
    public int o = 0;

    public final void a(String str) {
        r7.c.b(str);
        this.f111678b.add(str);
    }

    public final float b() {
        return (long) (((this.f111684m - this.f111683l) / this.f111685n) * 1000.0f);
    }

    public final Map c() {
        float fC = r7.l.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                this.d.put((String) entry.getKey(), ((c0) entry.getValue()).a(this.e / fC));
            }
        }
        this.e = fC;
        return this.d;
    }

    public final k7.i d(String str) {
        int size = this.f111680g.size();
        for (int i = 0; i < size; i++) {
            k7.i iVar = (k7.i) this.f111680g.get(i);
            if (iVar.a(str)) {
                return iVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("LottieComposition:\n");
        Iterator it8 = this.f111682j.iterator();
        while (it8.hasNext()) {
            sb6.append(((n7.h) it8.next()).a("\t"));
        }
        return sb6.toString();
    }
}
