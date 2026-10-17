package com.revolut.retail.feature.commodity.order_flow.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l6j.c;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/api/domain/PocketDescriptor;", "Landroid/os/Parcelable;", "<init>", "()V", "FullPocketDescriptor", "PocketTypeDescriptor", "l6j/c", "Lcom/revolut/retail/feature/commodity/order_flow/api/domain/PocketDescriptor$FullPocketDescriptor;", "Lcom/revolut/retail/feature/commodity/order_flow/api/domain/PocketDescriptor$PocketTypeDescriptor;", "feature_commodity_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PocketDescriptor implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/api/domain/PocketDescriptor$FullPocketDescriptor;", "Lcom/revolut/retail/feature/commodity/order_flow/api/domain/PocketDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FullPocketDescriptor extends PocketDescriptor {

        @NotNull
        public static final Parcelable.Creator<FullPocketDescriptor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f99802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f99803b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullPocketDescriptor((b) parcel.readSerializable(), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FullPocketDescriptor[i];
            }
        }

        public FullPocketDescriptor(b currency, c type) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f99802a = currency;
            this.f99803b = type;
        }

        @Override // com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF99802a() {
            return this.f99802a;
        }

        @Override // com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF99804a() {
            return this.f99803b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FullPocketDescriptor)) {
                return false;
            }
            FullPocketDescriptor fullPocketDescriptor = (FullPocketDescriptor) obj2;
            return Intrinsics.f(this.f99802a, fullPocketDescriptor.f99802a) && this.f99803b == fullPocketDescriptor.f99803b;
        }

        public final int hashCode() {
            return this.f99803b.hashCode() + (this.f99802a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99802a);
            dest.writeString(this.f99803b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/api/domain/PocketDescriptor$PocketTypeDescriptor;", "Lcom/revolut/retail/feature/commodity/order_flow/api/domain/PocketDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketTypeDescriptor extends PocketDescriptor {

        @NotNull
        public static final Parcelable.Creator<PocketTypeDescriptor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f99804a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketTypeDescriptor(c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketTypeDescriptor[i];
            }
        }

        public PocketTypeDescriptor(c type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f99804a = type;
        }

        @Override // com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor
        /* JADX INFO: renamed from: a */
        public final /* bridge */ /* synthetic */ b getF99802a() {
            return null;
        }

        @Override // com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor
        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getF99804a() {
            return this.f99804a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PocketTypeDescriptor) && this.f99804a == ((PocketTypeDescriptor) obj2).f99804a;
        }

        public final int hashCode() {
            return this.f99804a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99804a.name());
        }
    }

    private PocketDescriptor() {
    }

    /* JADX INFO: renamed from: a */
    public abstract b getF99802a();

    /* JADX INFO: renamed from: b */
    public abstract c getF99804a();
}
