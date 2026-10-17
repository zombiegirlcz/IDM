package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Identifier {
    public static Identifier create(Object obj2) {
        return new AutoValue_Identifier(obj2);
    }

    public abstract Object getValue();
}
