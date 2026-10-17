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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/api/product/ApmIris;", "Lcom/revolut/feature/apm/core/api/product/ApmProductComplete;", "Ldx1/e;", "Ldx1/b;", "<init>", "()V", "b", "feature_apm_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmIris extends ApmProductComplete implements e, dx1.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ApmIris f61811c = new ApmIris(0);
    public static final Lazy d = j.b(new r(12));
    public static final Lazy e = j.b(new r(13));

    @NotNull
    public static final Parcelable.Creator<ApmIris> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ApmIris.f61811c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmIris[i];
        }
    }

    public static final class b extends f implements dx1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f61812a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ApmIris f61813b = ApmIris.f61811c;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f61814c = "IRIS_PRO";

        private b() {
        }

        @Override // dx1.h
        public final int d() {
            f61813b.getClass();
            return R$drawable.uikit_icn_24_iris;
        }

        @Override // dx1.h
        public final TextLocalisedClause e() {
            return f61813b.e();
        }

        @Override // dx1.f
        public final ApmProductComplete f() {
            return f61813b;
        }

        @Override // dx1.b
        public final String getId() {
            return f61814c;
        }
    }

    private ApmIris() {
        super(0);
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct
    public final Image F() {
        return (Image) d.getValue();
    }

    @Override // dx1.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final TextLocalisedClause e() {
        return new TextLocalisedClause(R$string.apm_product_iris_title, null, null, 14);
    }

    @Override // dx1.h
    public final xi0.b b() {
        xi0.b.Companion.getClass();
        return xi0.b.f306272g;
    }

    @Override // dx1.h
    public final List c() {
        wi0.b.Companion.getClass();
        return u.c(wi0.b.y0);
    }

    @Override // dx1.h
    public final int d() {
        return R$drawable.uikit_icn_24_iris;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.apm.core.api.product.ApmProduct, dx1.b
    public final String getId() {
        return "IRIS";
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
