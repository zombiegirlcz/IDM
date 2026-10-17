package b6i;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s6i.e f12826b;

    public /* synthetic */ t(s6i.e eVar, int i) {
        this.f12825a = i;
        this.f12826b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12825a) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, this.f12826b, null, null, null, false, false, null, null, 0, 510);
            default:
                return h.a((h) obj2, this.f12826b, null, null, null, false, false, null, null, 0, 510);
        }
    }
}
