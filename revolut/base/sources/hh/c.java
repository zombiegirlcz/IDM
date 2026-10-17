package hh;

import ce.v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ce.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c f152198b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c f152199c = new c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152200a;

    public /* synthetic */ c(int i) {
        this.f152200a = i;
    }

    @Override // ce.f
    public final Object m(v vVar) {
        switch (this.f152200a) {
            case 0:
                return new f((ch.h) vVar.a(ch.h.class));
            default:
                return new e((f) vVar.a(f.class), (ch.d) vVar.a(ch.d.class), (ch.h) vVar.a(ch.h.class));
        }
    }
}
