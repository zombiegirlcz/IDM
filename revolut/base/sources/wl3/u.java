package wl3;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ay9.b f298405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final am2.a f298406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f298407c;

    public u(cl3.a contactsInteractor, ay9.b recipientSettingsRepository, am2.a userCountryPaymentSettingsFilter, l80.e dateProvider, t eligibilityChecker) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(recipientSettingsRepository, "recipientSettingsRepository");
        Intrinsics.checkNotNullParameter(userCountryPaymentSettingsFilter, "userCountryPaymentSettingsFilter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(eligibilityChecker, "eligibilityChecker");
        this.f298405a = recipientSettingsRepository;
        this.f298406b = userCountryPaymentSettingsFilter;
        this.f298407c = eligibilityChecker;
    }

    public static void a(ArrayList arrayList, RecipientPaymentsSettings.Setting setting) {
        Object next;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((RecipientPaymentsSettings.Setting) next).f79675a == setting.f79675a) {
                    break;
                }
            }
        }
        if (next == null) {
            arrayList.add(setting);
        }
    }

    public final pfm.r b(zm3.l contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return ((by9.j) this.f298405a).b(new com.revolut.feature.payments.recipients.settings.models.a(contact.getCode(), iy9.d.USER, iy9.c.HIDE_P2P_CHAT_HISTORY, new RecipientPaymentsSettings.Setting.Value.LongNumber(System.currentTimeMillis())));
    }

    public final pfm.r c(zm3.l contact, iy9.b setting) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(setting, "setting");
        return ((by9.j) this.f298405a).b(new com.revolut.feature.payments.recipients.settings.models.a(contact.getCode(), iy9.d.USER, jy9.b.b(setting).f79675a, new RecipientPaymentsSettings.Setting.Value.Binary(setting.f169641b)));
    }

    public final efm.r d() {
        return nim.a.w(f(), new d(2));
    }

    public final efm.r e(zm3.l contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return nim.a.w(f(), new wg2.g(this, contact, 16));
    }

    public final efm.r f() {
        efm.r rVarDistinctUntilChanged = zi0.c.o(((by9.j) this.f298405a).a()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
