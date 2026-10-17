package uvk;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ awk.h f283483b;

    public /* synthetic */ m(awk.h hVar, int i) {
        this.f283482a = i;
        this.f283483b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f283482a) {
            case 0:
                return e.a((e) obj2, null, this.f283483b, null, null, 29);
            default:
                ((wvk.d) obj2).getClass();
                return new wvk.d(this.f283483b);
        }
    }
}
