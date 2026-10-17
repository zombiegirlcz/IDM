package tij;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import dej.s3;
import dej.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm0.d f271566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb4.t f271567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f271568c;
    public final g d;
    public final Object e;

    public q(dm0.d deviceIdProvider, tb4.t currentDeviceResolver, b dataPlanItemsBuilder, g mobilePlanItemsBuilder) {
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(currentDeviceResolver, "currentDeviceResolver");
        Intrinsics.checkNotNullParameter(dataPlanItemsBuilder, "dataPlanItemsBuilder");
        Intrinsics.checkNotNullParameter(mobilePlanItemsBuilder, "mobilePlanItemsBuilder");
        this.f271566a = deviceIdProvider;
        this.f271567b = currentDeviceResolver;
        this.f271568c = dataPlanItemsBuilder;
        this.d = mobilePlanItemsBuilder;
        this.e = te0.w.y0(new th9.t(this, 4));
    }

    public static ListSubheaderDelegate.Model a(Clause clause, String str) {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(str, (Image) null, clause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp16, R$attr.uikit_dp8, 0, 0, 53242);
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp0;
        yp0.b.p(model, i, i2, i2, i2);
        return model;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    public final List b(Map subscriptionsByView, List list, boolean z, ArrayList arrayList) {
        List list2;
        Iterable iterableC;
        Intrinsics.checkNotNullParameter(subscriptionsByView, "subscriptionsByView");
        List installationStates = list;
        Intrinsics.checkNotNullParameter(installationStates, "installationStates");
        if (subscriptionsByView.isEmpty()) {
            return arrayList == null ? f0.f322471a : arrayList;
        }
        Set setEntrySet = subscriptionsByView.entrySet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : setEntrySet) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj2;
            s3 s3Var = (s3) entry.getKey();
            List<t1> list3 = (List) entry.getValue();
            sw6.a aVar = new sw6.a(this, s3Var, 24);
            List list4 = (i != 0 || arrayList == null) ? null : arrayList;
            if (list4 == null) {
                list4 = f0.f322471a;
            }
            List list5 = list4;
            ListSubheaderDelegate.Model model = (i != 0 || z) ? (ListSubheaderDelegate.Model) aVar.invoke() : null;
            ArrayList arrayList3 = new ArrayList();
            for (t1 t1Var : list3) {
                dej.m mVar = t1Var.f113653g;
                int i3 = mVar == null ? -1 : p.f271565a[mVar.ordinal()];
                ?? r62 = this.e;
                if (i3 == -1) {
                    list2 = list3;
                    iterableC = zhm.u.c(this.f271568c.a(list2, new pij.a(t1Var), list, false, f0.f322471a, (dm0.b) r62.getValue()));
                } else if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list2 = list3;
                    iterableC = zhm.u.c(this.f271568c.a(list2, new pij.a(t1Var), list, false, f0.f322471a, (dm0.b) r62.getValue()));
                } else {
                    iterableC = g.a(this.d, new pij.b(t1Var), installationStates, (dm0.b) r62.getValue(), f0.f322471a, null, null, 96);
                    list2 = list3;
                }
                a0.x(iterableC, arrayList3);
                installationStates = list;
                list3 = list2;
            }
            a0.x((arrayList3.isEmpty() && list5.isEmpty()) ? f0.f322471a : d0.E0(list5, d0.E0(arrayList3, zhm.v.l(model))), arrayList2);
            installationStates = list;
            i = i2;
        }
        return arrayList2;
    }
}
