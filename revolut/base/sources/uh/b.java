package uh;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes17.dex */
public enum b {
    PRIVATE(CoreConstants.COLON_CHAR, CoreConstants.COMMA_CHAR),
    REGISTRY('!', '?');

    private final char innerNodeCode;
    private final char leafNodeCode;

    b(char c2, char c3) {
        this.innerNodeCode = c2;
        this.leafNodeCode = c3;
    }

    public static b a(char c2) {
        for (b bVar : values()) {
            if (bVar.innerNodeCode == c2 || bVar.leafNodeCode == c2) {
                return bVar;
            }
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.j(c2, "No enum corresponding to given code: "));
    }
}
