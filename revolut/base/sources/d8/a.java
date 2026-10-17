package d8;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f112089c = {"_data"};
    public static final String[] d = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f112091b;

    public /* synthetic */ a(ContentResolver contentResolver, int i) {
        this.f112090a = i;
        this.f112091b = contentResolver;
    }

    @Override // d8.c
    public final Cursor a(Uri uri2) {
        switch (this.f112090a) {
            case 0:
                String lastPathSegment = uri2.getLastPathSegment();
                return this.f112091b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f112089c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri2.getLastPathSegment();
                return this.f112091b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
