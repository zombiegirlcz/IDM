package com.revolut.feature.apm.core.api.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import dx1.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/api/product/ApmPayId;", "Lcom/revolut/feature/apm/core/api/product/ApmProductIncomplete;", "Ldx1/e;", "<init>", "()V", "feature_apm_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmPayId extends ApmProductIncomplete implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ApmPayId f61819c = new ApmPayId(0);

    @NotNull
    public static final Parcelable.Creator<ApmPayId> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ApmPayId.f61819c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPayId[i];
        }
    }

    private ApmPayId() {
        super(0);
    }

    @Override // dx1.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final TextLocalisedClause e() {
        return new TextLocalisedClause(R$string.apm_product_payId_title, null, null, 14);
    }

    @Override // dx1.h
    public final b b() {
        b.Companion.getClass();
        return b.f306276m;
    }

    @Override // dx1.h
    public final List c() {
        wi0.b.Companion.getClass();
        return u.c(wi0.b.f297756l);
    }

    @Override // dx1.h
    public final int d() {
        return R$drawable.uikit_icn_24_payid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct, dx1.b
    public final String getId() {
        return "PAYID";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
