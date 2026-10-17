package com.revolut.sso.impl.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import gkl.f1;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.d0;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SessionToken;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "gkl/f1", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SessionToken implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106160a;

    @NotNull
    public static final Parcelable.Creator<SessionToken> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionToken(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SessionToken[i];
        }
    }

    public SessionToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f106160a = token;
    }

    public final f1 a() {
        byte[] bArrDecode = Base64.getUrlDecoder().decode((String) d0.n0(this.f106160a, new String[]{"."}, 0, 6).get(1));
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        String str = new String(bArrDecode, Charsets.UTF_8);
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return (f1) jsonA.b(f1.Companion.serializer(), str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF106160a() {
        return this.f106160a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SessionToken) && Intrinsics.f(this.f106160a, ((SessionToken) obj2).f106160a);
    }

    public final int hashCode() {
        return this.f106160a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106160a);
    }
}
