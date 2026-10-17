package com.revolut.core.ui_kit.models.navbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/navbar/NavBarMessage;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavBarMessage implements TrackableItem, Parcelable {

    @NotNull
    public static final Parcelable.Creator<NavBarMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f58115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58116c;
    public final boolean d;
    public Parcelable e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NavBarMessage(parcel.readString(), (Clause) parcel.readParcelable(NavBarMessage.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(NavBarMessage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NavBarMessage[i];
        }
    }

    public NavBarMessage(String id10, Clause text, boolean z, boolean z3, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f58114a = id10;
        this.f58115b = text;
        this.f58116c = z;
        this.d = z3;
        this.e = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NavBarMessage)) {
            return false;
        }
        NavBarMessage navBarMessage = (NavBarMessage) obj2;
        return Intrinsics.f(this.f58114a, navBarMessage.f58114a) && Intrinsics.f(this.f58115b, navBarMessage.f58115b) && this.f58116c == navBarMessage.f58116c && this.d == navBarMessage.d && Intrinsics.f(this.e, navBarMessage.e);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF52346h() {
        return this.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.a(this.f58114a.hashCode() * 31, 31, this.f58115b), 31, this.f58116c), 31, this.d);
        Parcelable parcelable = this.e;
        return iC + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.e = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f58114a);
        dest.writeParcelable(this.f58115b, i);
        dest.writeInt(this.f58116c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ NavBarMessage(String str, Clause clause, boolean z, boolean z3, int i) {
        this(str, clause, z, (i & 8) != 0 ? false : z3, (Parcelable) null);
    }
}
