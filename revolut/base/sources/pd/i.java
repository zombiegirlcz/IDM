package pd;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235032c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f235033g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f235031b = str;
        this.f235030a = str2;
        this.f235032c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f235033g = str7;
    }

    public static i a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new i(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Objects.equal(this.f235031b, iVar.f235031b) && Objects.equal(this.f235030a, iVar.f235030a) && Objects.equal(this.f235032c, iVar.f235032c) && Objects.equal(this.d, iVar.d) && Objects.equal(this.e, iVar.e) && Objects.equal(this.f, iVar.f) && Objects.equal(this.f235033g, iVar.f235033g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f235031b, this.f235030a, this.f235032c, this.d, this.e, this.f, this.f235033g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f235031b).add("apiKey", this.f235030a).add("databaseUrl", this.f235032c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.f235033g).toString();
    }
}
