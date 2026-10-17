package sl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements igm.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f264028b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f264029c = new c(1);
    public static final c d = new c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264030a;

    public /* synthetic */ c(int i) {
        this.f264030a = i;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        switch (this.f264030a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                it8.printStackTrace();
                break;
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                it9.printStackTrace();
                break;
            default:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                it10.printStackTrace();
                break;
        }
    }
}
