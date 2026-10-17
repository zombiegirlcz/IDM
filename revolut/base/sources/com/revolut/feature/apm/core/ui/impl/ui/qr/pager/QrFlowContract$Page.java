package com.revolut.feature.apm.core.ui.impl.ui.qr.pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import g12.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/apm/core/ui/impl/ui/qr/pager/QrFlowContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Scanner", "Details", "Lcom/revolut/feature/apm/core/ui/impl/ui/qr/pager/QrFlowContract$Page$Details;", "Lcom/revolut/feature/apm/core/ui/impl/ui/qr/pager/QrFlowContract$Page$Scanner;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class QrFlowContract$Page implements FixedIdPagerItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f62371a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/pager/QrFlowContract$Page$Details;", "Lcom/revolut/feature/apm/core/ui/impl/ui/qr/pager/QrFlowContract$Page;", "<init>", "()V", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details extends QrFlowContract$Page {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Details f62372b = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f62372b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
            super(r.DETAILS);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/pager/QrFlowContract$Page$Scanner;", "Lcom/revolut/feature/apm/core/ui/impl/ui/qr/pager/QrFlowContract$Page;", "<init>", "()V", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scanner extends QrFlowContract$Page {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Scanner f62373b = new Scanner();

        @NotNull
        public static final Parcelable.Creator<Scanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scanner.f62373b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scanner[i];
            }
        }

        private Scanner() {
            super(r.SCAN);
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

    public QrFlowContract$Page(r rVar) {
        this.f62371a = rVar;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
    /* JADX INFO: renamed from: getId */
    public final String getF98432a() {
        return this.f62371a.getId();
    }
}
