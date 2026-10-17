package vli;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f290461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f290462c;

    public /* synthetic */ g(k kVar, String str, int i) {
        this.f290460a = i;
        this.f290461b = kVar;
        this.f290462c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f290460a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                ufm.i iVar = new ufm.i(this.f290461b.i(this.f290462c), new vif.c(new vjk.b(16), 22), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            default:
                this.f290461b.d.c(k.b(this.f290462c));
                return Unit.f186387a;
        }
    }
}
