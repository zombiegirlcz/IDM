package wlm;

import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.h0;
import mmm.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f298538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f298539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f298540c;
    public final /* synthetic */ o d;

    public h(o oVar, j entry) {
        boolean[] zArr;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.d = oVar;
        this.f298538a = entry;
        if (entry.e) {
            zArr = null;
        } else {
            oVar.getClass();
            zArr = new boolean[2];
        }
        this.f298539b = zArr;
    }

    public final void a() {
        o oVar = this.d;
        synchronized (oVar) {
            try {
                if (this.f298540c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.f(this.f298538a.f298545g, this)) {
                    oVar.f(this, false);
                }
                this.f298540c = true;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void b() {
        o oVar = this.d;
        synchronized (oVar) {
            try {
                if (this.f298540c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.f(this.f298538a.f298545g, this)) {
                    oVar.f(this, true);
                }
                this.f298540c = true;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void c() {
        j jVar = this.f298538a;
        if (Intrinsics.f(jVar.f298545g, this)) {
            o oVar = this.d;
            if (oVar.f298563l) {
                oVar.f(this, false);
            } else {
                jVar.f = true;
            }
        }
    }

    public final q0 d(int i) {
        o oVar = this.d;
        synchronized (oVar) {
            try {
                if (this.f298540c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.f(this.f298538a.f298545g, this)) {
                    return new mmm.g();
                }
                if (!this.f298538a.e) {
                    boolean[] zArr = this.f298539b;
                    Intrinsics.h(zArr);
                    zArr[i] = true;
                }
                try {
                    return new p(oVar.f298558b.s((h0) this.f298538a.d.get(i)), new bsi.b(oVar, this, 14));
                } catch (FileNotFoundException unused) {
                    return new mmm.g();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
