package ozl;

import cri.d;
import l70.e;
import mri.w;
import oai.s;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f231384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th0.a f231385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231386c;
    public final e4m.e d;

    public a(c cVar, e eVar, th0.a aVar) {
        this.f231384a = eVar;
        this.f231385b = aVar;
        int i = 19;
        this.f231386c = e4m.b.b(new s(this, 1, i));
        this.d = e4m.b.b(new s(this, 0, i));
    }

    public final w a() {
        return (w) this.d.get();
    }
}
