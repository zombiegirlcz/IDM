package eli;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f127471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f127472c;

    public /* synthetic */ e(j jVar, String str, int i) {
        this.f127470a = i;
        this.f127471b = jVar;
        this.f127472c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        zm0.d dVar = (zm0.d) obj2;
        switch (this.f127470a) {
            case 0:
                Intrinsics.h(dVar);
                this.f127471b.d(this.f127472c, dVar);
                break;
            default:
                Intrinsics.h(dVar);
                this.f127471b.d(this.f127472c, dVar);
                break;
        }
        return Unit.f186387a;
    }
}
