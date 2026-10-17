package nol;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.phone.change_flow.b f218071b;

    public /* synthetic */ c(com.revolut.sso.impl.ui.phone.change_flow.b bVar, int i) {
        this.f218070a = i;
        this.f218071b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f218070a) {
            case 0:
                com.revolut.sso.impl.ui.phone.change_flow.b bVar = this.f218071b;
                bVar.n2(new x(bVar, null), new whi.b(6));
                break;
            case 1:
                oki.h.D2(this.f218071b.f106661y);
                break;
            case 2:
                oki.h.D2(this.f218071b.f106661y);
                break;
            default:
                oki.h.D2(this.f218071b.f106661y);
                break;
        }
        return Unit.f186387a;
    }
}
