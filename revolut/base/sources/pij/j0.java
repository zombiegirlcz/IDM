package pij;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EsimProfile f236556c;

    public /* synthetic */ j0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, EsimProfile esimProfile, int i) {
        this.f236554a = i;
        this.f236555b = bVar;
        this.f236556c = esimProfile;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f236554a) {
            case 0:
                this.f236555b.X.b3(this.f236556c);
                break;
            default:
                this.f236555b.X.b3(this.f236556c);
                break;
        }
        return Unit.f186387a;
    }
}
