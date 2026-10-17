package er9;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f128564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentsGroupsService f128565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yq9.l f128566c;
    public final r10.f d;
    public final Type e;

    public e(ue0.c storage, PaymentsGroupsService service, yq9.l groupsMembersDao, r10.f groupMemberContactMapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(groupsMembersDao, "groupsMembersDao");
        Intrinsics.checkNotNullParameter(groupMemberContactMapper, "groupMemberContactMapper");
        this.f128564a = storage;
        this.f128565b = service;
        this.f128566c = groupsMembersDao;
        this.d = groupMemberContactMapper;
        this.e = new TypeToken<List<? extends fr9.a>>() { // from class: com.revolut.feature.payments.groups.impl.data.repositories.PaymentsGroupsRemindersRepositoryImpl$remindersType$1
        }.getType();
    }

    public final efm.r a(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        String strQ = j6.a.q("STORAGE_KEY_REMINDERS", groupId);
        Type remindersType = this.e;
        Intrinsics.checkNotNullExpressionValue(remindersType, "remindersType");
        efm.r map = rd0.e.c(this.f128564a.C0(strQ, remindersType), kotlin.coroutines.g.f186406a).map(new eli.k(new eqd.h(8), 12));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ue0.e.H(pd.b.t(map, new eq4.c(this, groupId, 11)), h0.f322473a, new eqd.h(9));
    }
}
