package e8;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements g, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f123440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f123441c;
    public int d;
    public c8.g e;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f123442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile i8.t f123443h;
    public File i;

    public d(h hVar, m mVar) {
        this(hVar.a(), hVar, mVar);
    }

    @Override // e8.g
    public final boolean b() {
        while (true) {
            List list = this.f;
            boolean z = false;
            if (list != null && this.f123442g < list.size()) {
                this.f123443h = null;
                while (!z && this.f123442g < this.f.size()) {
                    List list2 = this.f;
                    int i = this.f123442g;
                    this.f123442g = i + 1;
                    i8.u uVar = (i8.u) list2.get(i);
                    File file = this.i;
                    h hVar = this.f123440b;
                    this.f123443h = uVar.a(file, hVar.e, hVar.f, hVar.i);
                    if (this.f123443h != null && this.f123440b.c(this.f123443h.f159400c.a()) != null) {
                        this.f123443h.f159400c.c(this.f123440b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.f123439a.size()) {
                return false;
            }
            c8.g gVar = (c8.g) this.f123439a.get(this.d);
            h hVar2 = this.f123440b;
            File fileC = hVar2.f123465h.a().c(new e(gVar, hVar2.f123469n));
            this.i = fileC;
            if (fileC != null) {
                this.e = gVar;
                this.f = this.f123440b.f123463c.a().f(fileC);
                this.f123442g = 0;
            }
        }
    }

    @Override // e8.g
    public final void cancel() {
        i8.t tVar = this.f123443h;
        if (tVar != null) {
            tVar.f159400c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Object obj2) {
        this.f123441c.a(this.e, obj2, this.f123443h.f159400c, c8.a.DATA_DISK_CACHE, this.e);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc2) {
        this.f123441c.c(this.e, exc2, this.f123443h.f159400c, c8.a.DATA_DISK_CACHE);
    }

    public d(List list, h hVar, f fVar) {
        this.d = -1;
        this.f123439a = list;
        this.f123440b = hVar;
        this.f123441c = fVar;
    }
}
