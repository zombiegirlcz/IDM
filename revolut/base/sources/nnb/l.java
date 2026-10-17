package nnb;

import com.revolut.feature.location.api.LocationApi$Toggles$AllowSpoofedLocation;
import com.revolut.feature.vaults.api.VaultsApi$Toggles;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gte.a f217503b;

    public /* synthetic */ l(gte.a aVar, int i) {
        this.f217502a = i;
        this.f217503b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zA;
        switch (this.f217502a) {
            case 0:
                zA = this.f217503b.a(VaultsApi$Toggles.StatementsMultiProduct.f94696c);
                break;
            default:
                zA = ((jte.d) this.f217503b).c(LocationApi$Toggles$AllowSpoofedLocation.f78065a);
                break;
        }
        return Boolean.valueOf(zA);
    }
}
