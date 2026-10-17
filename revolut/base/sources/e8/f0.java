package e8;

import androidx.collection.ArrayMap;
import com.bumptech.glide.Registry;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public final class f0 implements g, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f123449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f123450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f123451c;
    public int d = -1;
    public c8.g e;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f123452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile i8.t f123453h;
    public File i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0 f123454j;

    public f0(h hVar, m mVar) {
        this.f123450b = hVar;
        this.f123449a = mVar;
    }

    @Override // e8.g
    public final boolean b() {
        List list;
        ArrayList arrayListC;
        ArrayList arrayListA = this.f123450b.a();
        boolean z = false;
        if (!arrayListA.isEmpty()) {
            h hVar = this.f123450b;
            Registry registryA = hVar.f123463c.a();
            Class<?> cls = hVar.d.getClass();
            Class cls2 = hVar.f123464g;
            Class cls3 = hVar.k;
            ao.h hVar2 = registryA.f26069h;
            y8.j jVar = (y8.j) ((AtomicReference) hVar2.f7847b).getAndSet(null);
            if (jVar == null) {
                jVar = new y8.j(cls, cls2, cls3);
            } else {
                jVar.f311605a = cls;
                jVar.f311606b = cls2;
                jVar.f311607c = cls3;
            }
            synchronized (((ArrayMap) hVar2.f7848c)) {
                list = (List) ((ArrayMap) hVar2.f7848c).get(jVar);
            }
            ((AtomicReference) hVar2.f7847b).set(jVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                i8.x xVar = registryA.f26065a;
                synchronized (xVar) {
                    arrayListC = xVar.f159402a.c(cls);
                }
                Iterator it8 = arrayListC.iterator();
                while (it8.hasNext()) {
                    for (Class cls4 : registryA.f26067c.s((Class) it8.next(), cls2)) {
                        if (!registryA.f.d(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                ao.h hVar3 = registryA.f26069h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((ArrayMap) hVar3.f7848c)) {
                    ((ArrayMap) hVar3.f7848c).put(new y8.j(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f;
                    if (list3 != null && this.f123452g < list3.size()) {
                        this.f123453h = null;
                        while (!z && this.f123452g < this.f.size()) {
                            List list4 = this.f;
                            int i = this.f123452g;
                            this.f123452g = i + 1;
                            i8.u uVar = (i8.u) list4.get(i);
                            File file = this.i;
                            h hVar4 = this.f123450b;
                            this.f123453h = uVar.a(file, hVar4.e, hVar4.f, hVar4.i);
                            if (this.f123453h != null && this.f123450b.c(this.f123453h.f159400c.a()) != null) {
                                this.f123453h.f159400c.c(this.f123450b.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f123451c + 1;
                        this.f123451c = i3;
                        if (i3 >= arrayListA.size()) {
                            break;
                        }
                        this.d = 0;
                    }
                    c8.g gVar = (c8.g) arrayListA.get(this.f123451c);
                    Class cls5 = (Class) list2.get(this.d);
                    c8.o oVarE = this.f123450b.e(cls5);
                    h hVar5 = this.f123450b;
                    this.f123454j = new g0(hVar5.f123463c.f26088a, gVar, hVar5.f123469n, hVar5.e, hVar5.f, oVarE, cls5, hVar5.i);
                    File fileC = hVar5.f123465h.a().c(this.f123454j);
                    this.i = fileC;
                    if (fileC != null) {
                        this.e = gVar;
                        this.f = this.f123450b.f123463c.a().f(fileC);
                        this.f123452g = 0;
                    }
                }
            } else if (!File.class.equals(this.f123450b.k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f123450b.d.getClass() + " to " + this.f123450b.k);
            }
        }
        return false;
    }

    @Override // e8.g
    public final void cancel() {
        i8.t tVar = this.f123453h;
        if (tVar != null) {
            tVar.f159400c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Object obj2) {
        this.f123449a.a(this.e, obj2, this.f123453h.f159400c, c8.a.RESOURCE_DISK_CACHE, this.f123454j);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc2) {
        this.f123449a.c(this.f123454j, exc2, this.f123453h.f159400c, c8.a.RESOURCE_DISK_CACHE);
    }
}
