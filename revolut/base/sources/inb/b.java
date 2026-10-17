package inb;

import com.revolut.feature.retail.savings.api.documents.navigation.TaxFormsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f162770a;

    public static final class a {
        private a() {
        }
    }

    public b() {
        String[] elements = {"savings/tax-documents", "tax-documents"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f162770a = d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f162770a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return TaxFormsDestination.f83145a;
    }
}
