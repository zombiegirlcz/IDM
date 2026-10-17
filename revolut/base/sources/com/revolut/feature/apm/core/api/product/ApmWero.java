package com.revolut.feature.apm.core.api.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import dv9.r;
import dx1.b;
import dx1.e;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/api/product/ApmWero;", "Lcom/revolut/feature/apm/core/api/product/ApmProductComplete;", "Ldx1/e;", "Ldx1/b;", "<init>", "()V", "feature_apm_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmWero extends ApmProductComplete implements e, b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ApmWero f61829c = new ApmWero(0);
    public static final Lazy d = j.b(new r(19));
    public static final Lazy e = j.b(new r(20));

    @NotNull
    public static final Parcelable.Creator<ApmWero> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ApmWero.f61829c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmWero[i];
        }
    }

    private ApmWero() {
        super(0);
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct
    public final Image F() {
        return (Image) d.getValue();
    }

    @Override // dx1.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final TextLocalisedClause e() {
        return new TextLocalisedClause(R$string.apm_product_wero_title, null, null, 14);
    }

    @Override // dx1.h
    public final xi0.b b() {
        xi0.b.Companion.getClass();
        return xi0.b.f306272g;
    }

    @Override // dx1.h
    public final List c() {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        wi0.b bVar = wi0.b.f297771r;
        aVar.getClass();
        wi0.b bVar2 = wi0.b.W;
        aVar.getClass();
        wi0.b bVar3 = wi0.b.f297760n0;
        aVar.getClass();
        wi0.b bVar4 = wi0.b.f297788x1;
        aVar.getClass();
        wi0.b bVar5 = wi0.b.h2;
        aVar.getClass();
        wi0.b bVar6 = wi0.b.f297772r0;
        aVar.getClass();
        wi0.b bVar7 = wi0.b.f297787x0;
        aVar.getClass();
        wi0.b bVar8 = wi0.b.L1;
        aVar.getClass();
        wi0.b bVar9 = wi0.b.T1;
        aVar.getClass();
        wi0.b bVar10 = wi0.b.C2;
        aVar.getClass();
        wi0.b bVar11 = wi0.b.c2;
        aVar.getClass();
        wi0.b bVar12 = wi0.b.p2;
        aVar.getClass();
        wi0.b bVar13 = wi0.b.f297728a3;
        aVar.getClass();
        return v.k(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, wi0.b.D3);
    }

    @Override // dx1.h
    public final int d() {
        return R$drawable.uikit_icn_24_wero;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct, dx1.b
    public final String getId() {
        return "WERO";
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct
    public final Image j() {
        return (Image) e.getValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
