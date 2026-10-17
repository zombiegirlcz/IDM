package eob;

import a2g.q;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lcd.n;
import s6e.z;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127893a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f127894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f127895c;
    public final Object d;
    public final Object e;

    public h(g6e.d subaccountInteractor, String itemId, SubaccountType type, String str) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f127894b = subaccountInteractor;
        this.f127895c = itemId;
        this.d = type;
        this.e = str;
    }

    @Override // mf1.a
    public final Flow a() {
        switch (this.f127893a) {
            case 0:
                return rd0.e.e(new a87.b(mo3.a.g(xam.a.h(new q(this, (Continuation) null, 17), ((slb.a) this.f127894b).c(n.f193865a, w4l.h.f294642c)), null, new en6.a(5), 1), 16), h0.f322473a, new e(3, 2, null));
            default:
                return new wyd.f(zi0.c.w(((z) ((g6e.d) this.f127894b)).g()), this, 22);
        }
    }

    @Override // mf1.a
    public final String b() {
        switch (this.f127893a) {
            case 0:
                return null;
            default:
                return (String) this.e;
        }
    }

    public h(slb.a savingsCreationAvailabilityInteractor, ijb.a savingsProductInteractor, j savingsProductDataEntryPointTypeMapping, elb.b savingsFeatureConfigInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(savingsCreationAvailabilityInteractor, "savingsCreationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsProductDataEntryPointTypeMapping, "savingsProductDataEntryPointTypeMapping");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f127894b = savingsCreationAvailabilityInteractor;
        this.f127895c = savingsProductInteractor;
        this.d = savingsFeatureConfigInteractor;
        this.e = userInteractor;
    }
}
