package kej;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f183100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f183101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lej.a f183102c;

    public h(Context context, g contentValuesBuilder, lej.a apnUriSupplier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentValuesBuilder, "contentValuesBuilder");
        Intrinsics.checkNotNullParameter(apnUriSupplier, "apnUriSupplier");
        this.f183100a = context;
        this.f183101b = contentValuesBuilder;
        this.f183102c = apnUriSupplier;
    }

    public final void a(a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String apnName = config.f183087a;
        String apn = config.f183088b;
        Intrinsics.checkNotNullParameter(apnName, "apnName");
        Intrinsics.checkNotNullParameter(apn, "apn");
        String[] strArr = {apn, apnName};
        ContentResolver contentResolver = this.f183100a.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        this.f183102c.getClass();
        Uri CONTENT_URI = Telephony.Carriers.CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
        contentResolver.delete(CONTENT_URI, "apn=? AND name=?", strArr);
    }

    public final String b(a config, pej.c esim) {
        String lastPathSegment;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(esim, "esim");
        g gVar = this.f183101b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(esim, "esim");
        gVar.f183099a.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", config.f183087a);
        contentValues.put("apn", config.f183088b);
        contentValues.put("type", config.f183089c);
        contentValues.put("mmsc", config.d);
        contentValues.put("mmsport", config.e);
        contentValues.put("mvno_type", config.f);
        String str = esim.f235386c;
        String str2 = esim.d;
        contentValues.put("mvno_match_data", str + str2 + config.f183090g);
        String str3 = esim.f235386c;
        contentValues.put("mcc", str3);
        contentValues.put("mnc", str2);
        contentValues.put("numeric", str3.concat(str2));
        contentValues.put("sub_id", Integer.valueOf(esim.f235384a));
        contentValues.put("current", (Integer) 1);
        contentValues.put("user_visible", (Integer) 1);
        ContentResolver contentResolver = this.f183100a.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        this.f183102c.getClass();
        Uri CONTENT_URI = Telephony.Carriers.CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
        Uri uriInsert = contentResolver.insert(CONTENT_URI, contentValues);
        if (uriInsert == null || (lastPathSegment = uriInsert.getLastPathSegment()) == null) {
            throw new IllegalStateException("cannot insert APN configuration");
        }
        return lastPathSegment;
    }
}
