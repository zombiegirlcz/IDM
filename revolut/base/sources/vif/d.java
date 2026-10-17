package vif;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f289592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f289593c;

    public /* synthetic */ d(e eVar, long j2, int i) {
        this.f289591a = i;
        this.f289592b = eVar;
        this.f289593c = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str = (String) obj2;
        switch (this.f289591a) {
            case 0:
                return this.f289592b.f289594a.getTransactionsAfterDate(this.f289593c, 100, str);
            default:
                return this.f289592b.f289594a.getLastTransactions(Long.valueOf(this.f289593c), 100, str);
        }
    }
}
