package kd3;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f182781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f182782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f182783c;
    public final Data d;
    public final Data e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Image f182784g;

    public f(Data cashbackByCurrenciesData, Data cashbackBySourcesData, Data footerTypeData, Data shieldVisibleData, Data ultraPlanAvailableData, dj0.d balance, Image image) {
        Intrinsics.checkNotNullParameter(cashbackByCurrenciesData, "cashbackByCurrenciesData");
        Intrinsics.checkNotNullParameter(cashbackBySourcesData, "cashbackBySourcesData");
        Intrinsics.checkNotNullParameter(footerTypeData, "footerTypeData");
        Intrinsics.checkNotNullParameter(shieldVisibleData, "shieldVisibleData");
        Intrinsics.checkNotNullParameter(ultraPlanAvailableData, "ultraPlanAvailableData");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f182781a = cashbackByCurrenciesData;
        this.f182782b = cashbackBySourcesData;
        this.f182783c = footerTypeData;
        this.d = shieldVisibleData;
        this.e = ultraPlanAvailableData;
        this.f = balance;
        this.f182784g = image;
    }

    public static f a(f fVar, Data data, Data data2, Data data3, Data data4, Data data5, dj0.d dVar, Image image, int i) {
        if ((i & 1) != 0) {
            data = fVar.f182781a;
        }
        Data cashbackByCurrenciesData = data;
        if ((i & 2) != 0) {
            data2 = fVar.f182782b;
        }
        Data cashbackBySourcesData = data2;
        if ((i & 4) != 0) {
            data3 = fVar.f182783c;
        }
        Data footerTypeData = data3;
        if ((i & 8) != 0) {
            data4 = fVar.d;
        }
        Data shieldVisibleData = data4;
        if ((i & 16) != 0) {
            data5 = fVar.e;
        }
        Data ultraPlanAvailableData = data5;
        if ((i & 32) != 0) {
            dVar = fVar.f;
        }
        dj0.d balance = dVar;
        if ((i & 64) != 0) {
            image = fVar.f182784g;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(cashbackByCurrenciesData, "cashbackByCurrenciesData");
        Intrinsics.checkNotNullParameter(cashbackBySourcesData, "cashbackBySourcesData");
        Intrinsics.checkNotNullParameter(footerTypeData, "footerTypeData");
        Intrinsics.checkNotNullParameter(shieldVisibleData, "shieldVisibleData");
        Intrinsics.checkNotNullParameter(ultraPlanAvailableData, "ultraPlanAvailableData");
        Intrinsics.checkNotNullParameter(balance, "balance");
        return new f(cashbackByCurrenciesData, cashbackBySourcesData, footerTypeData, shieldVisibleData, ultraPlanAvailableData, balance, image);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f182781a, fVar.f182781a) && Intrinsics.f(this.f182782b, fVar.f182782b) && Intrinsics.f(this.f182783c, fVar.f182783c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f182784g, fVar.f182784g);
    }

    public final int hashCode() {
        int iC = v7.c(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f182783c, kii.e.c(this.f182782b, this.f182781a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
        Image image = this.f182784g;
        return iC + (image == null ? 0 : image.hashCode());
    }
}
