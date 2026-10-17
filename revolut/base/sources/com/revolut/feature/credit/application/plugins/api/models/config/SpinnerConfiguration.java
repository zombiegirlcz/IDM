package com.revolut.feature.credit.application.plugins.api.models.config;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import it3.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "FullScreen", "Popup", "Content", "Mode", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$FullScreen;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Popup;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SpinnerConfiguration extends Parcelable, Serializable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Content;", "Landroid/os/Parcelable;", "Static", "Dynamic", "SpinnerContent", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Content$Dynamic;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Content$Static;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Content extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Content$Dynamic;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Content;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dynamic implements Content {

            @NotNull
            public static final Parcelable.Creator<Dynamic> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f66373a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f66374b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(SpinnerContent.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new Dynamic(parcel.readLong(), arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Dynamic[i];
                }
            }

            public Dynamic(long j2, ArrayList spinnerContent) {
                Intrinsics.checkNotNullParameter(spinnerContent, "spinnerContent");
                this.f66373a = spinnerContent;
                this.f66374b = j2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) obj2;
                return this.f66373a.equals(dynamic.f66373a) && this.f66374b == dynamic.f66374b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f66374b) + (this.f66373a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itY = j6.a.y(this.f66373a, dest);
                while (itY.hasNext()) {
                    ((SpinnerContent) itY.next()).writeToParcel(dest, i);
                }
                dest.writeLong(this.f66374b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Content$SpinnerContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SpinnerContent implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<SpinnerContent> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f66375a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f66376b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SpinnerContent((Clause) parcel.readParcelable(SpinnerContent.class.getClassLoader()), (Clause) parcel.readParcelable(SpinnerContent.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SpinnerContent[i];
                }
            }

            public SpinnerContent(Clause title, Clause clause) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.f66375a = title;
                this.f66376b = clause;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SpinnerContent)) {
                    return false;
                }
                SpinnerContent spinnerContent = (SpinnerContent) obj2;
                return Intrinsics.f(this.f66375a, spinnerContent.f66375a) && Intrinsics.f(this.f66376b, spinnerContent.f66376b);
            }

            public final int hashCode() {
                int iHashCode = this.f66375a.hashCode() * 31;
                Clause clause = this.f66376b;
                return iHashCode + (clause == null ? 0 : clause.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f66375a, i);
                dest.writeParcelable(this.f66376b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Content$Static;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Content;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Static implements Content {

            @NotNull
            public static final Parcelable.Creator<Static> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpinnerContent f66377a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Static(SpinnerContent.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Static[i];
                }
            }

            public Static(SpinnerContent spinnerContent) {
                Intrinsics.checkNotNullParameter(spinnerContent, "spinnerContent");
                this.f66377a = spinnerContent;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Static) && Intrinsics.f(this.f66377a, ((Static) obj2).f66377a);
            }

            public final int hashCode() {
                return this.f66377a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66377a.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$FullScreen;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FullScreen implements SpinnerConfiguration {

        @NotNull
        public static final Parcelable.Creator<FullScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Content f66378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Mode f66379b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullScreen((Content) parcel.readParcelable(FullScreen.class.getClassLoader()), (Mode) parcel.readParcelable(FullScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FullScreen[i];
            }
        }

        public FullScreen(Content content, Mode mode) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f66378a = content;
            this.f66379b = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FullScreen)) {
                return false;
            }
            FullScreen fullScreen = (FullScreen) obj2;
            return Intrinsics.f(this.f66378a, fullScreen.f66378a) && Intrinsics.f(this.f66379b, fullScreen.f66379b);
        }

        public final int hashCode() {
            return this.f66379b.hashCode() + (this.f66378a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66378a, i);
            dest.writeParcelable(this.f66379b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode;", "Landroid/os/Parcelable;", "Infinite", "Limited", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Infinite;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Limited;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Infinite;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Infinite implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Infinite f66380a = new Infinite();

            @NotNull
            public static final Parcelable.Creator<Infinite> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Infinite.f66380a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Infinite[i];
                }
            }

            private Infinite() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Limited;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode;", "", "toString", "()Ljava/lang/String;", "TerminationCondition", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Limited implements Mode {

            @NotNull
            public static final Parcelable.Creator<Limited> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f66381a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f66382b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f66383c;
            public final TerminationCondition d;
            public final WaitingPopupScreenConfig e;
            public final g f;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Limited$TerminationCondition;", "Landroid/os/Parcelable;", "StatusStateChanged", "PluginStateChangedFrom", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Limited$TerminationCondition$PluginStateChangedFrom;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Limited$TerminationCondition$StatusStateChanged;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface TerminationCondition extends Parcelable {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Limited$TerminationCondition$PluginStateChangedFrom;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Limited$TerminationCondition;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class PluginStateChangedFrom implements TerminationCondition {

                    @NotNull
                    public static final Parcelable.Creator<PluginStateChangedFrom> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ks3.b f66384a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final ks3.c f66385b;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new PluginStateChangedFrom(ks3.b.valueOf(parcel.readString()), (ks3.c) parcel.readSerializable());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new PluginStateChangedFrom[i];
                        }
                    }

                    public PluginStateChangedFrom(ks3.b pluginName, ks3.c pluginState) {
                        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
                        Intrinsics.checkNotNullParameter(pluginState, "pluginState");
                        this.f66384a = pluginName;
                        this.f66385b = pluginState;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof PluginStateChangedFrom)) {
                            return false;
                        }
                        PluginStateChangedFrom pluginStateChangedFrom = (PluginStateChangedFrom) obj2;
                        return this.f66384a == pluginStateChangedFrom.f66384a && Intrinsics.f(this.f66385b, pluginStateChangedFrom.f66385b);
                    }

                    public final int hashCode() {
                        return this.f66385b.hashCode() + (this.f66384a.hashCode() * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f66384a.name());
                        dest.writeSerializable(this.f66385b);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Limited$TerminationCondition$StatusStateChanged;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Mode$Limited$TerminationCondition;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class StatusStateChanged implements TerminationCondition {

                    @NotNull
                    public static final Parcelable.Creator<StatusStateChanged> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ks3.b f66386a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final List f66387b;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            ks3.b bVarValueOf = parcel.readInt() == 0 ? null : ks3.b.valueOf(parcel.readString());
                            int i = parcel.readInt();
                            ArrayList arrayList = new ArrayList(i);
                            for (int i2 = 0; i2 != i; i2++) {
                                arrayList.add(f.valueOf(parcel.readString()));
                            }
                            return new StatusStateChanged(bVarValueOf, arrayList);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new StatusStateChanged[i];
                        }
                    }

                    public StatusStateChanged(ks3.b bVar, List states) {
                        Intrinsics.checkNotNullParameter(states, "states");
                        this.f66386a = bVar;
                        this.f66387b = states;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof StatusStateChanged)) {
                            return false;
                        }
                        StatusStateChanged statusStateChanged = (StatusStateChanged) obj2;
                        return this.f66386a == statusStateChanged.f66386a && Intrinsics.f(this.f66387b, statusStateChanged.f66387b);
                    }

                    public final int hashCode() {
                        ks3.b bVar = this.f66386a;
                        return this.f66387b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        ks3.b bVar = this.f66386a;
                        if (bVar == null) {
                            dest.writeInt(0);
                        } else {
                            dest.writeInt(1);
                            dest.writeString(bVar.name());
                        }
                        Iterator itV = p.a.v(this.f66387b, dest);
                        while (itV.hasNext()) {
                            dest.writeString(((f) itV.next()).name());
                        }
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Limited(parcel.readInt(), parcel.readLong(), parcel.readLong(), (TerminationCondition) parcel.readParcelable(Limited.class.getClassLoader()), WaitingPopupScreenConfig.CREATOR.createFromParcel(parcel), g.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Limited[i];
                }
            }

            public Limited(int i, long j2, long j3, TerminationCondition terminationCondition, WaitingPopupScreenConfig screenAfterLastRetry, g screenAfterLastRetryPopupType) {
                Intrinsics.checkNotNullParameter(terminationCondition, "terminationCondition");
                Intrinsics.checkNotNullParameter(screenAfterLastRetry, "screenAfterLastRetry");
                Intrinsics.checkNotNullParameter(screenAfterLastRetryPopupType, "screenAfterLastRetryPopupType");
                this.f66381a = i;
                this.f66382b = j2;
                this.f66383c = j3;
                this.d = terminationCondition;
                this.e = screenAfterLastRetry;
                this.f = screenAfterLastRetryPopupType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Limited)) {
                    return false;
                }
                Limited limited = (Limited) obj2;
                return this.f66381a == limited.f66381a && this.f66382b == limited.f66382b && this.f66383c == limited.f66383c && Intrinsics.f(this.d, limited.d) && Intrinsics.f(this.e, limited.e) && this.f == limited.f;
            }

            public final int hashCode() {
                return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + d.c(d.c(Integer.hashCode(this.f66381a) * 31, 31, this.f66382b), 31, this.f66383c)) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f66381a);
                dest.writeLong(this.f66382b);
                dest.writeLong(this.f66383c);
                dest.writeParcelable(this.d, i);
                this.e.writeToParcel(dest, i);
                dest.writeString(this.f.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration$Popup;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpinnerConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Popup implements SpinnerConfiguration {

        @NotNull
        public static final Parcelable.Creator<Popup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Content f66388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Mode.Limited f66389b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Popup((Content) parcel.readParcelable(Popup.class.getClassLoader()), Mode.Limited.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Popup[i];
            }
        }

        public Popup(Content content, Mode.Limited limitedMode) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(limitedMode, "limitedMode");
            this.f66388a = content;
            this.f66389b = limitedMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Popup)) {
                return false;
            }
            Popup popup = (Popup) obj2;
            return Intrinsics.f(this.f66388a, popup.f66388a) && Intrinsics.f(this.f66389b, popup.f66389b);
        }

        public final int hashCode() {
            return this.f66389b.hashCode() + (this.f66388a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66388a, i);
            this.f66389b.writeToParcel(dest, i);
        }
    }
}
