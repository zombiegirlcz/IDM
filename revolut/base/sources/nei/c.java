package nei;

import ael.u0;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoffSearchParameters;
import efm.d0;
import efm.k;
import i9g.l;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import jul.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import n68.w;
import p9g.g;
import rfm.h;
import rfm.j;
import rfm.m;
import rfm.z;
import ufm.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f214547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f214548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f214549c;
    public final g d;

    public c(o presentationModel, l draftInteractor, e dateProvider, g staysFeatureEntryPointCommandFactory) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(draftInteractor, "draftInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(staysFeatureEntryPointCommandFactory, "staysFeatureEntryPointCommandFactory");
        this.f214547a = presentationModel;
        this.f214548b = draftInteractor;
        this.f214549c = dateProvider;
        this.d = staysFeatureEntryPointCommandFactory;
    }

    public final k a(TravelHotelsDropoff dropoff) {
        Intrinsics.checkNotNullParameter(dropoff, "dropoff");
        String str = dropoff.f97918h;
        TravelHotelsDropoffSearchParameters travelHotelsDropoffSearchParameters = dropoff.f97919j;
        h hVar = h.f253943a;
        if (str == null) {
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        f fVar = (f) this.f214549c;
        LocalDate nowDate = fVar.e();
        Intrinsics.checkNotNullParameter(dropoff, "<this>");
        Intrinsics.checkNotNullParameter(nowDate, "nowDate");
        LocalDate localDate = travelHotelsDropoffSearchParameters.f97926c;
        LocalDate localDate2 = travelHotelsDropoffSearchParameters.d;
        LocalDate localDate3 = travelHotelsDropoffSearchParameters.f97926c;
        String str2 = travelHotelsDropoffSearchParameters.e;
        if (localDate.compareTo((ChronoLocalDate) nowDate) < 0) {
            Intrinsics.i(str, "null cannot be cast to non-null type kotlin.String");
            LocalDate localDateE = fVar.e();
            LocalDate localDatePlusDays = fVar.e().plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            return c(str, localDateE, localDatePlusDays, str2);
        }
        int i = b.f214546a[dropoff.f97915b.ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        if (i == 2) {
            Intrinsics.i(str, "null cannot be cast to non-null type kotlin.String");
            return c(str, localDate3, localDate2, str2);
        }
        if (i == 3) {
            Intrinsics.i(str, "null cannot be cast to non-null type kotlin.String");
            return e(str, localDate3, localDate2, str2);
        }
        if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        if (dropoff.i == null) {
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        Intrinsics.i(str, "null cannot be cast to non-null type kotlin.String");
        LocalDate localDate4 = travelHotelsDropoffSearchParameters.f97926c;
        LocalDate localDate5 = travelHotelsDropoffSearchParameters.d;
        String str3 = travelHotelsDropoffSearchParameters.e;
        List list = dropoff.i;
        d0 d0VarFirstOrError = this.f214547a.o(str, localDate4, localDate5, str3).firstOrError();
        nd3.a aVar = new nd3.a(new u0(this, list, str, localDate4, localDate5, str3), 14);
        d0VarFirstOrError.getClass();
        j jVar = new j(d0VarFirstOrError, aVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return jVar;
    }

    public final k b() {
        k kVarW = new i(this.d.a(), new nd3.a(new nd8.i(14), 9), 1).w();
        Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
        return kVarW;
    }

    public final m c(String str, LocalDate localDate, LocalDate localDate2, String str2) {
        d0 d0VarFirstOrError = this.f214547a.n(str, localDate, localDate2, str2).firstOrError();
        nd3.a aVar = new nd3.a(new nd8.i(12), 11);
        d0VarFirstOrError.getClass();
        z zVarM = new j(d0VarFirstOrError, aVar, 2).m(b());
        Intrinsics.checkNotNullExpressionValue(zVarM, "switchIfEmpty(...)");
        return ue0.e.B(zVarM, new a(this, 2));
    }

    public final m d(String str, LocalDate localDate, LocalDate localDate2, String str2) {
        d0 d0VarFirstOrError = this.f214547a.n(str, localDate, localDate2, str2).firstOrError();
        nd3.a aVar = new nd3.a(new w((Object) this, str2, (Serializable) localDate, (Object) localDate2, 4), 10);
        d0VarFirstOrError.getClass();
        z zVarM = new j(d0VarFirstOrError, aVar, 2).m(c(str, localDate, localDate2, str2));
        Intrinsics.checkNotNullExpressionValue(zVarM, "switchIfEmpty(...)");
        return ue0.e.B(zVarM, new a(this, 1));
    }

    public final j e(String str, LocalDate localDate, LocalDate localDate2, String str2) {
        d0 d0VarFirstOrError = this.f214547a.o(str, localDate, localDate2, str2).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        nd3.a aVar = new nd3.a(new nd8.i(13), 8);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        j jVar = new j(iVar, new nd3.a(new kwg.e((Object) this, str, (Object) localDate, (Object) localDate2, str2, 7), 13), 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return jVar;
    }
}
