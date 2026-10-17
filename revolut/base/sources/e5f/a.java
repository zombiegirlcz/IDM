package e5f;

import dw3.f6;
import e4m.e;
import p12.s0;
import q1h.c;
import q1h.d;
import q1h.f;
import q1h.g;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e3f.a, c, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xmg.a f122817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9h.a f122818c;
    public final e d;
    public final e e;
    public final e f;

    public a(h9h.a aVar, xmg.a aVar2, int i) {
        this.f122816a = i;
        switch (i) {
            case 1:
                this.f122817b = aVar2;
                this.f122818c = aVar;
                this.d = e4m.b.b(new s0(this, 0, 27));
                this.e = e4m.b.b(new s0(this, 1, 27));
                this.f = e4m.b.b(new s0(this, 2, 27));
                break;
            default:
                this.f122817b = aVar2;
                this.f122818c = aVar;
                this.d = e4m.b.b(new f6(this, 0, 11));
                this.e = e4m.b.b(new f6(this, 1, 11));
                this.f = e4m.b.b(new f6(this, 2, 11));
                break;
        }
    }

    @Override // q1h.c
    public final d a() {
        switch (this.f122816a) {
            case 0:
                return (d5f.c) this.f.get();
            default:
                return (obh.c) this.f.get();
        }
    }

    @Override // q1h.c
    public final f b() {
        switch (this.f122816a) {
            case 0:
                return (d5f.d) this.d.get();
            default:
                return (obh.d) this.d.get();
        }
    }

    @Override // q1h.c
    public final q1h.e c() {
        switch (this.f122816a) {
            case 0:
                return (d5f.b) this.e.get();
            default:
                return (obh.b) this.e.get();
        }
    }
}
