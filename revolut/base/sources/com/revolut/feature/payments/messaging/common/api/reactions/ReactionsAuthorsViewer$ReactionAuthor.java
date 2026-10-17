package com.revolut.feature.payments.messaging.common.api.reactions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/messaging/common/api/reactions/ReactionsAuthorsViewer$ReactionAuthor", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReactionsAuthorsViewer$ReactionAuthor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReactionsAuthorsViewer$ReactionAuthor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79511c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new ReactionsAuthorsViewer$ReactionAuthor(string, string2, string3, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReactionsAuthorsViewer$ReactionAuthor[i];
        }
    }

    public ReactionsAuthorsViewer$ReactionAuthor(String authorCode, String authorName, String reaction, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(authorCode, "authorCode");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        this.f79509a = authorCode;
        this.f79510b = authorName;
        this.f79511c = reaction;
        this.d = z;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReactionsAuthorsViewer$ReactionAuthor)) {
            return false;
        }
        ReactionsAuthorsViewer$ReactionAuthor reactionsAuthorsViewer$ReactionAuthor = (ReactionsAuthorsViewer$ReactionAuthor) obj2;
        return Intrinsics.f(this.f79509a, reactionsAuthorsViewer$ReactionAuthor.f79509a) && Intrinsics.f(this.f79510b, reactionsAuthorsViewer$ReactionAuthor.f79510b) && Intrinsics.f(this.f79511c, reactionsAuthorsViewer$ReactionAuthor.f79511c) && this.d == reactionsAuthorsViewer$ReactionAuthor.d && this.e == reactionsAuthorsViewer$ReactionAuthor.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.c(p.a.c(this.f79509a.hashCode() * 31, 31, this.f79510b), 31, this.f79511c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79509a);
        dest.writeString(this.f79510b);
        dest.writeString(this.f79511c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
