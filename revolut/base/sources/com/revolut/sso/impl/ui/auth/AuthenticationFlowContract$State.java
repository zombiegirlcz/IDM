package com.revolut.sso.impl.ui.auth;

import android.os.Parcel;
import android.os.Parcelable;
import cjl.s;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.sso.impl.domain.models.AuthLocation;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.InitialAuthenticationCredential;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "AccessRecovery", "SignIn", "OperationBoundAuthentication", "SignInWithRevolutIdAuthentication", "ExternalClientAuthentication", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$AccessRecovery;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$ExternalClientAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$OperationBoundAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$SignIn;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$SignInWithRevolutIdAuthentication;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AuthenticationFlowContract$State extends FlowState {
    /* JADX INFO: renamed from: A5 */
    InitialAuthenticationCredential getF106296b();

    /* JADX INFO: renamed from: D5 */
    Integer getF106302m();

    /* JADX INFO: renamed from: D8 */
    String getF106295a();

    /* JADX INFO: renamed from: F2 */
    List getI();

    /* JADX INFO: renamed from: G7 */
    List getF106300j();

    AuthenticationFlowContract$State O9(boolean z, Challenge challenge, List list, List list2, Set set, Set set2, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6);

    /* JADX INFO: renamed from: U8 */
    boolean getF106304p();

    /* JADX INFO: renamed from: Y1 */
    boolean getF106298g();

    /* JADX INFO: renamed from: getLocation */
    AuthLocation getF106303n();

    /* JADX INFO: renamed from: isCompleted */
    boolean getF106305q();

    /* JADX INFO: renamed from: o4 */
    Set getF106301l();

    /* JADX INFO: renamed from: r6 */
    Set getK();

    /* JADX INFO: renamed from: s8 */
    Challenge getF106299h();

    /* JADX INFO: renamed from: u1 */
    boolean getO();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$SignInWithRevolutIdAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignInWithRevolutIdAuthentication implements AuthenticationFlowContract$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialAuthenticationCredential f106296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106297c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f106298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Challenge f106299h;
        public final List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f106300j;
        public final Set k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Set f106301l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Integer f106302m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AuthLocation f106303n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f106304p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f106305q;

        @NotNull
        public static final Parcelable.Creator<SignInWithRevolutIdAuthentication> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(SignInWithRevolutIdAuthentication.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                Challenge challengeCreateFromParcel = parcel.readInt() == 0 ? null : Challenge.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iE = i;
                while (iE != i2) {
                    iE = j6.a.e(SignInWithRevolutIdAuthentication.class, parcel, arrayList, iE, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i5 = i; i5 != i3; i5++) {
                    arrayList2.add(jkl.i.valueOf(parcel.readString()));
                }
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i6);
                for (int i21 = 0; i21 != i6; i21++) {
                    linkedHashSet.add(gkl.m.valueOf(parcel.readString()));
                }
                int i22 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i22);
                for (int i32 = 0; i32 != i22; i32++) {
                    linkedHashSet2.add(jkl.i.valueOf(parcel.readString()));
                }
                return new SignInWithRevolutIdAuthentication(string, initialAuthenticationCredential, string2, string3, string4, string5, z, challengeCreateFromParcel, arrayList, arrayList2, linkedHashSet, linkedHashSet2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : AuthLocation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignInWithRevolutIdAuthentication[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SignInWithRevolutIdAuthentication(String str, InitialAuthenticationCredential.SessionToken sessionToken, String str2, String str3, String str4, String str5) {
            f0 f0Var = f0.f322471a;
            h0 h0Var = h0.f322473a;
            this(str, sessionToken, str2, str3, str4, str5, false, null, f0Var, f0Var, h0Var, h0Var, null, null, false, false, false);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: A5, reason: from getter */
        public final InitialAuthenticationCredential getF106296b() {
            return this.f106296b;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D5, reason: from getter */
        public final Integer getF106302m() {
            return this.f106302m;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106295a() {
            return this.f106295a;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: F2, reason: from getter */
        public final List getI() {
            return this.i;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: G7, reason: from getter */
        public final List getF106300j() {
            return this.f106300j;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        public final AuthenticationFlowContract$State O9(boolean z, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            return new SignInWithRevolutIdAuthentication(this.f106295a, this.f106296b, this.f106297c, this.d, this.e, this.f, z, challenge, evidences, availableMethods, rejectedClaims, rejectedMethods, num, authLocation, z3, z4, z6);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: U8, reason: from getter */
        public final boolean getF106304p() {
            return this.f106304p;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: Y1, reason: from getter */
        public final boolean getF106298g() {
            return this.f106298g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SignInWithRevolutIdAuthentication)) {
                return false;
            }
            SignInWithRevolutIdAuthentication signInWithRevolutIdAuthentication = (SignInWithRevolutIdAuthentication) obj2;
            return Intrinsics.f(this.f106295a, signInWithRevolutIdAuthentication.f106295a) && Intrinsics.f(this.f106296b, signInWithRevolutIdAuthentication.f106296b) && Intrinsics.f(this.f106297c, signInWithRevolutIdAuthentication.f106297c) && Intrinsics.f(this.d, signInWithRevolutIdAuthentication.d) && Intrinsics.f(this.e, signInWithRevolutIdAuthentication.e) && Intrinsics.f(this.f, signInWithRevolutIdAuthentication.f) && this.f106298g == signInWithRevolutIdAuthentication.f106298g && Intrinsics.f(this.f106299h, signInWithRevolutIdAuthentication.f106299h) && Intrinsics.f(this.i, signInWithRevolutIdAuthentication.i) && Intrinsics.f(this.f106300j, signInWithRevolutIdAuthentication.f106300j) && Intrinsics.f(this.k, signInWithRevolutIdAuthentication.k) && Intrinsics.f(this.f106301l, signInWithRevolutIdAuthentication.f106301l) && Intrinsics.f(this.f106302m, signInWithRevolutIdAuthentication.f106302m) && Intrinsics.f(this.f106303n, signInWithRevolutIdAuthentication.f106303n) && this.o == signInWithRevolutIdAuthentication.o && this.f106304p == signInWithRevolutIdAuthentication.f106304p && this.f106305q == signInWithRevolutIdAuthentication.f106305q;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: getLocation, reason: from getter */
        public final AuthLocation getF106303n() {
            return this.f106303n;
        }

        public final int hashCode() {
            int iHashCode = this.f106295a.hashCode() * 31;
            InitialAuthenticationCredential initialAuthenticationCredential = this.f106296b;
            int iC = j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (initialAuthenticationCredential == null ? 0 : initialAuthenticationCredential.hashCode())) * 31, 31, this.f106297c), 31, this.d), 31, this.e), 31, this.f), 31, this.f106298g);
            Challenge challenge = this.f106299h;
            int iF = p.a.f(p.a.f(p.a.d(p.a.d((iC + (challenge == null ? 0 : challenge.hashCode())) * 31, 31, this.i), 31, this.f106300j), 31, this.k), 31, this.f106301l);
            Integer num = this.f106302m;
            int iHashCode2 = (iF + (num == null ? 0 : num.hashCode())) * 31;
            AuthLocation authLocation = this.f106303n;
            return Boolean.hashCode(this.f106305q) + j6.a.c(j6.a.c((iHashCode2 + (authLocation != null ? authLocation.hashCode() : 0)) * 31, 31, this.o), 31, this.f106304p);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: isCompleted, reason: from getter */
        public final boolean getF106305q() {
            return this.f106305q;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getF106301l() {
            return this.f106301l;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getK() {
            return this.k;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: s8, reason: from getter */
        public final Challenge getF106299h() {
            return this.f106299h;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: u1, reason: from getter */
        public final boolean getO() {
            return this.o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106295a);
            dest.writeParcelable(this.f106296b, i);
            dest.writeString(this.f106297c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeInt(this.f106298g ? 1 : 0);
            Challenge challenge = this.f106299h;
            if (challenge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                challenge.writeToParcel(dest, i);
            }
            Iterator itV = p.a.v(this.i, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.f106300j, dest);
            while (itV2.hasNext()) {
                dest.writeString(((jkl.i) itV2.next()).name());
            }
            Iterator itV3 = ehe.n.v(this.k, dest);
            while (itV3.hasNext()) {
                dest.writeString(((gkl.m) itV3.next()).name());
            }
            Iterator itV4 = ehe.n.v(this.f106301l, dest);
            while (itV4.hasNext()) {
                dest.writeString(((jkl.i) itV4.next()).name());
            }
            Integer num = this.f106302m;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            AuthLocation authLocation = this.f106303n;
            if (authLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authLocation.writeToParcel(dest, i);
            }
            dest.writeInt(this.o ? 1 : 0);
            dest.writeInt(this.f106304p ? 1 : 0);
            dest.writeInt(this.f106305q ? 1 : 0);
        }

        public SignInWithRevolutIdAuthentication(String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, String clientId, String redirectUri, String state, String scope, boolean z, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            this.f106295a = codeChallenge;
            this.f106296b = initialAuthenticationCredential;
            this.f106297c = clientId;
            this.d = redirectUri;
            this.e = state;
            this.f = scope;
            this.f106298g = z;
            this.f106299h = challenge;
            this.i = evidences;
            this.f106300j = availableMethods;
            this.k = rejectedClaims;
            this.f106301l = rejectedMethods;
            this.f106302m = num;
            this.f106303n = authLocation;
            this.o = z3;
            this.f106304p = z4;
            this.f106305q = z6;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$AccessRecovery;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccessRecovery implements AuthenticationFlowContract$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialAuthenticationCredential f106253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Claim f106254c;
        public final boolean d;
        public final Challenge e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f106255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Set f106256h;
        public final Set i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f106257j;
        public final AuthLocation k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f106258l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f106259m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f106260n;

        @NotNull
        public static final Parcelable.Creator<AccessRecovery> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(AccessRecovery.class.getClassLoader());
                Claim claim = (Claim) parcel.readParcelable(AccessRecovery.class.getClassLoader());
                boolean z = false;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                Challenge challengeCreateFromParcel = parcel.readInt() == 0 ? null : Challenge.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iE = i;
                while (iE != i2) {
                    iE = j6.a.e(AccessRecovery.class, parcel, arrayList, iE, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i5 = i; i5 != i3; i5++) {
                    arrayList2.add(jkl.i.valueOf(parcel.readString()));
                }
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i6);
                for (int i21 = i; i21 != i6; i21++) {
                    linkedHashSet.add(gkl.m.valueOf(parcel.readString()));
                }
                int i22 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i22);
                for (int i32 = i; i32 != i22; i32++) {
                    linkedHashSet2.add(jkl.i.valueOf(parcel.readString()));
                }
                return new AccessRecovery(string, initialAuthenticationCredential, claim, z, challengeCreateFromParcel, arrayList, arrayList2, linkedHashSet, linkedHashSet2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? AuthLocation.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? 1 : i, parcel.readInt() != 0 ? 1 : i, parcel.readInt() != 0 ? 1 : i);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccessRecovery[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AccessRecovery(String str, InitialAuthenticationCredential.SessionToken sessionToken, Set set, Set set2, int i) {
            f0 f0Var = f0.f322471a;
            this(str, sessionToken, null, false, null, f0Var, f0Var, (i & 128) != 0 ? h0.f322473a : set, (i & 256) != 0 ? h0.f322473a : set2, null, null, false, false, false);
        }

        public static AccessRecovery a(AccessRecovery accessRecovery, Claim claim, HashSet hashSet, int i) {
            String codeChallenge = accessRecovery.f106252a;
            InitialAuthenticationCredential initialAuthenticationCredential = accessRecovery.f106253b;
            boolean z = accessRecovery.d;
            Challenge challenge = accessRecovery.e;
            List evidences = accessRecovery.f;
            List availableMethods = accessRecovery.f106255g;
            Set rejectedClaims = (i & 128) != 0 ? accessRecovery.f106256h : hashSet;
            Set rejectedMethods = accessRecovery.i;
            Integer num = accessRecovery.f106257j;
            AuthLocation authLocation = accessRecovery.k;
            boolean z3 = accessRecovery.f106258l;
            boolean z4 = accessRecovery.f106259m;
            boolean z6 = accessRecovery.f106260n;
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            return new AccessRecovery(codeChallenge, initialAuthenticationCredential, claim, z, challenge, evidences, availableMethods, rejectedClaims, rejectedMethods, num, authLocation, z3, z4, z6);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: A5, reason: from getter */
        public final InitialAuthenticationCredential getF106296b() {
            return this.f106253b;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D5, reason: from getter */
        public final Integer getF106302m() {
            return this.f106257j;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106295a() {
            return this.f106252a;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: F2, reason: from getter */
        public final List getI() {
            return this.f;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: G7, reason: from getter */
        public final List getF106300j() {
            return this.f106255g;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        public final AuthenticationFlowContract$State O9(boolean z, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            return new AccessRecovery(this.f106252a, this.f106253b, this.f106254c, z, challenge, evidences, availableMethods, rejectedClaims, rejectedMethods, num, authLocation, z3, z4, z6);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: U8, reason: from getter */
        public final boolean getF106304p() {
            return this.f106259m;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: Y1, reason: from getter */
        public final boolean getF106298g() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccessRecovery)) {
                return false;
            }
            AccessRecovery accessRecovery = (AccessRecovery) obj2;
            return Intrinsics.f(this.f106252a, accessRecovery.f106252a) && Intrinsics.f(this.f106253b, accessRecovery.f106253b) && Intrinsics.f(this.f106254c, accessRecovery.f106254c) && this.d == accessRecovery.d && Intrinsics.f(this.e, accessRecovery.e) && Intrinsics.f(this.f, accessRecovery.f) && Intrinsics.f(this.f106255g, accessRecovery.f106255g) && Intrinsics.f(this.f106256h, accessRecovery.f106256h) && Intrinsics.f(this.i, accessRecovery.i) && Intrinsics.f(this.f106257j, accessRecovery.f106257j) && Intrinsics.f(this.k, accessRecovery.k) && this.f106258l == accessRecovery.f106258l && this.f106259m == accessRecovery.f106259m && this.f106260n == accessRecovery.f106260n;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: getLocation, reason: from getter */
        public final AuthLocation getF106303n() {
            return this.k;
        }

        public final int hashCode() {
            int iHashCode = this.f106252a.hashCode() * 31;
            InitialAuthenticationCredential initialAuthenticationCredential = this.f106253b;
            int iHashCode2 = (iHashCode + (initialAuthenticationCredential == null ? 0 : initialAuthenticationCredential.hashCode())) * 31;
            Claim claim = this.f106254c;
            int iC = j6.a.c((iHashCode2 + (claim == null ? 0 : claim.hashCode())) * 31, 31, this.d);
            Challenge challenge = this.e;
            int iF = p.a.f(p.a.f(p.a.d(p.a.d((iC + (challenge == null ? 0 : challenge.hashCode())) * 31, 31, this.f), 31, this.f106255g), 31, this.f106256h), 31, this.i);
            Integer num = this.f106257j;
            int iHashCode3 = (iF + (num == null ? 0 : num.hashCode())) * 31;
            AuthLocation authLocation = this.k;
            return Boolean.hashCode(this.f106260n) + j6.a.c(j6.a.c((iHashCode3 + (authLocation != null ? authLocation.hashCode() : 0)) * 31, 31, this.f106258l), 31, this.f106259m);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: isCompleted, reason: from getter */
        public final boolean getF106305q() {
            return this.f106260n;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getF106301l() {
            return this.i;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getK() {
            return this.f106256h;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: s8, reason: from getter */
        public final Challenge getF106299h() {
            return this.e;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: u1, reason: from getter */
        public final boolean getO() {
            return this.f106258l;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106252a);
            dest.writeParcelable(this.f106253b, i);
            dest.writeParcelable(this.f106254c, i);
            dest.writeInt(this.d ? 1 : 0);
            Challenge challenge = this.e;
            if (challenge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                challenge.writeToParcel(dest, i);
            }
            Iterator itV = p.a.v(this.f, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.f106255g, dest);
            while (itV2.hasNext()) {
                dest.writeString(((jkl.i) itV2.next()).name());
            }
            Iterator itV3 = ehe.n.v(this.f106256h, dest);
            while (itV3.hasNext()) {
                dest.writeString(((gkl.m) itV3.next()).name());
            }
            Iterator itV4 = ehe.n.v(this.i, dest);
            while (itV4.hasNext()) {
                dest.writeString(((jkl.i) itV4.next()).name());
            }
            Integer num = this.f106257j;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            AuthLocation authLocation = this.k;
            if (authLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authLocation.writeToParcel(dest, i);
            }
            dest.writeInt(this.f106258l ? 1 : 0);
            dest.writeInt(this.f106259m ? 1 : 0);
            dest.writeInt(this.f106260n ? 1 : 0);
        }

        public AccessRecovery(String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, Claim claim, boolean z, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            this.f106252a = codeChallenge;
            this.f106253b = initialAuthenticationCredential;
            this.f106254c = claim;
            this.d = z;
            this.e = challenge;
            this.f = evidences;
            this.f106255g = availableMethods;
            this.f106256h = rejectedClaims;
            this.i = rejectedMethods;
            this.f106257j = num;
            this.k = authLocation;
            this.f106258l = z3;
            this.f106259m = z4;
            this.f106260n = z6;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$ExternalClientAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalClientAuthentication implements AuthenticationFlowContract$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialAuthenticationCredential f106262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106263c;
        public final List d;
        public final String e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Challenge f106264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f106265h;
        public final List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Set f106266j;
        public final Set k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Integer f106267l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AuthLocation f106268m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f106269n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f106270p;

        @NotNull
        public static final Parcelable.Creator<ExternalClientAuthentication> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(ExternalClientAuthentication.class.getClassLoader());
                String string2 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string3 = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                Challenge challengeCreateFromParcel = parcel.readInt() == 0 ? null : Challenge.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iE = i;
                while (iE != i2) {
                    iE = j6.a.e(ExternalClientAuthentication.class, parcel, arrayList, iE, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i5 = i; i5 != i3; i5++) {
                    arrayList2.add(jkl.i.valueOf(parcel.readString()));
                }
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i6);
                for (int i21 = i; i21 != i6; i21++) {
                    linkedHashSet.add(gkl.m.valueOf(parcel.readString()));
                }
                int i22 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i22);
                for (int i32 = 0; i32 != i22; i32++) {
                    linkedHashSet2.add(jkl.i.valueOf(parcel.readString()));
                }
                return new ExternalClientAuthentication(string, initialAuthenticationCredential, string2, arrayListCreateStringArrayList, string3, z, challengeCreateFromParcel, arrayList, arrayList2, linkedHashSet, linkedHashSet2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? AuthLocation.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalClientAuthentication[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ExternalClientAuthentication(String str, InitialAuthenticationCredential initialAuthenticationCredential, String str2, List list, String str3, Set set, Set set2, int i) {
            f0 f0Var = f0.f322471a;
            this(str, initialAuthenticationCredential, str2, list, str3, false, null, f0Var, f0Var, (i & 512) != 0 ? h0.f322473a : set, (i & 1024) != 0 ? h0.f322473a : set2, null, null, false, false, false);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: A5, reason: from getter */
        public final InitialAuthenticationCredential getF106296b() {
            return this.f106262b;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D5, reason: from getter */
        public final Integer getF106302m() {
            return this.f106267l;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106295a() {
            return this.f106261a;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: F2, reason: from getter */
        public final List getI() {
            return this.f106265h;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: G7, reason: from getter */
        public final List getF106300j() {
            return this.i;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        public final AuthenticationFlowContract$State O9(boolean z, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            return new ExternalClientAuthentication(this.f106261a, this.f106262b, this.f106263c, this.d, this.e, z, challenge, evidences, availableMethods, rejectedClaims, rejectedMethods, num, authLocation, z3, z4, z6);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: U8, reason: from getter */
        public final boolean getF106304p() {
            return this.o;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: Y1, reason: from getter */
        public final boolean getF106298g() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExternalClientAuthentication)) {
                return false;
            }
            ExternalClientAuthentication externalClientAuthentication = (ExternalClientAuthentication) obj2;
            return Intrinsics.f(this.f106261a, externalClientAuthentication.f106261a) && Intrinsics.f(this.f106262b, externalClientAuthentication.f106262b) && Intrinsics.f(this.f106263c, externalClientAuthentication.f106263c) && Intrinsics.f(this.d, externalClientAuthentication.d) && Intrinsics.f(this.e, externalClientAuthentication.e) && this.f == externalClientAuthentication.f && Intrinsics.f(this.f106264g, externalClientAuthentication.f106264g) && Intrinsics.f(this.f106265h, externalClientAuthentication.f106265h) && Intrinsics.f(this.i, externalClientAuthentication.i) && Intrinsics.f(this.f106266j, externalClientAuthentication.f106266j) && Intrinsics.f(this.k, externalClientAuthentication.k) && Intrinsics.f(this.f106267l, externalClientAuthentication.f106267l) && Intrinsics.f(this.f106268m, externalClientAuthentication.f106268m) && this.f106269n == externalClientAuthentication.f106269n && this.o == externalClientAuthentication.o && this.f106270p == externalClientAuthentication.f106270p;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: getLocation, reason: from getter */
        public final AuthLocation getF106303n() {
            return this.f106268m;
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.c((this.f106262b.hashCode() + (this.f106261a.hashCode() * 31)) * 31, 31, this.f106263c), 31, this.d);
            String str = this.e;
            int iC = j6.a.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            Challenge challenge = this.f106264g;
            int iF = p.a.f(p.a.f(p.a.d(p.a.d((iC + (challenge == null ? 0 : challenge.hashCode())) * 31, 31, this.f106265h), 31, this.i), 31, this.f106266j), 31, this.k);
            Integer num = this.f106267l;
            int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
            AuthLocation authLocation = this.f106268m;
            return Boolean.hashCode(this.f106270p) + j6.a.c(j6.a.c((iHashCode + (authLocation != null ? authLocation.hashCode() : 0)) * 31, 31, this.f106269n), 31, this.o);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: isCompleted, reason: from getter */
        public final boolean getF106305q() {
            return this.f106270p;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getF106301l() {
            return this.k;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getK() {
            return this.f106266j;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: s8, reason: from getter */
        public final Challenge getF106299h() {
            return this.f106264g;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: u1, reason: from getter */
        public final boolean getO() {
            return this.f106269n;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106261a);
            dest.writeParcelable(this.f106262b, i);
            dest.writeString(this.f106263c);
            dest.writeStringList(this.d);
            dest.writeString(this.e);
            dest.writeInt(this.f ? 1 : 0);
            Challenge challenge = this.f106264g;
            if (challenge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                challenge.writeToParcel(dest, i);
            }
            Iterator itV = p.a.v(this.f106265h, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.i, dest);
            while (itV2.hasNext()) {
                dest.writeString(((jkl.i) itV2.next()).name());
            }
            Iterator itV3 = ehe.n.v(this.f106266j, dest);
            while (itV3.hasNext()) {
                dest.writeString(((gkl.m) itV3.next()).name());
            }
            Iterator itV4 = ehe.n.v(this.k, dest);
            while (itV4.hasNext()) {
                dest.writeString(((jkl.i) itV4.next()).name());
            }
            Integer num = this.f106267l;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            AuthLocation authLocation = this.f106268m;
            if (authLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authLocation.writeToParcel(dest, i);
            }
            dest.writeInt(this.f106269n ? 1 : 0);
            dest.writeInt(this.o ? 1 : 0);
            dest.writeInt(this.f106270p ? 1 : 0);
        }

        public ExternalClientAuthentication(String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, String clientId, List securityProfiles, String str, boolean z, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(initialAuthenticationCredential, "initialAuthenticationCredential");
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            this.f106261a = codeChallenge;
            this.f106262b = initialAuthenticationCredential;
            this.f106263c = clientId;
            this.d = securityProfiles;
            this.e = str;
            this.f = z;
            this.f106264g = challenge;
            this.f106265h = evidences;
            this.i = availableMethods;
            this.f106266j = rejectedClaims;
            this.k = rejectedMethods;
            this.f106267l = num;
            this.f106268m = authLocation;
            this.f106269n = z3;
            this.o = z4;
            this.f106270p = z6;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$SignIn;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignIn implements AuthenticationFlowContract$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialAuthenticationCredential f106285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Claim f106286c;
        public final String d;
        public final Boolean e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f106287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Challenge f106288h;
        public final List i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f106289j;
        public final Set k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Set f106290l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Integer f106291m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AuthLocation f106292n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f106293p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f106294q;

        @NotNull
        public static final Parcelable.Creator<SignIn> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(SignIn.class.getClassLoader());
                Claim claim = (Claim) parcel.readParcelable(SignIn.class.getClassLoader());
                RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(SignIn.class.getClassLoader());
                String str = registeredIdentityId != null ? registeredIdentityId.f74764a : null;
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                boolean z = parcel.readInt() != 0;
                Challenge challengeCreateFromParcel = parcel.readInt() == 0 ? null : Challenge.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                boolean z3 = z;
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SignIn.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(jkl.i.valueOf(parcel.readString()));
                }
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashSet.add(gkl.m.valueOf(parcel.readString()));
                }
                int i21 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i21);
                for (int i22 = 0; i22 != i21; i22++) {
                    linkedHashSet2.add(jkl.i.valueOf(parcel.readString()));
                }
                return new SignIn(string, initialAuthenticationCredential, claim, str, boolValueOf, arrayListCreateStringArrayList, z3, challengeCreateFromParcel, arrayList, arrayList2, linkedHashSet, linkedHashSet2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : AuthLocation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignIn[i];
            }
        }

        public SignIn(String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, Claim claim, String str, Boolean bool, List list, boolean z, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            this.f106284a = codeChallenge;
            this.f106285b = initialAuthenticationCredential;
            this.f106286c = claim;
            this.d = str;
            this.e = bool;
            this.f = list;
            this.f106287g = z;
            this.f106288h = challenge;
            this.i = evidences;
            this.f106289j = availableMethods;
            this.k = rejectedClaims;
            this.f106290l = rejectedMethods;
            this.f106291m = num;
            this.f106292n = authLocation;
            this.o = z3;
            this.f106293p = z4;
            this.f106294q = z6;
        }

        public static SignIn a(SignIn signIn, Claim claim, HashSet hashSet, LinkedHashSet linkedHashSet, int i) {
            String codeChallenge = signIn.f106284a;
            InitialAuthenticationCredential initialAuthenticationCredential = (i & 2) != 0 ? signIn.f106285b : null;
            Claim claim2 = (i & 4) != 0 ? signIn.f106286c : claim;
            String str = signIn.d;
            InitialAuthenticationCredential initialAuthenticationCredential2 = initialAuthenticationCredential;
            Claim claim3 = claim2;
            Boolean bool = signIn.e;
            List list = signIn.f;
            boolean z = signIn.f106287g;
            Challenge challenge = signIn.f106288h;
            List evidences = signIn.i;
            List availableMethods = signIn.f106289j;
            Set rejectedClaims = (i & 1024) != 0 ? signIn.k : hashSet;
            Set rejectedMethods = (i & 2048) != 0 ? signIn.f106290l : linkedHashSet;
            Integer num = signIn.f106291m;
            AuthLocation authLocation = signIn.f106292n;
            boolean z3 = signIn.o;
            boolean z4 = signIn.f106293p;
            boolean z6 = signIn.f106294q;
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            return new SignIn(codeChallenge, initialAuthenticationCredential2, claim3, str, bool, list, z, challenge, evidences, availableMethods, rejectedClaims, rejectedMethods, num, authLocation, z3, z4, z6);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: A5, reason: from getter */
        public final InitialAuthenticationCredential getF106296b() {
            return this.f106285b;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D5, reason: from getter */
        public final Integer getF106302m() {
            return this.f106291m;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106295a() {
            return this.f106284a;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: F2, reason: from getter */
        public final List getI() {
            return this.i;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: G7, reason: from getter */
        public final List getF106300j() {
            return this.f106289j;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        public final AuthenticationFlowContract$State O9(boolean z, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            return new SignIn(this.f106284a, this.f106285b, this.f106286c, this.d, this.e, this.f, z, challenge, evidences, availableMethods, rejectedClaims, rejectedMethods, num, authLocation, z3, z4, z6);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: U8, reason: from getter */
        public final boolean getF106304p() {
            return this.f106293p;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: Y1, reason: from getter */
        public final boolean getF106298g() {
            return this.f106287g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
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
                boolean r1 = r5 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.SignIn
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State$SignIn r5 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.SignIn) r5
                java.lang.String r1 = r4.f106284a
                java.lang.String r3 = r5.f106284a
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                com.revolut.sso.impl.domain.models.InitialAuthenticationCredential r1 = r4.f106285b
                com.revolut.sso.impl.domain.models.InitialAuthenticationCredential r3 = r5.f106285b
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                com.revolut.sso.impl.domain.models.Claim r1 = r4.f106286c
                com.revolut.sso.impl.domain.models.Claim r3 = r5.f106286c
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r5.d
                java.lang.String r3 = r4.d
                if (r3 != 0) goto L39
                if (r1 != 0) goto L37
                r1 = r0
                goto L40
            L37:
                r1 = r2
                goto L40
            L39:
                if (r1 != 0) goto L3c
                goto L37
            L3c:
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            L40:
                if (r1 != 0) goto L43
                return r2
            L43:
                java.lang.Boolean r1 = r4.e
                java.lang.Boolean r3 = r5.e
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L4e
                return r2
            L4e:
                java.util.List r1 = r4.f
                java.util.List r3 = r5.f
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L59
                return r2
            L59:
                boolean r1 = r4.f106287g
                boolean r3 = r5.f106287g
                if (r1 == r3) goto L60
                return r2
            L60:
                com.revolut.sso.impl.domain.models.Challenge r1 = r4.f106288h
                com.revolut.sso.impl.domain.models.Challenge r3 = r5.f106288h
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L6b
                return r2
            L6b:
                java.util.List r1 = r4.i
                java.util.List r3 = r5.i
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L76
                return r2
            L76:
                java.util.List r1 = r4.f106289j
                java.util.List r3 = r5.f106289j
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L81
                return r2
            L81:
                java.util.Set r1 = r4.k
                java.util.Set r3 = r5.k
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L8c
                return r2
            L8c:
                java.util.Set r1 = r4.f106290l
                java.util.Set r3 = r5.f106290l
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L97
                return r2
            L97:
                java.lang.Integer r1 = r4.f106291m
                java.lang.Integer r3 = r5.f106291m
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto La2
                return r2
            La2:
                com.revolut.sso.impl.domain.models.AuthLocation r1 = r4.f106292n
                com.revolut.sso.impl.domain.models.AuthLocation r3 = r5.f106292n
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto Lad
                return r2
            Lad:
                boolean r1 = r4.o
                boolean r3 = r5.o
                if (r1 == r3) goto Lb4
                return r2
            Lb4:
                boolean r1 = r4.f106293p
                boolean r3 = r5.f106293p
                if (r1 == r3) goto Lbb
                return r2
            Lbb:
                boolean r1 = r4.f106294q
                boolean r5 = r5.f106294q
                if (r1 == r5) goto Lc2
                return r2
            Lc2:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.SignIn.equals(java.lang.Object):boolean");
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: getLocation, reason: from getter */
        public final AuthLocation getF106303n() {
            return this.f106292n;
        }

        public final int hashCode() {
            int iHashCode = this.f106284a.hashCode() * 31;
            InitialAuthenticationCredential initialAuthenticationCredential = this.f106285b;
            int iHashCode2 = (iHashCode + (initialAuthenticationCredential == null ? 0 : initialAuthenticationCredential.hashCode())) * 31;
            Claim claim = this.f106286c;
            int iHashCode3 = (iHashCode2 + (claim == null ? 0 : claim.hashCode())) * 31;
            String str = this.d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.e;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            List list = this.f;
            int iC = j6.a.c((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f106287g);
            Challenge challenge = this.f106288h;
            int iF = p.a.f(p.a.f(p.a.d(p.a.d((iC + (challenge == null ? 0 : challenge.hashCode())) * 31, 31, this.i), 31, this.f106289j), 31, this.k), 31, this.f106290l);
            Integer num = this.f106291m;
            int iHashCode6 = (iF + (num == null ? 0 : num.hashCode())) * 31;
            AuthLocation authLocation = this.f106292n;
            return Boolean.hashCode(this.f106294q) + j6.a.c(j6.a.c((iHashCode6 + (authLocation != null ? authLocation.hashCode() : 0)) * 31, 31, this.o), 31, this.f106293p);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: isCompleted, reason: from getter */
        public final boolean getF106305q() {
            return this.f106294q;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getF106301l() {
            return this.f106290l;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getK() {
            return this.k;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: s8, reason: from getter */
        public final Challenge getF106299h() {
            return this.f106288h;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: u1, reason: from getter */
        public final boolean getO() {
            return this.o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106284a);
            dest.writeParcelable(this.f106285b, i);
            dest.writeParcelable(this.f106286c, i);
            String str = this.d;
            dest.writeParcelable(str != null ? new RegisteredIdentityId(str) : null, i);
            Boolean bool = this.e;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeStringList(this.f);
            dest.writeInt(this.f106287g ? 1 : 0);
            Challenge challenge = this.f106288h;
            if (challenge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                challenge.writeToParcel(dest, i);
            }
            Iterator itV = p.a.v(this.i, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.f106289j, dest);
            while (itV2.hasNext()) {
                dest.writeString(((jkl.i) itV2.next()).name());
            }
            Iterator itV3 = ehe.n.v(this.k, dest);
            while (itV3.hasNext()) {
                dest.writeString(((gkl.m) itV3.next()).name());
            }
            Iterator itV4 = ehe.n.v(this.f106290l, dest);
            while (itV4.hasNext()) {
                dest.writeString(((jkl.i) itV4.next()).name());
            }
            Integer num = this.f106291m;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            AuthLocation authLocation = this.f106292n;
            if (authLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authLocation.writeToParcel(dest, i);
            }
            dest.writeInt(this.o ? 1 : 0);
            dest.writeInt(this.f106293p ? 1 : 0);
            dest.writeInt(this.f106294q ? 1 : 0);
        }

        public SignIn(String str, InitialAuthenticationCredential initialAuthenticationCredential, Claim claim, String str2, Boolean bool, List list, Challenge challenge, List list2, List list3, Set set, Set set2, boolean z, int i) {
            this(str, initialAuthenticationCredential, (i & 4) != 0 ? null : claim, str2, bool, list, false, (i & 128) != 0 ? null : challenge, (i & 256) != 0 ? f0.f322471a : list2, (i & 512) != 0 ? f0.f322471a : list3, (i & 1024) != 0 ? h0.f322473a : set, (i & 2048) != 0 ? h0.f322473a : set2, null, null, false, (i & 32768) != 0 ? false : z, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State$OperationBoundAuthentication;", "Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowContract$State;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OperationBoundAuthentication implements AuthenticationFlowContract$State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialAuthenticationCredential f106272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f106273c;
        public final List d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f106274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f106275h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f106276j;
        public final Challenge k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List f106277l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List f106278m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Set f106279n;
        public final Set o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f106280p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Integer f106281q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final AuthLocation f106282r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f106283s;

        @NotNull
        public static final Parcelable.Creator<OperationBoundAuthentication> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                int iE;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(OperationBoundAuthentication.class.getClassLoader());
                s sVarValueOf = s.valueOf(parcel.readString());
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string2 = parcel.readString();
                RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(OperationBoundAuthentication.class.getClassLoader());
                String str = registeredIdentityId != null ? registeredIdentityId.f74764a : null;
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    iE = 0;
                    z = true;
                } else {
                    z = false;
                    iE = 0;
                }
                String string4 = parcel.readString();
                int i = parcel.readInt() != 0 ? 1 : iE;
                Challenge challengeCreateFromParcel = parcel.readInt() == 0 ? null : Challenge.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                boolean z3 = i;
                ArrayList arrayList = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(OperationBoundAuthentication.class, parcel, arrayList, iE, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    arrayList2.add(jkl.i.valueOf(parcel.readString()));
                }
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i6);
                int i21 = 0;
                while (i21 != i6) {
                    linkedHashSet.add(gkl.m.valueOf(parcel.readString()));
                    i21++;
                    i6 = i6;
                }
                int i22 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i22);
                String str2 = str;
                int i32 = 0;
                while (i32 != i22) {
                    linkedHashSet2.add(jkl.i.valueOf(parcel.readString()));
                    i32++;
                    i22 = i22;
                }
                return new OperationBoundAuthentication(string, initialAuthenticationCredential, sVarValueOf, arrayListCreateStringArrayList, string2, str2, string3, z, string4, z3, challengeCreateFromParcel, arrayList, arrayList2, linkedHashSet, linkedHashSet2, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : AuthLocation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OperationBoundAuthentication[i];
            }
        }

        public OperationBoundAuthentication(String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, s routingContext, List securityProfiles, String str, String str2, String str3, boolean z, String str4, boolean z3, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, boolean z4, Integer num, AuthLocation authLocation, boolean z6) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(routingContext, "routingContext");
            Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            this.f106271a = codeChallenge;
            this.f106272b = initialAuthenticationCredential;
            this.f106273c = routingContext;
            this.d = securityProfiles;
            this.e = str;
            this.f = str2;
            this.f106274g = str3;
            this.f106275h = z;
            this.i = str4;
            this.f106276j = z3;
            this.k = challenge;
            this.f106277l = evidences;
            this.f106278m = availableMethods;
            this.f106279n = rejectedClaims;
            this.o = rejectedMethods;
            this.f106280p = z4;
            this.f106281q = num;
            this.f106282r = authLocation;
            this.f106283s = z6;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: A5, reason: from getter */
        public final InitialAuthenticationCredential getF106296b() {
            return this.f106272b;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D5, reason: from getter */
        public final Integer getF106302m() {
            return this.f106281q;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106295a() {
            return this.f106271a;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: F2, reason: from getter */
        public final List getI() {
            return this.f106277l;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: G7, reason: from getter */
        public final List getF106300j() {
            return this.f106278m;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        public final AuthenticationFlowContract$State O9(boolean z, Challenge challenge, List evidences, List availableMethods, Set rejectedClaims, Set rejectedMethods, Integer num, AuthLocation authLocation, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
            Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
            return new OperationBoundAuthentication(this.f106271a, this.f106272b, this.f106273c, this.d, this.e, this.f, this.f106274g, z6, this.i, z, challenge, evidences, availableMethods, rejectedClaims, rejectedMethods, z4, num, authLocation, z3);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: U8, reason: from getter */
        public final boolean getF106304p() {
            return this.f106280p;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: Y1, reason: from getter */
        public final boolean getF106298g() {
            return this.f106276j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.OperationBoundAuthentication.equals(java.lang.Object):boolean");
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: getLocation, reason: from getter */
        public final AuthLocation getF106303n() {
            return this.f106282r;
        }

        public final int hashCode() {
            int iHashCode = this.f106271a.hashCode() * 31;
            InitialAuthenticationCredential initialAuthenticationCredential = this.f106272b;
            int iD = p.a.d((this.f106273c.hashCode() + ((iHashCode + (initialAuthenticationCredential == null ? 0 : initialAuthenticationCredential.hashCode())) * 31)) * 31, 31, this.d);
            String str = this.e;
            int iHashCode2 = (iD + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f106274g;
            int iC = j6.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f106275h);
            String str4 = this.i;
            int iC2 = j6.a.c((iC + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f106276j);
            Challenge challenge = this.k;
            int iC3 = j6.a.c(p.a.f(p.a.f(p.a.d(p.a.d((iC2 + (challenge == null ? 0 : challenge.hashCode())) * 31, 31, this.f106277l), 31, this.f106278m), 31, this.f106279n), 31, this.o), 31, this.f106280p);
            Integer num = this.f106281q;
            int iHashCode4 = (iC3 + (num == null ? 0 : num.hashCode())) * 31;
            AuthLocation authLocation = this.f106282r;
            return Boolean.hashCode(this.f106283s) + ((iHashCode4 + (authLocation != null ? authLocation.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: isCompleted, reason: from getter */
        public final boolean getF106305q() {
            return this.f106275h;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getF106301l() {
            return this.o;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getK() {
            return this.f106279n;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: s8, reason: from getter */
        public final Challenge getF106299h() {
            return this.k;
        }

        @Override // com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State
        /* JADX INFO: renamed from: u1, reason: from getter */
        public final boolean getO() {
            return this.f106283s;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106271a);
            dest.writeParcelable(this.f106272b, i);
            dest.writeString(this.f106273c.name());
            dest.writeStringList(this.d);
            dest.writeString(this.e);
            String str = this.f;
            dest.writeParcelable(str != null ? new RegisteredIdentityId(str) : null, i);
            dest.writeString(this.f106274g);
            dest.writeInt(this.f106275h ? 1 : 0);
            dest.writeString(this.i);
            dest.writeInt(this.f106276j ? 1 : 0);
            Challenge challenge = this.k;
            if (challenge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                challenge.writeToParcel(dest, i);
            }
            Iterator itV = p.a.v(this.f106277l, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Iterator itV2 = p.a.v(this.f106278m, dest);
            while (itV2.hasNext()) {
                dest.writeString(((jkl.i) itV2.next()).name());
            }
            Iterator itV3 = ehe.n.v(this.f106279n, dest);
            while (itV3.hasNext()) {
                dest.writeString(((gkl.m) itV3.next()).name());
            }
            Iterator itV4 = ehe.n.v(this.o, dest);
            while (itV4.hasNext()) {
                dest.writeString(((jkl.i) itV4.next()).name());
            }
            dest.writeInt(this.f106280p ? 1 : 0);
            Integer num = this.f106281q;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            AuthLocation authLocation = this.f106282r;
            if (authLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authLocation.writeToParcel(dest, i);
            }
            dest.writeInt(this.f106283s ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OperationBoundAuthentication(String str, InitialAuthenticationCredential.SessionToken sessionToken, s sVar, List list, String str2, String str3, String str4, String str5, Set set, Set set2, int i) {
            String str6 = (i & 256) != 0 ? null : str5;
            f0 f0Var = f0.f322471a;
            this(str, sessionToken, sVar, list, str2, str3, str4, false, str6, false, null, f0Var, f0Var, (i & 8192) != 0 ? h0.f322473a : set, (i & 16384) != 0 ? h0.f322473a : set2, false, null, null, false);
        }
    }
}
