package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixKeys;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixKeys implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PixKeys> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f80417b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PixKeys.class, parcel, arrayList, iE, 1);
            }
            return new PixKeys(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixKeys[i];
        }
    }

    public PixKeys() {
        this(0);
    }

    public final PixKey a() {
        Object obj2;
        Object next;
        List list = this.f80417b;
        Iterator it8 = list.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((PixKey) next).getF80405a(), this.f80416a)) {
                break;
            }
        }
        PixKey pixKey = (PixKey) next;
        PixKeyStatus.Active active = PixKeyStatus.Active.f80407a;
        if (pixKey != null) {
            if (!Intrinsics.f(pixKey.getF80406b(), active)) {
                pixKey = null;
            }
            if (pixKey != null) {
                return pixKey;
            }
        }
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (Intrinsics.f(((PixKey) next2).getF80406b(), active)) {
                obj2 = next2;
                break;
            }
        }
        return (PixKey) obj2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixKeys)) {
            return false;
        }
        PixKeys pixKeys = (PixKeys) obj2;
        return Intrinsics.f(this.f80416a, pixKeys.f80416a) && Intrinsics.f(this.f80417b, pixKeys.f80417b);
    }

    public final int hashCode() {
        String str = this.f80416a;
        return this.f80417b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80416a);
        Iterator itV = p.a.v(this.f80417b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public PixKeys(String str, List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        this.f80416a = str;
        this.f80417b = keys;
    }

    public PixKeys(int i) {
        this(null, f0.f322471a);
    }
}
