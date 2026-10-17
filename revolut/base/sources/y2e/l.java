package y2e;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f310648b;

    public /* synthetic */ l(m mVar, int i) {
        this.f310647a = i;
        this.f310648b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f310647a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((g2e.c) this.f310648b.f310650b).a();
            default:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return new pfm.h(new xza.a(this.f310648b, pagedData, 3), 2);
        }
    }
}
