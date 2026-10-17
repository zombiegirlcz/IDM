package nj8;

import com.google.protobuf.f3;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$DomainState;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import d9.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f216383b;

    public /* synthetic */ b(com.revolut.feature.contacts_chooser.impl.ui.a aVar, String str) {
        this.f216382a = 5;
        this.f216383b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f216382a) {
            case 0:
                Map juniorProfiles = (Map) obj2;
                Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
                return (JuniorBankingProfile) juniorProfiles.get(this.f216383b);
            case 1:
                List juniors = (List) obj2;
                Intrinsics.checkNotNullParameter(juniors, "juniors");
                Iterator it8 = juniors.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((JuniorBankingProfile) next).getF77101g(), this.f216383b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return Boolean.valueOf(next != null);
            case 2:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List<JuniorBankingProfile> list2 = list;
                int iB = q0.b(w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (JuniorBankingProfile juniorBankingProfile : list2) {
                    linkedHashMap.put(juniorBankingProfile.getF77103j(), new Pair(this.f216383b, juniorBankingProfile));
                }
                return linkedHashMap;
            case 3:
                nk6.e update = (nk6.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return nk6.e.a(update, null, this.f216383b, 1);
            case 4:
                nm6.e update2 = (nm6.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return nm6.e.a(update2, null, this.f216383b, 1);
            case 5:
                nn3.c update3 = (nn3.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                nn3.a aVar = update3.f217441g;
                nn3.a aVar2 = nn3.a.REVOLUT;
                String str = this.f216383b;
                boolean z = false;
                boolean z3 = aVar == aVar2 && Intrinsics.f(str, "ID_REVOLUT_FILTER_ITEM");
                nn3.a aVar3 = nn3.a.GROUP;
                if (aVar == aVar3 && Intrinsics.f(str, "ID_GROUP_FILTER_ITEM")) {
                    z = true;
                }
                if (z3 || z) {
                    return nn3.c.a(update3, null, null, null, null, null, false, false, null, 0, null, 131007);
                }
                if (Intrinsics.f(str, "ID_REVOLUT_FILTER_ITEM")) {
                    return nn3.c.a(update3, null, null, null, null, aVar2, false, false, null, 0, null, 131007);
                }
                if (Intrinsics.f(str, "ID_GROUP_FILTER_ITEM")) {
                    return nn3.c.a(update3, null, null, null, null, aVar3, false, false, null, 0, null, 131007);
                }
                throw new IllegalStateException("Invalid state");
            case 6:
                nnb.f update4 = (nnb.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return nnb.f.a(update4, null, y0.b(this.f216383b), false, null, 13);
            case 7:
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct, "app_instance_id", this.f216383b);
                return Unit.f186387a;
            case 8:
                f3 buildStruct2 = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct2, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct2, "name", this.f216383b);
                return Unit.f186387a;
            case 9:
                f3 buildStruct3 = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct3, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct3, "status", this.f216383b);
                return Unit.f186387a;
            case 10:
                f3 buildStruct4 = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct4, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct4, "resourceId", this.f216383b);
                return Unit.f186387a;
            case 11:
                f3 buildStruct5 = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct5, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct5, "name", this.f216383b);
                return Unit.f186387a;
            case 12:
                ((no6.b) obj2).getClass();
                return new no6.b(this.f216383b);
            case 13:
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    UserInfoAccount.Claim claim = ((UserInfoAccount) obj3).f106206g;
                    if (Intrinsics.f(claim != null ? claim.f106213c : null, this.f216383b)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 14:
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                ArrayList arrayList2 = portfolio.e;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    if (obj4 instanceof kel.n) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : arrayList3) {
                    kel.n nVar = (kel.n) obj5;
                    if (Intrinsics.f(nVar.e, this.f216383b) && e1.D(nVar.f183174b)) {
                        arrayList4.add(obj5);
                    }
                }
                return arrayList4;
            case 15:
                nuc.h update5 = (nuc.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return nuc.h.a(update5, null, this.f216383b, null, null, 29);
            case 16:
                iv9.l it9 = (iv9.l) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.getAuthorCode(), this.f216383b));
            case 17:
                nwf.e updateState = (nwf.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return nwf.e.a(updateState, this.f216383b, null, null, 6);
            case 18:
                nxa.l update6 = (nxa.l) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return nxa.l.a(update6, this.f216383b, null, false, null, 14);
            case 19:
                return nxa.l.a((nxa.l) obj2, this.f216383b, null, false, null, 14);
            case 20:
                FreelancerOnboardingFlowContract$DomainState update7 = (FreelancerOnboardingFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return FreelancerOnboardingFlowContract$DomainState.a(update7, null, null, this.f216383b, null, null, null, 59);
            case 21:
                FreelancerOnboardingFlowContract$DomainState update8 = (FreelancerOnboardingFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return FreelancerOnboardingFlowContract$DomainState.a(update8, null, null, null, this.f216383b, null, null, 55);
            case 22:
                return FreelancerOnboardingFlowContract$DomainState.a((FreelancerOnboardingFlowContract$DomainState) obj2, null, null, null, null, this.f216383b, null, 47);
            case 23:
                jzc.i it10 = (jzc.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.getId(), this.f216383b));
            case 24:
                o22.a update9 = (o22.a) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return o22.a.a(update9, null, null, null, this.f216383b, 23);
            case 25:
                o22.a update10 = (o22.a) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return o22.a.a(update10, null, null, this.f216383b, null, 27);
            case 26:
                sh1.h it11 = (sh1.h) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return sh1.h.a(it11, sh1.g.a(it11.f263347b, this.f216383b, null, 6), null, null, null, null, null, null, null, null, null, null, null, 8189);
            case 27:
                sh1.h it12 = (sh1.h) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return sh1.h.a(it12, null, null, null, null, null, null, null, null, null, null, null, sh1.g.a(it12.f263353m, this.f216383b, null, 6), 4095);
            case 28:
                sh1.h it13 = (sh1.h) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return sh1.h.a(it13, null, null, null, null, null, null, null, null, null, sh1.g.a(it13.k, this.f216383b, null, 6), null, null, 7167);
            default:
                sh1.h it14 = (sh1.h) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return sh1.h.a(it14, null, null, null, null, null, null, null, null, null, null, sh1.g.a(it14.f263352l, this.f216383b, null, 6), null, 6143);
        }
    }

    public /* synthetic */ b(String str, int i) {
        this.f216382a = i;
        this.f216383b = str;
    }
}
