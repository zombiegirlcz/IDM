package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/chat/domain/model/InitialMessage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitialMessage implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51054c;
    public final String d;
    public final String e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<InitialMessage> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.chat.domain.model.InitialMessage$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InitialMessage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InitialMessage[i];
        }
    }

    public InitialMessage(String str, String str2, String str3, String str4, String str5) {
        this.f51052a = str;
        this.f51053b = str2;
        this.f51054c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InitialMessage)) {
            return false;
        }
        InitialMessage initialMessage = (InitialMessage) obj2;
        return Intrinsics.f(this.f51052a, initialMessage.f51052a) && Intrinsics.f(this.f51053b, initialMessage.f51053b) && Intrinsics.f(this.f51054c, initialMessage.f51054c) && Intrinsics.f(this.d, initialMessage.d) && Intrinsics.f(this.e, initialMessage.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f51052a.hashCode() * 31, 31, this.f51053b);
        String str = this.f51054c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51052a);
        dest.writeString(this.f51053b);
        dest.writeString(this.f51054c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
