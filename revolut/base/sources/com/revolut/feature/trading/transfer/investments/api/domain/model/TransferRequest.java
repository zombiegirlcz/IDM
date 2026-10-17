package com.revolut.feature.trading.transfer.investments.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8f.e;
import u8f.f;
import u8f.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/api/domain/model/TransferRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f91520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f91521c;
    public final ZonedDateTime d;
    public final h e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f91522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f91523h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f91524j;
    public final ArrayList k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            f fVarValueOf = f.valueOf(parcel.readString());
            e eVarValueOf = e.valueOf(parcel.readString());
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            h hVarValueOf = parcel.readInt() == 0 ? null : h.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TransferRequestStep.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TransferRequestPosition.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new TransferRequest(string, fVarValueOf, eVarValueOf, zonedDateTime, hVarValueOf, string2, string3, string4, dVar, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferRequest[i];
        }
    }

    public TransferRequest(String id10, f state, e direction, ZonedDateTime receivedDate, h hVar, String brokerName, String str, String accountId, d dVar, ArrayList steps, ArrayList positions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(receivedDate, "receivedDate");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.f91519a = id10;
        this.f91520b = state;
        this.f91521c = direction;
        this.d = receivedDate;
        this.e = hVar;
        this.f = brokerName;
        this.f91522g = str;
        this.f91523h = accountId;
        this.i = dVar;
        this.f91524j = steps;
        this.k = positions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferRequest)) {
            return false;
        }
        TransferRequest transferRequest = (TransferRequest) obj2;
        return Intrinsics.f(this.f91519a, transferRequest.f91519a) && this.f91520b == transferRequest.f91520b && this.f91521c == transferRequest.f91521c && Intrinsics.f(this.d, transferRequest.d) && this.e == transferRequest.e && Intrinsics.f(this.f, transferRequest.f) && Intrinsics.f(this.f91522g, transferRequest.f91522g) && Intrinsics.f(this.f91523h, transferRequest.f91523h) && Intrinsics.f(this.i, transferRequest.i) && this.f91524j.equals(transferRequest.f91524j) && this.k.equals(transferRequest.k);
    }

    public final int hashCode() {
        int iH = l.h(this.d, (this.f91521c.hashCode() + ((this.f91520b.hashCode() + (this.f91519a.hashCode() * 31)) * 31)) * 31, 31);
        h hVar = this.e;
        int iC = p.a.c((iH + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.f);
        String str = this.f91522g;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f91523h);
        d dVar = this.i;
        return this.k.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f91524j, (iC2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91519a);
        dest.writeString(this.f91520b.name());
        dest.writeString(this.f91521c.name());
        dest.writeSerializable(this.d);
        h hVar = this.e;
        if (hVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(hVar.name());
        }
        dest.writeString(this.f);
        dest.writeString(this.f91522g);
        dest.writeString(this.f91523h);
        dest.writeSerializable(this.i);
        Iterator itY = j6.a.y(this.f91524j, dest);
        while (itY.hasNext()) {
            ((TransferRequestStep) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.k, dest);
        while (itY2.hasNext()) {
            ((TransferRequestPosition) itY2.next()).writeToParcel(dest, i);
        }
    }
}
