package qb9;

import ib9.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, hb9.b.class, "toDomain", "toDomain(Lcom/revolut/feature/onboarding/impl/onboarding/model/WaitingListResponseDto;)Lcom/revolut/feature/onboarding/api/waiting_list/models/WaitingList;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h p0 = (h) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new e99.a(p0.getReferralCode(), p0.getReferralLink());
    }
}
