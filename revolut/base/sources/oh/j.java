package oh;

import ce.v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ce.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j f225261b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j f225262c = new j(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225263a;

    public /* synthetic */ j(int i) {
        this.f225263a = i;
    }

    @Override // ce.f
    public final Object m(v vVar) {
        switch (this.f225263a) {
            case 0:
                return new e((ch.h) vVar.a(ch.h.class));
            default:
                return new d((e) vVar.a(e.class), (ch.d) vVar.a(ch.d.class));
        }
    }
}
