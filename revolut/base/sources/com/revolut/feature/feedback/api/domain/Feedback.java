package com.revolut.feature.feedback.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/feedback/api/domain/Feedback;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Feedback implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f73127c;
    public final List d;
    public final String e;
    public final Date f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<Feedback> CREATOR = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Feedback f73124g = new Feedback("", "", null, f0.f322471a, "", new Date());

    /* JADX INFO: renamed from: com.revolut.feature.feedback.api.domain.Feedback$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Feedback(string, string2, boolValueOf, parcel.createStringArrayList(), parcel.readString(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Feedback[i];
        }
    }

    public Feedback(String id10, String entity, Boolean bool, List tags, String comment, Date createdDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f73125a = id10;
        this.f73126b = entity;
        this.f73127c = bool;
        this.d = tags;
        this.e = comment;
        this.f = createdDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Feedback)) {
            return false;
        }
        Feedback feedback = (Feedback) obj2;
        return Intrinsics.f(this.f73125a, feedback.f73125a) && Intrinsics.f(this.f73126b, feedback.f73126b) && Intrinsics.f(this.f73127c, feedback.f73127c) && Intrinsics.f(this.d, feedback.d) && Intrinsics.f(this.e, feedback.e) && Intrinsics.f(this.f, feedback.f);
    }

    public final int hashCode() {
        int iC = a.c(this.f73125a.hashCode() * 31, 31, this.f73126b);
        Boolean bool = this.f73127c;
        return this.f.hashCode() + a.c(a.d((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73125a);
        dest.writeString(this.f73126b);
        Boolean bool = this.f73127c;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            a.A(dest, 1, bool);
        }
        dest.writeStringList(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
    }
}
