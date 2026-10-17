package ao7;

import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.common.date_range.DateRangeScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.date_range.DateRangeScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.date.MtaDateSelectorScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAdjuster;
import kl7.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends jki.g implements i {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final LocalTime f7919t;
    public static final LocalTime u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MtaDateSelectorScreenContract$InputData f7920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tl7.f f7921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l80.e f7922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f7923s;

    static {
        LocalTime localTime = LocalTime.parse("09:00");
        Intrinsics.checkNotNullExpressionValue(localTime, "parse(...)");
        f7919t = localTime;
        LocalTime localTime2 = LocalTime.parse("23:59");
        Intrinsics.checkNotNullExpressionValue(localTime2, "parse(...)");
        u = localTime2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jki.p stateMapper, MtaDateSelectorScreenContract$InputData inputData, tl7.f bottomDialog, l80.e dateProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f7920p = inputData;
        this.f7921q = bottomDialog;
        this.f7922r = dateProvider;
        ZonedDateTime zonedDateTimeWith = A2(((l80.f) dateProvider).k()).plusDays(5L).with((TemporalAdjuster) f7919t);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
        ZonedDateTime zonedDateTimeZ2 = z2(zonedDateTimeWith);
        a1 a1Var = inputData.f75530a;
        boolean z = inputData.f75531b;
        ZonedDateTime zonedDateTimeA2 = null;
        if (z) {
            ZonedDateTime zonedDateTimeWith2 = zonedDateTimeZ2.plusDays(7L).with((TemporalAdjuster) u);
            Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith2, "with(...)");
            zonedDateTimeA2 = A2((ZonedDateTime) kotlin.ranges.f.j(zonedDateTimeWith2, null, inputData.e));
        }
        this.f7923s = new f(a1Var, z, zonedDateTimeZ2, zonedDateTimeA2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.time.ZonedDateTime] */
    public static ZonedDateTime A2(ZonedDateTime zonedDateTime) {
        k.Companion.getClass();
        ?? WithZoneSameInstant = zonedDateTime.withZoneSameInstant(e.f7905b);
        Intrinsics.checkNotNullExpressionValue(WithZoneSameInstant, "withZoneSameInstant(...)");
        return WithZoneSameInstant;
    }

    public final ZonedDateTime B2() {
        Comparable comparableC = kotlin.ranges.f.c(kotlin.ranges.f.j(A2(((l80.f) this.f7922r).k()).plusDays(30L), null, this.f7920p.d), C2());
        Intrinsics.checkNotNullExpressionValue(comparableC, "coerceAtLeast(...)");
        return A2((ZonedDateTime) comparableC);
    }

    public final ZonedDateTime C2() {
        Comparable comparableJ = kotlin.ranges.f.j(A2(((l80.f) this.f7922r).k()).plusHours(1L), this.f7920p.f75532c, null);
        Intrinsics.checkNotNullExpressionValue(comparableJ, "coerceIn(...)");
        return A2((ZonedDateTime) comparableJ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void D2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        tl7.f fVar = this.f7921q;
        switch (iHashCode) {
            case -2133947866:
                if (listId.equals("DATE_RANGE_ITEM")) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_mta_date_date_range_selector_title, null, null, 14);
                    LocalDate localDate = C2().toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                    ZonedDateTime zonedDateTimePlusDays = B2().plusDays(30L);
                    Intrinsics.checkNotNullExpressionValue(zonedDateTimePlusDays, "plusDays(...)");
                    LocalDate localDate2 = A2((ZonedDateTime) kotlin.ranges.f.j(zonedDateTimePlusDays, null, this.f7920p.e)).toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
                    LocalDate localDate3 = ((f) t2()).f7908c.toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate3, "toLocalDate(...)");
                    ZonedDateTime zonedDateTime = ((f) t2()).d;
                    if (zonedDateTime == null) {
                        throw new IllegalStateException("endDateTime must not be null");
                    }
                    LocalDate localDate4 = zonedDateTime.toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate4, "toLocalDate(...)");
                    LocalDate localDate5 = A2(((l80.f) this.f7922r).k()).toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate5, "toLocalDate(...)");
                    final int i = 2;
                    f2(new DateRangeScreen(new DateRangeScreenContract$InputData(textLocalisedClause, localDate, localDate2, localDate3, localDate4, localDate5)), ModalDestination.Style.POPUP.f98311a, new Function1(this) { // from class: ao7.l

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ o f7915b;

                        {
                            this.f7915b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i) {
                                case 0:
                                    final LocalTime selectedTime = (LocalTime) obj3;
                                    Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
                                    final int i2 = 0;
                                    final o oVar = this.f7915b;
                                    oVar.x2(new Function1() { // from class: ao7.m
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            f updateState = (f) obj4;
                                            switch (i2) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTime2 = updateState.d;
                                                    if (zonedDateTime2 == null) {
                                                        throw new IllegalStateException("endDateTime must not be null");
                                                    }
                                                    ZonedDateTime zonedDateTimeWith = zonedDateTime2.with((TemporalAdjuster) selectedTime);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
                                                    return f.a(updateState, null, oVar.y2(zonedDateTimeWith, updateState.f7908c), 7);
                                                default:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTimeWith2 = updateState.f7908c.with((TemporalAdjuster) selectedTime);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith2, "with(...)");
                                                    o oVar2 = oVar;
                                                    ZonedDateTime zonedDateTimeZ2 = oVar2.z2(zonedDateTimeWith2);
                                                    ZonedDateTime zonedDateTime3 = updateState.d;
                                                    return f.a(updateState, zonedDateTimeZ2, zonedDateTime3 != null ? oVar2.y2(zonedDateTime3, zonedDateTimeZ2) : null, 3);
                                            }
                                        }
                                    });
                                    break;
                                case 1:
                                    final LocalTime selectedTime2 = (LocalTime) obj3;
                                    Intrinsics.checkNotNullParameter(selectedTime2, "selectedTime");
                                    final int i3 = 1;
                                    final o oVar2 = this.f7915b;
                                    oVar2.x2(new Function1() { // from class: ao7.m
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            f updateState = (f) obj4;
                                            switch (i3) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTime2 = updateState.d;
                                                    if (zonedDateTime2 == null) {
                                                        throw new IllegalStateException("endDateTime must not be null");
                                                    }
                                                    ZonedDateTime zonedDateTimeWith = zonedDateTime2.with((TemporalAdjuster) selectedTime2);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
                                                    return f.a(updateState, null, oVar2.y2(zonedDateTimeWith, updateState.f7908c), 7);
                                                default:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTimeWith2 = updateState.f7908c.with((TemporalAdjuster) selectedTime2);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith2, "with(...)");
                                                    o oVar22 = oVar2;
                                                    ZonedDateTime zonedDateTimeZ2 = oVar22.z2(zonedDateTimeWith2);
                                                    ZonedDateTime zonedDateTime3 = updateState.d;
                                                    return f.a(updateState, zonedDateTimeZ2, zonedDateTime3 != null ? oVar22.y2(zonedDateTime3, zonedDateTimeZ2) : null, 3);
                                            }
                                        }
                                    });
                                    break;
                                case 2:
                                    nn7.f result = (nn7.f) obj3;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    LocalDate localDate6 = (LocalDate) result.f217476a.getStart();
                                    LocalDate localDate7 = (LocalDate) result.f217476a.b();
                                    o oVar3 = this.f7915b;
                                    LocalDate localDate8 = o.A2(((l80.f) oVar3.f7922r).k()).toLocalDate();
                                    Intrinsics.checkNotNullExpressionValue(localDate8, "toLocalDate(...)");
                                    if (localDate6.compareTo((ChronoLocalDate) localDate8.plusDays(30L)) > 0) {
                                        oVar3.X1(vl7.a.f(new TextLocalisedClause(R$string.car_insurance_mta_date_max_start_date_warning_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_date_max_start_date_warning_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14), null));
                                    } else if (localDate7.compareTo((ChronoLocalDate) localDate6.plusDays(30L)) > 0) {
                                        oVar3.X1(vl7.a.f(new TextLocalisedClause(R$string.car_insurance_mta_date_max_duration_warning_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_date_max_duration_warning_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14), null));
                                    }
                                    oVar3.x2(new amh.j(oVar3, result, 12));
                                    break;
                                default:
                                    LocalDate selectedDate = (LocalDate) obj3;
                                    Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                                    o oVar4 = this.f7915b;
                                    oVar4.x2(new amh.j(oVar4, selectedDate, 13));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                return;
            case -94401374:
                if (listId.equals("DATE_SELECTOR_ITEM")) {
                    int i2 = R$string.car_insurance_mta_date_date_selector_title;
                    LocalDate min = C2().toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(min, "toLocalDate(...)");
                    LocalDate max = B2().toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(max, "toLocalDate(...)");
                    LocalDate currentSelection = ((f) t2()).f7908c.toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(currentSelection, "toLocalDate(...)");
                    final int i3 = 3;
                    Function1 onSelected = new Function1(this) { // from class: ao7.l

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ o f7915b;

                        {
                            this.f7915b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i3) {
                                case 0:
                                    final LocalTime selectedTime = (LocalTime) obj3;
                                    Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
                                    final int i22 = 0;
                                    final o oVar = this.f7915b;
                                    oVar.x2(new Function1() { // from class: ao7.m
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            f updateState = (f) obj4;
                                            switch (i22) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTime2 = updateState.d;
                                                    if (zonedDateTime2 == null) {
                                                        throw new IllegalStateException("endDateTime must not be null");
                                                    }
                                                    ZonedDateTime zonedDateTimeWith = zonedDateTime2.with((TemporalAdjuster) selectedTime);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
                                                    return f.a(updateState, null, oVar.y2(zonedDateTimeWith, updateState.f7908c), 7);
                                                default:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTimeWith2 = updateState.f7908c.with((TemporalAdjuster) selectedTime);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith2, "with(...)");
                                                    o oVar22 = oVar;
                                                    ZonedDateTime zonedDateTimeZ2 = oVar22.z2(zonedDateTimeWith2);
                                                    ZonedDateTime zonedDateTime3 = updateState.d;
                                                    return f.a(updateState, zonedDateTimeZ2, zonedDateTime3 != null ? oVar22.y2(zonedDateTime3, zonedDateTimeZ2) : null, 3);
                                            }
                                        }
                                    });
                                    break;
                                case 1:
                                    final LocalTime selectedTime2 = (LocalTime) obj3;
                                    Intrinsics.checkNotNullParameter(selectedTime2, "selectedTime");
                                    final int i32 = 1;
                                    final o oVar2 = this.f7915b;
                                    oVar2.x2(new Function1() { // from class: ao7.m
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            f updateState = (f) obj4;
                                            switch (i32) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTime2 = updateState.d;
                                                    if (zonedDateTime2 == null) {
                                                        throw new IllegalStateException("endDateTime must not be null");
                                                    }
                                                    ZonedDateTime zonedDateTimeWith = zonedDateTime2.with((TemporalAdjuster) selectedTime2);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
                                                    return f.a(updateState, null, oVar2.y2(zonedDateTimeWith, updateState.f7908c), 7);
                                                default:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTimeWith2 = updateState.f7908c.with((TemporalAdjuster) selectedTime2);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith2, "with(...)");
                                                    o oVar22 = oVar2;
                                                    ZonedDateTime zonedDateTimeZ2 = oVar22.z2(zonedDateTimeWith2);
                                                    ZonedDateTime zonedDateTime3 = updateState.d;
                                                    return f.a(updateState, zonedDateTimeZ2, zonedDateTime3 != null ? oVar22.y2(zonedDateTime3, zonedDateTimeZ2) : null, 3);
                                            }
                                        }
                                    });
                                    break;
                                case 2:
                                    nn7.f result = (nn7.f) obj3;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    LocalDate localDate6 = (LocalDate) result.f217476a.getStart();
                                    LocalDate localDate7 = (LocalDate) result.f217476a.b();
                                    o oVar3 = this.f7915b;
                                    LocalDate localDate8 = o.A2(((l80.f) oVar3.f7922r).k()).toLocalDate();
                                    Intrinsics.checkNotNullExpressionValue(localDate8, "toLocalDate(...)");
                                    if (localDate6.compareTo((ChronoLocalDate) localDate8.plusDays(30L)) > 0) {
                                        oVar3.X1(vl7.a.f(new TextLocalisedClause(R$string.car_insurance_mta_date_max_start_date_warning_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_date_max_start_date_warning_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14), null));
                                    } else if (localDate7.compareTo((ChronoLocalDate) localDate6.plusDays(30L)) > 0) {
                                        oVar3.X1(vl7.a.f(new TextLocalisedClause(R$string.car_insurance_mta_date_max_duration_warning_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_date_max_duration_warning_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14), null));
                                    }
                                    oVar3.x2(new amh.j(oVar3, result, 12));
                                    break;
                                default:
                                    LocalDate selectedDate = (LocalDate) obj3;
                                    Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                                    o oVar4 = this.f7915b;
                                    oVar4.x2(new amh.j(oVar4, selectedDate, 13));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(min, "min");
                    Intrinsics.checkNotNullParameter(max, "max");
                    Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
                    Intrinsics.checkNotNullParameter(onSelected, "onSelected");
                    Intrinsics.checkNotNullParameter(min, "min");
                    Intrinsics.checkNotNullParameter(max, "max");
                    Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
                    t tVar = new t(new TextLocalisedClause(i2, null, null, 14), null, null, 30);
                    g5 g5Var = new g5("DATE_PICKER_ITEM_ID", currentSelection, currentSelection, false, null, min, max, null, null, null, 0, 0, 1048376);
                    yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
                    fVar.x(new y(u.c(g5Var), tVar, rp0.l.WINDOW, null, null, null, 1016));
                    fVar.f272017q = onSelected;
                    return;
                }
                return;
            case 1902540168:
                if (listId.equals("START_TIME_ITEM")) {
                    int i5 = R$string.car_insurance_mta_date_time_selector_title_start;
                    LocalTime localTime = ((f) t2()).f7908c.toLocalTime();
                    Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
                    final int i6 = 1;
                    fVar.U(i5, localTime, new Function1(this) { // from class: ao7.l

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ o f7915b;

                        {
                            this.f7915b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i6) {
                                case 0:
                                    final LocalTime selectedTime = (LocalTime) obj3;
                                    Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
                                    final int i22 = 0;
                                    final o oVar = this.f7915b;
                                    oVar.x2(new Function1() { // from class: ao7.m
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            f updateState = (f) obj4;
                                            switch (i22) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTime2 = updateState.d;
                                                    if (zonedDateTime2 == null) {
                                                        throw new IllegalStateException("endDateTime must not be null");
                                                    }
                                                    ZonedDateTime zonedDateTimeWith = zonedDateTime2.with((TemporalAdjuster) selectedTime);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
                                                    return f.a(updateState, null, oVar.y2(zonedDateTimeWith, updateState.f7908c), 7);
                                                default:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTimeWith2 = updateState.f7908c.with((TemporalAdjuster) selectedTime);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith2, "with(...)");
                                                    o oVar22 = oVar;
                                                    ZonedDateTime zonedDateTimeZ2 = oVar22.z2(zonedDateTimeWith2);
                                                    ZonedDateTime zonedDateTime3 = updateState.d;
                                                    return f.a(updateState, zonedDateTimeZ2, zonedDateTime3 != null ? oVar22.y2(zonedDateTime3, zonedDateTimeZ2) : null, 3);
                                            }
                                        }
                                    });
                                    break;
                                case 1:
                                    final LocalTime selectedTime2 = (LocalTime) obj3;
                                    Intrinsics.checkNotNullParameter(selectedTime2, "selectedTime");
                                    final int i32 = 1;
                                    final o oVar2 = this.f7915b;
                                    oVar2.x2(new Function1() { // from class: ao7.m
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            f updateState = (f) obj4;
                                            switch (i32) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTime2 = updateState.d;
                                                    if (zonedDateTime2 == null) {
                                                        throw new IllegalStateException("endDateTime must not be null");
                                                    }
                                                    ZonedDateTime zonedDateTimeWith = zonedDateTime2.with((TemporalAdjuster) selectedTime2);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
                                                    return f.a(updateState, null, oVar2.y2(zonedDateTimeWith, updateState.f7908c), 7);
                                                default:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTimeWith2 = updateState.f7908c.with((TemporalAdjuster) selectedTime2);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith2, "with(...)");
                                                    o oVar22 = oVar2;
                                                    ZonedDateTime zonedDateTimeZ2 = oVar22.z2(zonedDateTimeWith2);
                                                    ZonedDateTime zonedDateTime3 = updateState.d;
                                                    return f.a(updateState, zonedDateTimeZ2, zonedDateTime3 != null ? oVar22.y2(zonedDateTime3, zonedDateTimeZ2) : null, 3);
                                            }
                                        }
                                    });
                                    break;
                                case 2:
                                    nn7.f result = (nn7.f) obj3;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    LocalDate localDate6 = (LocalDate) result.f217476a.getStart();
                                    LocalDate localDate7 = (LocalDate) result.f217476a.b();
                                    o oVar3 = this.f7915b;
                                    LocalDate localDate8 = o.A2(((l80.f) oVar3.f7922r).k()).toLocalDate();
                                    Intrinsics.checkNotNullExpressionValue(localDate8, "toLocalDate(...)");
                                    if (localDate6.compareTo((ChronoLocalDate) localDate8.plusDays(30L)) > 0) {
                                        oVar3.X1(vl7.a.f(new TextLocalisedClause(R$string.car_insurance_mta_date_max_start_date_warning_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_date_max_start_date_warning_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14), null));
                                    } else if (localDate7.compareTo((ChronoLocalDate) localDate6.plusDays(30L)) > 0) {
                                        oVar3.X1(vl7.a.f(new TextLocalisedClause(R$string.car_insurance_mta_date_max_duration_warning_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_date_max_duration_warning_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14), null));
                                    }
                                    oVar3.x2(new amh.j(oVar3, result, 12));
                                    break;
                                default:
                                    LocalDate selectedDate = (LocalDate) obj3;
                                    Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                                    o oVar4 = this.f7915b;
                                    oVar4.x2(new amh.j(oVar4, selectedDate, 13));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                return;
            case 2138518209:
                if (listId.equals("END_TIME_ITEM")) {
                    int i21 = R$string.car_insurance_mta_date_time_selector_title_end;
                    ZonedDateTime zonedDateTime2 = ((f) t2()).d;
                    if (zonedDateTime2 == null) {
                        throw new IllegalStateException("endDateTime must not be null");
                    }
                    LocalTime localTime2 = zonedDateTime2.toLocalTime();
                    Intrinsics.checkNotNullExpressionValue(localTime2, "toLocalTime(...)");
                    final int i22 = 0;
                    fVar.U(i21, localTime2, new Function1(this) { // from class: ao7.l

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ o f7915b;

                        {
                            this.f7915b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i22) {
                                case 0:
                                    final LocalTime selectedTime = (LocalTime) obj3;
                                    Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
                                    final int i222 = 0;
                                    final o oVar = this.f7915b;
                                    oVar.x2(new Function1() { // from class: ao7.m
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            f updateState = (f) obj4;
                                            switch (i222) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTime22 = updateState.d;
                                                    if (zonedDateTime22 == null) {
                                                        throw new IllegalStateException("endDateTime must not be null");
                                                    }
                                                    ZonedDateTime zonedDateTimeWith = zonedDateTime22.with((TemporalAdjuster) selectedTime);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
                                                    return f.a(updateState, null, oVar.y2(zonedDateTimeWith, updateState.f7908c), 7);
                                                default:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTimeWith2 = updateState.f7908c.with((TemporalAdjuster) selectedTime);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith2, "with(...)");
                                                    o oVar22 = oVar;
                                                    ZonedDateTime zonedDateTimeZ2 = oVar22.z2(zonedDateTimeWith2);
                                                    ZonedDateTime zonedDateTime3 = updateState.d;
                                                    return f.a(updateState, zonedDateTimeZ2, zonedDateTime3 != null ? oVar22.y2(zonedDateTime3, zonedDateTimeZ2) : null, 3);
                                            }
                                        }
                                    });
                                    break;
                                case 1:
                                    final LocalTime selectedTime2 = (LocalTime) obj3;
                                    Intrinsics.checkNotNullParameter(selectedTime2, "selectedTime");
                                    final int i32 = 1;
                                    final o oVar2 = this.f7915b;
                                    oVar2.x2(new Function1() { // from class: ao7.m
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            f updateState = (f) obj4;
                                            switch (i32) {
                                                case 0:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTime22 = updateState.d;
                                                    if (zonedDateTime22 == null) {
                                                        throw new IllegalStateException("endDateTime must not be null");
                                                    }
                                                    ZonedDateTime zonedDateTimeWith = zonedDateTime22.with((TemporalAdjuster) selectedTime2);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
                                                    return f.a(updateState, null, oVar2.y2(zonedDateTimeWith, updateState.f7908c), 7);
                                                default:
                                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                                    ZonedDateTime zonedDateTimeWith2 = updateState.f7908c.with((TemporalAdjuster) selectedTime2);
                                                    Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith2, "with(...)");
                                                    o oVar22 = oVar2;
                                                    ZonedDateTime zonedDateTimeZ2 = oVar22.z2(zonedDateTimeWith2);
                                                    ZonedDateTime zonedDateTime3 = updateState.d;
                                                    return f.a(updateState, zonedDateTimeZ2, zonedDateTime3 != null ? oVar22.y2(zonedDateTime3, zonedDateTimeZ2) : null, 3);
                                            }
                                        }
                                    });
                                    break;
                                case 2:
                                    nn7.f result = (nn7.f) obj3;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    LocalDate localDate6 = (LocalDate) result.f217476a.getStart();
                                    LocalDate localDate7 = (LocalDate) result.f217476a.b();
                                    o oVar3 = this.f7915b;
                                    LocalDate localDate8 = o.A2(((l80.f) oVar3.f7922r).k()).toLocalDate();
                                    Intrinsics.checkNotNullExpressionValue(localDate8, "toLocalDate(...)");
                                    if (localDate6.compareTo((ChronoLocalDate) localDate8.plusDays(30L)) > 0) {
                                        oVar3.X1(vl7.a.f(new TextLocalisedClause(R$string.car_insurance_mta_date_max_start_date_warning_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_date_max_start_date_warning_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14), null));
                                    } else if (localDate7.compareTo((ChronoLocalDate) localDate6.plusDays(30L)) > 0) {
                                        oVar3.X1(vl7.a.f(new TextLocalisedClause(R$string.car_insurance_mta_date_max_duration_warning_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_mta_date_max_duration_warning_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_gotIt, null, null, 14), null));
                                    }
                                    oVar3.x2(new amh.j(oVar3, result, 12));
                                    break;
                                default:
                                    LocalDate selectedDate = (LocalDate) obj3;
                                    Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                                    o oVar4 = this.f7915b;
                                    oVar4.x2(new amh.j(oVar4, selectedDate, 13));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f7923s;
    }

    public final ZonedDateTime y2(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        ZonedDateTime zonedDateTimePlusHours = zonedDateTime2.plusHours(1L);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimePlusHours, "plusHours(...)");
        Comparable comparableC = kotlin.ranges.f.c(zonedDateTime, zonedDateTimePlusHours);
        ZonedDateTime zonedDateTimePlusDays = zonedDateTime2.plusDays(30L);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimePlusDays, "plusDays(...)");
        Comparable comparableD = kotlin.ranges.f.d(comparableC, zonedDateTimePlusDays);
        Intrinsics.checkNotNullExpressionValue(comparableD, "coerceAtMost(...)");
        return A2((ZonedDateTime) kotlin.ranges.f.j((ZonedDateTime) comparableD, null, this.f7920p.e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ZonedDateTime z2(ZonedDateTime zonedDateTime) {
        Comparable comparableK;
        vim.e range = vim.i.b(C2(), B2());
        Comparable comparable = range.f289622b;
        Comparable comparable2 = range.f289621a;
        Intrinsics.checkNotNullParameter(zonedDateTime, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            comparableK = kotlin.ranges.f.k(zonedDateTime, (ClosedFloatingPointRange) range);
        } else {
            if (range.isEmpty()) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + CoreConstants.DOT);
            }
            if (zonedDateTime.compareTo(comparable2) < 0) {
                comparableK = comparable2;
            } else {
                int iCompareTo = zonedDateTime.compareTo(comparable);
                comparableK = zonedDateTime;
                if (iCompareTo > 0) {
                    comparableK = comparable;
                }
            }
        }
        return (ZonedDateTime) comparableK;
    }
}
