package xu0;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f308858b;

    public /* synthetic */ c(g gVar, int i) {
        this.f308857a = i;
        this.f308858b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f308857a) {
            case 0:
                return this.f308858b.f308870n;
            default:
                g gVar = this.f308858b;
                return Boolean.valueOf(gVar.e || gVar.f);
        }
    }
}
