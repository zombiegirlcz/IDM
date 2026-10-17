package com.revolut.feature.backgroundpicker.api;

import android.os.Parcel;
import android.os.Parcelable;
import cm2.i;
import com.revolut.feature.backgroundpicker.api.Preselection;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import em2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backgroundpicker/api/ThemeCustomisationDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/backgroundpicker/api/ThemeCustomisationDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_background_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThemeCustomisationDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ThemeCustomisationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThemedBackgroundKey f63734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63735c;
    public final i d;
    public final Preselection e;
    public final boolean f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/api/ThemeCustomisationDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThemedBackgroundKey f63736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f63737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f63738c;
        public final Preselection d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ThemedBackgroundKey themedBackgroundKey = (ThemedBackgroundKey) j6.a.f(parcel, "parcel", InputData.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(b.valueOf(parcel.readString()));
                }
                return new InputData(themedBackgroundKey, arrayList, parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), (Preselection) parcel.readParcelable(InputData.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(ThemedBackgroundKey themedBackgroundKey, List scopes, i iVar, Preselection preselection, boolean z) {
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            this.f63736a = themedBackgroundKey;
            this.f63737b = scopes;
            this.f63738c = iVar;
            this.d = preselection;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return Intrinsics.f(this.f63736a, inputData.f63736a) && Intrinsics.f(this.f63737b, inputData.f63737b) && this.f63738c == inputData.f63738c && Intrinsics.f(this.d, inputData.d) && this.e == inputData.e;
        }

        public final int hashCode() {
            ThemedBackgroundKey themedBackgroundKey = this.f63736a;
            int iD = p.a.d((themedBackgroundKey == null ? 0 : themedBackgroundKey.hashCode()) * 31, 31, this.f63737b);
            i iVar = this.f63738c;
            int iHashCode = (iD + (iVar == null ? 0 : iVar.hashCode())) * 31;
            Preselection preselection = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (preselection != null ? preselection.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63736a, i);
            Iterator itV = p.a.v(this.f63737b, dest);
            while (itV.hasNext()) {
                dest.writeString(((b) itV.next()).name());
            }
            i iVar = this.f63738c;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ThemedBackgroundKey themedBackgroundKey = (ThemedBackgroundKey) j6.a.f(parcel, "parcel", ThemeCustomisationDestination.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(b.valueOf(parcel.readString()));
            }
            return new ThemeCustomisationDestination(themedBackgroundKey, arrayList, parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), (Preselection) parcel.readParcelable(ThemeCustomisationDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThemeCustomisationDestination[i];
        }
    }

    public ThemeCustomisationDestination() {
        this(null, 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0 */
    public final TransitionAnimation getE() {
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ThemedBackgroundKey getF63734b() {
        return this.f63734b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i getD() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThemeCustomisationDestination)) {
            return false;
        }
        ThemeCustomisationDestination themeCustomisationDestination = (ThemeCustomisationDestination) obj2;
        return Intrinsics.f(this.f63734b, themeCustomisationDestination.f63734b) && Intrinsics.f(this.f63735c, themeCustomisationDestination.f63735c) && this.d == themeCustomisationDestination.d && Intrinsics.f(this.e, themeCustomisationDestination.e) && this.f == themeCustomisationDestination.f;
    }

    public final int hashCode() {
        ThemedBackgroundKey themedBackgroundKey = this.f63734b;
        int iD = p.a.d((themedBackgroundKey == null ? 0 : themedBackgroundKey.hashCode()) * 31, 31, this.f63735c);
        i iVar = this.d;
        int iHashCode = (iD + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Preselection preselection = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (preselection != null ? preselection.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Preselection getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63734b, i);
        Iterator itV = p.a.v(this.f63735c, dest);
        while (itV.hasNext()) {
            dest.writeString(((b) itV.next()).name());
        }
        i iVar = this.d;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final List getF63735c() {
        return this.f63735c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThemeCustomisationDestination(Preselection.ThemePreselection themePreselection, int i) {
        this(null, em2.a.a(), null, (i & 8) != 0 ? null : themePreselection, (i & 16) == 0);
        b.Companion.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeCustomisationDestination(ThemedBackgroundKey themedBackgroundKey, List scopes, i iVar, Preselection preselection, boolean z) {
        super(new InputData(themedBackgroundKey, scopes, iVar, preselection, z));
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f63734b = themedBackgroundKey;
        this.f63735c = scopes;
        this.d = iVar;
        this.e = preselection;
        this.f = z;
    }
}
