package com.revolut.feature.shared.help_centre.impl.faq.screens.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "OpenByFaqKey", "OpenByFaqNode", "OpenByDisplayableItems", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData$OpenByDisplayableItems;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData$OpenByFaqKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData$OpenByFaqNode;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FaqListScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData$OpenByDisplayableItems;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenByDisplayableItems extends FaqListScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OpenByDisplayableItems> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f86263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f86264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86265c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", OpenByDisplayableItems.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(OpenByDisplayableItems.class, parcel, arrayList, iE, 1);
                }
                return new OpenByDisplayableItems(clause, arrayList, parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenByDisplayableItems[i];
            }
        }

        public OpenByDisplayableItems(Clause title, List items, boolean z, String analyticsContextId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(analyticsContextId, "analyticsContextId");
            this.f86263a = title;
            this.f86264b = items;
            this.f86265c = z;
            this.d = analyticsContextId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenByDisplayableItems)) {
                return false;
            }
            OpenByDisplayableItems openByDisplayableItems = (OpenByDisplayableItems) obj2;
            return Intrinsics.f(this.f86263a, openByDisplayableItems.f86263a) && Intrinsics.f(this.f86264b, openByDisplayableItems.f86264b) && this.f86265c == openByDisplayableItems.f86265c && Intrinsics.f(this.d, openByDisplayableItems.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.c(p.a.d(this.f86263a.hashCode() * 31, 31, this.f86264b), 31, this.f86265c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86263a, i);
            Iterator itV = p.a.v(this.f86264b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.f86265c ? 1 : 0);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData$OpenByFaqKey;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenByFaqKey extends FaqListScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OpenByFaqKey> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f86267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86268c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenByFaqKey(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenByFaqKey[i];
            }
        }

        public OpenByFaqKey(String faqKey, List list, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(faqKey, "faqKey");
            this.f86266a = faqKey;
            this.f86267b = list;
            this.f86268c = z;
            this.d = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenByFaqKey)) {
                return false;
            }
            OpenByFaqKey openByFaqKey = (OpenByFaqKey) obj2;
            return Intrinsics.f(this.f86266a, openByFaqKey.f86266a) && Intrinsics.f(this.f86267b, openByFaqKey.f86267b) && this.f86268c == openByFaqKey.f86268c && this.d == openByFaqKey.d;
        }

        public final int hashCode() {
            int iHashCode = this.f86266a.hashCode() * 31;
            List list = this.f86267b;
            return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f86268c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86266a);
            dest.writeStringList(this.f86267b);
            dest.writeInt(this.f86268c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData$OpenByFaqNode;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/list/FaqListScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenByFaqNode extends FaqListScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OpenByFaqNode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FaqNodeBase f86269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86271c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenByFaqNode((FaqNodeBase) parcel.readParcelable(OpenByFaqNode.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenByFaqNode[i];
            }
        }

        public OpenByFaqNode(FaqNodeBase node, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f86269a = node;
            this.f86270b = z;
            this.f86271c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenByFaqNode)) {
                return false;
            }
            OpenByFaqNode openByFaqNode = (OpenByFaqNode) obj2;
            return Intrinsics.f(this.f86269a, openByFaqNode.f86269a) && this.f86270b == openByFaqNode.f86270b && this.f86271c == openByFaqNode.f86271c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f86271c) + j6.a.c(this.f86269a.hashCode() * 31, 31, this.f86270b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86269a, i);
            dest.writeInt(this.f86270b ? 1 : 0);
            dest.writeInt(this.f86271c ? 1 : 0);
        }
    }

    private FaqListScreenContract$InputData() {
    }
}
