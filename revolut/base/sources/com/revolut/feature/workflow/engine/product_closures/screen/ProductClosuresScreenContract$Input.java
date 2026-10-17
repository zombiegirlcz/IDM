package com.revolut.feature.workflow.engine.product_closures.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/workflow/engine/product_closures/screen/ProductClosuresScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductClosuresScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ProductClosuresScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96506c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductClosuresScreenContract$Input(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductClosuresScreenContract$Input[i];
        }
    }

    public ProductClosuresScreenContract$Input(String title, String subtitle, String migrationContext, String workflowStepId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(migrationContext, "migrationContext");
        Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
        this.f96504a = title;
        this.f96505b = subtitle;
        this.f96506c = migrationContext;
        this.d = workflowStepId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductClosuresScreenContract$Input)) {
            return false;
        }
        ProductClosuresScreenContract$Input productClosuresScreenContract$Input = (ProductClosuresScreenContract$Input) obj2;
        return Intrinsics.f(this.f96504a, productClosuresScreenContract$Input.f96504a) && Intrinsics.f(this.f96505b, productClosuresScreenContract$Input.f96505b) && Intrinsics.f(this.f96506c, productClosuresScreenContract$Input.f96506c) && Intrinsics.f(this.d, productClosuresScreenContract$Input.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f96504a.hashCode() * 31, 31, this.f96505b), 31, this.f96506c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96504a);
        dest.writeString(this.f96505b);
        dest.writeString(this.f96506c);
        dest.writeString(this.d);
    }
}
