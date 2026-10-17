package com.samskivert.mustache;

import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes12.dex */
public class MustacheParseException extends MustacheException {
    public MustacheParseException(String str) {
        super(str);
    }

    public MustacheParseException(String str, int i) {
        super(a.k(i, str, " @ line "));
    }
}
