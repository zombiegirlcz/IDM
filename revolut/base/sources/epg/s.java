package epg;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dpg.a f128191b;

    public /* synthetic */ s(dpg.a aVar, int i) {
        this.f128190a = i;
        this.f128191b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128190a) {
            case 0:
                return l.a((l) obj2, null, null, null, this.f128191b, 7);
            default:
                return yw9.e.a((yw9.e) obj2, null, this.f128191b, null, null, null, 29);
        }
    }
}
