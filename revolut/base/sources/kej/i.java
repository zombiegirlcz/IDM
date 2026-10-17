package kej;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f183103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f183104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lej.c f183105c;

    public i(Context context, g contentValuesBuilder, lej.c preferredApnUriSupplier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentValuesBuilder, "contentValuesBuilder");
        Intrinsics.checkNotNullParameter(preferredApnUriSupplier, "preferredApnUriSupplier");
        this.f183103a = context;
        this.f183104b = contentValuesBuilder;
        this.f183105c = preferredApnUriSupplier;
    }

    public final void a(String apnConfigId, pej.c esim) {
        Intrinsics.checkNotNullParameter(apnConfigId, "apnConfigId");
        Intrinsics.checkNotNullParameter(esim, "esim");
        int i = esim.f235384a;
        ((lej.b) this.f183105c).getClass();
        Uri uriWithAppendedPath = Uri.withAppendedPath(lej.b.f194559a, String.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(uriWithAppendedPath, "withAppendedPath(...)");
        g gVar = this.f183104b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(apnConfigId, "apnConfigId");
        gVar.f183099a.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("apn_id", apnConfigId);
        ContentResolver contentResolver = this.f183103a.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        contentResolver.insert(uriWithAppendedPath, contentValues);
    }
}
