package u90;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class w0 extends c {

    @NotNull
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f278335b = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ISO_LOCAL_TIME).optionalStart().appendOffset("+HH:MM:ss", "+00:00").toFormatter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f278336a;

    public w0(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f278336a = dateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    @Override // u90.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.backend_flow.domain.models.BackendItem a(q90.v r8, java.util.List r9) {
        /*
            r7 = this;
            q90.z3 r8 = (q90.z3) r8
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "previousElements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r2 = r8.getId()
            boolean r3 = r8.getRequired()
            q90.a4 r9 = r8.getValue()
            if (r9 == 0) goto L59
            java.lang.String r9 = r9.getValue()
            java.time.format.DateTimeFormatter r0 = u90.w0.f278335b
            java.time.temporal.TemporalAccessor r9 = r0.parse(r9)
            java.time.LocalTime r1 = java.time.LocalTime.from(r9)
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L35
            java.time.temporal.TemporalQuery r0 = java.time.temporal.TemporalQueries.offset()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r9 = r9.query(r0)     // Catch: java.lang.Throwable -> L35
            java.time.ZoneOffset r9 = (java.time.ZoneOffset) r9     // Catch: java.lang.Throwable -> L35
            goto L3d
        L35:
            r0 = move-exception
            r9 = r0
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L3d:
            java.lang.Throwable r0 = yhm.m.a(r9)
            if (r0 != 0) goto L44
            goto L46
        L44:
            java.time.ZoneOffset r9 = java.time.ZoneOffset.UTC
        L46:
            java.time.ZoneOffset r9 = (java.time.ZoneOffset) r9
            java.time.OffsetTime r9 = java.time.OffsetTime.of(r1, r9)
            java.lang.String r0 = "of(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            if (r9 == 0) goto L59
            java.time.LocalTime r9 = r9.toLocalTime()
        L57:
            r5 = r9
            goto L5b
        L59:
            r9 = 0
            goto L57
        L5b:
            java.lang.String r4 = r8.getHint()
            com.revolut.feature.backend_flow.domain.models.TimeInputItem r1 = new com.revolut.feature.backend_flow.domain.models.TimeInputItem
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.w0.a(q90.v, java.util.List):com.revolut.feature.backend_flow.domain.models.BackendItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    @Override // u90.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q90.v b(com.revolut.feature.backend_flow.domain.models.BackendItem r6) {
        /*
            r5 = this;
            com.revolut.feature.backend_flow.domain.models.TimeInputItem r6 = (com.revolut.feature.backend_flow.domain.models.TimeInputItem) r6
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = r6.f63694a
            boolean r1 = r6.f63695b
            java.time.LocalTime r2 = r6.d
            if (r2 == 0) goto L43
            l80.e r3 = r5.f278336a
            l80.f r3 = (l80.f) r3
            java.lang.String r3 = r3.a()
            java.time.ZoneId r3 = java.time.ZoneId.of(r3)
            java.time.zone.ZoneRules r3 = r3.getRules()
            java.time.Instant r4 = java.time.Instant.now()
            java.time.ZoneOffset r3 = r3.getOffset(r4)
            java.time.OffsetTime r2 = r2.atOffset(r3)
            java.lang.String r3 = "atOffset(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            if (r2 == 0) goto L43
            q90.a4 r3 = new q90.a4
            java.time.format.DateTimeFormatter r4 = u90.w0.f278335b
            java.lang.String r2 = r4.format(r2)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r3.<init>(r2)
            goto L44
        L43:
            r3 = 0
        L44:
            java.lang.String r6 = r6.f63696c
            q90.z3 r2 = new q90.z3
            r2.<init>(r0, r1, r6, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.w0.b(com.revolut.feature.backend_flow.domain.models.BackendItem):q90.v");
    }
}
