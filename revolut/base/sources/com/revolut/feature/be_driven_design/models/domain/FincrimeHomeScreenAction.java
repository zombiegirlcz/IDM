package com.revolut.feature.be_driven_design.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction;", "Landroid/os/Parcelable;", "<init>", "()V", "Dismiss", "Deeplink", "PopupMenu", "Dialog", "Request", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Deeplink;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dialog;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dismiss;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$PopupMenu;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Request;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FincrimeHomeScreenAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Deeplink;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink extends FincrimeHomeScreenAction {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64132a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f64132a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Deeplink) && Intrinsics.f(this.f64132a, ((Deeplink) obj2).f64132a);
        }

        public final int hashCode() {
            return this.f64132a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64132a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dialog;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction;", "<init>", "()V", "Bottom", "Status", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dialog$Bottom;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dialog$Status;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Dialog extends FincrimeHomeScreenAction {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dialog$Bottom;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dialog;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Bottom extends Dialog {

            @NotNull
            public static final Parcelable.Creator<Bottom> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64133a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64134b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List f64135c;
            public final ArrayList d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    int iA2 = 0;
                    while (iA2 != i) {
                        iA2 = org.bouncycastle.jcajce.provider.digest.a.a(SectionContent.TransactionCell.CREATOR, parcel, arrayList, iA2, 1);
                    }
                    int i2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i2);
                    while (iA != i2) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(FincrimeHomeScreenActionButton.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    return new Bottom(string, string2, arrayList2, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Bottom[i];
                }
            }

            public Bottom(String title, String str, ArrayList buttons, List transactionCells) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(transactionCells, "transactionCells");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                this.f64133a = title;
                this.f64134b = str;
                this.f64135c = transactionCells;
                this.d = buttons;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Bottom)) {
                    return false;
                }
                Bottom bottom = (Bottom) obj2;
                return Intrinsics.f(this.f64133a, bottom.f64133a) && Intrinsics.f(this.f64134b, bottom.f64134b) && Intrinsics.f(this.f64135c, bottom.f64135c) && this.d.equals(bottom.d);
            }

            public final int hashCode() {
                int iHashCode = this.f64133a.hashCode() * 31;
                String str = this.f64134b;
                return this.d.hashCode() + p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f64135c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f64133a);
                dest.writeString(this.f64134b);
                Iterator itV = p.a.v(this.f64135c, dest);
                while (itV.hasNext()) {
                    ((SectionContent.TransactionCell) itV.next()).writeToParcel(dest, i);
                }
                Iterator itY = j6.a.y(this.d, dest);
                while (itY.hasNext()) {
                    ((FincrimeHomeScreenActionButton) itY.next()).writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dialog$Status;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dialog;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/be_driven_design/models/domain/a", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Status extends Dialog {

            @NotNull
            public static final Parcelable.Creator<Status> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.revolut.feature.be_driven_design.models.domain.a f64136a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64137b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f64138c;
            public final ArrayList d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    com.revolut.feature.be_driven_design.models.domain.a aVarValueOf = com.revolut.feature.be_driven_design.models.domain.a.valueOf(parcel.readString());
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(FincrimeHomeScreenActionButton.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new Status(aVarValueOf, string, string2, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Status[i];
                }
            }

            public Status(com.revolut.feature.be_driven_design.models.domain.a type, String title, String str, ArrayList buttons) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                this.f64136a = type;
                this.f64137b = title;
                this.f64138c = str;
                this.d = buttons;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Status)) {
                    return false;
                }
                Status status = (Status) obj2;
                return this.f64136a == status.f64136a && Intrinsics.f(this.f64137b, status.f64137b) && Intrinsics.f(this.f64138c, status.f64138c) && this.d.equals(status.d);
            }

            public final int hashCode() {
                int iC = p.a.c(this.f64136a.hashCode() * 31, 31, this.f64137b);
                String str = this.f64138c;
                return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f64136a.name());
                dest.writeString(this.f64137b);
                dest.writeString(this.f64138c);
                Iterator itY = j6.a.y(this.d, dest);
                while (itY.hasNext()) {
                    ((FincrimeHomeScreenActionButton) itY.next()).writeToParcel(dest, i);
                }
            }
        }

        private Dialog() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Dismiss;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction;", "<init>", "()V", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dismiss extends FincrimeHomeScreenAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dismiss f64139a = new Dismiss();

        @NotNull
        public static final Parcelable.Creator<Dismiss> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dismiss.f64139a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dismiss[i];
            }
        }

        private Dismiss() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$PopupMenu;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction;", "", "toString", "()Ljava/lang/String;", "Item", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PopupMenu extends FincrimeHomeScreenAction {

        @NotNull
        public static final Parcelable.Creator<PopupMenu> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f64140a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$PopupMenu$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/be_driven_design/models/domain/b", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64141a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final aal.b f64142b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f64143c;
            public final String d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(parcel.readString(), parcel.readInt() == 0 ? null : aal.b.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Item[i];
                }
            }

            public Item(String title, aal.b bVar, b style, String deeplink) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f64141a = title;
                this.f64142b = bVar;
                this.f64143c = style;
                this.d = deeplink;
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
                return Intrinsics.f(this.f64141a, item.f64141a) && this.f64142b == item.f64142b && this.f64143c == item.f64143c && Intrinsics.f(this.d, item.d);
            }

            public final int hashCode() {
                int iHashCode = this.f64141a.hashCode() * 31;
                aal.b bVar = this.f64142b;
                return this.d.hashCode() + ((this.f64143c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f64141a);
                aal.b bVar = this.f64142b;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(bVar.name());
                }
                dest.writeString(this.f64143c.name());
                dest.writeString(this.d);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
                }
                return new PopupMenu(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PopupMenu[i];
            }
        }

        public PopupMenu(ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f64140a = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PopupMenu) && this.f64140a.equals(((PopupMenu) obj2).f64140a);
        }

        public final int hashCode() {
            return this.f64140a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f64140a, dest);
            while (itY.hasNext()) {
                ((Item) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction$Request;", "Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenAction;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/be_driven_design/models/domain/d", "com/revolut/feature/be_driven_design/models/domain/c", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Request extends FincrimeHomeScreenAction {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f64145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f64146c;
        public final String d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Request(parcel.readString(), c.valueOf(parcel.readString()), d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public Request(String successMessage, c successMessageType, d method, String path, String str, String str2) {
            Intrinsics.checkNotNullParameter(successMessage, "successMessage");
            Intrinsics.checkNotNullParameter(successMessageType, "successMessageType");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(path, "path");
            this.f64144a = successMessage;
            this.f64145b = successMessageType;
            this.f64146c = method;
            this.d = path;
            this.e = str;
            this.f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Request)) {
                return false;
            }
            Request request = (Request) obj2;
            return Intrinsics.f(this.f64144a, request.f64144a) && this.f64145b == request.f64145b && this.f64146c == request.f64146c && Intrinsics.f(this.d, request.d) && Intrinsics.f(this.e, request.e) && Intrinsics.f(this.f, request.f);
        }

        public final int hashCode() {
            int iC = p.a.c((this.f64146c.hashCode() + ((this.f64145b.hashCode() + (this.f64144a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            String str = this.e;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64144a);
            dest.writeString(this.f64145b.name());
            dest.writeString(this.f64146c.name());
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    private FincrimeHomeScreenAction() {
    }
}
