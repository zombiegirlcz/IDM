package com.revolut.feature.retail.corporate_events.common.delegates.widget.mappers.content;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/corporate_events/common/delegates/widget/mappers/content/EventContentMapper$EventInfoDialogContent", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_corporate_events_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EventContentMapper$EventInfoDialogContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EventContentMapper$EventInfoDialogContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f82634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f82635b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EventContentMapper$EventInfoDialogContent((Clause) parcel.readParcelable(EventContentMapper$EventInfoDialogContent.class.getClassLoader()), (Clause) parcel.readParcelable(EventContentMapper$EventInfoDialogContent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EventContentMapper$EventInfoDialogContent[i];
        }
    }

    public EventContentMapper$EventInfoDialogContent(Clause title, Clause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f82634a = title;
        this.f82635b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EventContentMapper$EventInfoDialogContent)) {
            return false;
        }
        EventContentMapper$EventInfoDialogContent eventContentMapper$EventInfoDialogContent = (EventContentMapper$EventInfoDialogContent) obj2;
        return Intrinsics.f(this.f82634a, eventContentMapper$EventInfoDialogContent.f82634a) && Intrinsics.f(this.f82635b, eventContentMapper$EventInfoDialogContent.f82635b);
    }

    public final int hashCode() {
        return this.f82635b.hashCode() + (this.f82634a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82634a, i);
        dest.writeParcelable(this.f82635b, i);
    }
}
