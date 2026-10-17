package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.api.models.UserInfo;
import gkl.b1;
import gkl.c1;
import gkl.d1;
import gkl.e1;
import gkl.z0;
import java.io.IOException;
import java.util.UUID;
import jli.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/domain/models/RevolutAccountImpl;", "Lcom/revolut/sso/api/accounts/RevolutAccount;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutAccountImpl implements RevolutAccount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cjl.b f106158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106159c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevolutAccountImpl> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.sso.impl.domain.models.RevolutAccountImpl$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static RevolutAccountImpl a(SessionToken sessionToken, UserInfo userInfo) throws IOException {
            cjl.b bVar;
            String strQ;
            String string;
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            e1 e1Var = sessionToken.a().f144448a;
            String strV0 = null;
            if (e1Var instanceof b1) {
                bVar = cjl.b.RETAIL;
            } else if (e1Var instanceof z0) {
                bVar = cjl.b.BUSINESS;
            } else if (e1Var instanceof d1) {
                bVar = cjl.b.YOUTH;
            } else {
                if (e1Var instanceof c1) {
                    throw new IllegalStateException(a10.b.s("Account can't be created, because it has unsupported ", ((c1) e1Var).f144438a, " profile."));
                }
                if (e1Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = null;
            }
            if (bVar == null) {
                strQ = "";
            } else {
                m70.a.a(t0.f186434a);
                strQ = j6.a.q(" · ", g.c(bVar.a()));
            }
            String str = userInfo.e;
            String str2 = userInfo.d;
            if (str != null) {
                return new RevolutAccountImpl(((Object) str) + strQ, bVar);
            }
            String str3 = userInfo.f;
            if (str3 != null) {
                return new RevolutAccountImpl(((Object) str3) + strQ, bVar);
            }
            int i = bVar == null ? -1 : a.f106217a[bVar.ordinal()];
            if (i != -1 && i != 1) {
                if (i == 2 || i == 3) {
                    throw new RevolutSSOException.IllegalState("User info has neither phone nor email information which are mandatory");
                }
                throw new NoWhenBranchMatchedException();
            }
            String strU0 = str2 != null ? f0.U0(2, str2) : null;
            String strV02 = str2 != null ? f0.V0(2, str2) : null;
            UUID uuid = userInfo.f105990a;
            if (uuid != null && (string = uuid.toString()) != null) {
                strV0 = f0.V0(4, string);
            }
            String[] elements = {strU0, strV02, strV0};
            Intrinsics.checkNotNullParameter(elements, "elements");
            String strK0 = d0.k0(d.L(elements), " .. ", null, null, 0, null, 62);
            if (kotlin.text.d0.W(strK0)) {
                throw new IllegalArgumentException("Not enough information in UserInfo. Account name is empty");
            }
            return new RevolutAccountImpl(a0.d.r(strK0, strQ), bVar);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutAccountImpl(parcel.readString(), parcel.readInt() == 0 ? null : cjl.b.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutAccountImpl[i];
        }
    }

    public RevolutAccountImpl(String name, cjl.b bVar, String type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f106157a = name;
        this.f106158b = bVar;
        this.f106159c = type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final cjl.b getF106158b() {
        return this.f106158b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF106159c() {
        return this.f106159c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutAccountImpl)) {
            return false;
        }
        RevolutAccountImpl revolutAccountImpl = (RevolutAccountImpl) obj2;
        return Intrinsics.f(this.f106157a, revolutAccountImpl.f106157a) && this.f106158b == revolutAccountImpl.f106158b && Intrinsics.f(this.f106159c, revolutAccountImpl.f106159c);
    }

    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF106157a() {
        return this.f106157a;
    }

    public final int hashCode() {
        int iHashCode = this.f106157a.hashCode() * 31;
        cjl.b bVar = this.f106158b;
        return this.f106159c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106157a);
        cjl.b bVar = this.f106158b;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.f106159c);
    }

    public /* synthetic */ RevolutAccountImpl(String str, cjl.b bVar) {
        this(str, bVar, "com.revolut.sso");
    }
}
