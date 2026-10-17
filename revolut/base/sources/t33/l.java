package t33;

import android.content.Context;
import com.revolut.feature.cards_core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f267615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f267616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f267617c;
    public final List d;

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f267615a = context;
        this.f267616b = zhm.v.k(Integer.valueOf(R$string.card_label_virtual_suggestion_online_shopping), Integer.valueOf(R$string.card_label_virtual_suggestion_subscriptions), Integer.valueOf(R$string.card_label_virtual_suggestion_general));
        this.f267617c = zhm.v.k(Integer.valueOf(R$string.card_label_virtual_suggestion_lambo), Integer.valueOf(R$string.card_label_virtual_suggestion_defi), Integer.valueOf(R$string.card_label_virtual_suggestion_moon));
        this.d = m72.b.u(20);
    }
}
