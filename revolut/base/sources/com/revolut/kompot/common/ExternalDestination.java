package com.revolut.kompot.common;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/kompot/common/ExternalDestination;", "Lcom/revolut/kompot/common/ParcelableDestination;", "<init>", "()V", "Browser", "ByIntent", "ExplicitActivity", "ImplicitActivity", "Lcom/revolut/kompot/common/ExternalDestination$Browser;", "Lcom/revolut/kompot/common/ExternalDestination$ByIntent;", "Lcom/revolut/kompot/common/ExternalDestination$ExplicitActivity;", "Lcom/revolut/kompot/common/ExternalDestination$ImplicitActivity;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExternalDestination implements ParcelableDestination {
    private ExternalDestination() {
    }

    /* JADX INFO: renamed from: U */
    public abstract Integer getI();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/ExternalDestination$Browser;", "Lcom/revolut/kompot/common/ExternalDestination;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Browser extends ExternalDestination {

        @NotNull
        public static final Parcelable.Creator<Browser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f98288b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Browser(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Browser[i];
            }
        }

        public Browser(String url2, Integer num) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f98287a = url2;
            this.f98288b = num;
        }

        @Override // com.revolut.kompot.common.ExternalDestination
        /* JADX INFO: renamed from: U, reason: from getter */
        public final Integer getI() {
            return this.f98288b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Browser)) {
                return false;
            }
            Browser browser = (Browser) obj2;
            return Intrinsics.f(this.f98287a, browser.f98287a) && Intrinsics.f(this.f98288b, browser.f98288b);
        }

        /* JADX INFO: renamed from: getUrl, reason: from getter */
        public final String getF98287a() {
            return this.f98287a;
        }

        public final int hashCode() {
            int iHashCode = this.f98287a.hashCode() * 31;
            Integer num = this.f98288b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98287a);
            Integer num = this.f98288b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public /* synthetic */ Browser(String str) {
            this(str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/ExternalDestination$ByIntent;", "Lcom/revolut/kompot/common/ExternalDestination;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByIntent extends ExternalDestination {

        @NotNull
        public static final Parcelable.Creator<ByIntent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f98289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f98290b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByIntent((Intent) parcel.readParcelable(ByIntent.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByIntent[i];
            }
        }

        public ByIntent(Intent intent, Integer num) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f98289a = intent;
            this.f98290b = num;
        }

        @Override // com.revolut.kompot.common.ExternalDestination
        /* JADX INFO: renamed from: U, reason: from getter */
        public final Integer getI() {
            return this.f98290b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ByIntent)) {
                return false;
            }
            ByIntent byIntent = (ByIntent) obj2;
            return Intrinsics.f(this.f98289a, byIntent.f98289a) && Intrinsics.f(this.f98290b, byIntent.f98290b);
        }

        public final int hashCode() {
            int iHashCode = this.f98289a.hashCode() * 31;
            Integer num = this.f98290b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98289a, i);
            Integer num = this.f98290b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public /* synthetic */ ByIntent(Intent intent) {
            this(intent, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/ExternalDestination$ExplicitActivity;", "Lcom/revolut/kompot/common/ExternalDestination;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExplicitActivity extends ExternalDestination {

        @NotNull
        public static final Parcelable.Creator<ExplicitActivity> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f98291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f98292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f98293c;
        public final String d;
        public final Integer e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Class cls = (Class) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(ExplicitActivity.class.getClassLoader()));
                }
                return new ExplicitActivity(cls, linkedHashMap, parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExplicitActivity[i];
            }
        }

        public ExplicitActivity(Class clazz, Map extras, int i, String str, Integer num) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(extras, "extras");
            this.f98291a = clazz;
            this.f98292b = extras;
            this.f98293c = i;
            this.d = str;
            this.e = num;
        }

        @Override // com.revolut.kompot.common.ExternalDestination
        /* JADX INFO: renamed from: U, reason: from getter */
        public final Integer getI() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExplicitActivity)) {
                return false;
            }
            ExplicitActivity explicitActivity = (ExplicitActivity) obj2;
            return Intrinsics.f(this.f98291a, explicitActivity.f98291a) && Intrinsics.f(this.f98292b, explicitActivity.f98292b) && this.f98293c == explicitActivity.f98293c && Intrinsics.f(this.d, explicitActivity.d) && Intrinsics.f(this.e, explicitActivity.e);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f98293c, p.a.e(this.f98291a.hashCode() * 31, 31, this.f98292b), 31);
            String str = this.d;
            int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.e;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f98291a);
            Iterator itZ = j6.a.z(this.f98292b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
            dest.writeInt(this.f98293c);
            dest.writeString(this.d);
            Integer num = this.e;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public /* synthetic */ ExplicitActivity(Class cls, Map map, int i) {
            this(cls, map, (i & 4) != 0 ? 0 : 335577088, null, (i & 16) != 0 ? null : 12321);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/ExternalDestination$ImplicitActivity;", "Lcom/revolut/kompot/common/ExternalDestination;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ImplicitActivity extends ExternalDestination {

        @NotNull
        public static final Parcelable.Creator<ImplicitActivity> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f98295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f98296c;
        public final String d;
        public final Uri e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f98297g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ComponentName f98298h;
        public final Integer i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(ImplicitActivity.class.getClassLoader()));
                }
                return new ImplicitActivity(string, linkedHashMap, parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(ImplicitActivity.class.getClassLoader()), parcel.readInt(), parcel.readString(), (ComponentName) parcel.readParcelable(ImplicitActivity.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImplicitActivity[i];
            }
        }

        public ImplicitActivity(String action, Map extras, String str, String str2, Uri uri2, int i, String str3, ComponentName componentName, Integer num) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(extras, "extras");
            this.f98294a = action;
            this.f98295b = extras;
            this.f98296c = str;
            this.d = str2;
            this.e = uri2;
            this.f = i;
            this.f98297g = str3;
            this.f98298h = componentName;
            this.i = num;
        }

        @Override // com.revolut.kompot.common.ExternalDestination
        /* JADX INFO: renamed from: U, reason: from getter */
        public final Integer getI() {
            return this.i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF98294a() {
            return this.f98294a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Uri getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ImplicitActivity)) {
                return false;
            }
            ImplicitActivity implicitActivity = (ImplicitActivity) obj2;
            return Intrinsics.f(this.f98294a, implicitActivity.f98294a) && Intrinsics.f(this.f98295b, implicitActivity.f98295b) && Intrinsics.f(this.f98296c, implicitActivity.f98296c) && Intrinsics.f(this.d, implicitActivity.d) && Intrinsics.f(this.e, implicitActivity.e) && this.f == implicitActivity.f && Intrinsics.f(this.f98297g, implicitActivity.f98297g) && Intrinsics.f(this.f98298h, implicitActivity.f98298h) && Intrinsics.f(this.i, implicitActivity.i);
        }

        public final int hashCode() {
            int iB = p.a.b(this.f98294a.hashCode() * 31, 31, this.f98295b);
            String str = this.f98296c;
            int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Uri uri2 = this.e;
            int iB2 = j6.a.b(this.f, (iHashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31, 31);
            String str3 = this.f98297g;
            int iHashCode3 = (iB2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ComponentName componentName = this.f98298h;
            int iHashCode4 = (iHashCode3 + (componentName == null ? 0 : componentName.hashCode())) * 31;
            Integer num = this.i;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98294a);
            Iterator itT = o.t(this.f98295b, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
            dest.writeString(this.f98296c);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
            dest.writeInt(this.f);
            dest.writeString(this.f98297g);
            dest.writeParcelable(this.f98298h, i);
            Integer num = this.i;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public /* synthetic */ ImplicitActivity(String str, String str2, Uri uri2, int i, String str3, int i2) {
            this(str, r0.g(), (i2 & 4) != 0 ? null : str2, null, uri2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str3, null, null);
        }
    }
}
