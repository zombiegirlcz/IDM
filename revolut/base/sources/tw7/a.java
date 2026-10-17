package tw7;

import com.revolut.feature.insurance_home.impl.data.model.Header;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final String a(Header.Button button) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        return a0.d.s("MENU_ITEM_ID_", button.f76188c, "_", button.f76186a);
    }
}
