package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUrl", id = 2)
    private final Uri f38002zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private final int f38003zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHeight", id = 4)
    private final int f38004zad;

    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Uri uri2, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3) {
        this.zaa = i;
        this.f38002zab = uri2;
        this.f38003zac = i2;
        this.f38004zad = i3;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && (obj2 instanceof WebImage)) {
            WebImage webImage = (WebImage) obj2;
            if (Objects.equal(this.f38002zab, webImage.f38002zab) && this.f38003zac == webImage.f38003zac && this.f38004zad == webImage.f38004zad) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f38004zad;
    }

    @NonNull
    public Uri getUrl() {
        return this.f38002zab;
    }

    public int getWidth() {
        return this.f38003zac;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38002zab, Integer.valueOf(this.f38003zac), Integer.valueOf(this.f38004zad));
    }

    @NonNull
    @KeepForSdk
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f38002zab.toString());
            jSONObject.put("width", this.f38003zac);
            jSONObject.put("height", this.f38004zad);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        int i = this.f38003zac;
        int i2 = this.f38004zad;
        String string = this.f38002zab.toString();
        StringBuilder sbW = a.w("Image ", i, i2, "x", " ");
        sbW.append(string);
        return sbW.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeParcelable(parcel, 2, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebImage(@NonNull Uri uri2) throws IllegalArgumentException {
        this(uri2, 0, 0);
    }

    public WebImage(@NonNull Uri uri2, int i, int i2) throws IllegalArgumentException {
        this(1, uri2, i, i2);
        if (uri2 == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    public WebImage(@NonNull JSONObject jSONObject) throws IllegalArgumentException {
        Uri uri2 = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri2 = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri2, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }
}
