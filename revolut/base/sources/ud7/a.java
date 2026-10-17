package ud7;

import e4m.e;
import vd7.h;
import vd7.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f279165b;

    public /* synthetic */ a(b bVar, int i) {
        this.f279164a = i;
        this.f279165b = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f279164a) {
            case 0:
                return new td7.a(this.f279165b.f279166a);
            default:
                return new h(new i(), this.f279165b.f279166a);
        }
    }
}
