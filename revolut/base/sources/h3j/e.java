package h3j;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f149143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f149144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f149145c;
    public final b6k.e d;
    public final RecipientPaymentsSettings.Setting e;
    public final n61.o f;

    public e(Data recipient, AccountId accountId, Data transactionsContent, b6k.e recipientAnalytics, RecipientPaymentsSettings.Setting setting, n61.o oVar) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        this.f149143a = recipient;
        this.f149144b = accountId;
        this.f149145c = transactionsContent;
        this.d = recipientAnalytics;
        this.e = setting;
        this.f = oVar;
    }

    public static e a(e eVar, Data data, Data data2, b6k.e eVar2, RecipientPaymentsSettings.Setting setting, n61.o oVar, int i) {
        if ((i & 1) != 0) {
            data = eVar.f149143a;
        }
        Data recipient = data;
        AccountId accountId = eVar.f149144b;
        if ((i & 4) != 0) {
            data2 = eVar.f149145c;
        }
        Data transactionsContent = data2;
        if ((i & 8) != 0) {
            eVar2 = eVar.d;
        }
        b6k.e recipientAnalytics = eVar2;
        if ((i & 16) != 0) {
            setting = eVar.e;
        }
        RecipientPaymentsSettings.Setting setting2 = setting;
        if ((i & 32) != 0) {
            oVar = eVar.f;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        return new e(recipient, accountId, transactionsContent, recipientAnalytics, setting2, oVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f149143a, eVar.f149143a) && Intrinsics.f(this.f149144b, eVar.f149144b) && Intrinsics.f(this.f149145c, eVar.f149145c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + kii.e.c(this.f149145c, h30.l.b(this.f149144b, this.f149143a.hashCode() * 31, 31), 31)) * 31;
        RecipientPaymentsSettings.Setting setting = this.e;
        int iHashCode2 = (iHashCode + (setting == null ? 0 : setting.hashCode())) * 31;
        n61.o oVar = this.f;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }
}
