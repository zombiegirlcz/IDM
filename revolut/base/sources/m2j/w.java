package m2j;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f202090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f202091c;

    public /* synthetic */ w(z zVar, String str, int i) {
        this.f202089a = i;
        this.f202090b = zVar;
        this.f202091c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202089a) {
            case 0:
                Map profilesMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(profilesMap, "profilesMap");
                efm.d0 list = efm.r.fromIterable(profilesMap.values()).flatMapSingle(new m1i.j0(new w(this.f202090b, this.f202091c, 2), 23)).toList();
                Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
                return list;
            case 1:
                List profilesWithExtra = (List) obj2;
                Intrinsics.checkNotNullParameter(profilesWithExtra, "profilesWithExtra");
                List<a0> list2 = profilesWithExtra;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (a0 a0Var : list2) {
                    arrayList.add(nim.a.w(rd0.e.c(this.f202090b.e.b(a0Var.f202011a.f77103j, this.f202091c, w4l.j.f294644c), kotlin.coroutines.g.f186406a), new x(a0Var, 2)));
                }
                return !arrayList.isEmpty() ? nim.a.w(mif.a.l(arrayList), new m2g.c(19)) : te0.w.h(new Data(null, null, false, 6, null));
            case 2:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                String str = profile.f77103j;
                wsg.n nVar = this.f202090b.f202099c;
                String str2 = this.f202091c;
                efm.d0 d0VarFirstOrError = m70.a.g(nVar.c0(str, str2, false), null, new lxi.g(21), 1).firstOrError();
                m1i.j0 j0Var = new m1i.j0(new m2g.c(21), 25);
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, j0Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return new ufm.i(iVar, new m1i.j0(new y(profile, str2), 24), 1);
            default:
                List juniorProfiles = (List) obj2;
                Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
                List<a0> list3 = juniorProfiles;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                for (a0 a0Var2 : list3) {
                    arrayList2.add(nim.a.w(rd0.e.c(this.f202090b.f202100g.b(a0Var2.f202011a.f77103j, this.f202091c, w4l.j.f294644c), kotlin.coroutines.g.f186406a), new x(a0Var2, 1)));
                }
                return !arrayList2.isEmpty() ? nim.a.w(mif.a.l(arrayList2), new m2g.c(18)) : te0.w.h(new Data(null, null, false, 6, null));
        }
    }
}
