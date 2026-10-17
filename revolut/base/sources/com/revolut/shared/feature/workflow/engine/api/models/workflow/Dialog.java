package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import aal.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Dialog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Item", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Dialog implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Dialog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105587c;
    public final ArrayList d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Dialog$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f105588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105590c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item(b.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(b icon, String title, String str) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f105588a = icon;
            this.f105589b = title;
            this.f105590c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Item)) {
                return false;
            }
            Item item = (Item) obj2;
            return this.f105588a == item.f105588a && Intrinsics.f(this.f105589b, item.f105589b) && Intrinsics.f(this.f105590c, item.f105590c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105588a.hashCode() * 31, 31, this.f105589b);
            String str = this.f105590c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105588a.name());
            dest.writeString(this.f105589b);
            dest.writeString(this.f105590c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Dialog(string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Dialog[i];
        }
    }

    public Dialog(String entryLabel, String str, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(entryLabel, "entryLabel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f105585a = entryLabel;
        this.f105586b = str;
        this.f105587c = str2;
        this.d = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Dialog)) {
            return false;
        }
        Dialog dialog = (Dialog) obj2;
        return Intrinsics.f(this.f105585a, dialog.f105585a) && Intrinsics.f(this.f105586b, dialog.f105586b) && Intrinsics.f(this.f105587c, dialog.f105587c) && this.d.equals(dialog.d);
    }

    public final int hashCode() {
        int iHashCode = this.f105585a.hashCode() * 31;
        String str = this.f105586b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f105587c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105585a);
        dest.writeString(this.f105586b);
        dest.writeString(this.f105587c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((Item) itY.next()).writeToParcel(dest, i);
        }
    }
}
