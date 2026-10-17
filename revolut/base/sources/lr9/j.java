package lr9;

import androidx.room.RxRoom;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import e4k.m0;
import efm.d0;
import er9.x;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f199451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er9.f f199452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv9.k f199453c;
    public final yq9.l d;
    public final yq9.b e;
    public final yq9.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f199454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r10.f f199455h;
    public final ang.f i;

    public j(e dataRepository, er9.f groupsRepository, mv9.k messagesRepository, yq9.l groupsMembersDao, yq9.b groupsBillsDao, yq9.o groupsSettlementsDao, r groupsTimestampManager, r10.f groupMemberContactMapper, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(dataRepository, "dataRepository");
        Intrinsics.checkNotNullParameter(groupsRepository, "groupsRepository");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(groupsMembersDao, "groupsMembersDao");
        Intrinsics.checkNotNullParameter(groupsBillsDao, "groupsBillsDao");
        Intrinsics.checkNotNullParameter(groupsSettlementsDao, "groupsSettlementsDao");
        Intrinsics.checkNotNullParameter(groupsTimestampManager, "groupsTimestampManager");
        Intrinsics.checkNotNullParameter(groupMemberContactMapper, "groupMemberContactMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f199451a = dataRepository;
        this.f199452b = groupsRepository;
        this.f199453c = messagesRepository;
        this.d = groupsMembersDao;
        this.e = groupsBillsDao;
        this.f = groupsSettlementsDao;
        this.f199454g = groupsTimestampManager;
        this.f199455h = groupMemberContactMapper;
        this.i = userInteractor;
    }

    public final ufm.i a(ArrayList arrayList) {
        yq9.l lVar = this.d;
        lVar.getClass();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("SELECT * FROM payments_groups_members WHERE groupId IN (");
        d0 d0VarFirstOrError = RxRoom.createObservable(lVar.f316016a, false, new String[]{"payments_groups_members"}, new yq9.k(lVar, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, sb6, ")"), arrayList, 1)).firstOrError();
        b bVar = new b(16, new g(this, 3));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.r b(mq9.a aVar) {
        int i = i.f199450a[aVar.ordinal()];
        if (i == 1) {
            return w.h(Unit.f186387a);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        j01.b bVar = new j01.b(efm.r.interval(0L, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, TimeUnit.MILLISECONDS, hhm.f.f152431c).toFlowable(efm.a.DROP).f(new b(6, new g(this, 0)), 1, efm.i.f125385a), 7);
        Intrinsics.checkNotNullExpressionValue(bVar, "toObservable(...)");
        return bVar.firstOrError().x();
    }

    public final efm.r c(long j2) {
        yq9.c cVar = (yq9.c) this.e;
        efm.r rVarFlatMapSingle = RxRoom.createObservable(cVar.f315994a, false, new String[]{"payments_groups_bills"}, new m0(cVar, j2, 18)).flatMapSingle(new b(8, new g(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        yq9.o oVar = this.f;
        efm.r rVarFlatMapSingle2 = RxRoom.createObservable(oVar.f316023a, false, new String[]{"payments_groups_settlements"}, new m0(oVar, j2, 19)).flatMapSingle(new b(4, new g(this, 4)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle2, "flatMapSingle(...)");
        sfm.b bVar = new sfm.b(this.i.f(false), new b(5, new f(this, j2, 1)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        x xVar = (x) this.f199452b;
        yq9.h hVar = xVar.f128596a;
        efm.r rVarFlatMapSingle3 = RxRoom.createObservable(hVar.f316005a, false, new String[]{"payments_groups"}, new yo7.p(hVar, 9)).map(new er9.k(11, new er9.h(xVar, 28))).flatMapSingle(new er9.k(12, new er9.h(xVar, 29)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle3, "flatMapSingle(...)");
        efm.r map = rVarFlatMapSingle3.map(new er9.k(6, new a82.r(j2, 14)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = w.n(rVarFlatMapSingle, rVarFlatMapSingle2, bVar, map).map(new b(21, new loc.a(16)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return w.f0(map2);
    }
}
