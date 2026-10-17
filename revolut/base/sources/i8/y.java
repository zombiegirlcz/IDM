package i8;

import androidx.core.util.Pools$Pool;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class y implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f159404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pools$Pool f159405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f159406c;
    public com.bumptech.glide.h d;
    public com.bumptech.glide.load.data.d e;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f159407g;

    public y(ArrayList arrayList, Pools$Pool pools$Pool) {
        this.f159405b = pools$Pool;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f159404a = arrayList;
        this.f159406c = 0;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f159404a.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        return ((com.bumptech.glide.load.data.e) this.f159404a.get(0)).b();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        this.d = hVar;
        this.e = dVar;
        this.f = (List) this.f159405b.acquire();
        ((com.bumptech.glide.load.data.e) this.f159404a.get(this.f159406c)).c(hVar, this);
        if (this.f159407g) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f159407g = true;
        Iterator it8 = this.f159404a.iterator();
        while (it8.hasNext()) {
            ((com.bumptech.glide.load.data.e) it8.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        List list = this.f;
        if (list != null) {
            this.f159405b.release(list);
        }
        this.f = null;
        Iterator it8 = this.f159404a.iterator();
        while (it8.hasNext()) {
            ((com.bumptech.glide.load.data.e) it8.next()).cleanup();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Object obj2) {
        if (obj2 != null) {
            this.e.d(obj2);
        } else {
            f();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc2) {
        List list = this.f;
        y8.f.c(list, "Argument must not be null");
        list.add(exc2);
        f();
    }

    public final void f() {
        if (this.f159407g) {
            return;
        }
        if (this.f159406c < this.f159404a.size() - 1) {
            this.f159406c++;
            c(this.d, this.e);
        } else {
            y8.f.b(this.f);
            this.e.e(new GlideException("Fetch failed", new ArrayList(this.f)));
        }
    }
}
