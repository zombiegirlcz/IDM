package im9;

import akg.n;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import java.util.Iterator;
import java.util.List;
import jq9.t;
import jq9.w;
import jq9.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xx9.p;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3a.b f162328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f162329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ay9.a f162330c;
    public final f4h.a d;
    public final n8b.a e;

    public i(d3a.b paymentsSearchInteractor, p recentRecipientInteractor, ay9.a recipientPaymentsSettingsInteractor, f4h.a payeesRecipientMapper, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(paymentsSearchInteractor, "paymentsSearchInteractor");
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(recipientPaymentsSettingsInteractor, "recipientPaymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(payeesRecipientMapper, "payeesRecipientMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f162328a = paymentsSearchInteractor;
        this.f162329b = recentRecipientInteractor;
        this.f162330c = recipientPaymentsSettingsInteractor;
        this.d = payeesRecipientMapper;
        this.e = countryInteractor;
    }

    public static final boolean a(i iVar, List list, String str) {
        iVar.getClass();
        RecipientPaymentsSettings.Setting settingC = c(list, str, iy9.c.TWO_FA_REQUIRED);
        Boolean boolC = settingC != null ? settingC.c() : null;
        return boolC == null || !boolC.booleanValue();
    }

    public static final boolean b(i iVar, List list, String str) {
        iVar.getClass();
        RecipientPaymentsSettings.Setting settingC = c(list, str, iy9.c.TWO_FA_REQUIRED);
        if (settingC != null) {
            return Intrinsics.f(settingC.c(), Boolean.TRUE);
        }
        return false;
    }

    public static RecipientPaymentsSettings.Setting c(List list, String str, iy9.c cVar) {
        Object obj2;
        Object next;
        List list2;
        Iterator it8 = list.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((RecipientPaymentsSettings) next).f79672a, str)) {
                break;
            }
        }
        RecipientPaymentsSettings recipientPaymentsSettings = (RecipientPaymentsSettings) next;
        if (recipientPaymentsSettings == null || (list2 = recipientPaymentsSettings.f79674c) == null) {
            return null;
        }
        Iterator it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (((RecipientPaymentsSettings.Setting) next2).f79675a == cVar) {
                obj2 = next2;
                break;
            }
        }
        return (RecipientPaymentsSettings.Setting) obj2;
    }

    public static n d(i iVar, String str, List list, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            list = v.k(d3a.a.REVOLUT, d3a.a.ACCOUNTS, d3a.a.CARDS);
        }
        return nim.a.v(rd0.e.b(((u3a.n) iVar.f162328a).d(str, list, jq9.a.NONE)), new im3.e(1));
    }

    public final Object e(t recipient, PayeesFlowType payeesFlowType, gim.i iVar) {
        iy9.c cVar;
        String strM = f4h.a.m(recipient);
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        iy9.d dVar = recipient instanceof y ? iy9.d.USER : recipient instanceof jq9.v ? iy9.d.BENEFICIARY : recipient instanceof w ? iy9.d.CARD_OWNER : null;
        if (strM != null && dVar != null) {
            if (payeesFlowType instanceof PayeesFlowType.Blocked) {
                cVar = iy9.c.BLOCK_USER;
            } else {
                if (!(payeesFlowType instanceof PayeesFlowType.RequireAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = iy9.c.TWO_FA_REQUIRED;
            }
            RecipientPaymentsSettings.Setting.Value.Binary binary = new RecipientPaymentsSettings.Setting.Value.Binary(false);
            new RecipientPaymentsSettings.Setting(cVar, binary);
            Object objA = nim.a.a(((by9.j) ((hy9.c) this.f162330c).f156768a).b(new com.revolut.feature.payments.recipients.settings.models.a(strM, dVar, cVar, binary)), iVar);
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (objA != aVar) {
                objA = Unit.f186387a;
            }
            if (objA == aVar) {
                return objA;
            }
        }
        return Unit.f186387a;
    }
}
