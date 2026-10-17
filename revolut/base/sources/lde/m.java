package lde;

import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.b f194086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.n f194087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g9e.a f194088c;
    public final mae.o d;
    public final z1 e;

    public m(whf.b transactionsContentProvider, whf.n transactionsListMapper, g9e.a subscriptionListPresentationModel, mae.o subscriptionList, yd9.k ordersWidgetPresenterDelegate, yd9.g orderOrdersWidgetMapper, fde.a pocketFilterProvider) {
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(subscriptionListPresentationModel, "subscriptionListPresentationModel");
        Intrinsics.checkNotNullParameter(subscriptionList, "subscriptionList");
        Intrinsics.checkNotNullParameter(ordersWidgetPresenterDelegate, "ordersWidgetPresenterDelegate");
        Intrinsics.checkNotNullParameter(orderOrdersWidgetMapper, "orderOrdersWidgetMapper");
        Intrinsics.checkNotNullParameter(pocketFilterProvider, "pocketFilterProvider");
        this.f194086a = transactionsContentProvider;
        this.f194087b = transactionsListMapper;
        this.f194088c = subscriptionListPresentationModel;
        this.d = subscriptionList;
        this.e = vkm.q.b(0, 7, null);
        vkm.q.b(0, 7, null);
        vkm.q.b(0, 7, null);
    }

    public final vkm.d a(String recurrentPaymentId, boolean z) {
        Intrinsics.checkNotNullParameter(recurrentPaymentId, "recurrentPaymentId");
        return rd0.e.b(nim.a.w(g9e.a.d(this.f194088c, null, null, 63), new l1.e(this, recurrentPaymentId, z, 1)));
    }
}
