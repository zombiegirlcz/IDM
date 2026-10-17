package com.revolut.feature.globe_resources.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$color;
import j6.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Style", "a", "feature_globe_resources_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TripsMapBitmapConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f74634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Style f74635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74636c;
    public final int d;
    public final float e;
    public final boolean f;

    @NotNull
    public static final Parcelable.Creator<TripsMapBitmapConfig> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style;", "Landroid/os/Parcelable;", "Light", "Dark", "Custom", "Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style$Custom;", "Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style$Dark;", "Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style$Light;", "feature_globe_resources_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Style extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style$Custom;", "Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style;", "", "toString", "()Ljava/lang/String;", "feature_globe_resources_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Custom implements Style {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Color f74637a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Color f74638b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom((Color) parcel.readParcelable(Custom.class.getClassLoader()), (Color) parcel.readParcelable(Custom.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Custom[i];
                }
            }

            public Custom() {
                this(0);
            }

            @Override // com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig.Style
            /* JADX INFO: renamed from: Q4, reason: from getter */
            public final Color getF74637a() {
                return this.f74637a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) obj2;
                return Intrinsics.f(this.f74637a, custom.f74637a) && Intrinsics.f(this.f74638b, custom.f74638b);
            }

            public final int hashCode() {
                return this.f74638b.hashCode() + (this.f74637a.hashCode() * 31);
            }

            @Override // com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig.Style
            /* JADX INFO: renamed from: v4, reason: from getter */
            public final Color getF74638b() {
                return this.f74638b;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f74637a, i);
                dest.writeParcelable(this.f74638b, i);
            }

            public Custom(Color regularCountryColor, Color highlightedCountryColor) {
                Intrinsics.checkNotNullParameter(regularCountryColor, "regularCountryColor");
                Intrinsics.checkNotNullParameter(highlightedCountryColor, "highlightedCountryColor");
                this.f74637a = regularCountryColor;
                this.f74638b = highlightedCountryColor;
            }

            public /* synthetic */ Custom(int i) {
                this(new Color.SolidInt(android.graphics.Color.parseColor("#060B4C")), new Color.SolidInt(android.graphics.Color.parseColor("#C6D9FD")));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style$Dark;", "Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style;", "<init>", "()V", "feature_globe_resources_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Dark implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Dark f74639a = new Dark();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Color.SolidRes f74640b = new Color.SolidRes(R$color.internal_accentNeutral_10_mono);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final Color.SolidRes f74641c = new Color.SolidRes(R$color.internal_accent_mono);

            @NotNull
            public static final Parcelable.Creator<Dark> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Dark.f74639a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Dark[i];
                }
            }

            private Dark() {
            }

            @Override // com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig.Style
            /* JADX INFO: renamed from: Q4 */
            public final Color getF74637a() {
                return f74640b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig.Style
            /* JADX INFO: renamed from: v4 */
            public final Color getF74638b() {
                return f74641c;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style$Light;", "Lcom/revolut/feature/globe_resources/api/model/TripsMapBitmapConfig$Style;", "<init>", "()V", "feature_globe_resources_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Light implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Light f74642a = new Light();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Color.SolidRes f74643b = new Color.SolidRes(R$color.internal_accentNeutral_10_mono_light);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final Color.SolidRes f74644c = new Color.SolidRes(R$color.internal_accent_mono_light);

            @NotNull
            public static final Parcelable.Creator<Light> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Light.f74642a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Light[i];
                }
            }

            private Light() {
            }

            @Override // com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig.Style
            /* JADX INFO: renamed from: Q4 */
            public final Color getF74637a() {
                return f74643b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig.Style
            /* JADX INFO: renamed from: v4 */
            public final Color getF74638b() {
                return f74644c;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: Q4 */
        Color getF74637a();

        /* JADX INFO: renamed from: v4 */
        Color getF74638b();
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TripsMapBitmapConfig(parcel.createStringArrayList(), (Style) parcel.readParcelable(TripsMapBitmapConfig.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TripsMapBitmapConfig[i];
        }
    }

    public TripsMapBitmapConfig(List highlightedCountryCodes, Style style, int i, int i2, float f, boolean z) {
        Intrinsics.checkNotNullParameter(highlightedCountryCodes, "highlightedCountryCodes");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f74634a = highlightedCountryCodes;
        this.f74635b = style;
        this.f74636c = i;
        this.d = i2;
        this.e = f;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TripsMapBitmapConfig)) {
            return false;
        }
        TripsMapBitmapConfig tripsMapBitmapConfig = (TripsMapBitmapConfig) obj2;
        return Intrinsics.f(this.f74634a, tripsMapBitmapConfig.f74634a) && Intrinsics.f(this.f74635b, tripsMapBitmapConfig.f74635b) && this.f74636c == tripsMapBitmapConfig.f74636c && this.d == tripsMapBitmapConfig.d && Float.compare(this.e, tripsMapBitmapConfig.e) == 0 && this.f == tripsMapBitmapConfig.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + m72.b.b(this.e, a.b(this.d, a.b(this.f74636c, (this.f74635b.hashCode() + (this.f74634a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f74634a);
        dest.writeParcelable(this.f74635b, i);
        dest.writeInt(this.f74636c);
        dest.writeInt(this.d);
        dest.writeFloat(this.e);
        dest.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ TripsMapBitmapConfig(List list, Style style, int i) {
        this(list, style, (i & 4) != 0 ? 280 : 319, (i & 8) != 0 ? SyslogConstants.LOG_LOCAL7 : 157, (i & 16) != 0 ? BitmapDescriptorFactory.HUE_RED : 10.0f, true);
    }
}
