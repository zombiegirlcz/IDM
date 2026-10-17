package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction;", "Landroid/os/Parcelable;", "T", "SwitchToAccountIdAction", "General", "EmptyPayload", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction$EmptyPayload;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction$General;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction$SwitchToAccountIdAction;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProductAccountSubtitleAction<T extends Parcelable> implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f89527a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction$EmptyPayload;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction;", "", "<init>", "()V", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EmptyPayload extends ProductAccountSubtitleAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EmptyPayload f89528b = new EmptyPayload(null);

        @NotNull
        public static final Parcelable.Creator<EmptyPayload> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EmptyPayload.f89528b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmptyPayload[i];
            }
        }

        private EmptyPayload() {
            super(null);
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction$General;", "Landroid/os/Parcelable;", "T", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class General<T extends Parcelable> extends ProductAccountSubtitleAction<T> {

        @NotNull
        public static final Parcelable.Creator<General<?>> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Parcelable f89529b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new General(parcel.readParcelable(General.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new General[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public General(Parcelable payload) {
            super(payload);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f89529b = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof General) && Intrinsics.f(this.f89529b, ((General) obj2).f89529b);
        }

        public final int hashCode() {
            return this.f89529b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89529b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction$SwitchToAccountIdAction;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitleAction;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountDescriptor$Value;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchToAccountIdAction extends ProductAccountSubtitleAction<ProductAccountDescriptor$Value> {

        @NotNull
        public static final Parcelable.Creator<SwitchToAccountIdAction> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProductAccountDescriptor$Value f89530b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchToAccountIdAction((ProductAccountDescriptor$Value) parcel.readParcelable(SwitchToAccountIdAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchToAccountIdAction[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchToAccountIdAction(ProductAccountDescriptor$Value payload) {
            super(payload);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f89530b = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SwitchToAccountIdAction) && Intrinsics.f(this.f89530b, ((SwitchToAccountIdAction) obj2).f89530b);
        }

        public final int hashCode() {
            return this.f89530b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89530b, i);
        }
    }

    public ProductAccountSubtitleAction(Parcelable parcelable) {
        this.f89527a = parcelable;
    }
}
