package b79;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12946c;

    public /* synthetic */ f(m mVar, String str, int i) {
        this.f12944a = i;
        this.f12945b = mVar;
        this.f12946c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12944a) {
            case 0:
                this.f12945b.f12963h.add(this.f12946c);
                break;
            default:
                this.f12945b.f12963h.remove(this.f12946c);
                break;
        }
        return Unit.f186387a;
    }
}
