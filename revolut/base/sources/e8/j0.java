package e8;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements g, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f123481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f123482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f123483c;
    public volatile d d;
    public volatile Object e;
    public volatile i8.t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile e f123484g;

    public j0(h hVar, m mVar) {
        this.f123481a = hVar;
        this.f123482b = mVar;
    }

    @Override // e8.f
    public final void a(c8.g gVar, Object obj2, com.bumptech.glide.load.data.e eVar, c8.a aVar, c8.g gVar2) {
        this.f123482b.a(gVar, obj2, eVar, this.f.f159400c.b(), gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    @Override // e8.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r6.e
            r6.e = r1
            boolean r0 = r6.d(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L1e
            goto L2a
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L1e
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
        L1e:
            e8.d r0 = r6.d
            if (r0 == 0) goto L2b
            e8.d r0 = r6.d
            boolean r0 = r0.b()
            if (r0 == 0) goto L2b
        L2a:
            return r2
        L2b:
            r6.d = r1
            r6.f = r1
            r0 = 0
        L30:
            if (r0 != 0) goto L90
            int r1 = r6.f123483c
            e8.h r3 = r6.f123481a
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L90
            e8.h r1 = r6.f123481a
            java.util.ArrayList r1 = r1.b()
            int r3 = r6.f123483c
            int r4 = r3 + 1
            r6.f123483c = r4
            java.lang.Object r1 = r1.get(r3)
            i8.t r1 = (i8.t) r1
            r6.f = r1
            i8.t r1 = r6.f
            if (r1 == 0) goto L30
            e8.h r1 = r6.f123481a
            e8.p r1 = r1.f123470p
            i8.t r3 = r6.f
            com.bumptech.glide.load.data.e r3 = r3.f159400c
            c8.a r3 = r3.b()
            boolean r1 = r1.c(r3)
            if (r1 != 0) goto L7a
            e8.h r1 = r6.f123481a
            i8.t r3 = r6.f
            com.bumptech.glide.load.data.e r3 = r3.f159400c
            java.lang.Class r3 = r3.a()
            e8.c0 r1 = r1.c(r3)
            if (r1 == 0) goto L30
        L7a:
            i8.t r0 = r6.f
            i8.t r1 = r6.f
            com.bumptech.glide.load.data.e r1 = r1.f159400c
            e8.h r3 = r6.f123481a
            com.bumptech.glide.h r3 = r3.o
            ao.h r4 = new ao.h
            r5 = 8
            r4.<init>(r6, r0, r5)
            r1.c(r3, r4)
            r0 = r2
            goto L30
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.j0.b():boolean");
    }

    @Override // e8.f
    public final void c(c8.g gVar, Exception exc2, com.bumptech.glide.load.data.e eVar, c8.a aVar) {
        this.f123482b.c(gVar, exc2, eVar, this.f.f159400c.b());
    }

    @Override // e8.g
    public final void cancel() {
        i8.t tVar = this.f;
        if (tVar != null) {
            tVar.f159400c.cancel();
        }
    }

    public final boolean d(Object obj2) throws Throwable {
        Throwable th10;
        int i = y8.h.f311602b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            com.bumptech.glide.load.data.g gVarG = this.f123481a.f123463c.a().g(obj2);
            Object objA = gVarG.a();
            c8.d dVarD = this.f123481a.d(objA);
            mp.p pVar = new mp.p(dVarD, 14, objA, this.f123481a.i);
            c8.g gVar = this.f.f159398a;
            h hVar = this.f123481a;
            e eVar = new e(gVar, hVar.f123469n);
            g8.a aVarA = hVar.f123465h.a();
            aVarA.d(eVar, pVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                String str = "Finished encoding source to cache, key: " + eVar + ", data: " + obj2 + ", encoder: " + dVarD + ", duration: " + y8.h.a(jElapsedRealtimeNanos);
            }
            if (aVarA.c(eVar) != null) {
                this.f123484g = eVar;
                this.d = new d(Collections.singletonList(this.f.f159398a), this.f123481a, this);
                this.f.f159400c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                String str2 = "Attempt to write: " + this.f123484g + ", data: " + obj2 + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...";
            }
            try {
                this.f123482b.a(this.f.f159398a, gVarG.a(), this.f.f159400c, this.f.f159400c.b(), this.f.f159398a);
                return false;
            } catch (Throwable th11) {
                th10 = th11;
                z = true;
                if (z) {
                    throw th10;
                }
                this.f.f159400c.cleanup();
                throw th10;
            }
        } catch (Throwable th12) {
            th10 = th12;
        }
    }
}
