package plj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingServiceProvider;
import com.revolut.retail.feature.esim.api.model.EsimPickerItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ilj.e f237432b;

    public /* synthetic */ m(ilj.e eVar, int i) {
        this.f237431a = i;
        this.f237432b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f237431a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                EsimPickerItem esimPickerItem = this.f237432b.f162246a;
                return e.a(update, esimPickerItem instanceof EsimPhoneNumberPortingServiceProvider ? (EsimPhoneNumberPortingServiceProvider) esimPickerItem : null, null, null, null, null, 30);
            default:
                xkj.g update2 = (xkj.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                EsimPickerItem esimPickerItem2 = this.f237432b.f162246a;
                return xkj.g.a(update2, esimPickerItem2 instanceof EsimPhoneNumberPortingServiceProvider ? (EsimPhoneNumberPortingServiceProvider) esimPickerItem2 : null, null, null, null, null, null, null, 126);
        }
    }
}
