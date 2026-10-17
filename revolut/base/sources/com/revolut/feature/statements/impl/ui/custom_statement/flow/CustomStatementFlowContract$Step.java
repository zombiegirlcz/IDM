package com.revolut.feature.statements.impl.ui.custom_statement.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/statements/impl/ui/custom_statement/flow/CustomStatementFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "CustomStatement", "Lcom/revolut/feature/statements/impl/ui/custom_statement/flow/CustomStatementFlowContract$Step$CustomStatement;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/flow/CustomStatementFlowContract$Step$ProductArticle;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CustomStatementFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/custom_statement/flow/CustomStatementFlowContract$Step$CustomStatement;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/flow/CustomStatementFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomStatement implements CustomStatementFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomStatement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f88328a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomStatement((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomStatement[i];
            }
        }

        public CustomStatement(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f88328a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomStatement) && Intrinsics.f(this.f88328a, ((CustomStatement) obj2).f88328a);
        }

        public final int hashCode() {
            return this.f88328a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88328a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/custom_statement/flow/CustomStatementFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/statements/impl/ui/custom_statement/flow/CustomStatementFlowContract$Step;", "<init>", "()V", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements CustomStatementFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f88329a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f88329a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        private ProductArticle() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
