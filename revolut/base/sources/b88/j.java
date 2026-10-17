package b88;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ psg.a f13127b;

    public /* synthetic */ j(psg.a aVar, int i) {
        this.f13126a = i;
        this.f13127b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f13126a) {
            case 0:
                ejb.b it8 = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new d(this.f13127b, it8);
            default:
                JuniorBankingProfile juniorProfile = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                return new Pair(this.f13127b, juniorProfile);
        }
    }
}
