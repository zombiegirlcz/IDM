package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.x;
import xl2.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "PermissionValue", "PermissionPayload", "DeclinedPermissionDialog", "DeclinedPermissionDialogAction", "xl2/x", "xl2/y", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PermissionInputItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<PermissionInputItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f63557c;
    public final PermissionValue d;
    public final DeclinedPermissionDialog e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$DeclinedPermissionDialog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclinedPermissionDialog implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DeclinedPermissionDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63560c;
        public final ArrayList d;

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
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DeclinedPermissionDialogAction.CREATOR, parcel, arrayList, iA, 1);
                }
                return new DeclinedPermissionDialog(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclinedPermissionDialog[i];
            }
        }

        public DeclinedPermissionDialog(String assetUrl, String title, String description, ArrayList actions) {
            Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f63558a = assetUrl;
            this.f63559b = title;
            this.f63560c = description;
            this.d = actions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclinedPermissionDialog)) {
                return false;
            }
            DeclinedPermissionDialog declinedPermissionDialog = (DeclinedPermissionDialog) obj2;
            return Intrinsics.f(this.f63558a, declinedPermissionDialog.f63558a) && Intrinsics.f(this.f63559b, declinedPermissionDialog.f63559b) && Intrinsics.f(this.f63560c, declinedPermissionDialog.f63560c) && this.d.equals(declinedPermissionDialog.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f63558a.hashCode() * 31, 31, this.f63559b), 31, this.f63560c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63558a);
            dest.writeString(this.f63559b);
            dest.writeString(this.f63560c);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                ((DeclinedPermissionDialogAction) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$DeclinedPermissionDialogAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclinedPermissionDialogAction implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DeclinedPermissionDialogAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63562b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclinedPermissionDialogAction(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclinedPermissionDialogAction[i];
            }
        }

        public DeclinedPermissionDialogAction(String type, String title) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f63561a = type;
            this.f63562b = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclinedPermissionDialogAction)) {
                return false;
            }
            DeclinedPermissionDialogAction declinedPermissionDialogAction = (DeclinedPermissionDialogAction) obj2;
            return Intrinsics.f(this.f63561a, declinedPermissionDialogAction.f63561a) && Intrinsics.f(this.f63562b, declinedPermissionDialogAction.f63562b);
        }

        public final int hashCode() {
            return this.f63562b.hashCode() + (this.f63561a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63561a);
            dest.writeString(this.f63562b);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$PermissionPayload;", "Landroid/os/Parcelable;", "LocationPermissionPayload", "MetaPermissionPayload", "Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$PermissionPayload$LocationPermissionPayload;", "Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$PermissionPayload$MetaPermissionPayload;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class PermissionPayload implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63563a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$PermissionPayload$LocationPermissionPayload;", "Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$PermissionPayload;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LocationPermissionPayload extends PermissionPayload {

            @NotNull
            public static final Parcelable.Creator<LocationPermissionPayload> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final double f63564b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f63565c;
            public final String d;
            public final String e;
            public final String f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LocationPermissionPayload(parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LocationPermissionPayload[i];
                }
            }

            public LocationPermissionPayload(double d, double d5, String str, String str2, String str3) {
                super("GEO_LOCATION");
                this.f63564b = d;
                this.f63565c = d5;
                this.d = str;
                this.e = str2;
                this.f = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof LocationPermissionPayload)) {
                    return false;
                }
                LocationPermissionPayload locationPermissionPayload = (LocationPermissionPayload) obj2;
                return Double.compare(this.f63564b, locationPermissionPayload.f63564b) == 0 && Double.compare(this.f63565c, locationPermissionPayload.f63565c) == 0 && Intrinsics.f(this.d, locationPermissionPayload.d) && Intrinsics.f(this.e, locationPermissionPayload.e) && Intrinsics.f(this.f, locationPermissionPayload.f);
            }

            public final int hashCode() {
                int iC = m72.b.c(Double.hashCode(this.f63564b) * 31, this.f63565c, 31);
                String str = this.d;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.e;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeDouble(this.f63564b);
                dest.writeDouble(this.f63565c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$PermissionPayload$MetaPermissionPayload;", "Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$PermissionPayload;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MetaPermissionPayload extends PermissionPayload {

            @NotNull
            public static final Parcelable.Creator<MetaPermissionPayload> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f63566b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MetaPermissionPayload(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MetaPermissionPayload[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MetaPermissionPayload(String accessCode) {
                super("META_ACCESS_CODE");
                Intrinsics.checkNotNullParameter(accessCode, "accessCode");
                this.f63566b = accessCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof MetaPermissionPayload) && Intrinsics.f(this.f63566b, ((MetaPermissionPayload) obj2).f63566b);
            }

            public final int hashCode() {
                return this.f63566b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63566b);
            }
        }

        public PermissionPayload(String str) {
            this.f63563a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PermissionInputItem$PermissionValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PermissionValue implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PermissionValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f63567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PermissionPayload f63568b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PermissionValue(x.valueOf(parcel.readString()), (PermissionPayload) parcel.readParcelable(PermissionValue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PermissionValue[i];
            }
        }

        public PermissionValue(x result, PermissionPayload permissionPayload) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f63567a = result;
            this.f63568b = permissionPayload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PermissionValue)) {
                return false;
            }
            PermissionValue permissionValue = (PermissionValue) obj2;
            return this.f63567a == permissionValue.f63567a && Intrinsics.f(this.f63568b, permissionValue.f63568b);
        }

        public final int hashCode() {
            int iHashCode = this.f63567a.hashCode() * 31;
            PermissionPayload permissionPayload = this.f63568b;
            return iHashCode + (permissionPayload == null ? 0 : permissionPayload.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63567a.name());
            dest.writeParcelable(this.f63568b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PermissionInputItem(parcel.readString(), parcel.readInt() != 0, y.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PermissionValue.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DeclinedPermissionDialog.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PermissionInputItem[i];
        }
    }

    public PermissionInputItem(String id10, boolean z, y permission, PermissionValue permissionValue, DeclinedPermissionDialog declinedPermissionDialog) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.f63555a = id10;
        this.f63556b = z;
        this.f63557c = permission;
        this.d = permissionValue;
        this.e = declinedPermissionDialog;
    }

    public static PermissionInputItem d(PermissionInputItem permissionInputItem, PermissionValue permissionValue) {
        String id10 = permissionInputItem.f63555a;
        boolean z = permissionInputItem.f63556b;
        y permission = permissionInputItem.f63557c;
        DeclinedPermissionDialog declinedPermissionDialog = permissionInputItem.e;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return new PermissionInputItem(id10, z, permission, permissionValue, declinedPermissionDialog);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63555a() {
        return this.f63555a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63556b() {
        return this.f63556b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PermissionInputItem)) {
            return false;
        }
        PermissionInputItem permissionInputItem = (PermissionInputItem) obj2;
        return Intrinsics.f(this.f63555a, permissionInputItem.f63555a) && this.f63556b == permissionInputItem.f63556b && this.f63557c == permissionInputItem.f63557c && Intrinsics.f(this.d, permissionInputItem.d) && Intrinsics.f(this.e, permissionInputItem.e);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63555a;
    }

    public final int hashCode() {
        int iHashCode = (this.f63557c.hashCode() + j6.a.c(this.f63555a.hashCode() * 31, 31, this.f63556b)) * 31;
        PermissionValue permissionValue = this.d;
        int iHashCode2 = (iHashCode + (permissionValue == null ? 0 : permissionValue.hashCode())) * 31;
        DeclinedPermissionDialog declinedPermissionDialog = this.e;
        return iHashCode2 + (declinedPermissionDialog != null ? declinedPermissionDialog.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63555a);
        dest.writeInt(this.f63556b ? 1 : 0);
        dest.writeString(this.f63557c.name());
        PermissionValue permissionValue = this.d;
        if (permissionValue == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            permissionValue.writeToParcel(dest, i);
        }
        DeclinedPermissionDialog declinedPermissionDialog = this.e;
        if (declinedPermissionDialog == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            declinedPermissionDialog.writeToParcel(dest, i);
        }
    }
}
