package com.fourthline.orca.internal;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class se {
    public static final String a(Uri uri2, String productPathSegment) {
        Intrinsics.checkNotNullParameter(uri2, "<this>");
        Intrinsics.checkNotNullParameter(productPathSegment, "productPathSegment");
        String path = uri2.getPath();
        if (path == null) {
            throw new IllegalStateException("FL Developer error. The Deep Link has no path!");
        }
        if (kotlin.text.d0.J(path, productPathSegment, false)) {
            return path;
        }
        throw new IllegalStateException(("FL Developer error. \"" + productPathSegment + "\" segment is not found in the Deep Link path: " + uri2.getPath() + "!").toString());
    }
}
