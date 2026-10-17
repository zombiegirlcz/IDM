package flm;

import kotlin.jvm.functions.Function3;
import skm.r0;
import zkm.t;

/* JADX INFO: loaded from: classes14.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f136004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function3 f136005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f136006c;
    public final Object d;
    public final gim.i e;
    public final Function3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f136007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f136008h = -1;
    public final /* synthetic */ h i;

    public f(h hVar, Object obj2, Function3 function3, Function3 function32, cfm.c cVar, gim.i iVar, Function3 function33) {
        this.i = hVar;
        this.f136004a = obj2;
        this.f136005b = function3;
        this.f136006c = function32;
        this.d = cVar;
        this.e = iVar;
        this.f = function33;
    }

    public final void a() {
        Object obj2 = this.f136007g;
        if (obj2 instanceof t) {
            ((t) obj2).h(this.f136008h, this.i.f136011a);
            return;
        }
        r0 r0Var = obj2 instanceof r0 ? (r0) obj2 : null;
        if (r0Var != null) {
            r0Var.dispose();
        }
    }
}
