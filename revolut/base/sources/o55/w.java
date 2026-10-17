package o55;

import androidx.room.RxRoom;
import com.revolut.feature.credit.loan.impl.network.LoanRepaymentsService;
import java.time.Clock;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanRepaymentsService f222374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n45.d f222375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d55.g f222376c;
    public final atg.l d;
    public final com.google.firebase.messaging.t e;
    public final ao.h f;

    public w(LoanRepaymentsService api2, xx4.d memoryCache, n45.d loanRepaymentDao, d55.g previewMapper, atg.l walletsRepository) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(loanRepaymentDao, "loanRepaymentDao");
        Intrinsics.checkNotNullParameter(previewMapper, "previewMapper");
        Intrinsics.checkNotNullParameter(walletsRepository, "walletsRepository");
        this.f222374a = api2;
        this.f222375b = loanRepaymentDao;
        this.f222376c = previewMapper;
        this.d = walletsRepository;
        int i = 0;
        final int i2 = 0;
        this.e = new com.google.firebase.messaging.t(new Function1(this) { // from class: o55.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f222373b;

            {
                this.f222373b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        s key = (s) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        n45.d dVar = this.f222373b.f222375b;
                        efm.r map = RxRoom.createObservable(dVar.f212298a, false, new String[]{"loan_repayments"}, new mll.h(dVar, key.f222367a)).map(new o4a.e(15, new o5.b(20)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map;
                    default:
                        String loanId = (String) obj2;
                        Intrinsics.checkNotNullParameter(loanId, "loanId");
                        String string = ZonedDateTime.now(Clock.systemUTC()).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        w wVar = this.f222373b;
                        efm.d0<i55.t<i55.d0>> loanRepayments = wVar.f222374a.getLoanRepayments(loanId, string, 100);
                        o4a.e eVar = new o4a.e(16, new o5.b(21));
                        loanRepayments.getClass();
                        ufm.i iVar = new ufm.i(loanRepayments, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        efm.b bVarIgnoreElements = new sfm.b(iVar, new o4a.e(13, new t(wVar, loanId, 0)), 2).doOnNext(new o4a.e(14, new t(wVar, loanId, 1))).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                        pfm.z zVarD = bVarIgnoreElements.D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                }
            }
        }, new ald.o(1, memoryCache, xx4.d.class, "get", "get(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;)Ljava/lang/Object;", i, 11), new jki.d(2, memoryCache, xx4.d.class, "set", "set(Lcom/revolut/feature/credit/core/storage/MemoryCacheKey;Ljava/lang/Object;)V", i, 5));
        final int i3 = 1;
        this.f = new ao.h(20, new Function1(this) { // from class: o55.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f222373b;

            {
                this.f222373b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        s key = (s) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        n45.d dVar = this.f222373b.f222375b;
                        efm.r map = RxRoom.createObservable(dVar.f212298a, false, new String[]{"loan_repayments"}, new mll.h(dVar, key.f222367a)).map(new o4a.e(15, new o5.b(20)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map;
                    default:
                        String loanId = (String) obj2;
                        Intrinsics.checkNotNullParameter(loanId, "loanId");
                        String string = ZonedDateTime.now(Clock.systemUTC()).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        w wVar = this.f222373b;
                        efm.d0<i55.t<i55.d0>> loanRepayments = wVar.f222374a.getLoanRepayments(loanId, string, 100);
                        o4a.e eVar = new o4a.e(16, new o5.b(21));
                        loanRepayments.getClass();
                        ufm.i iVar = new ufm.i(loanRepayments, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        efm.b bVarIgnoreElements = new sfm.b(iVar, new o4a.e(13, new t(wVar, loanId, 0)), 2).doOnNext(new o4a.e(14, new t(wVar, loanId, 1))).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                        pfm.z zVarD = bVarIgnoreElements.D(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                        return zVarD;
                }
            }
        });
    }

    public static ZonedDateTime a(List list) {
        Iterator it8 = list.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        ZonedDateTime repaymentDateTime = ((i55.d0) it8.next()).getRepaymentDateTime();
        while (it8.hasNext()) {
            ZonedDateTime repaymentDateTime2 = ((i55.d0) it8.next()).getRepaymentDateTime();
            if (repaymentDateTime.compareTo(repaymentDateTime2) > 0) {
                repaymentDateTime = repaymentDateTime2;
            }
        }
        return repaymentDateTime;
    }

    public final efm.r b(String str, String str2, List list) {
        ZonedDateTime zonedDateTime = str2 != null ? ZonedDateTime.parse(str2) : null;
        if (list.size() < 100 || (zonedDateTime != null && zonedDateTime.isAfter(a(list)))) {
            efm.r rVarJust = efm.r.just(list);
            Intrinsics.h(rVarJust);
            return rVarJust;
        }
        efm.r rVarJust2 = efm.r.just(list);
        Intrinsics.checkNotNullExpressionValue(rVarJust2, "just(...)");
        String string = a(list).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        efm.d0<i55.t<i55.d0>> loanRepayments = this.f222374a.getLoanRepayments(str, string, 100);
        o4a.e eVar = new o4a.e(16, new o5.b(21));
        loanRepayments.getClass();
        ufm.i iVar = new ufm.i(loanRepayments, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        sfm.b bVar = new sfm.b(iVar, new o4a.e(17, new neg.q(this, 20, str, str2)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        efm.r map = te0.w.l(rVarJust2, bVar).map(new o4a.e(9, new o5.b(15)));
        Intrinsics.h(map);
        return map;
    }
}
