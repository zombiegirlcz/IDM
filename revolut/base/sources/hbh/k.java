package hbh;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f150742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1h.c f150743c;

    public /* synthetic */ k(m mVar, h1h.c cVar, int i) {
        this.f150741a = i;
        this.f150742b = mVar;
        this.f150743c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150741a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean z = this.f150743c.f148572a;
                this.f150742b.getClass();
                return m.c(z);
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                boolean z3 = this.f150743c.f148572a;
                this.f150742b.getClass();
                return m.c(z3);
            default:
                h1h.g gVar = (h1h.g) obj2;
                Intrinsics.h(gVar);
                return this.f150742b.b(gVar, this.f150743c.f148573b);
        }
    }
}
