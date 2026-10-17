package com.revolut.feature.home_feed.api.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "", "toString", "()Ljava/lang/String;", "Type", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VaultWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<VaultWidgetContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f74721b;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "Landroid/os/Parcelable;", "Savings", "JuniorSavings", "JointSavings", "Pockets", "JointPockets", "ProRegularPockets", "ProTaxPockets", "JuniorPockets", "TeenPockets", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$JointPockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$JointSavings;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$JuniorPockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$JuniorSavings;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$Pockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$ProRegularPockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$ProTaxPockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$Savings;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$TeenPockets;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Type extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$JointPockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JointPockets implements Type {

            @NotNull
            public static final Parcelable.Creator<JointPockets> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74722a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JointPockets(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JointPockets[i];
                }
            }

            public JointPockets(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f74722a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof JointPockets) && Intrinsics.f(this.f74722a, ((JointPockets) obj2).f74722a);
            }

            @Override // com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF74730a() {
                return this.f74722a;
            }

            public final int hashCode() {
                return this.f74722a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74722a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$JointSavings;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JointSavings implements Type {

            @NotNull
            public static final Parcelable.Creator<JointSavings> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74723a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JointSavings(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JointSavings[i];
                }
            }

            public JointSavings(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f74723a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof JointSavings) && Intrinsics.f(this.f74723a, ((JointSavings) obj2).f74723a);
            }

            @Override // com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF74730a() {
                return this.f74723a;
            }

            public final int hashCode() {
                return this.f74723a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74723a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$JuniorPockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JuniorPockets implements Type {

            @NotNull
            public static final Parcelable.Creator<JuniorPockets> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74724a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JuniorPockets(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JuniorPockets[i];
                }
            }

            public JuniorPockets(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f74724a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof JuniorPockets) && Intrinsics.f(this.f74724a, ((JuniorPockets) obj2).f74724a);
            }

            @Override // com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF74730a() {
                return this.f74724a;
            }

            public final int hashCode() {
                return this.f74724a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74724a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$JuniorSavings;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JuniorSavings implements Type {

            @NotNull
            public static final Parcelable.Creator<JuniorSavings> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74725a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JuniorSavings(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JuniorSavings[i];
                }
            }

            public JuniorSavings(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f74725a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof JuniorSavings) && Intrinsics.f(this.f74725a, ((JuniorSavings) obj2).f74725a);
            }

            @Override // com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF74730a() {
                return this.f74725a;
            }

            public final int hashCode() {
                return this.f74725a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74725a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$Pockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Pockets implements Type {

            @NotNull
            public static final Parcelable.Creator<Pockets> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74726a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Pockets(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pockets[i];
                }
            }

            public Pockets(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f74726a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Pockets) && Intrinsics.f(this.f74726a, ((Pockets) obj2).f74726a);
            }

            @Override // com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF74730a() {
                return this.f74726a;
            }

            public final int hashCode() {
                return this.f74726a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74726a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$ProRegularPockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProRegularPockets implements Type {

            @NotNull
            public static final Parcelable.Creator<ProRegularPockets> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74727a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ProRegularPockets(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProRegularPockets[i];
                }
            }

            public ProRegularPockets(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f74727a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ProRegularPockets) && Intrinsics.f(this.f74727a, ((ProRegularPockets) obj2).f74727a);
            }

            @Override // com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF74730a() {
                return this.f74727a;
            }

            public final int hashCode() {
                return this.f74727a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74727a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$ProTaxPockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProTaxPockets implements Type {

            @NotNull
            public static final Parcelable.Creator<ProTaxPockets> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74728a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ProTaxPockets(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProTaxPockets[i];
                }
            }

            public ProTaxPockets(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f74728a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ProTaxPockets) && Intrinsics.f(this.f74728a, ((ProTaxPockets) obj2).f74728a);
            }

            @Override // com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF74730a() {
                return this.f74728a;
            }

            public final int hashCode() {
                return this.f74728a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74728a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$Savings;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Savings implements Type {

            @NotNull
            public static final Parcelable.Creator<Savings> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74729a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Savings(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Savings[i];
                }
            }

            public Savings(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f74729a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Savings) && Intrinsics.f(this.f74729a, ((Savings) obj2).f74729a);
            }

            @Override // com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF74730a() {
                return this.f74729a;
            }

            public final int hashCode() {
                return this.f74729a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74729a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type$TeenPockets;", "Lcom/revolut/feature/home_feed/api/widget/VaultWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TeenPockets implements Type {

            @NotNull
            public static final Parcelable.Creator<TeenPockets> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74730a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TeenPockets(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TeenPockets[i];
                }
            }

            public TeenPockets(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f74730a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof TeenPockets) && Intrinsics.f(this.f74730a, ((TeenPockets) obj2).f74730a);
            }

            @Override // com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF74730a() {
                return this.f74730a;
            }

            public final int hashCode() {
                return this.f74730a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74730a);
            }
        }

        /* JADX INFO: renamed from: getId */
        String getF74730a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VaultWidgetContext(parcel.readString(), (Type) parcel.readParcelable(VaultWidgetContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VaultWidgetContext[i];
        }
    }

    public VaultWidgetContext(String contextKey, Type type) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f74720a = contextKey;
        this.f74721b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VaultWidgetContext)) {
            return false;
        }
        VaultWidgetContext vaultWidgetContext = (VaultWidgetContext) obj2;
        return Intrinsics.f(this.f74720a, vaultWidgetContext.f74720a) && Intrinsics.f(this.f74721b, vaultWidgetContext.f74721b);
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    /* JADX INFO: renamed from: getContextKey, reason: from getter */
    public final String getF76166a() {
        return this.f74720a;
    }

    public final int hashCode() {
        return this.f74721b.hashCode() + (this.f74720a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74720a);
        dest.writeParcelable(this.f74721b, i);
    }
}
