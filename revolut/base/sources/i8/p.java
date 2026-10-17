package i8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class p implements com.bumptech.glide.load.data.e {
    public static final String[] d = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f159392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f159393c;

    public /* synthetic */ p(Object obj2, Object obj3, int i) {
        this.f159391a = i;
        this.f159392b = obj2;
        this.f159393c = obj3;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f159391a) {
            case 0:
                return File.class;
            default:
                switch (((c) this.f159393c).f159350a) {
                    case 0:
                        return ByteBuffer.class;
                    default:
                        return InputStream.class;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        switch (this.f159391a) {
        }
        return c8.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        Object objWrap;
        switch (this.f159391a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f159392b).getContentResolver().query((Uri) this.f159393c, d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th10) {
                        cursorQuery.close();
                        throw th10;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    dVar.d(new File(string));
                    return;
                }
                dVar.e(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f159393c)));
                return;
            default:
                c cVar = (c) this.f159393c;
                byte[] bArr = (byte[]) this.f159392b;
                switch (cVar.f159350a) {
                    case 0:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar.d(objWrap);
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f159391a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        int i = this.f159391a;
    }
}
