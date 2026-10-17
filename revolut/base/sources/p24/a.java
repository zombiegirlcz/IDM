package p24;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f232034b;

    public /* synthetic */ a(d dVar, int i) {
        this.f232033a = i;
        this.f232034b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        tt3.a it8 = (tt3.a) obj2;
        switch (this.f232033a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f232034b.f232040a.p(it8);
    }
}
