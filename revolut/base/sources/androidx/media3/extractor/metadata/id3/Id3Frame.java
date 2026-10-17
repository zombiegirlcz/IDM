package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;

/* JADX INFO: loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f7624id;

    public Id3Frame(String str) {
        this.f7624id = str;
    }

    public String toString() {
        return this.f7624id;
    }
}
