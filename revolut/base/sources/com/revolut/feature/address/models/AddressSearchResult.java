package com.revolut.feature.address.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006+"}, d2 = {"Lcom/revolut/feature/address/models/AddressSearchResult;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "id", "", "result", "description", "hasChildren", "", "resultHighlights", "", "Lcom/revolut/feature/address/models/Highlight;", "descriptionHighlights", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getResult", "getDescription", "getHasChildren", "()Z", "getResultHighlights", "()Ljava/util/List;", "getDescriptionHighlights", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressSearchResult implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<AddressSearchResult> CREATOR = new Creator();

    @NotNull
    private final String description;

    @NotNull
    private final List<Highlight> descriptionHighlights;
    private final boolean hasChildren;

    @NotNull
    private final String id;

    @NotNull
    private final String result;

    @NotNull
    private final List<Highlight> resultHighlights;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressSearchResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearchResult createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = a.a(Highlight.CREATOR, parcel, arrayList, iA2, i);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            while (iA != i3) {
                iA = a.a(Highlight.CREATOR, parcel, arrayList2, iA, i);
            }
            return new AddressSearchResult(string, string2, string3, z, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearchResult[] newArray(int i) {
            return new AddressSearchResult[i];
        }
    }

    public AddressSearchResult(@NotNull String id10, @NotNull String result, @NotNull String description, boolean z, @NotNull List<Highlight> resultHighlights, @NotNull List<Highlight> descriptionHighlights) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(resultHighlights, "resultHighlights");
        Intrinsics.checkNotNullParameter(descriptionHighlights, "descriptionHighlights");
        this.id = id10;
        this.result = result;
        this.description = description;
        this.hasChildren = z;
        this.resultHighlights = resultHighlights;
        this.descriptionHighlights = descriptionHighlights;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressSearchResult copy$default(AddressSearchResult addressSearchResult, String str, String str2, String str3, boolean z, List list, List list2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = addressSearchResult.id;
        }
        if ((i & 2) != 0) {
            str2 = addressSearchResult.result;
        }
        if ((i & 4) != 0) {
            str3 = addressSearchResult.description;
        }
        if ((i & 8) != 0) {
            z = addressSearchResult.hasChildren;
        }
        if ((i & 16) != 0) {
            list = addressSearchResult.resultHighlights;
        }
        if ((i & 32) != 0) {
            list2 = addressSearchResult.descriptionHighlights;
        }
        List list3 = list;
        List list4 = list2;
        return addressSearchResult.copy(str, str2, str3, z, list3, list4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    @NotNull
    public final List<Highlight> component5() {
        return this.resultHighlights;
    }

    @NotNull
    public final List<Highlight> component6() {
        return this.descriptionHighlights;
    }

    @NotNull
    public final AddressSearchResult copy(@NotNull String id10, @NotNull String result, @NotNull String description, boolean hasChildren, @NotNull List<Highlight> resultHighlights, @NotNull List<Highlight> descriptionHighlights) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(resultHighlights, "resultHighlights");
        Intrinsics.checkNotNullParameter(descriptionHighlights, "descriptionHighlights");
        return new AddressSearchResult(id10, result, description, hasChildren, resultHighlights, descriptionHighlights);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSearchResult)) {
            return false;
        }
        AddressSearchResult addressSearchResult = (AddressSearchResult) other;
        return Intrinsics.f(this.id, addressSearchResult.id) && Intrinsics.f(this.result, addressSearchResult.result) && Intrinsics.f(this.description, addressSearchResult.description) && this.hasChildren == addressSearchResult.hasChildren && Intrinsics.f(this.resultHighlights, addressSearchResult.resultHighlights) && Intrinsics.f(this.descriptionHighlights, addressSearchResult.descriptionHighlights);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<Highlight> getDescriptionHighlights() {
        return this.descriptionHighlights;
    }

    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final List<Highlight> getResultHighlights() {
        return this.resultHighlights;
    }

    public int hashCode() {
        return this.descriptionHighlights.hashCode() + p.a.d(j6.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.result), 31, this.description), 31, this.hasChildren), 31, this.resultHighlights);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.result);
        dest.writeString(this.description);
        dest.writeInt(this.hasChildren ? 1 : 0);
        Iterator itV = p.a.v(this.resultHighlights, dest);
        while (itV.hasNext()) {
            ((Highlight) itV.next()).writeToParcel(dest, flags);
        }
        Iterator itV2 = p.a.v(this.descriptionHighlights, dest);
        while (itV2.hasNext()) {
            ((Highlight) itV2.next()).writeToParcel(dest, flags);
        }
    }
}
