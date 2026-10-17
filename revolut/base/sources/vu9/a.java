package vu9;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f292276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292278c;

    public a(Bitmap bitmap, String title, String uniqueKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(uniqueKey, "uniqueKey");
        this.f292276a = bitmap;
        this.f292277b = title;
        this.f292278c = uniqueKey;
    }
}
