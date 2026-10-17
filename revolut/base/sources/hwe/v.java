package hwe;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flow.topup_methods.d f156160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TopupMethod f156161c;
    public final /* synthetic */ String d;

    public /* synthetic */ v(com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar, TopupMethod topupMethod, String str, int i) {
        this.f156159a = i;
        this.f156160b = dVar;
        this.f156161c = topupMethod;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f156159a) {
            case 0:
                i iVar = new i(this.f156161c, this.d);
                com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar = this.f156160b;
                dVar.C2(iVar);
                oki.h.D2(dVar.D);
                break;
            default:
                i iVar2 = new i(this.f156161c, this.d);
                com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar2 = this.f156160b;
                dVar2.C2(iVar2);
                oki.h.D2(dVar2.D);
                break;
        }
        return Unit.f186387a;
    }
}
