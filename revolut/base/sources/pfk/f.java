package pfk;

import ip0.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f235634b;

    public /* synthetic */ f(s sVar, int i) {
        this.f235633a = i;
        this.f235634b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f235633a) {
            case 0:
                l request = (l) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                return (lha.j) this.f235634b.f235685a.get(request.f235653c);
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "request");
                return (List) this.f235634b.f235685a.get("PENDING_INVITATIONS_KEY");
            case 2:
                String planId = (String) obj2;
                Intrinsics.checkNotNullParameter(planId, "planId");
                return (lha.p) v7.r("FAMILY_PLAN_SUBSCRIBE_INFO_", planId, this.f235634b.f235685a);
            case 3:
                k params = (k) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (lha.p) this.f235634b.f235685a.get(s.c(params));
            case 4:
                i params2 = (i) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (lha.g) this.f235634b.f235685a.get(s.b(params2.f235642b));
            case 5:
                j params3 = (j) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (lha.e) this.f235634b.f235685a.get("FAMILY_PLAN_EXTRA_CANCELLATION_PREVIEW__" + params3.f235645a + "_" + params3.f235646b);
            case 6:
                Intrinsics.checkNotNullParameter((Unit) obj2, "params");
                return (lha.d) this.f235634b.f235685a.get("FAMILY_LIMITS_KEY");
            default:
                String code = (String) obj2;
                Intrinsics.checkNotNullParameter(code, "code");
                return (lha.n) v7.r("MEMBER_ELIGIBILITY_CACHE_KEY_SUFFIX_", code, this.f235634b.f235685a);
        }
    }
}
