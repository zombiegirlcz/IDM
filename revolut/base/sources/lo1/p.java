package lo1;

import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends oki.h implements dli.b {
    public final oo1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oo1.b f197382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xn1.e f197383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n60.a f197384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q12.a f197385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f197386t;

    public p(oo1.a billerCodeValidator, oo1.b referenceNumberValidator, xn1.e repository, n60.a keyboardExtension, q12.a apmErrorProvider, m stateMapper) {
        Intrinsics.checkNotNullParameter(billerCodeValidator, "billerCodeValidator");
        Intrinsics.checkNotNullParameter(referenceNumberValidator, "referenceNumberValidator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(apmErrorProvider, "apmErrorProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = billerCodeValidator;
        this.f197382p = referenceNumberValidator;
        this.f197383q = repository;
        this.f197384r = keyboardExtension;
        this.f197385s = apmErrorProvider;
        this.f197386t = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    public final void I2(final k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(g.f197369a)) {
            this.f197384r.Q();
            l2(new lo.c(this, (Continuation) null, 1), new l3l.m(1, this, p.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 25));
            return;
        }
        if (event.equals(j.f197374a)) {
            B2();
            return;
        }
        boolean z = event instanceof h;
        y yVar = this.f197386t;
        if (!z) {
            if (!(event instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((i) event).f197373b) {
                final int i = 1;
                H2(yVar, new Function1() { // from class: lo1.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i) {
                            case 0:
                                d update = (d) obj2;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return d.a(update, null, null, ((h) event).f197371b, null, 11);
                            default:
                                d update2 = (d) obj2;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return d.a(update2, null, null, null, ((i) event).f197372a, 7);
                        }
                    }
                });
                return;
            }
            return;
        }
        String str = ((h) event).f197370a;
        int iHashCode = str.hashCode();
        if (iHashCode == -956707535) {
            if (str.equals("LIST_ID_LABEL")) {
                final int i2 = 0;
                H2(yVar, new Function1() { // from class: lo1.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                d update = (d) obj2;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return d.a(update, null, null, ((h) event).f197371b, null, 11);
                            default:
                                d update2 = (d) obj2;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return d.a(update2, null, null, null, ((i) event).f197372a, 7);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (iHashCode == -135617291) {
            if (str.equals("LIST_ID_BILLER_CODE")) {
                final int i3 = 0;
                H2(yVar, new Function1(this) { // from class: lo1.n

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ p f197378b;

                    {
                        this.f197378b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                d update = (d) obj2;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return d.a(update, this.f197378b.o.validate(((h) event).f197371b), null, null, null, 14);
                            default:
                                d update2 = (d) obj2;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return d.a(update2, null, this.f197378b.f197382p.validate(((h) event).f197371b), null, null, 13);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (iHashCode == -45534112 && str.equals("LIST_ID_REFERENCE_NUMBER")) {
            final int i5 = 1;
            H2(yVar, new Function1(this) { // from class: lo1.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f197378b;

                {
                    this.f197378b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            d update = (d) obj2;
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return d.a(update, this.f197378b.o.validate(((h) event).f197371b), null, null, null, 14);
                        default:
                            d update2 = (d) obj2;
                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                            return d.a(update2, null, this.f197378b.f197382p.validate(((h) event).f197371b), null, null, 13);
                    }
                }
            });
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f197386t;
    }
}
