package tml;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.email.change_flow.a f272248b;

    public /* synthetic */ e(com.revolut.sso.impl.ui.email.change_flow.a aVar, int i) {
        this.f272247a = i;
        this.f272248b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f272247a) {
            case 0:
                oki.h.D2(this.f272248b.f106526x);
                break;
            case 1:
                com.revolut.sso.impl.ui.email.change_flow.a aVar = this.f272248b;
                oki.h.t2(aVar, aVar.f106526x, aVar.K2(), false, null, false, 12);
                break;
            case 2:
                oki.h.D2(this.f272248b.f106526x);
                break;
            case 3:
                com.revolut.sso.impl.ui.email.change_flow.a aVar2 = this.f272248b;
                oki.h.t2(aVar2, aVar2.f106526x, aVar2.K2(), false, null, false, 12);
                break;
            default:
                oki.h.D2(this.f272248b.f106526x);
                break;
        }
        return Unit.f186387a;
    }
}
