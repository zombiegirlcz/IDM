package lr9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsService;
import cr9.v;
import efm.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentsGroupsService f199440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yq9.h f199441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yq9.l f199442c;
    public final yq9.b d;
    public final yq9.e e;
    public final yq9.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r10.f f199443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ne0.j f199444h;

    public e(PaymentsGroupsService service, yq9.h groupsDao, yq9.l groupsMembersDao, yq9.b groupsBillsDao, yq9.e groupsBillsSplitsDao, yq9.o groupsSettlementsDao, r10.f groupMemberContactMapper, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(groupsDao, "groupsDao");
        Intrinsics.checkNotNullParameter(groupsMembersDao, "groupsMembersDao");
        Intrinsics.checkNotNullParameter(groupsBillsDao, "groupsBillsDao");
        Intrinsics.checkNotNullParameter(groupsBillsSplitsDao, "groupsBillsSplitsDao");
        Intrinsics.checkNotNullParameter(groupsSettlementsDao, "groupsSettlementsDao");
        Intrinsics.checkNotNullParameter(groupMemberContactMapper, "groupMemberContactMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f199440a = service;
        this.f199441b = groupsDao;
        this.f199442c = groupsMembersDao;
        this.d = groupsBillsDao;
        this.e = groupsBillsSplitsDao;
        this.f = groupsSettlementsDao;
        this.f199443g = groupMemberContactMapper;
        this.f199444h = memoryCache;
    }

    public final z a(long j2, String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        d0<List<cr9.l>> groupBills = this.f199440a.getGroupBills(groupId, Long.valueOf(j2));
        llh.g gVar = new llh.g(29, new loc.a(11));
        groupBills.getClass();
        ufm.i iVar = new ufm.i(groupBills, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        int i = 0;
        ufm.i iVar2 = new ufm.i(w.H0(iVar, d(groupId)), new b(i, new a(this, groupId, i)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return ue0.e.F(iVar2, -1L);
    }

    public final z b(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        d0<v> group2 = this.f199440a.getGroup(true, group.getF79285a());
        b bVar = new b(3, new c(this, 1));
        group2.getClass();
        ufm.i iVar = new ufm.i(group2, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.F(iVar, group);
    }

    public final z c(long j2, String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        int i = 1;
        ufm.i iVar = new ufm.i(w.H0(this.f199440a.getGroupSettlements(groupId, Long.valueOf(j2)), d(groupId)), new b(i, new a(this, groupId, i)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, -1L);
    }

    public final ufm.i d(String str) {
        d0 d0VarFirstOrError = this.f199442c.a(str).firstOrError();
        b bVar = new b(2, new c(this, 0));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
