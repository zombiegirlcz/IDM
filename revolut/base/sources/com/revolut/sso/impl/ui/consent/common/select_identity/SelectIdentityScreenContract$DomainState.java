package com.revolut.sso.impl.ui.consent.common.select_identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.sso.api.models.ConsentChallenge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/sso/impl/ui/consent/common/select_identity/SelectIdentityScreenContract$DomainState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "SelectionState", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectIdentityScreenContract$DomainState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<SelectIdentityScreenContract$DomainState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentChallenge.Qr.Delegated f106455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectionState f106456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f106457c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/common/select_identity/SelectIdentityScreenContract$DomainState$SelectionState;", "Landroid/os/Parcelable;", "Selected", "NotSelected", "Lcom/revolut/sso/impl/ui/consent/common/select_identity/SelectIdentityScreenContract$DomainState$SelectionState$NotSelected;", "Lcom/revolut/sso/impl/ui/consent/common/select_identity/SelectIdentityScreenContract$DomainState$SelectionState$Selected;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface SelectionState extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/common/select_identity/SelectIdentityScreenContract$DomainState$SelectionState$NotSelected;", "Lcom/revolut/sso/impl/ui/consent/common/select_identity/SelectIdentityScreenContract$DomainState$SelectionState;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NotSelected implements SelectionState {

            @NotNull
            public static final Parcelable.Creator<NotSelected> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f106458a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(NotSelected.class, parcel, arrayList, iE, 1);
                    }
                    return new NotSelected(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NotSelected[i];
                }
            }

            public NotSelected(List selectionIdentities) {
                Intrinsics.checkNotNullParameter(selectionIdentities, "selectionIdentities");
                this.f106458a = selectionIdentities;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NotSelected) && Intrinsics.f(this.f106458a, ((NotSelected) obj2).f106458a);
            }

            public final int hashCode() {
                return this.f106458a.hashCode();
            }

            @Override // com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreenContract$DomainState.SelectionState
            /* JADX INFO: renamed from: v2, reason: from getter */
            public final List getF106460b() {
                return this.f106458a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f106458a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/common/select_identity/SelectIdentityScreenContract$DomainState$SelectionState$Selected;", "Lcom/revolut/sso/impl/ui/consent/common/select_identity/SelectIdentityScreenContract$DomainState$SelectionState;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Selected implements SelectionState {

            @NotNull
            public static final Parcelable.Creator<Selected> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ConsentChallenge.Qr.Delegated.Selection.Identity f106459a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f106460b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    ConsentChallenge.Qr.Delegated.Selection.Identity identity = (ConsentChallenge.Qr.Delegated.Selection.Identity) j6.a.f(parcel, "parcel", Selected.class);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(Selected.class, parcel, arrayList, iE, 1);
                    }
                    return new Selected(identity, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Selected[i];
                }
            }

            public Selected(ConsentChallenge.Qr.Delegated.Selection.Identity chosenIdentity, List selectionIdentities) {
                Intrinsics.checkNotNullParameter(chosenIdentity, "chosenIdentity");
                Intrinsics.checkNotNullParameter(selectionIdentities, "selectionIdentities");
                this.f106459a = chosenIdentity;
                this.f106460b = selectionIdentities;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Selected)) {
                    return false;
                }
                Selected selected = (Selected) obj2;
                return Intrinsics.f(this.f106459a, selected.f106459a) && Intrinsics.f(this.f106460b, selected.f106460b);
            }

            public final int hashCode() {
                return this.f106460b.hashCode() + (this.f106459a.hashCode() * 31);
            }

            @Override // com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreenContract$DomainState.SelectionState
            /* JADX INFO: renamed from: v2, reason: from getter */
            public final List getF106460b() {
                return this.f106460b;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f106459a, i);
                Iterator itV = p.a.v(this.f106460b, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        /* JADX INFO: renamed from: v2 */
        List getF106460b();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectIdentityScreenContract$DomainState((ConsentChallenge.Qr.Delegated) parcel.readParcelable(SelectIdentityScreenContract$DomainState.class.getClassLoader()), (SelectionState) parcel.readParcelable(SelectIdentityScreenContract$DomainState.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectIdentityScreenContract$DomainState[i];
        }
    }

    public SelectIdentityScreenContract$DomainState(ConsentChallenge.Qr.Delegated consentChallenge, SelectionState selectionState, long j2) {
        Intrinsics.checkNotNullParameter(consentChallenge, "consentChallenge");
        Intrinsics.checkNotNullParameter(selectionState, "selectionState");
        this.f106455a = consentChallenge;
        this.f106456b = selectionState;
        this.f106457c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectIdentityScreenContract$DomainState)) {
            return false;
        }
        SelectIdentityScreenContract$DomainState selectIdentityScreenContract$DomainState = (SelectIdentityScreenContract$DomainState) obj2;
        return Intrinsics.f(this.f106455a, selectIdentityScreenContract$DomainState.f106455a) && Intrinsics.f(this.f106456b, selectIdentityScreenContract$DomainState.f106456b) && this.f106457c == selectIdentityScreenContract$DomainState.f106457c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f106457c) + ((this.f106456b.hashCode() + (this.f106455a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106455a, i);
        dest.writeParcelable(this.f106456b, i);
        dest.writeLong(this.f106457c);
    }
}
