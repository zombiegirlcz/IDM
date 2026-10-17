package com.revolut.feature.backgroundpicker.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/feature/backgroundpicker/api/BackgroundPickerForResultDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/backgroundpicker/api/BackgroundPickerForResultDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Companion", "InputData", "a", "feature_background_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackgroundPickerForResultDestination extends InternalDestination<InputData> implements KompotDestination {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f63729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation.FADE f63730c;

    @NotNull
    public static final Parcelable.Creator<BackgroundPickerForResultDestination> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/api/BackgroundPickerForResultDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f63731a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(em2.b.valueOf(parcel.readString()));
                }
                return new InputData(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(List scopes) {
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            this.f63731a = scopes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f63731a, ((InputData) obj2).f63731a);
        }

        public final int hashCode() {
            return this.f63731a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f63731a, dest);
            while (itV.hasNext()) {
                dest.writeString(((em2.b) itV.next()).name());
            }
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(em2.b.valueOf(parcel.readString()));
            }
            return new BackgroundPickerForResultDestination(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackgroundPickerForResultDestination[i];
        }
    }

    public BackgroundPickerForResultDestination() {
        this(d.v0(em2.b.values()));
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0 */
    public final TransitionAnimation getE() {
        return this.f63730c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getF63729b() {
        return this.f63729b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BackgroundPickerForResultDestination) && Intrinsics.f(this.f63729b, ((BackgroundPickerForResultDestination) obj2).f63729b);
    }

    public final int hashCode() {
        return this.f63729b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = a.v(this.f63729b, dest);
        while (itV.hasNext()) {
            dest.writeString(((em2.b) itV.next()).name());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPickerForResultDestination(List scopes) {
        super(new InputData(scopes));
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f63729b = scopes;
        this.f63730c = TransitionAnimation.FADE.f98392a;
    }
}
