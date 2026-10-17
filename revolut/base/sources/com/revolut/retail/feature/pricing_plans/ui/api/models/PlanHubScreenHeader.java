package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader;", "Landroid/os/Parcelable;", "<init>", "()V", "Standard", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanHubScreenHeader implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader;", "", "toString", "()Ljava/lang/String;", "TitleContent", "Background", "Description", "Action", "HeaderAction", "com/revolut/retail/feature/pricing_plans/ui/api/models/c", "com/revolut/retail/feature/pricing_plans/ui/api/models/b", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Standard extends PlanHubScreenHeader {

        @NotNull
        public static final Parcelable.Creator<Standard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f102665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102666c;
        public final PlanScreenElementView.Action d;
        public final Description e;
        public final Background f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f102667g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final HeaderAction f102668h;
        public final ArrayList i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f102669j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Icon", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Action implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Action> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102670a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Icon f102671b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f102672c;
            public final PlanScreenElementView.Action d;
            public final b e;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Action$Icon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Icon implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Icon> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f102673a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f102674b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f102675c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Icon(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Icon[i];
                    }
                }

                public Icon(String str, String str2, boolean z) {
                    this.f102673a = str;
                    this.f102674b = str2;
                    this.f102675c = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Icon)) {
                        return false;
                    }
                    Icon icon = (Icon) obj2;
                    return Intrinsics.f(this.f102673a, icon.f102673a) && Intrinsics.f(this.f102674b, icon.f102674b) && this.f102675c == icon.f102675c;
                }

                public final int hashCode() {
                    String str = this.f102673a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f102674b;
                    return Boolean.hashCode(this.f102675c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f102673a);
                    dest.writeString(this.f102674b);
                    dest.writeInt(this.f102675c ? 1 : 0);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Action(parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readString(), (PlanScreenElementView.Action) parcel.readParcelable(Action.class.getClassLoader()), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Action[i];
                }
            }

            public Action(String str, Icon icon, String str2, PlanScreenElementView.Action deeplink, b bVar) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f102670a = str;
                this.f102671b = icon;
                this.f102672c = str2;
                this.d = deeplink;
                this.e = bVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj2;
                return Intrinsics.f(this.f102670a, action.f102670a) && Intrinsics.f(this.f102671b, action.f102671b) && Intrinsics.f(this.f102672c, action.f102672c) && Intrinsics.f(this.d, action.d) && this.e == action.e;
            }

            public final int hashCode() {
                String str = this.f102670a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Icon icon = this.f102671b;
                int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                String str2 = this.f102672c;
                int iC = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d.f81005a);
                b bVar = this.e;
                return iC + (bVar != null ? bVar.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102670a);
                Icon icon = this.f102671b;
                if (icon == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    icon.writeToParcel(dest, i);
                }
                dest.writeString(this.f102672c);
                dest.writeParcelable(this.d, i);
                b bVar = this.e;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(bVar.name());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background;", "Landroid/os/Parcelable;", "<init>", "()V", "AnimatedBackground", "Image", "Video", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background$AnimatedBackground;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background$Image;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background$Video;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Background implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background$AnimatedBackground;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AnimatedBackground extends Background {

                @NotNull
                public static final Parcelable.Creator<AnimatedBackground> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f102676a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AnimatedBackground(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AnimatedBackground[i];
                    }
                }

                public AnimatedBackground(String code) {
                    Intrinsics.checkNotNullParameter(code, "code");
                    this.f102676a = code;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof AnimatedBackground) && Intrinsics.f(this.f102676a, ((AnimatedBackground) obj2).f102676a);
                }

                public final int hashCode() {
                    return this.f102676a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f102676a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background$Image;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Image extends Background {

                @NotNull
                public static final Parcelable.Creator<Image> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f102677a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f102678b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Image(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Image[i];
                    }
                }

                public Image(String urlLight, String str) {
                    Intrinsics.checkNotNullParameter(urlLight, "urlLight");
                    this.f102677a = urlLight;
                    this.f102678b = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) obj2;
                    return Intrinsics.f(this.f102677a, image.f102677a) && Intrinsics.f(this.f102678b, image.f102678b);
                }

                public final int hashCode() {
                    int iHashCode = this.f102677a.hashCode() * 31;
                    String str = this.f102678b;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f102677a);
                    dest.writeString(this.f102678b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background$Video;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Background;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Video extends Background {

                @NotNull
                public static final Parcelable.Creator<Video> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f102679a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f102680b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Video(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Video[i];
                    }
                }

                public Video(String urlLight, String str) {
                    Intrinsics.checkNotNullParameter(urlLight, "urlLight");
                    this.f102679a = urlLight;
                    this.f102680b = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Video)) {
                        return false;
                    }
                    Video video = (Video) obj2;
                    return Intrinsics.f(this.f102679a, video.f102679a) && Intrinsics.f(this.f102680b, video.f102680b);
                }

                public final int hashCode() {
                    int iHashCode = this.f102679a.hashCode() * 31;
                    String str = this.f102680b;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f102679a);
                    dest.writeString(this.f102680b);
                }
            }

            private Background() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$Description;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Description implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Description> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlanScreenElementView.Icon f102681a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f102682b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f102683c;
            public final String d;
            public final String e;
            public final PlanScreenElementView.Icon f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final PlanScreenElementView.Action f102684g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Description((PlanScreenElementView.Icon) parcel.readParcelable(Description.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PlanScreenElementView.Icon) parcel.readParcelable(Description.class.getClassLoader()), (PlanScreenElementView.Action) parcel.readParcelable(Description.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Description[i];
                }
            }

            public Description(PlanScreenElementView.Icon icon, String str, String str2, String str3, String str4, PlanScreenElementView.Icon icon2, PlanScreenElementView.Action action) {
                this.f102681a = icon;
                this.f102682b = str;
                this.f102683c = str2;
                this.d = str3;
                this.e = str4;
                this.f = icon2;
                this.f102684g = action;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Description)) {
                    return false;
                }
                Description description = (Description) obj2;
                return Intrinsics.f(this.f102681a, description.f102681a) && Intrinsics.f(this.f102682b, description.f102682b) && Intrinsics.f(this.f102683c, description.f102683c) && Intrinsics.f(this.d, description.d) && Intrinsics.f(this.e, description.e) && Intrinsics.f(this.f, description.f) && Intrinsics.f(this.f102684g, description.f102684g);
            }

            public final int hashCode() {
                PlanScreenElementView.Icon icon = this.f102681a;
                int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
                String str = this.f102682b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f102683c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.d;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.e;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                PlanScreenElementView.Icon icon2 = this.f;
                int iHashCode6 = (iHashCode5 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
                PlanScreenElementView.Action action = this.f102684g;
                return iHashCode6 + (action != null ? action.f81005a.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f102681a, i);
                dest.writeString(this.f102682b);
                dest.writeString(this.f102683c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeParcelable(this.f, i);
                dest.writeParcelable(this.f102684g, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$HeaderAction;", "Landroid/os/Parcelable;", "<init>", "()V", "RevPointsBadge", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$HeaderAction$RevPointsBadge;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class HeaderAction implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$HeaderAction$RevPointsBadge;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$HeaderAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class RevPointsBadge extends HeaderAction {

                @NotNull
                public static final Parcelable.Creator<RevPointsBadge> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f102685a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PlanScreenElementView.Icon f102686b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final PlanScreenElementView.Action f102687c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new RevPointsBadge(parcel.readString(), (PlanScreenElementView.Icon) parcel.readParcelable(RevPointsBadge.class.getClassLoader()), (PlanScreenElementView.Action) parcel.readParcelable(RevPointsBadge.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new RevPointsBadge[i];
                    }
                }

                public RevPointsBadge(String label, PlanScreenElementView.Icon icon, PlanScreenElementView.Action action) {
                    Intrinsics.checkNotNullParameter(label, "label");
                    this.f102685a = label;
                    this.f102686b = icon;
                    this.f102687c = action;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof RevPointsBadge)) {
                        return false;
                    }
                    RevPointsBadge revPointsBadge = (RevPointsBadge) obj2;
                    return Intrinsics.f(this.f102685a, revPointsBadge.f102685a) && Intrinsics.f(this.f102686b, revPointsBadge.f102686b) && Intrinsics.f(this.f102687c, revPointsBadge.f102687c);
                }

                public final int hashCode() {
                    int iHashCode = this.f102685a.hashCode() * 31;
                    PlanScreenElementView.Icon icon = this.f102686b;
                    int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                    PlanScreenElementView.Action action = this.f102687c;
                    return iHashCode2 + (action != null ? action.f81005a.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f102685a);
                    dest.writeParcelable(this.f102686b, i);
                    dest.writeParcelable(this.f102687c, i);
                }
            }

            private HeaderAction() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$TitleContent;", "Landroid/os/Parcelable;", "<init>", "()V", "RevolutLogo", "PlainText", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$TitleContent$PlainText;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$TitleContent$RevolutLogo;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class TitleContent implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$TitleContent$PlainText;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$TitleContent;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PlainText extends TitleContent {

                @NotNull
                public static final Parcelable.Creator<PlainText> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f102688a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PlainText(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new PlainText[i];
                    }
                }

                public PlainText(String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.f102688a = text;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof PlainText) && Intrinsics.f(this.f102688a, ((PlainText) obj2).f102688a);
                }

                public final int hashCode() {
                    return this.f102688a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f102688a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$TitleContent$RevolutLogo;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenHeader$Standard$TitleContent;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class RevolutLogo extends TitleContent {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final RevolutLogo f102689a = new RevolutLogo();

                @NotNull
                public static final Parcelable.Creator<RevolutLogo> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return RevolutLogo.f102689a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new RevolutLogo[i];
                    }
                }

                private RevolutLogo() {
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

            private TitleContent() {
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(Standard.class, parcel, arrayList, iE, 1);
                    }
                }
                int iA = 0;
                String string2 = parcel.readString();
                PlanScreenElementView.Action action = (PlanScreenElementView.Action) parcel.readParcelable(Standard.class.getClassLoader());
                Description descriptionCreateFromParcel = parcel.readInt() != 0 ? Description.CREATOR.createFromParcel(parcel) : null;
                Background background = (Background) parcel.readParcelable(Standard.class.getClassLoader());
                c cVarValueOf = c.valueOf(parcel.readString());
                HeaderAction headerAction = (HeaderAction) parcel.readParcelable(Standard.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Action.CREATOR, parcel, arrayList2, iA2, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Action.CREATOR, parcel, arrayList3, iA, 1);
                }
                return new Standard(string, arrayList, string2, action, descriptionCreateFromParcel, background, cVarValueOf, headerAction, arrayList2, arrayList3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Standard[i];
            }
        }

        public Standard(String title, ArrayList arrayList, String str, PlanScreenElementView.Action action, Description description, Background background, c style, HeaderAction headerAction, ArrayList menuActions, ArrayList actionPanel) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(menuActions, "menuActions");
            Intrinsics.checkNotNullParameter(actionPanel, "actionPanel");
            this.f102664a = title;
            this.f102665b = arrayList;
            this.f102666c = str;
            this.d = action;
            this.e = description;
            this.f = background;
            this.f102667g = style;
            this.f102668h = headerAction;
            this.i = menuActions;
            this.f102669j = actionPanel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Standard)) {
                return false;
            }
            Standard standard = (Standard) obj2;
            return Intrinsics.f(this.f102664a, standard.f102664a) && Intrinsics.f(this.f102665b, standard.f102665b) && Intrinsics.f(this.f102666c, standard.f102666c) && Intrinsics.f(this.d, standard.d) && Intrinsics.f(this.e, standard.e) && Intrinsics.f(this.f, standard.f) && this.f102667g == standard.f102667g && Intrinsics.f(this.f102668h, standard.f102668h) && this.i.equals(standard.i) && this.f102669j.equals(standard.f102669j);
        }

        public final int hashCode() {
            int iHashCode = this.f102664a.hashCode() * 31;
            List list = this.f102665b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f102666c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            PlanScreenElementView.Action action = this.d;
            int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.f81005a.hashCode())) * 31;
            Description description = this.e;
            int iHashCode5 = (iHashCode4 + (description == null ? 0 : description.hashCode())) * 31;
            Background background = this.f;
            int iHashCode6 = (this.f102667g.hashCode() + ((iHashCode5 + (background == null ? 0 : background.hashCode())) * 31)) * 31;
            HeaderAction headerAction = this.f102668h;
            return this.f102669j.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, (iHashCode6 + (headerAction != null ? headerAction.hashCode() : 0)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102664a);
            List list = this.f102665b;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeParcelable((Parcelable) itQ.next(), i);
                }
            }
            dest.writeString(this.f102666c);
            dest.writeParcelable(this.d, i);
            Description description = this.e;
            if (description == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                description.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f, i);
            dest.writeString(this.f102667g.name());
            dest.writeParcelable(this.f102668h, i);
            Iterator itY = j6.a.y(this.i, dest);
            while (itY.hasNext()) {
                ((Action) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f102669j, dest);
            while (itY2.hasNext()) {
                ((Action) itY2.next()).writeToParcel(dest, i);
            }
        }
    }

    private PlanHubScreenHeader() {
    }
}
