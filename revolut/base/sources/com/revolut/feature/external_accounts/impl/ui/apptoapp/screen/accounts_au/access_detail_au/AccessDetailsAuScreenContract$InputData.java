package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.ConsentPermission;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/apptoapp/screen/accounts_au/access_detail_au/AccessDetailsAuScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccessDetailsAuScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccessDetailsAuScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f72525b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ConsentPermission.valueOf(parcel.readString()));
            }
            return new AccessDetailsAuScreenContract$InputData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccessDetailsAuScreenContract$InputData[i];
        }
    }

    public AccessDetailsAuScreenContract$InputData(String clientName, List permissions) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f72524a = clientName;
        this.f72525b = permissions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccessDetailsAuScreenContract$InputData)) {
            return false;
        }
        AccessDetailsAuScreenContract$InputData accessDetailsAuScreenContract$InputData = (AccessDetailsAuScreenContract$InputData) obj2;
        return Intrinsics.f(this.f72524a, accessDetailsAuScreenContract$InputData.f72524a) && Intrinsics.f(this.f72525b, accessDetailsAuScreenContract$InputData.f72525b);
    }

    public final int hashCode() {
        return this.f72525b.hashCode() + (this.f72524a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72524a);
        Iterator itV = p.a.v(this.f72525b, dest);
        while (itV.hasNext()) {
            dest.writeString(((ConsentPermission) itV.next()).name());
        }
    }
}
