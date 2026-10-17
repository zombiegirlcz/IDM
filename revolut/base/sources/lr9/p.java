package lr9;

import androidx.room.RxRoom;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import efm.d0;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f199465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yq9.h f199466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yq9.l f199467c;
    public final yq9.b d;
    public final yq9.e e;
    public final yq9.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f199468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r10.f f199469h;

    public p(e dataRepository, yq9.h groupsDao, yq9.l groupsMembersDao, yq9.b groupsBillsDao, yq9.e groupsBillsSplitsDao, yq9.o groupsSettlementsDao, r groupsTimestampManager, r10.f groupMemberContactMapper) {
        Intrinsics.checkNotNullParameter(dataRepository, "dataRepository");
        Intrinsics.checkNotNullParameter(groupsDao, "groupsDao");
        Intrinsics.checkNotNullParameter(groupsMembersDao, "groupsMembersDao");
        Intrinsics.checkNotNullParameter(groupsBillsDao, "groupsBillsDao");
        Intrinsics.checkNotNullParameter(groupsBillsSplitsDao, "groupsBillsSplitsDao");
        Intrinsics.checkNotNullParameter(groupsSettlementsDao, "groupsSettlementsDao");
        Intrinsics.checkNotNullParameter(groupsTimestampManager, "groupsTimestampManager");
        Intrinsics.checkNotNullParameter(groupMemberContactMapper, "groupMemberContactMapper");
        this.f199465a = dataRepository;
        this.f199466b = groupsDao;
        this.f199467c = groupsMembersDao;
        this.d = groupsBillsDao;
        this.e = groupsBillsSplitsDao;
        this.f = groupsSettlementsDao;
        this.f199468g = groupsTimestampManager;
        this.f199469h = groupMemberContactMapper;
    }

    public final ufm.i a(String str) {
        d0 d0VarFirstOrError = this.f199467c.a(str).firstOrError();
        m mVar = new m(new lk4.g(this, 22), 0);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, mVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.r b(PaymentGroup paymentGroup) {
        String str = paymentGroup.f79285a;
        yq9.h hVar = this.f199466b;
        efm.r rVarFlatMapSingle = RxRoom.createObservable(hVar.f316005a, false, new String[]{"payments_groups"}, new yj2.b(hVar, str, 19)).flatMapSingle(new b(23, new k(this, paymentGroup, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        efm.r rVarE = ue0.e.E(rVarFlatMapSingle, paymentGroup);
        String str2 = paymentGroup.f79285a;
        yq9.c cVar = (yq9.c) this.d;
        efm.r rVarFlatMapSingle2 = RxRoom.createObservable(cVar.f315994a, false, new String[]{"payments_groups_bills"}, new yj2.b(cVar, str2, 16)).flatMapSingle(new b(24, new l(this, str2, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle2, "flatMapSingle(...)");
        yq9.o oVar = this.f;
        efm.r rVarFlatMapSingle3 = RxRoom.createObservable(oVar.f316023a, false, new String[]{"payments_groups_settlements"}, new yq9.m(oVar, str2, 1)).flatMapSingle(new b(25, new l(this, str2, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle3, "flatMapSingle(...)");
        efm.r map = w.m(rVarE, rVarFlatMapSingle2, rVarFlatMapSingle3).map(new m(new loc.a(20), 4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return w.f0(map);
    }

    public final efm.r c(PaymentGroup group, mq9.b observeMode) {
        efm.r rVarH;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(observeMode, "observeMode");
        efm.r rVarB = b(group);
        int i = o.f199464a[observeMode.ordinal()];
        if (i == 1) {
            rVarH = w.h(Unit.f186387a);
        } else if (i == 2) {
            rVarH = d(group).firstOrError().x();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            rVarH = rd0.e.p(d(group), CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, 30000L, 25);
        }
        efm.r rVarDistinctUntilChanged = w.l(rVarB, rVarH).map(new m(new loc.a(19), 2)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        d0 d0VarFirstOrError = b(group).firstOrError();
        m mVar = new m(new lk4.g(observeMode, 21), 1);
        d0VarFirstOrError.getClass();
        efm.r rVarX = new ufm.i(d0VarFirstOrError, mVar, 1).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r rVarDistinctUntilChanged2 = rVarDistinctUntilChanged.startWith((efm.w) rVarX).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        return ue0.e.H(rVarDistinctUntilChanged2, h0.f322473a, new bs9.d0(group, 2));
    }

    public final j01.b d(PaymentGroup paymentGroup) {
        j01.b bVar = new j01.b(efm.r.interval(0L, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, TimeUnit.MILLISECONDS, hhm.f.f152431c).toFlowable(efm.a.DROP).f(new m(new k(this, paymentGroup, 1), 3), 1, efm.i.f125385a), 7);
        Intrinsics.checkNotNullExpressionValue(bVar, "toObservable(...)");
        return bVar;
    }
}
