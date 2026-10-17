package com.revolut.feature.selfserve.sot.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/api/models/SubmissionActionToDo;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmissionActionToDo implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<SubmissionActionToDo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85880c;
    public final String d;
    public final SubmissionVariantDetails e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            SubmissionVariantDetails submissionVariantDetailsCreateFromParcel = parcel.readInt() == 0 ? null : SubmissionVariantDetails.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SubmissionEvidence.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new SubmissionActionToDo(string, string2, string3, string4, submissionVariantDetailsCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubmissionActionToDo[i];
        }
    }

    public SubmissionActionToDo(String id10, String message, String action, String str, SubmissionVariantDetails submissionVariantDetails, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f85878a = id10;
        this.f85879b = message;
        this.f85880c = action;
        this.d = str;
        this.e = submissionVariantDetails;
        this.f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubmissionActionToDo)) {
            return false;
        }
        SubmissionActionToDo submissionActionToDo = (SubmissionActionToDo) obj2;
        return Intrinsics.f(this.f85878a, submissionActionToDo.f85878a) && Intrinsics.f(this.f85879b, submissionActionToDo.f85879b) && Intrinsics.f(this.f85880c, submissionActionToDo.f85880c) && Intrinsics.f(this.d, submissionActionToDo.d) && Intrinsics.f(this.e, submissionActionToDo.e) && Intrinsics.f(this.f, submissionActionToDo.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f85878a.hashCode() * 31, 31, this.f85879b), 31, this.f85880c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        SubmissionVariantDetails submissionVariantDetails = this.e;
        int iHashCode2 = (iHashCode + (submissionVariantDetails == null ? 0 : submissionVariantDetails.hashCode())) * 31;
        List list = this.f;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85878a);
        dest.writeString(this.f85879b);
        dest.writeString(this.f85880c);
        dest.writeString(this.d);
        SubmissionVariantDetails submissionVariantDetails = this.e;
        if (submissionVariantDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            submissionVariantDetails.writeToParcel(dest, i);
        }
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((SubmissionEvidence) itQ.next()).writeToParcel(dest, i);
        }
    }
}
