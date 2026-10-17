package t0l;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f267049b;

    public /* synthetic */ i(j jVar, int i) {
        this.f267048a = i;
        this.f267049b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f267048a) {
            case 0:
                j jVar = this.f267049b;
                jVar.x2(new i(jVar, 1));
                return Boolean.FALSE;
            case 1:
                return new c(false);
            case 2:
                return new c(true);
            default:
                return new c(false);
        }
    }
}
