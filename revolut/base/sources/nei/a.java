package nei;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f214545b;

    public /* synthetic */ a(c cVar, int i) {
        this.f214544a = i;
        this.f214545b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f214544a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f214545b.b();
    }
}
