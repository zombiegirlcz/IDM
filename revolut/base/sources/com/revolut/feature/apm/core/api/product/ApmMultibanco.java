package com.revolut.feature.apm.core.api.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import dv9.r;
import dx1.e;
import dx1.f;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/api/product/ApmMultibanco;", "Lcom/revolut/feature/apm/core/api/product/ApmProductComplete;", "Ldx1/e;", "<init>", "()V", "b", "feature_apm_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmMultibanco extends ApmProductComplete implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ApmMultibanco f61815c = new ApmMultibanco(0);
    public static final Lazy d = j.b(new r(14));
    public static final Lazy e = j.b(new r(15));

    @NotNull
    public static final Parcelable.Creator<ApmMultibanco> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ApmMultibanco.f61815c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmMultibanco[i];
        }
    }

    public static final class b extends f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f61816a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ApmMultibanco f61817b = ApmMultibanco.f61815c;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f61818c = R$drawable.uikit_icn_24_viaverde;
        public static final TextLocalisedClause d = new TextLocalisedClause(R$string.apm_product_multibanco_via_verde_title, null, null, 14);

        private b() {
        }

        @Override // dx1.h
        public final int d() {
            return f61818c;
        }

        @Override // dx1.h
        public final TextLocalisedClause e() {
            return d;
        }

        @Override // dx1.f
        public final ApmProductComplete f() {
            return f61817b;
        }
    }

    private ApmMultibanco() {
        super(0);
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct
    public final Image F() {
        return (Image) d.getValue();
    }

    @Override // dx1.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final TextLocalisedClause e() {
        return new TextLocalisedClause(R$string.apm_product_multibanco_title, null, null, 14);
    }

    @Override // dx1.h
    public final xi0.b b() {
        xi0.b.Companion.getClass();
        return xi0.b.f306272g;
    }

    @Override // dx1.h
    public final List c() {
        wi0.b.Companion.getClass();
        return u.c(wi0.b.y2);
    }

    @Override // dx1.h
    public final int d() {
        return R$drawable.uikit_icn_24_mb_way;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct, dx1.b
    public final String getId() {
        return "MULTIBANCO";
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
