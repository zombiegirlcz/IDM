package oee;

import ha3.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f224587b;

    public /* synthetic */ k(m mVar, int i) {
        this.f224586a = i;
        this.f224587b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String it8 = (String) obj2;
        switch (this.f224586a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((x) this.f224587b.f224590b).n(it8);
            case 1:
                Intrinsics.checkNotNullParameter(it8, "cardId");
                return ((x) this.f224587b.f224590b).m(it8);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "cardId");
                return this.f224587b.f224591c.a(it8, true);
            default:
                Intrinsics.checkNotNullParameter(it8, "cardId");
                return l93.f.f(this.f224587b.f224590b, it8);
        }
    }
}
