package com.revolut.feature.feedback.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/feedback/api/domain/TagsFeedback;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TagsFeedback implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TagsFeedback> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f73135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f73136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f73137c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(FeedbackTag.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(FeedbackTag.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FeedbackTag.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new TagsFeedback(arrayList3, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TagsFeedback[i];
        }
    }

    public TagsFeedback(ArrayList negativeTags, List positiveTags, List neutralTags) {
        Intrinsics.checkNotNullParameter(positiveTags, "positiveTags");
        Intrinsics.checkNotNullParameter(neutralTags, "neutralTags");
        Intrinsics.checkNotNullParameter(negativeTags, "negativeTags");
        this.f73135a = positiveTags;
        this.f73136b = neutralTags;
        this.f73137c = negativeTags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TagsFeedback)) {
            return false;
        }
        TagsFeedback tagsFeedback = (TagsFeedback) obj2;
        return Intrinsics.f(this.f73135a, tagsFeedback.f73135a) && Intrinsics.f(this.f73136b, tagsFeedback.f73136b) && this.f73137c.equals(tagsFeedback.f73137c);
    }

    public final int hashCode() {
        return this.f73137c.hashCode() + p.a.d(this.f73135a.hashCode() * 31, 31, this.f73136b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f73135a, dest);
        while (itV.hasNext()) {
            ((FeedbackTag) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f73136b, dest);
        while (itV2.hasNext()) {
            ((FeedbackTag) itV2.next()).writeToParcel(dest, i);
        }
        ArrayList arrayList = this.f73137c;
        dest.writeInt(arrayList.size());
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((FeedbackTag) it8.next()).writeToParcel(dest, i);
        }
    }
}
