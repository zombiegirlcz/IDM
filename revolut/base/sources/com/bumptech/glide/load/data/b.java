package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparable f26107c;
    public final Object d;

    public /* synthetic */ b(int i, Comparable comparable, Object obj2) {
        this.f26105a = i;
        this.d = obj2;
        this.f26107c = comparable;
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        switch (this.f26105a) {
        }
        return c8.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(com.bumptech.glide.h hVar, d dVar) {
        switch (this.f26105a) {
            case 0:
                try {
                    Object objH = h((AssetManager) this.d, (String) this.f26107c);
                    this.f26106b = objH;
                    dVar.d(objH);
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                    }
                    dVar.e(e);
                }
                break;
            default:
                try {
                    Object objG = g((ContentResolver) this.d, (Uri) this.f26107c);
                    this.f26106b = objG;
                    dVar.d(objG);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                    }
                    dVar.e(e2);
                    return;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f26105a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        switch (this.f26105a) {
            case 0:
                Object obj2 = this.f26106b;
                if (obj2 != null) {
                    try {
                        f(obj2);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj3 = this.f26106b;
                if (obj3 != null) {
                    try {
                        f(obj3);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    public abstract void f(Object obj2);

    public abstract Object g(ContentResolver contentResolver, Uri uri2);

    public abstract Object h(AssetManager assetManager, String str);
}
