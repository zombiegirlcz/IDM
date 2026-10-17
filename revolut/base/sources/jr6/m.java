package jr6;

import com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.FreelancerNewSalePickerScreen;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker.FreelancerNewSalePickerScreenContract$InputData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public interface m {

    @NotNull
    public static final l Companion = l.f177946a;

    static FreelancerNewSalePickerScreen a(m mVar, xi0.b bVar, Set includedSaleTypes, int i) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        if ((i & 2) != 0) {
            includedSaleTypes = d0.i1(cs6.c.b());
        }
        ((ct6.t) mVar).getClass();
        Intrinsics.checkNotNullParameter(includedSaleTypes, "includedSaleTypes");
        return new FreelancerNewSalePickerScreen(new FreelancerNewSalePickerScreenContract$InputData(includedSaleTypes, bVar));
    }
}
