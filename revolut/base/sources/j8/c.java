package j8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import c8.k;
import com.bumptech.glide.h;
import i8.t;
import i8.u;
import java.io.File;
import java.io.FileNotFoundException;
import md6.s;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements com.bumptech.glide.load.data.e {
    public static final String[] k = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f172065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f172066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f172067c;
    public final Uri d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f172068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f172069h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.e f172070j;

    public c(Context context, u uVar, u uVar2, Uri uri2, int i, int i2, k kVar, Class cls) {
        this.f172065a = context.getApplicationContext();
        this.f172066b = uVar;
        this.f172067c = uVar2;
        this.d = uri2;
        this.e = i;
        this.f = i2;
        this.f172068g = kVar;
        this.f172069h = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f172069h;
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        return c8.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(h hVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            com.bumptech.glide.load.data.e eVarD = d();
            if (eVarD == null) {
                dVar.e(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.f172070j = eVarD;
                if (this.i) {
                    cancel();
                } else {
                    eVarD.c(hVar, dVar);
                }
            }
        } catch (FileNotFoundException e) {
            dVar.e(e);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.i = true;
        com.bumptech.glide.load.data.e eVar = this.f172070j;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        com.bumptech.glide.load.data.e eVar = this.f172070j;
        if (eVar != null) {
            eVar.cleanup();
        }
    }

    public final com.bumptech.glide.load.data.e d() throws Throwable {
        t tVarA;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f172065a;
        k kVar = this.f172068g;
        int i = this.f;
        int i2 = this.e;
        if (zIsExternalStorageLegacy) {
            Uri uri2 = this.d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri2, k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri2);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            tVarA = this.f172066b.a(file, i2, i, kVar);
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri2);
            } catch (Throwable th11) {
                th = th11;
            }
        } else {
            Uri requireOriginal = this.d;
            boolean zI = s.i(requireOriginal);
            u uVar = this.f172067c;
            if (zI && requireOriginal.getPathSegments().contains("picker")) {
                tVarA = uVar.a(requireOriginal, i2, i, kVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                tVarA = uVar.a(requireOriginal, i2, i, kVar);
            }
        }
        if (tVarA != null) {
            return tVarA.f159400c;
        }
        return null;
    }
}
