package au6;

import com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatSummary;
import com.revolut.feature.freelancer.impl.network.services.FreelancerVatReminderService;
import ip0.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 {

    @NotNull
    public static final u3 Companion = new u3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerVatReminderService f9667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f9668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f9669c;
    public final os6.e d;
    public final os6.f e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f9670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f9671h;

    public y3(FreelancerVatReminderService api2, ne0.j memoryCache, xe0.e storage, os6.e vatReminderDao, os6.f vatSummaryDao) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(vatReminderDao, "vatReminderDao");
        Intrinsics.checkNotNullParameter(vatSummaryDao, "vatSummaryDao");
        this.f9667a = api2;
        this.f9668b = memoryCache;
        this.f9669c = storage;
        this.d = vatReminderDao;
        this.e = vatSummaryDao;
        Continuation continuation = null;
        final int i = 0;
        this.f = new x4l.c(new v3(this, null, 1), new Function1(this) { // from class: au6.s3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y3 f9621b;

            {
                this.f9621b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f9621b.f9668b.get("MEMORY_CACHE_KEY_VAT_REMINDERS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (fs6.e) this.f9621b.f9668b.get("MEMORY_CACHE_KEY_VAT_REMINDER_OPTIONS");
                    default:
                        String vatReminderId = (String) obj2;
                        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
                        return (FreelancerVatSummary) v7.r("MEMORY_CACHE_KEY_VAT_SUMMARY_", vatReminderId, this.f9621b.f9668b);
                }
            }
        }, new Function2(this) { // from class: au6.t3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y3 f9624b;

            {
                this.f9624b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List vatReminders = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vatReminders, "vatReminders");
                        this.f9624b.f9668b.f("MEMORY_CACHE_KEY_VAT_REMINDERS", vatReminders);
                        break;
                    case 1:
                        fs6.e options = (fs6.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(options, "options");
                        this.f9624b.f9668b.f("MEMORY_CACHE_KEY_VAT_REMINDER_OPTIONS", options);
                        break;
                    default:
                        String vatReminderId = (String) obj2;
                        FreelancerVatSummary vatSummary = (FreelancerVatSummary) obj3;
                        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
                        Intrinsics.checkNotNullParameter(vatSummary, "vatSummary");
                        this.f9624b.f9668b.f("MEMORY_CACHE_KEY_VAT_SUMMARY_" + vatReminderId, vatSummary);
                        break;
                }
                return Unit.f186387a;
            }
        }, new w3(this, continuation, 1), new a09.p(this, continuation, 28));
        final int i2 = 1;
        this.f9670g = new x4l.c(new v3(this, null, 0), new Function1(this) { // from class: au6.s3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y3 f9621b;

            {
                this.f9621b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f9621b.f9668b.get("MEMORY_CACHE_KEY_VAT_REMINDERS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (fs6.e) this.f9621b.f9668b.get("MEMORY_CACHE_KEY_VAT_REMINDER_OPTIONS");
                    default:
                        String vatReminderId = (String) obj2;
                        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
                        return (FreelancerVatSummary) v7.r("MEMORY_CACHE_KEY_VAT_SUMMARY_", vatReminderId, this.f9621b.f9668b);
                }
            }
        }, new Function2(this) { // from class: au6.t3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y3 f9624b;

            {
                this.f9624b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List vatReminders = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vatReminders, "vatReminders");
                        this.f9624b.f9668b.f("MEMORY_CACHE_KEY_VAT_REMINDERS", vatReminders);
                        break;
                    case 1:
                        fs6.e options = (fs6.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(options, "options");
                        this.f9624b.f9668b.f("MEMORY_CACHE_KEY_VAT_REMINDER_OPTIONS", options);
                        break;
                    default:
                        String vatReminderId = (String) obj2;
                        FreelancerVatSummary vatSummary = (FreelancerVatSummary) obj3;
                        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
                        Intrinsics.checkNotNullParameter(vatSummary, "vatSummary");
                        this.f9624b.f9668b.f("MEMORY_CACHE_KEY_VAT_SUMMARY_" + vatReminderId, vatSummary);
                        break;
                }
                return Unit.f186387a;
            }
        }, new w3(this, continuation, 0), new a09.p(this, continuation, 27));
        final int i3 = 2;
        this.f9671h = new x4l.c(new a72.k(this, continuation, 16), new Function1(this) { // from class: au6.s3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y3 f9621b;

            {
                this.f9621b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f9621b.f9668b.get("MEMORY_CACHE_KEY_VAT_REMINDERS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (fs6.e) this.f9621b.f9668b.get("MEMORY_CACHE_KEY_VAT_REMINDER_OPTIONS");
                    default:
                        String vatReminderId = (String) obj2;
                        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
                        return (FreelancerVatSummary) v7.r("MEMORY_CACHE_KEY_VAT_SUMMARY_", vatReminderId, this.f9621b.f9668b);
                }
            }
        }, new Function2(this) { // from class: au6.t3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y3 f9624b;

            {
                this.f9624b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List vatReminders = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vatReminders, "vatReminders");
                        this.f9624b.f9668b.f("MEMORY_CACHE_KEY_VAT_REMINDERS", vatReminders);
                        break;
                    case 1:
                        fs6.e options = (fs6.e) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(options, "options");
                        this.f9624b.f9668b.f("MEMORY_CACHE_KEY_VAT_REMINDER_OPTIONS", options);
                        break;
                    default:
                        String vatReminderId = (String) obj2;
                        FreelancerVatSummary vatSummary = (FreelancerVatSummary) obj3;
                        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
                        Intrinsics.checkNotNullParameter(vatSummary, "vatSummary");
                        this.f9624b.f9668b.f("MEMORY_CACHE_KEY_VAT_SUMMARY_" + vatReminderId, vatSummary);
                        break;
                }
                return Unit.f186387a;
            }
        }, new x3(this, continuation, 0), new a09.p(this, continuation, 29), new x3(this, continuation, 1));
    }

    public static final Object a(y3 y3Var, String str, gim.i iVar) {
        y3Var.getClass();
        ald.l lVar = new ald.l(y3Var, str, null, 27);
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, lVar, iVar);
    }
}
