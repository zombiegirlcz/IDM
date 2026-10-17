package u17;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f276359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f276360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f276361c;
    public final i d;
    public final h e;

    public k(l generalFilterChipProvider, n statusesFilterChipProvider, m paymentMethodsFilterChipProvider, o typesMethodsFilterChipProvider, f amountFilterChipProvider, i dateRangeFilterChipProvider, h currencyFilterChipProvider) {
        Intrinsics.checkNotNullParameter(generalFilterChipProvider, "generalFilterChipProvider");
        Intrinsics.checkNotNullParameter(statusesFilterChipProvider, "statusesFilterChipProvider");
        Intrinsics.checkNotNullParameter(paymentMethodsFilterChipProvider, "paymentMethodsFilterChipProvider");
        Intrinsics.checkNotNullParameter(typesMethodsFilterChipProvider, "typesMethodsFilterChipProvider");
        Intrinsics.checkNotNullParameter(amountFilterChipProvider, "amountFilterChipProvider");
        Intrinsics.checkNotNullParameter(dateRangeFilterChipProvider, "dateRangeFilterChipProvider");
        Intrinsics.checkNotNullParameter(currencyFilterChipProvider, "currencyFilterChipProvider");
        this.f276359a = statusesFilterChipProvider;
        this.f276360b = paymentMethodsFilterChipProvider;
        this.f276361c = typesMethodsFilterChipProvider;
        this.d = dateRangeFilterChipProvider;
        this.e = currencyFilterChipProvider;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final z a(FreelancerSalesFilters$CompoundFreelancerSalesFilter compoundFilter) {
        ActionsView.Item item;
        Intrinsics.checkNotNullParameter(compoundFilter, "compoundFilter");
        ArrayList arrayList = new ArrayList();
        arrayList.add(l.a(compoundFilter.b()));
        cs6.g target = compoundFilter.f73469a;
        List includedStatuses = compoundFilter.f73470b;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(includedStatuses, "includedStatuses");
        ActionsView.Item itemA = g.a(includedStatuses.size(), "STATUS_FILTER_CHIP", new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new qg7.k(this.f276359a, 11, includedStatuses, target), new d4h.a(includedStatuses, 9));
        if (itemA != null) {
            arrayList.add(itemA);
        }
        List includedPaymentMethods = compoundFilter.f73471c;
        Intrinsics.checkNotNullParameter(includedPaymentMethods, "includedPaymentMethods");
        ActionsView.Item itemA2 = g.a(includedPaymentMethods.size(), "PAYMENT_METHOD_FILTER_CHIP", new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new u1.g(this.f276360b, includedPaymentMethods, 5), new d4h.a(includedPaymentMethods, 8));
        if (itemA2 != null) {
            arrayList.add(itemA2);
        }
        List includedTypes = compoundFilter.d;
        Intrinsics.checkNotNullParameter(includedTypes, "includedTypes");
        ActionsView.Item itemA3 = g.a(includedTypes.size(), "TYPE_FILTER_CHIP", new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new u1.g(this.f276361c, includedTypes, 6), new d4h.a(includedTypes, 10));
        if (itemA3 != null) {
            arrayList.add(itemA3);
        }
        ActionsView.Item itemA4 = f.a(compoundFilter.f, compoundFilter.f73472g);
        if (itemA4 != null) {
            arrayList.add(itemA4);
        }
        FilteringDateRange filteringDateRange = compoundFilter.e;
        if (filteringDateRange != null) {
            item = new ActionsView.Item("DATE_RANGE_FILTER_CHIP", mx0.d.SEMIBLACK, false, null, null, ((t17.o) this.d.f276358a).a(filteringDateRange).f267205a, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
        } else {
            item = null;
        }
        if (item != null) {
            arrayList.add(item);
        }
        ActionsView.Item itemB = this.e.b(compoundFilter.f73473h);
        if (itemB != null) {
            arrayList.add(itemB);
        }
        return new z("ACTIONS_DELEGATE_ID", arrayList, null, mx0.l.SCROLLABLE, 0, 0, 116);
    }
}
