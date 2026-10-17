package org.chromium.support_lib_boundary;

import android.content.ContentProvider;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes14.dex */
public interface DropDataContentProviderBoundaryInterface {
    Uri cache(byte[] bArr, String str, String str2);

    Bundle call(String str, String str2, Bundle bundle);

    String[] getStreamTypes(Uri uri2, String str);

    String getType(Uri uri2);

    boolean onCreate();

    void onDragEnd(boolean z);

    ParcelFileDescriptor openFile(ContentProvider contentProvider, Uri uri2) throws FileNotFoundException;

    Cursor query(Uri uri2, String[] strArr, String str, String[] strArr2, String str2);

    void setClearCachedDataIntervalMs(int i);
}
