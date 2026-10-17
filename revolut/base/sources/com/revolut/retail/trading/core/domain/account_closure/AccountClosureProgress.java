package com.revolut.retail.trading.core.domain.account_closure;

import android.os.Parcel;
import android.os.Parcelable;
import h4l.b;
import h4l.c;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureProgress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureProgress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountClosureProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f104489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104490c;
    public final Instant d;
    public final Instant e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f104491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f104492h;
    public final AccountClosureProgressStep i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f104493j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f104494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LocalDate f104495m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            String string2 = parcel.readString();
            Instant instant = (Instant) parcel.readSerializable();
            Instant instant2 = (Instant) parcel.readSerializable();
            b bVarValueOf = b.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            AccountClosureProgressStep accountClosureProgressStepCreateFromParcel = AccountClosureProgressStep.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (true) {
                if (iA == i) {
                    break;
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AccountClosureProgressStep.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(AccountClosureProgressStep.CREATOR, parcel, arrayList2, iA2, 1);
            }
            return new AccountClosureProgress(string, cVarValueOf, string2, instant, instant2, bVarValueOf, string3, string4, accountClosureProgressStepCreateFromParcel, arrayList, arrayList2, parcel.readInt() != 0, (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureProgress[i];
        }
    }

    public AccountClosureProgress(String id10, c state, String portfolioId, Instant createdDate, Instant updatedDate, b source, String tradingLegalEntityId, String str, AccountClosureProgressStep currentStep, ArrayList pendingSteps, ArrayList completedSteps, boolean z, LocalDate estimatedCompletionDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(tradingLegalEntityId, "tradingLegalEntityId");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(pendingSteps, "pendingSteps");
        Intrinsics.checkNotNullParameter(completedSteps, "completedSteps");
        Intrinsics.checkNotNullParameter(estimatedCompletionDate, "estimatedCompletionDate");
        this.f104488a = id10;
        this.f104489b = state;
        this.f104490c = portfolioId;
        this.d = createdDate;
        this.e = updatedDate;
        this.f = source;
        this.f104491g = tradingLegalEntityId;
        this.f104492h = str;
        this.i = currentStep;
        this.f104493j = pendingSteps;
        this.k = completedSteps;
        this.f104494l = z;
        this.f104495m = estimatedCompletionDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureProgress)) {
            return false;
        }
        AccountClosureProgress accountClosureProgress = (AccountClosureProgress) obj2;
        return Intrinsics.f(this.f104488a, accountClosureProgress.f104488a) && this.f104489b == accountClosureProgress.f104489b && Intrinsics.f(this.f104490c, accountClosureProgress.f104490c) && Intrinsics.f(this.d, accountClosureProgress.d) && Intrinsics.f(this.e, accountClosureProgress.e) && this.f == accountClosureProgress.f && Intrinsics.f(this.f104491g, accountClosureProgress.f104491g) && Intrinsics.f(this.f104492h, accountClosureProgress.f104492h) && Intrinsics.f(this.i, accountClosureProgress.i) && this.f104493j.equals(accountClosureProgress.f104493j) && this.k.equals(accountClosureProgress.k) && this.f104494l == accountClosureProgress.f104494l && Intrinsics.f(this.f104495m, accountClosureProgress.f104495m);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f.hashCode() + r6.b.c(r6.b.c(p.a.c((this.f104489b.hashCode() + (this.f104488a.hashCode() * 31)) * 31, 31, this.f104490c), 31, this.d), 31, this.e)) * 31, 31, this.f104491g);
        String str = this.f104492h;
        return this.f104495m.hashCode() + j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f104493j, (this.i.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31), 31, this.f104494l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104488a);
        dest.writeString(this.f104489b.name());
        dest.writeString(this.f104490c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f.name());
        dest.writeString(this.f104491g);
        dest.writeString(this.f104492h);
        this.i.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f104493j, dest);
        while (itY.hasNext()) {
            ((AccountClosureProgressStep) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.k, dest);
        while (itY2.hasNext()) {
            ((AccountClosureProgressStep) itY2.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f104494l ? 1 : 0);
        dest.writeSerializable(this.f104495m);
    }
}
