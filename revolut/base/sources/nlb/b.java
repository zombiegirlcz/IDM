package nlb;

import com.revolut.feature.retail.savings.api.core.navigation.SavingsReturnExampleControllerDescriptor;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lg0.e;
import ncd.g;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f217111a = y0.b("savings/explanations/representative-examples");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f217111a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        g gVar;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strA = lg0.g.a("groupType", deeplink.f195041c);
        if (strA != null) {
            g[] gVarArrValues = g.values();
            int length = gVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gVar = null;
                    break;
                }
                gVar = gVarArrValues[i];
                if (a0.z(gVar.name(), strA, true)) {
                    break;
                }
                i++;
            }
            if (gVar != null) {
                return new ControllerDestination.Modal(new SavingsReturnExampleControllerDescriptor(gVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return null;
    }
}
