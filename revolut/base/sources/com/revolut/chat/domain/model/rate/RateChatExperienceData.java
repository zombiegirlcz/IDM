package com.revolut.chat.domain.model.rate;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z30.n;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/rate/RateChatExperienceData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RateChatExperienceData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RateChatExperienceData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f51108c;
    public final n d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ExperienceTagItem.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new RateChatExperienceData(string, string2, arrayList, parcel.readInt() != 0 ? n.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RateChatExperienceData[i];
        }
    }

    public RateChatExperienceData(String experience, String str, List list, n nVar) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        this.f51106a = experience;
        this.f51107b = str;
        this.f51108c = list;
        this.d = nVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RateChatExperienceData)) {
            return false;
        }
        RateChatExperienceData rateChatExperienceData = (RateChatExperienceData) obj2;
        return Intrinsics.f(this.f51106a, rateChatExperienceData.f51106a) && Intrinsics.f(this.f51107b, rateChatExperienceData.f51107b) && Intrinsics.f(this.f51108c, rateChatExperienceData.f51108c) && this.d == rateChatExperienceData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f51106a.hashCode() * 31;
        String str = this.f51107b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f51108c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        n nVar = this.d;
        return iHashCode3 + (nVar != null ? nVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51106a);
        dest.writeString(this.f51107b);
        List list = this.f51108c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((ExperienceTagItem) itQ.next()).writeToParcel(dest, i);
            }
        }
        n nVar = this.d;
        if (nVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(nVar.name());
        }
    }
}
