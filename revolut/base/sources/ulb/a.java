package ulb;

import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lg0.e;
import ncd.g;
import org.jetbrains.annotations.NotNull;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {

    @NotNull
    public static final C1552a Companion = new C1552a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f280920a = y0.b("savings/create");

    /* JADX INFO: renamed from: ulb.a$a, reason: collision with other inner class name */
    public static final class C1552a {
        private C1552a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f280920a;
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
                return new SavingsAccountCreationFlow$Destination(new SavingsAccountCreationFlow$Filter.Product(gVar), null, 14);
            }
        }
        return null;
    }
}
