package m2j;

import com.revolut.feature.junior_core.models.configuration.Links;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202094a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f202095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JuniorBankingProfile f202096c;

    public /* synthetic */ y(JuniorBankingProfile juniorBankingProfile, String str) {
        this.f202096c = juniorBankingProfile;
        this.f202095b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202094a) {
            case 0:
                Boolean isParent = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isParent, "isParent");
                JuniorBankingProfile juniorBankingProfile = this.f202096c;
                Intrinsics.h(juniorBankingProfile);
                return new a0(juniorBankingProfile, isParent.booleanValue(), this.f202095b);
            default:
                Links config = (Links) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return new r88.i(this.f202095b, this.f202096c.f77099b, config.f76906a);
        }
    }

    public /* synthetic */ y(String str, JuniorBankingProfile juniorBankingProfile) {
        this.f202095b = str;
        this.f202096c = juniorBankingProfile;
    }
}
