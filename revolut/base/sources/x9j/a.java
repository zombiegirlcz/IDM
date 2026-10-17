package x9j;

import aii.e;
import aii.g;
import com.revolut.retail.feature.crypto.disclaimer.api.CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion;
import com.revolut.retail.feature.crypto.disclaimer.api.navigation.RetailRevolutXDifferenceDescriptor;
import com.revolut.retail.feature.crypto.disclaimer.api.navigation.RetailRevolutXDifferenceDestination;
import com.revolut.retail.feature.crypto.disclaimer.impl.retail_revolut_x_difference.RetailRevolutXDifferenceScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof RetailRevolutXDifferenceDescriptor) {
            return ((RetailRevolutXDifferenceDescriptor) descriptor).a(new RetailRevolutXDifferenceScreen());
        }
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion.f100018c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RetailRevolutXDifferenceDestination) {
            return new RetailRevolutXDifferenceScreen();
        }
        return null;
    }
}
