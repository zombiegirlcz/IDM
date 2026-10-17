package j3l;

import gsi.g;
import gsi.h;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f171223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f171224c;

    public /* synthetic */ a(Object obj2, int i) {
        this.f171222a = i;
        this.f171224c = obj2;
    }

    @Override // gsi.g
    public final h build() {
        switch (this.f171222a) {
            case 0:
                s.h(this.f171223b, fsi.g.class);
                return new b((c) this.f171224c, this.f171223b);
            case 1:
                s.h(this.f171223b, fsi.g.class);
                return new na4.g((na4.e) this.f171224c, this.f171223b);
            default:
                s.h(this.f171223b, fsi.g.class);
                return new t64.d((t64.c) this.f171224c, this.f171223b);
        }
    }

    @Override // gsi.g
    public final Object h(fsi.g gVar) {
        switch (this.f171222a) {
            case 0:
                this.f171223b = (xoi.d) gVar;
                break;
            case 1:
                this.f171223b = (xoi.d) gVar;
                break;
            default:
                this.f171223b = (xoi.d) gVar;
                break;
        }
        return this;
    }
}
