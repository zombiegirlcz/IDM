package cc3;

import cc3.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f22929b;

    public /* synthetic */ h(j jVar, int i) {
        this.f22928a = i;
        this.f22929b = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22928a) {
            case 0:
                this.f22929b.C2(f.a.f22925a);
                break;
            default:
                this.f22929b.C2(f.b.f22926a);
                break;
        }
        return Unit.f186387a;
    }
}
