package com.revolut.sso.impl.ui.phone.change_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.sso.impl.domain.models.Claim;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChangePhoneFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChangePhoneFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f106643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106645c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(ChangePhoneFlowContract$State.class, parcel, linkedHashSet, iE, 1);
            }
            RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(ChangePhoneFlowContract$State.class.getClassLoader());
            String str = registeredIdentityId != null ? registeredIdentityId.f74764a : null;
            Claim.Phone phoneCreateFromParcel = parcel.readInt() == 0 ? null : Claim.Phone.CREATOR.createFromParcel(parcel);
            return new ChangePhoneFlowContract$State(str, phoneCreateFromParcel != null ? phoneCreateFromParcel.f106131a : null, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChangePhoneFlowContract$State[i];
        }
    }

    public ChangePhoneFlowContract$State(String str, String str2, Set accountIdsToApplyChange) {
        Intrinsics.checkNotNullParameter(accountIdsToApplyChange, "accountIdsToApplyChange");
        this.f106643a = accountIdsToApplyChange;
        this.f106644b = str;
        this.f106645c = str2;
    }

    public static ChangePhoneFlowContract$State a(ChangePhoneFlowContract$State changePhoneFlowContract$State, Set accountIdsToApplyChange, String str, String str2, int i) {
        if ((i & 1) != 0) {
            accountIdsToApplyChange = changePhoneFlowContract$State.f106643a;
        }
        if ((i & 2) != 0) {
            str = changePhoneFlowContract$State.f106644b;
        }
        if ((i & 4) != 0) {
            str2 = changePhoneFlowContract$State.f106645c;
        }
        changePhoneFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(accountIdsToApplyChange, "accountIdsToApplyChange");
        return new ChangePhoneFlowContract$State(str, str2, accountIdsToApplyChange);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$State
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$State r5 = (com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$State) r5
            java.util.Set r1 = r4.f106643a
            java.util.Set r3 = r5.f106643a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.f106644b
            java.lang.String r3 = r4.f106644b
            if (r3 != 0) goto L23
            if (r1 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r1 != 0) goto L26
            goto L21
        L26:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r5 = r5.f106645c
            java.lang.String r1 = r4.f106645c
            if (r1 != 0) goto L39
            if (r5 != 0) goto L37
            r5 = r0
            goto L40
        L37:
            r5 = r2
            goto L40
        L39:
            if (r5 != 0) goto L3c
            goto L37
        L3c:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L40:
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$State.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f106643a.hashCode() * 31;
        String str = this.f106644b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106645c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f106643a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        String str = this.f106644b;
        dest.writeParcelable(str != null ? new RegisteredIdentityId(str) : null, i);
        String str2 = this.f106645c;
        if (str2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(str2);
    }
}
