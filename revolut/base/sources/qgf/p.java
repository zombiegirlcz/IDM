package qgf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.flow.a f245815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f245816c;

    public /* synthetic */ p(com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar, boolean z, int i) {
        this.f245814a = i;
        this.f245815b = aVar;
        this.f245816c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h hVar = (h) obj2;
        switch (this.f245814a) {
            case 0:
                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar = this.f245815b;
                return com.revolut.feature.transaction_list.impl.ui.list.flow.a.I2(aVar, hVar, this.f245816c, aVar.o);
            default:
                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar2 = this.f245815b;
                return com.revolut.feature.transaction_list.impl.ui.list.flow.a.I2(aVar2, hVar, this.f245816c, aVar2.o);
        }
    }
}
