package x94;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f303551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f303552c;

    public /* synthetic */ j(k kVar, String str, int i) {
        this.f303550a = i;
        this.f303551b = kVar;
        this.f303552c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303550a) {
            case 0:
                this.f303551b.f303553b.U().set(new Pair(this.f303552c, (su3.a) obj2));
                return Unit.f186387a;
            default:
                Pair it8 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                k kVar = this.f303551b;
                kVar.f303554c.getClass();
                String documentId = this.f303552c;
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar.l(new v3e.t(kVar, it8, 26));
        }
    }
}
