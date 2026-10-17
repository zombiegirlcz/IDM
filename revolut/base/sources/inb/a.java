package inb;

import com.revolut.feature.retail.savings.api.documents.navigation.SavingsDocumentLauncherDestination;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements xii.b {

    @NotNull
    public static final C0933a Companion = new C0933a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f162769a = y0.b("savings/open-document");

    /* JADX INFO: renamed from: inb.a$a, reason: collision with other inner class name */
    public static final class C0933a {
        private C0933a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f162769a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        String strA;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        String strA2 = g.a("url", linkedHashMap);
        if (strA2 != null) {
            if (d0.W(strA2)) {
                strA2 = null;
            }
            if (strA2 != null && (strA = g.a("title", linkedHashMap)) != null) {
                if (d0.W(strA)) {
                    strA = null;
                }
                if (strA != null) {
                    return new SavingsDocumentLauncherDestination(new SavingsDocument.Link(strA, null, strA2));
                }
            }
        }
        return null;
    }
}
