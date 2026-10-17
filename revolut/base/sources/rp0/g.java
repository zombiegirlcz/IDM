package rp0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f256084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f256085c;

    public /* synthetic */ g(j jVar, i iVar, int i) {
        this.f256083a = i;
        this.f256084b = jVar;
        this.f256085c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f256083a) {
            case 0:
                this.f256084b.f256098c.onNext(this.f256085c);
                break;
            default:
                this.f256084b.d.onNext(this.f256085c);
                break;
        }
        return Unit.f186387a;
    }
}
