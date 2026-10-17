package bul;

import java.time.LocalDate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.StandardBiometricHeader;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final int e = Math.max(6, 1) + 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yhl.d f18913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f18914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18915c;
    public final Object d;

    public r(yhl.d corporateEventsInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(corporateEventsInteractor, "corporateEventsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f18913a = corporateEventsInteractor;
        this.f18914b = dateProvider;
        final int i = 0;
        this.f18915c = te0.w.y0(new Function0(this) { // from class: bul.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f18912b;

            {
                this.f18912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((l80.f) this.f18912b.f18914b).e().withDayOfMonth(1);
                    default:
                        return ((LocalDate) this.f18912b.f18915c.getValue()).plusMonths(((long) r.e) + 1);
                }
            }
        });
        final int i2 = 1;
        this.d = te0.w.y0(new Function0(this) { // from class: bul.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f18912b;

            {
                this.f18912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((l80.f) this.f18912b.f18914b).e().withDayOfMonth(1);
                    default:
                        return ((LocalDate) this.f18912b.f18915c.getValue()).plusMonths(((long) r.e) + 1);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final cxe.u a() {
        return nim.a.A(rd0.e.n(nim.a.v(rd0.e.b(yhl.d.c(this.f18913a, null, (LocalDate) this.f18915c.getValue(), (LocalDate) this.d.getValue(), false, y0.b(iel.e.MARKET_HOLIDAY), null, null, null, StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE)), new bt9.t(10)), h0.f322473a), new bt9.t(11));
    }
}
