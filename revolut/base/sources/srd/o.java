package srd;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomAsset f265180b;

    public /* synthetic */ o(CustomAsset customAsset, int i) {
        this.f265179a = i;
        this.f265180b = customAsset;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f265179a) {
            case 0:
                return a.a((a) obj2, this.f265180b, false, null, null, 62);
            case 1:
                return urd.a.a((urd.a) obj2, this.f265180b, null, 0, null, null, null, 254);
            default:
                return wrd.a.a((wrd.a) obj2, this.f265180b, false, 6);
        }
    }
}
