package com.revolut.sso.impl.ui.combined_authentication.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Identifier;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CombinedAuthenticationFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CombinedAuthenticationFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Identifier f106406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f106407c;
    public final Challenge d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Identifier identifier = (Identifier) parcel.readParcelable(CombinedAuthenticationFlowContract$State.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(CombinedAuthenticationFlowContract$State.class, parcel, linkedHashSet, iE, 1);
            }
            return new CombinedAuthenticationFlowContract$State(string, identifier, linkedHashSet, parcel.readInt() == 0 ? null : Challenge.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CombinedAuthenticationFlowContract$State[i];
        }
    }

    public CombinedAuthenticationFlowContract$State(String codeChallenge, Identifier identifier, Set evidences, Challenge challenge) {
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(evidences, "evidences");
        this.f106405a = codeChallenge;
        this.f106406b = identifier;
        this.f106407c = evidences;
        this.d = challenge;
    }

    public static CombinedAuthenticationFlowContract$State a(CombinedAuthenticationFlowContract$State combinedAuthenticationFlowContract$State, String codeChallenge, Identifier identifier, Set evidences, Challenge challenge, int i) {
        if ((i & 1) != 0) {
            codeChallenge = combinedAuthenticationFlowContract$State.f106405a;
        }
        if ((i & 2) != 0) {
            identifier = combinedAuthenticationFlowContract$State.f106406b;
        }
        if ((i & 4) != 0) {
            evidences = combinedAuthenticationFlowContract$State.f106407c;
        }
        if ((i & 8) != 0) {
            challenge = combinedAuthenticationFlowContract$State.d;
        }
        combinedAuthenticationFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(evidences, "evidences");
        return new CombinedAuthenticationFlowContract$State(codeChallenge, identifier, evidences, challenge);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CombinedAuthenticationFlowContract$State)) {
            return false;
        }
        CombinedAuthenticationFlowContract$State combinedAuthenticationFlowContract$State = (CombinedAuthenticationFlowContract$State) obj2;
        return Intrinsics.f(this.f106405a, combinedAuthenticationFlowContract$State.f106405a) && Intrinsics.f(this.f106406b, combinedAuthenticationFlowContract$State.f106406b) && Intrinsics.f(this.f106407c, combinedAuthenticationFlowContract$State.f106407c) && Intrinsics.f(this.d, combinedAuthenticationFlowContract$State.d);
    }

    public final int hashCode() {
        int iHashCode = this.f106405a.hashCode() * 31;
        Identifier identifier = this.f106406b;
        int iF = p.a.f((iHashCode + (identifier == null ? 0 : identifier.hashCode())) * 31, 31, this.f106407c);
        Challenge challenge = this.d;
        return iF + (challenge != null ? challenge.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106405a);
        dest.writeParcelable(this.f106406b, i);
        Iterator itV = n.v(this.f106407c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Challenge challenge = this.d;
        if (challenge == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            challenge.writeToParcel(dest, i);
        }
    }
}
