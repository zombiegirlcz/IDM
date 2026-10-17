package a9a;

import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PhoneNumber;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AliasRegistrationType.Phone f2394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2395c;

    public /* synthetic */ i(AliasRegistrationType.Phone phone, int i, int i2) {
        this.f2393a = i2;
        this.f2394b = phone;
        this.f2395c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f update = (f) obj2;
        switch (this.f2393a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                AliasRegistrationType.Phone phone = this.f2394b;
                AliasRegistrationType.Phone aliasType = AliasRegistrationType.Phone.z(phone, PhoneNumber.a(phone.f80391b, this.f2395c, null, 2), null, 2);
                update.getClass();
                Intrinsics.checkNotNullParameter(aliasType, "aliasType");
                return new f(aliasType);
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                AliasRegistrationType.Phone phone2 = this.f2394b;
                AliasRegistrationType.Phone aliasType2 = AliasRegistrationType.Phone.z(phone2, PhoneNumber.a(phone2.f80391b, this.f2395c, null, 2), null, 2);
                update.getClass();
                Intrinsics.checkNotNullParameter(aliasType2, "aliasType");
                return new f(aliasType2);
        }
    }
}
