package com.revolut.feature.apm.core.api.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import dv9.r;
import dx1.e;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/api/product/ApmBizum;", "Lcom/revolut/feature/apm/core/api/product/ApmProductComplete;", "Ldx1/e;", "<init>", "()V", "feature_apm_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmBizum extends ApmProductComplete implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ApmBizum f61808c = new ApmBizum(0);
    public static final Lazy d = j.b(new r(8));
    public static final Lazy e = j.b(new r(9));

    @NotNull
    public static final Parcelable.Creator<ApmBizum> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ApmBizum.f61808c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmBizum[i];
        }
    }

    private ApmBizum() {
        super(0);
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct
    public final Image F() {
        return (Image) d.getValue();
    }

    @Override // dx1.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final TextLocalisedClause e() {
        return new TextLocalisedClause(R$string.apm_product_bizum_title, null, null, 14);
    }

    @Override // dx1.h
    public final b b() {
        b.Companion.getClass();
        return b.f306272g;
    }

    @Override // dx1.h
    public final List c() {
        wi0.b.Companion.getClass();
        return u.c(wi0.b.f297750h0);
    }

    @Override // dx1.h
    public final int d() {
        return R$drawable.uikit_icn_24_bizum;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct, dx1.b
    public final String getId() {
        return "BIZUM";
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
