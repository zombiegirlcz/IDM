package h3j;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecipientPaymentsSettings.Setting f149163b;

    public /* synthetic */ k(RecipientPaymentsSettings.Setting setting, int i) {
        this.f149162a = i;
        this.f149163b = setting;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f149162a) {
        }
        return z32.a.a((z32.a) obj2, null, null, null, null, this.f149163b, 15);
    }
}
