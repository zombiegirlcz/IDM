package cji;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24684b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f24683a = i;
        this.f24684b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24683a) {
            case 0:
                Object obj2 = this.f24684b;
                return (obj2 != null ? ihm.b.e(obj2) : j6.a.h("create(...)")).d();
            case 1:
                return this.f24684b;
            default:
                xi0.b bVar = (xi0.b) this.f24684b.getValue();
                return Boolean.valueOf(cp5.d.A(bVar) || cp5.d.z(bVar) || cp5.d.y(bVar));
        }
    }

    public /* synthetic */ c(y0i.e eVar, Lazy lazy) {
        this.f24683a = 2;
        this.f24684b = lazy;
    }
}
