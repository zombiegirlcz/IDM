package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import cjl.s;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.sso.impl.domain.models.InitialAuthenticationCredential;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import gkl.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jkl.i;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthAction;", "Landroid/os/Parcelable;", "<init>", "()V", "AccessRecovery", "SignIn", "OperationBoundAuthentication", "AuthoriseExternalClient", "SignInWithRevolutId", "Lcom/revolut/sso/impl/domain/models/AuthAction$AccessRecovery;", "Lcom/revolut/sso/impl/domain/models/AuthAction$AuthoriseExternalClient;", "Lcom/revolut/sso/impl/domain/models/AuthAction$OperationBoundAuthentication;", "Lcom/revolut/sso/impl/domain/models/AuthAction$SignIn;", "Lcom/revolut/sso/impl/domain/models/AuthAction$SignInWithRevolutId;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AuthAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthAction$AccessRecovery;", "Lcom/revolut/sso/impl/domain/models/AuthAction;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccessRecovery extends AuthAction {

        @NotNull
        public static final Parcelable.Creator<AccessRecovery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialAuthenticationCredential f106033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f106034c;
        public final Set d;
        public final Set e;
        public final Claim f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AuthLocation f106035g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f106036h;
        public final String i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                LinkedHashSet linkedHashSet2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(AccessRecovery.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(AccessRecovery.class, parcel, arrayList, iE, 1);
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i2 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        linkedHashSet.add(m.valueOf(parcel.readString()));
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet2 = null;
                } else {
                    int i5 = parcel.readInt();
                    linkedHashSet2 = new LinkedHashSet(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        linkedHashSet2.add(i.valueOf(parcel.readString()));
                    }
                }
                return new AccessRecovery(string, initialAuthenticationCredential, arrayList, linkedHashSet, linkedHashSet2, (Claim) parcel.readParcelable(AccessRecovery.class.getClassLoader()), parcel.readInt() != 0 ? AuthLocation.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccessRecovery[i];
            }
        }

        public AccessRecovery(String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, List evidences, Set set, Set set2, Claim claim, AuthLocation authLocation, boolean z, String str) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            this.f106032a = codeChallenge;
            this.f106033b = initialAuthenticationCredential;
            this.f106034c = evidences;
            this.d = set;
            this.e = set2;
            this.f = claim;
            this.f106035g = authLocation;
            this.f106036h = z;
            this.i = str;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106060a() {
            return this.f106032a;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF106065j() {
            return this.i;
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
            return Intrinsics.f(this.f106032a, accessRecovery.f106032a) && Intrinsics.f(this.f106033b, accessRecovery.f106033b) && Intrinsics.f(this.f106034c, accessRecovery.f106034c) && Intrinsics.f(this.d, accessRecovery.d) && Intrinsics.f(this.e, accessRecovery.e) && Intrinsics.f(this.f, accessRecovery.f) && Intrinsics.f(this.f106035g, accessRecovery.f106035g) && this.f106036h == accessRecovery.f106036h && Intrinsics.f(this.i, accessRecovery.i);
        }

        public final int hashCode() {
            int iHashCode = this.f106032a.hashCode() * 31;
            InitialAuthenticationCredential initialAuthenticationCredential = this.f106033b;
            int iD = p.a.d((iHashCode + (initialAuthenticationCredential == null ? 0 : initialAuthenticationCredential.hashCode())) * 31, 31, this.f106034c);
            Set set = this.d;
            int iHashCode2 = (iD + (set == null ? 0 : set.hashCode())) * 31;
            Set set2 = this.e;
            int iHashCode3 = (iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
            Claim claim = this.f;
            int iHashCode4 = (iHashCode3 + (claim == null ? 0 : claim.hashCode())) * 31;
            AuthLocation authLocation = this.f106035g;
            int iC = j6.a.c((iHashCode4 + (authLocation == null ? 0 : authLocation.hashCode())) * 31, 31, this.f106036h);
            String str = this.i;
            return iC + (str != null ? str.hashCode() : 0);
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getI() {
            return this.e;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getF106064h() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106032a);
            dest.writeParcelable(this.f106033b, i);
            Iterator itV = p.a.v(this.f106034c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Set set = this.d;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString(((m) itQ.next()).name());
                }
            }
            Set set2 = this.e;
            if (set2 == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ2 = e.q(dest, 1, set2);
                while (itQ2.hasNext()) {
                    dest.writeString(((i) itQ2.next()).name());
                }
            }
            dest.writeParcelable(this.f, i);
            AuthLocation authLocation = this.f106035g;
            if (authLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authLocation.writeToParcel(dest, i);
            }
            dest.writeInt(this.f106036h ? 1 : 0);
            dest.writeString(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthAction$AuthoriseExternalClient;", "Lcom/revolut/sso/impl/domain/models/AuthAction;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthoriseExternalClient extends AuthAction {

        @NotNull
        public static final Parcelable.Creator<AuthoriseExternalClient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialAuthenticationCredential f106038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106039c;
        public final List d;
        public final String e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f106040g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Set f106041h;
        public final String i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(AuthoriseExternalClient.class.getClassLoader());
                String string2 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string3 = parcel.readString();
                LinkedHashSet linkedHashSet2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(AuthoriseExternalClient.class, parcel, arrayList, iE, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i2 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        linkedHashSet.add(m.valueOf(parcel.readString()));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i5 = parcel.readInt();
                    linkedHashSet2 = new LinkedHashSet(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        linkedHashSet2.add(i.valueOf(parcel.readString()));
                    }
                }
                return new AuthoriseExternalClient(string, initialAuthenticationCredential, string2, arrayListCreateStringArrayList, string3, arrayList, linkedHashSet, linkedHashSet2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthoriseExternalClient[i];
            }
        }

        public AuthoriseExternalClient(String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, String clientId, List securityProfiles, String str, List list, Set set, Set set2, String str2) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(initialAuthenticationCredential, "initialAuthenticationCredential");
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
            this.f106037a = codeChallenge;
            this.f106038b = initialAuthenticationCredential;
            this.f106039c = clientId;
            this.d = securityProfiles;
            this.e = str;
            this.f = list;
            this.f106040g = set;
            this.f106041h = set2;
            this.i = str2;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106060a() {
            return this.f106037a;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF106065j() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AuthoriseExternalClient)) {
                return false;
            }
            AuthoriseExternalClient authoriseExternalClient = (AuthoriseExternalClient) obj2;
            return Intrinsics.f(this.f106037a, authoriseExternalClient.f106037a) && Intrinsics.f(this.f106038b, authoriseExternalClient.f106038b) && Intrinsics.f(this.f106039c, authoriseExternalClient.f106039c) && Intrinsics.f(this.d, authoriseExternalClient.d) && Intrinsics.f(this.e, authoriseExternalClient.e) && Intrinsics.f(this.f, authoriseExternalClient.f) && Intrinsics.f(this.f106040g, authoriseExternalClient.f106040g) && Intrinsics.f(this.f106041h, authoriseExternalClient.f106041h) && Intrinsics.f(this.i, authoriseExternalClient.i);
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.c((this.f106038b.hashCode() + (this.f106037a.hashCode() * 31)) * 31, 31, this.f106039c), 31, this.d);
            String str = this.e;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            List list = this.f;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Set set = this.f106040g;
            int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
            Set set2 = this.f106041h;
            int iHashCode4 = (iHashCode3 + (set2 == null ? 0 : set2.hashCode())) * 31;
            String str2 = this.i;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getI() {
            return this.f106041h;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getF106064h() {
            return this.f106040g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106037a);
            dest.writeParcelable(this.f106038b, i);
            dest.writeString(this.f106039c);
            dest.writeStringList(this.d);
            dest.writeString(this.e);
            List list = this.f;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeParcelable((Parcelable) itQ.next(), i);
                }
            }
            Set set = this.f106040g;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ2 = e.q(dest, 1, set);
                while (itQ2.hasNext()) {
                    dest.writeString(((m) itQ2.next()).name());
                }
            }
            Set set2 = this.f106041h;
            if (set2 == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ3 = e.q(dest, 1, set2);
                while (itQ3.hasNext()) {
                    dest.writeString(((i) itQ3.next()).name());
                }
            }
            dest.writeString(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthAction$SignInWithRevolutId;", "Lcom/revolut/sso/impl/domain/models/AuthAction;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignInWithRevolutId extends AuthAction {

        @NotNull
        public static final Parcelable.Creator<SignInWithRevolutId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialAuthenticationCredential f106061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106062c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f106063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Set f106064h;
        public final Set i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f106065j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(SignInWithRevolutId.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                LinkedHashSet linkedHashSet2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(SignInWithRevolutId.class, parcel, arrayList, iE, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i2 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        linkedHashSet.add(m.valueOf(parcel.readString()));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i5 = parcel.readInt();
                    linkedHashSet2 = new LinkedHashSet(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        linkedHashSet2.add(i.valueOf(parcel.readString()));
                    }
                }
                return new SignInWithRevolutId(string, initialAuthenticationCredential, string2, string3, string4, string5, arrayList, linkedHashSet, linkedHashSet2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignInWithRevolutId[i];
            }
        }

        public SignInWithRevolutId(String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, String clientId, String redirectUri, String scope, String state, List list, Set set, Set set2, String str) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f106060a = codeChallenge;
            this.f106061b = initialAuthenticationCredential;
            this.f106062c = clientId;
            this.d = redirectUri;
            this.e = scope;
            this.f = state;
            this.f106063g = list;
            this.f106064h = set;
            this.i = set2;
            this.f106065j = str;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106060a() {
            return this.f106060a;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF106065j() {
            return this.f106065j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SignInWithRevolutId)) {
                return false;
            }
            SignInWithRevolutId signInWithRevolutId = (SignInWithRevolutId) obj2;
            return Intrinsics.f(this.f106060a, signInWithRevolutId.f106060a) && Intrinsics.f(this.f106061b, signInWithRevolutId.f106061b) && Intrinsics.f(this.f106062c, signInWithRevolutId.f106062c) && Intrinsics.f(this.d, signInWithRevolutId.d) && Intrinsics.f(this.e, signInWithRevolutId.e) && Intrinsics.f(this.f, signInWithRevolutId.f) && Intrinsics.f(this.f106063g, signInWithRevolutId.f106063g) && Intrinsics.f(this.f106064h, signInWithRevolutId.f106064h) && Intrinsics.f(this.i, signInWithRevolutId.i) && Intrinsics.f(this.f106065j, signInWithRevolutId.f106065j);
        }

        public final int hashCode() {
            int iHashCode = this.f106060a.hashCode() * 31;
            InitialAuthenticationCredential initialAuthenticationCredential = this.f106061b;
            int iC = p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (initialAuthenticationCredential == null ? 0 : initialAuthenticationCredential.hashCode())) * 31, 31, this.f106062c), 31, this.d), 31, this.e), 31, this.f);
            List list = this.f106063g;
            int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
            Set set = this.f106064h;
            int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
            Set set2 = this.i;
            int iHashCode4 = (iHashCode3 + (set2 == null ? 0 : set2.hashCode())) * 31;
            String str = this.f106065j;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getI() {
            return this.i;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getF106064h() {
            return this.f106064h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106060a);
            dest.writeParcelable(this.f106061b, i);
            dest.writeString(this.f106062c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            List list = this.f106063g;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeParcelable((Parcelable) itQ.next(), i);
                }
            }
            Set set = this.f106064h;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ2 = e.q(dest, 1, set);
                while (itQ2.hasNext()) {
                    dest.writeString(((m) itQ2.next()).name());
                }
            }
            Set set2 = this.i;
            if (set2 == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ3 = e.q(dest, 1, set2);
                while (itQ3.hasNext()) {
                    dest.writeString(((i) itQ3.next()).name());
                }
            }
            dest.writeString(this.f106065j);
        }
    }

    private AuthAction() {
    }

    /* JADX INFO: renamed from: D8 */
    public abstract String getF106060a();

    /* JADX INFO: renamed from: a */
    public abstract String getF106065j();

    /* JADX INFO: renamed from: o4 */
    public abstract Set getI();

    /* JADX INFO: renamed from: r6 */
    public abstract Set getF106064h();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthAction$SignIn;", "Lcom/revolut/sso/impl/domain/models/AuthAction;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignIn extends AuthAction {

        @NotNull
        public static final Parcelable.Creator<SignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialAuthenticationCredential f106052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f106053c;
        public final Set d;
        public final Set e;
        public final Claim f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AuthLocation f106054g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f106055h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f106056j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Boolean f106057l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List f106058m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f106059n;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                LinkedHashSet linkedHashSet2;
                Boolean boolValueOf;
                LinkedHashSet linkedHashSet3;
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(SignIn.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SignIn.class, parcel, arrayList, iE, 1);
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i2 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        linkedHashSet.add(m.valueOf(parcel.readString()));
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet2 = null;
                } else {
                    int i5 = parcel.readInt();
                    linkedHashSet2 = new LinkedHashSet(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        linkedHashSet2.add(i.valueOf(parcel.readString()));
                    }
                }
                Claim claim = (Claim) parcel.readParcelable(SignIn.class.getClassLoader());
                AuthLocation authLocationCreateFromParcel = parcel.readInt() == 0 ? null : AuthLocation.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    boolValueOf = null;
                    linkedHashSet3 = linkedHashSet2;
                    z = true;
                } else {
                    boolValueOf = null;
                    linkedHashSet3 = linkedHashSet2;
                    z = false;
                }
                LinkedHashSet linkedHashSet4 = linkedHashSet;
                String string2 = parcel.readString();
                Object objValueOf = parcel.readInt() == 0 ? boolValueOf : Integer.valueOf(parcel.readInt());
                RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(SignIn.class.getClassLoader());
                Object obj2 = registeredIdentityId != null ? registeredIdentityId.f74764a : boolValueOf;
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SignIn(string, initialAuthenticationCredential, arrayList, linkedHashSet4, linkedHashSet3, claim, authLocationCreateFromParcel, z, string2, objValueOf, obj2, boolValueOf, parcel.createStringArrayList(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignIn[i];
            }
        }

        public SignIn(String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, List evidences, Set set, Set set2, Claim claim, AuthLocation authLocation, boolean z, String str, Integer num, String str2, Boolean bool, List list, boolean z3) {
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            this.f106051a = codeChallenge;
            this.f106052b = initialAuthenticationCredential;
            this.f106053c = evidences;
            this.d = set;
            this.e = set2;
            this.f = claim;
            this.f106054g = authLocation;
            this.f106055h = z;
            this.i = str;
            this.f106056j = num;
            this.k = str2;
            this.f106057l = bool;
            this.f106058m = list;
            this.f106059n = z3;
        }

        public static SignIn b(SignIn signIn, String str) {
            String codeChallenge = signIn.f106051a;
            InitialAuthenticationCredential initialAuthenticationCredential = signIn.f106052b;
            List evidences = signIn.f106053c;
            Set set = signIn.d;
            Set set2 = signIn.e;
            Claim claim = signIn.f;
            AuthLocation authLocation = signIn.f106054g;
            boolean z = signIn.f106055h;
            Integer num = signIn.f106056j;
            String str2 = signIn.k;
            Boolean bool = signIn.f106057l;
            List list = signIn.f106058m;
            boolean z3 = signIn.f106059n;
            signIn.getClass();
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            return new SignIn(codeChallenge, initialAuthenticationCredential, evidences, set, set2, claim, authLocation, z, str, num, str2, bool, list, z3);
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106060a() {
            return this.f106051a;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF106065j() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
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
                boolean r1 = r5 instanceof com.revolut.sso.impl.domain.models.AuthAction.SignIn
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revolut.sso.impl.domain.models.AuthAction$SignIn r5 = (com.revolut.sso.impl.domain.models.AuthAction.SignIn) r5
                java.lang.String r1 = r4.f106051a
                java.lang.String r3 = r5.f106051a
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                com.revolut.sso.impl.domain.models.InitialAuthenticationCredential r1 = r4.f106052b
                com.revolut.sso.impl.domain.models.InitialAuthenticationCredential r3 = r5.f106052b
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.util.List r1 = r4.f106053c
                java.util.List r3 = r5.f106053c
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.util.Set r1 = r4.d
                java.util.Set r3 = r5.d
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                java.util.Set r1 = r4.e
                java.util.Set r3 = r5.e
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L43
                return r2
            L43:
                com.revolut.sso.impl.domain.models.Claim r1 = r4.f
                com.revolut.sso.impl.domain.models.Claim r3 = r5.f
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L4e
                return r2
            L4e:
                com.revolut.sso.impl.domain.models.AuthLocation r1 = r4.f106054g
                com.revolut.sso.impl.domain.models.AuthLocation r3 = r5.f106054g
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L59
                return r2
            L59:
                boolean r1 = r4.f106055h
                boolean r3 = r5.f106055h
                if (r1 == r3) goto L60
                return r2
            L60:
                java.lang.String r1 = r4.i
                java.lang.String r3 = r5.i
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L6b
                return r2
            L6b:
                java.lang.Integer r1 = r4.f106056j
                java.lang.Integer r3 = r5.f106056j
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L76
                return r2
            L76:
                java.lang.String r1 = r5.k
                java.lang.String r3 = r4.k
                if (r3 != 0) goto L82
                if (r1 != 0) goto L80
                r1 = r0
                goto L89
            L80:
                r1 = r2
                goto L89
            L82:
                if (r1 != 0) goto L85
                goto L80
            L85:
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            L89:
                if (r1 != 0) goto L8c
                return r2
            L8c:
                java.lang.Boolean r1 = r4.f106057l
                java.lang.Boolean r3 = r5.f106057l
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L97
                return r2
            L97:
                java.util.List r1 = r4.f106058m
                java.util.List r3 = r5.f106058m
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto La2
                return r2
            La2:
                boolean r1 = r4.f106059n
                boolean r5 = r5.f106059n
                if (r1 == r5) goto La9
                return r2
            La9:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.domain.models.AuthAction.SignIn.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int iHashCode = this.f106051a.hashCode() * 31;
            InitialAuthenticationCredential initialAuthenticationCredential = this.f106052b;
            int iD = p.a.d((iHashCode + (initialAuthenticationCredential == null ? 0 : initialAuthenticationCredential.hashCode())) * 31, 31, this.f106053c);
            Set set = this.d;
            int iHashCode2 = (iD + (set == null ? 0 : set.hashCode())) * 31;
            Set set2 = this.e;
            int iHashCode3 = (iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
            Claim claim = this.f;
            int iHashCode4 = (iHashCode3 + (claim == null ? 0 : claim.hashCode())) * 31;
            AuthLocation authLocation = this.f106054g;
            int iC = j6.a.c((iHashCode4 + (authLocation == null ? 0 : authLocation.hashCode())) * 31, 31, this.f106055h);
            String str = this.i;
            int iHashCode5 = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f106056j;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.k;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f106057l;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            List list = this.f106058m;
            return Boolean.hashCode(this.f106059n) + ((iHashCode8 + (list != null ? list.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getI() {
            return this.e;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getF106064h() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106051a);
            dest.writeParcelable(this.f106052b, i);
            Iterator itV = p.a.v(this.f106053c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Set set = this.d;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString(((m) itQ.next()).name());
                }
            }
            Set set2 = this.e;
            if (set2 == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ2 = e.q(dest, 1, set2);
                while (itQ2.hasNext()) {
                    dest.writeString(((i) itQ2.next()).name());
                }
            }
            dest.writeParcelable(this.f, i);
            AuthLocation authLocation = this.f106054g;
            if (authLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authLocation.writeToParcel(dest, i);
            }
            dest.writeInt(this.f106055h ? 1 : 0);
            dest.writeString(this.i);
            Integer num = this.f106056j;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            String str = this.k;
            dest.writeParcelable(str != null ? new RegisteredIdentityId(str) : null, i);
            Boolean bool = this.f106057l;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            dest.writeStringList(this.f106058m);
            dest.writeInt(this.f106059n ? 1 : 0);
        }

        public /* synthetic */ SignIn(String str, InitialAuthenticationCredential.Account account, List list, h0 h0Var, h0 h0Var2, String str2, int i) {
            this(str, account, list, h0Var, h0Var2, null, null, false, (i & 256) != 0 ? null : str2, null, null, null, null, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/AuthAction$OperationBoundAuthentication;", "Lcom/revolut/sso/impl/domain/models/AuthAction;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OperationBoundAuthentication extends AuthAction {

        @NotNull
        public static final Parcelable.Creator<OperationBoundAuthentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f106042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InitialAuthenticationCredential f106044c;
        public final List d;
        public final String e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f106045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Set f106046h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f106047j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f106048l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AuthLocation f106049m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f106050n;
        public final AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin o;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                LinkedHashSet linkedHashSet2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                s sVarValueOf = s.valueOf(parcel.readString());
                String string = parcel.readString();
                InitialAuthenticationCredential initialAuthenticationCredential = (InitialAuthenticationCredential) parcel.readParcelable(OperationBoundAuthentication.class.getClassLoader());
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(OperationBoundAuthentication.class, parcel, arrayList, iE, 1);
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i2 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        linkedHashSet.add(m.valueOf(parcel.readString()));
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet2 = null;
                } else {
                    int i5 = parcel.readInt();
                    linkedHashSet2 = new LinkedHashSet(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        linkedHashSet2.add(i.valueOf(parcel.readString()));
                    }
                }
                String string3 = parcel.readString();
                LinkedHashSet linkedHashSet3 = linkedHashSet;
                String string4 = parcel.readString();
                RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(OperationBoundAuthentication.class.getClassLoader());
                return new OperationBoundAuthentication(sVarValueOf, string, initialAuthenticationCredential, arrayListCreateStringArrayList, string2, arrayList, linkedHashSet3, linkedHashSet2, string3, string4, registeredIdentityId != null ? registeredIdentityId.f74764a : null, parcel.readString(), parcel.readInt() != 0 ? AuthLocation.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, (AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin) parcel.readParcelable(OperationBoundAuthentication.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OperationBoundAuthentication[i];
            }
        }

        public OperationBoundAuthentication(s routingContext, String codeChallenge, InitialAuthenticationCredential initialAuthenticationCredential, List securityProfiles, String str, List evidences, Set set, Set set2, String str2, String str3, String str4, String str5, AuthLocation authLocation, boolean z, AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin origin) {
            Intrinsics.checkNotNullParameter(routingContext, "routingContext");
            Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
            Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
            Intrinsics.checkNotNullParameter(evidences, "evidences");
            Intrinsics.checkNotNullParameter(origin, "origin");
            this.f106042a = routingContext;
            this.f106043b = codeChallenge;
            this.f106044c = initialAuthenticationCredential;
            this.d = securityProfiles;
            this.e = str;
            this.f = evidences;
            this.f106045g = set;
            this.f106046h = set2;
            this.i = str2;
            this.f106047j = str3;
            this.k = str4;
            this.f106048l = str5;
            this.f106049m = authLocation;
            this.f106050n = z;
            this.o = origin;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: D8, reason: from getter */
        public final String getF106060a() {
            return this.f106043b;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF106065j() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
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
                boolean r1 = r5 instanceof com.revolut.sso.impl.domain.models.AuthAction.OperationBoundAuthentication
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revolut.sso.impl.domain.models.AuthAction$OperationBoundAuthentication r5 = (com.revolut.sso.impl.domain.models.AuthAction.OperationBoundAuthentication) r5
                cjl.s r1 = r4.f106042a
                cjl.s r3 = r5.f106042a
                if (r1 == r3) goto L13
                return r2
            L13:
                java.lang.String r1 = r4.f106043b
                java.lang.String r3 = r5.f106043b
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L1e
                return r2
            L1e:
                com.revolut.sso.impl.domain.models.InitialAuthenticationCredential r1 = r4.f106044c
                com.revolut.sso.impl.domain.models.InitialAuthenticationCredential r3 = r5.f106044c
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L29
                return r2
            L29:
                java.util.List r1 = r4.d
                java.util.List r3 = r5.d
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L34
                return r2
            L34:
                java.lang.String r1 = r4.e
                java.lang.String r3 = r5.e
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L3f
                return r2
            L3f:
                java.util.List r1 = r4.f
                java.util.List r3 = r5.f
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L4a
                return r2
            L4a:
                java.util.Set r1 = r4.f106045g
                java.util.Set r3 = r5.f106045g
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L55
                return r2
            L55:
                java.util.Set r1 = r4.f106046h
                java.util.Set r3 = r5.f106046h
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L60
                return r2
            L60:
                java.lang.String r1 = r4.i
                java.lang.String r3 = r5.i
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L6b
                return r2
            L6b:
                java.lang.String r1 = r4.f106047j
                java.lang.String r3 = r5.f106047j
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L76
                return r2
            L76:
                java.lang.String r1 = r5.k
                java.lang.String r3 = r4.k
                if (r3 != 0) goto L82
                if (r1 != 0) goto L80
                r1 = r0
                goto L89
            L80:
                r1 = r2
                goto L89
            L82:
                if (r1 != 0) goto L85
                goto L80
            L85:
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            L89:
                if (r1 != 0) goto L8c
                return r2
            L8c:
                java.lang.String r1 = r4.f106048l
                java.lang.String r3 = r5.f106048l
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto L97
                return r2
            L97:
                com.revolut.sso.impl.domain.models.AuthLocation r1 = r4.f106049m
                com.revolut.sso.impl.domain.models.AuthLocation r3 = r5.f106049m
                boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
                if (r1 != 0) goto La2
                return r2
            La2:
                boolean r1 = r4.f106050n
                boolean r3 = r5.f106050n
                if (r1 == r3) goto La9
                return r2
            La9:
                com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin r1 = r4.o
                com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin r5 = r5.o
                boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
                if (r5 != 0) goto Lb4
                return r2
            Lb4:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.domain.models.AuthAction.OperationBoundAuthentication.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int iC = p.a.c(this.f106042a.hashCode() * 31, 31, this.f106043b);
            InitialAuthenticationCredential initialAuthenticationCredential = this.f106044c;
            int iD = p.a.d((iC + (initialAuthenticationCredential == null ? 0 : initialAuthenticationCredential.hashCode())) * 31, 31, this.d);
            String str = this.e;
            int iD2 = p.a.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            Set set = this.f106045g;
            int iHashCode = (iD2 + (set == null ? 0 : set.hashCode())) * 31;
            Set set2 = this.f106046h;
            int iHashCode2 = (iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
            String str2 = this.i;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f106047j;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.k;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f106048l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            AuthLocation authLocation = this.f106049m;
            return this.o.hashCode() + j6.a.c((iHashCode6 + (authLocation != null ? authLocation.hashCode() : 0)) * 31, 31, this.f106050n);
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: o4, reason: from getter */
        public final Set getI() {
            return this.f106046h;
        }

        @Override // com.revolut.sso.impl.domain.models.AuthAction
        /* JADX INFO: renamed from: r6, reason: from getter */
        public final Set getF106064h() {
            return this.f106045g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106042a.name());
            dest.writeString(this.f106043b);
            dest.writeParcelable(this.f106044c, i);
            dest.writeStringList(this.d);
            dest.writeString(this.e);
            Iterator itV = p.a.v(this.f, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            Set set = this.f106045g;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString(((m) itQ.next()).name());
                }
            }
            Set set2 = this.f106046h;
            if (set2 == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ2 = e.q(dest, 1, set2);
                while (itQ2.hasNext()) {
                    dest.writeString(((i) itQ2.next()).name());
                }
            }
            dest.writeString(this.i);
            dest.writeString(this.f106047j);
            String str = this.k;
            dest.writeParcelable(str != null ? new RegisteredIdentityId(str) : null, i);
            dest.writeString(this.f106048l);
            AuthLocation authLocation = this.f106049m;
            if (authLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                authLocation.writeToParcel(dest, i);
            }
            dest.writeInt(this.f106050n ? 1 : 0);
            dest.writeParcelable(this.o, i);
        }

        public /* synthetic */ OperationBoundAuthentication(s sVar, String str, f0 f0Var, String str2, f0 f0Var2, h0 h0Var, h0 h0Var2, int i) {
            this(sVar, str, null, f0Var, str2, f0Var2, h0Var, h0Var2, null, null, null, null, null, false, AuthenticationFlowContract$InputData.OperationBoundAuthentication.Origin.Default.f106229a);
        }
    }
}
