package z32;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipient f319117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f319118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f319119c;
    public final b6k.e d;
    public final RecipientPaymentsSettings.Setting e;

    public a(ApmRecipient recipient, Image image, Data transactionsContent, b6k.e recipientAnalytics, RecipientPaymentsSettings.Setting setting) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        this.f319117a = recipient;
        this.f319118b = image;
        this.f319119c = transactionsContent;
        this.d = recipientAnalytics;
        this.e = setting;
    }

    public static a a(a aVar, ApmRecipient apmRecipient, Image image, Data data, b6k.e eVar, RecipientPaymentsSettings.Setting setting, int i) {
        if ((i & 1) != 0) {
            apmRecipient = aVar.f319117a;
        }
        ApmRecipient recipient = apmRecipient;
        if ((i & 2) != 0) {
            image = aVar.f319118b;
        }
        Image image2 = image;
        if ((i & 4) != 0) {
            data = aVar.f319119c;
        }
        Data transactionsContent = data;
        if ((i & 8) != 0) {
            eVar = aVar.d;
        }
        b6k.e recipientAnalytics = eVar;
        if ((i & 16) != 0) {
            setting = aVar.e;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(image2, "image");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        return new a(recipient, image2, transactionsContent, recipientAnalytics, setting);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f319117a, aVar.f319117a) && Intrinsics.f(this.f319118b, aVar.f319118b) && Intrinsics.f(this.f319119c, aVar.f319119c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + kii.e.c(this.f319119c, a10.b.c(this.f319118b, this.f319117a.hashCode() * 31, 31), 31)) * 31;
        RecipientPaymentsSettings.Setting setting = this.e;
        return iHashCode + (setting == null ? 0 : setting.hashCode());
    }
}
