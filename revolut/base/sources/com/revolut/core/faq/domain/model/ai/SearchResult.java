package com.revolut.core.faq.domain.model.ai;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.faq.FaqMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import jg0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/faq/domain/model/ai/SearchResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SearchResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f51383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f51384c;
    public final Summarisation d;
    public final int e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FaqMetaData.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SearchResult(string, bVarValueOf, arrayList, parcel.readInt() == 0 ? null : Summarisation.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchResult[i];
        }
    }

    public SearchResult(String searchRequestId, b state, ArrayList suggestions, Summarisation summarisation, int i) {
        Intrinsics.checkNotNullParameter(searchRequestId, "searchRequestId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f51382a = searchRequestId;
        this.f51383b = state;
        this.f51384c = suggestions;
        this.d = summarisation;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) obj2;
        return Intrinsics.f(this.f51382a, searchResult.f51382a) && this.f51383b == searchResult.f51383b && this.f51384c.equals(searchResult.f51384c) && Intrinsics.f(this.d, searchResult.d) && this.e == searchResult.e;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f51384c, (this.f51383b.hashCode() + (this.f51382a.hashCode() * 31)) * 31, 31);
        Summarisation summarisation = this.d;
        return Integer.hashCode(this.e) + ((iB + (summarisation == null ? 0 : summarisation.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51382a);
        dest.writeString(this.f51383b.name());
        Iterator itY = j6.a.y(this.f51384c, dest);
        while (itY.hasNext()) {
            ((FaqMetaData) itY.next()).writeToParcel(dest, i);
        }
        Summarisation summarisation = this.d;
        if (summarisation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            summarisation.writeToParcel(dest, i);
        }
        dest.writeInt(this.e);
    }
}
