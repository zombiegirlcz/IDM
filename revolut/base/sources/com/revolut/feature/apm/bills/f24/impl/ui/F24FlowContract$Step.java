package com.revolut.feature.apm.bills.f24.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Entry", "NewForm", "FormsList", "Lcom/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step$Entry;", "Lcom/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step$FormsList;", "Lcom/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step$NewForm;", "feature_apm_bills_f24_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface F24FlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step$Entry;", "Lcom/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step;", "<init>", "()V", "feature_apm_bills_f24_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Entry implements F24FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Entry f61467a = new Entry();

        @NotNull
        public static final Parcelable.Creator<Entry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Entry.f61467a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Entry[i];
            }
        }

        private Entry() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step$FormsList;", "Lcom/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_f24_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormsList implements F24FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FormsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f61468a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(FormsList.class, parcel, arrayList, iE, 1);
                }
                return new FormsList(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FormsList[i];
            }
        }

        public FormsList(List forms) {
            Intrinsics.checkNotNullParameter(forms, "forms");
            this.f61468a = forms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FormsList) && Intrinsics.f(this.f61468a, ((FormsList) obj2).f61468a);
        }

        public final int hashCode() {
            return this.f61468a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f61468a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step$NewForm;", "Lcom/revolut/feature/apm/bills/f24/impl/ui/F24FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_f24_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewForm implements F24FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NewForm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BillFormV2 f61469a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewForm((BillFormV2) parcel.readParcelable(NewForm.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewForm[i];
            }
        }

        public NewForm(BillFormV2 form) {
            Intrinsics.checkNotNullParameter(form, "form");
            this.f61469a = form;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewForm) && Intrinsics.f(this.f61469a, ((NewForm) obj2).f61469a);
        }

        public final int hashCode() {
            return this.f61469a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61469a, i);
        }
    }
}
