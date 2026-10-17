package pfk;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f235636b;

    public /* synthetic */ g(s sVar, int i) {
        this.f235635a = i;
        this.f235636b = sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f235635a) {
            case 0:
                String code = (String) obj2;
                lha.n eligibility = (lha.n) obj3;
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                this.f235636b.f235685a.f("MEMBER_ELIGIBILITY_CACHE_KEY_SUFFIX_" + code, eligibility);
                break;
            case 1:
                List invitations = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "request");
                Intrinsics.checkNotNullParameter(invitations, "invitations");
                this.f235636b.f235685a.f("PENDING_INVITATIONS_KEY", invitations);
                break;
            case 2:
                String planId = (String) obj2;
                lha.p subscribeInfo = (lha.p) obj3;
                Intrinsics.checkNotNullParameter(planId, "planId");
                Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
                this.f235636b.f235685a.f("FAMILY_PLAN_SUBSCRIBE_INFO_" + planId, subscribeInfo);
                break;
            case 3:
                k params = (k) obj2;
                lha.p subscribeInfo2 = (lha.p) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(subscribeInfo2, "subscribeInfo");
                this.f235636b.f235685a.f(s.c(params), subscribeInfo2);
                break;
            case 4:
                l request = (l) obj2;
                lha.j invitationInfo = (lha.j) obj3;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(invitationInfo, "invitationInfo");
                this.f235636b.f235685a.f(request.f235653c, invitationInfo);
                break;
            case 5:
                j params2 = (j) obj2;
                lha.e cancellationInfo = (lha.e) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(cancellationInfo, "cancellationInfo");
                this.f235636b.f235685a.f(a0.d.s("FAMILY_PLAN_EXTRA_CANCELLATION_PREVIEW__", params2.f235645a, "_", params2.f235646b), cancellationInfo);
                break;
            case 6:
                lha.d domain = (lha.d) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                this.f235636b.f235685a.f("FAMILY_LIMITS_KEY", domain);
                break;
            default:
                i params3 = (i) obj2;
                lha.g family = (lha.g) obj3;
                Intrinsics.checkNotNullParameter(params3, "params");
                Intrinsics.checkNotNullParameter(family, "family");
                this.f235636b.f235685a.f(s.b(params3.f235642b), family);
                break;
        }
        return Unit.f186387a;
    }
}
