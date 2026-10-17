package com.revolut.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class StubProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri2, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri2, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri2, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri2, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
