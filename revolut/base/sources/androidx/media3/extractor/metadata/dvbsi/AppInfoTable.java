package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.Metadata;
import v0.a;

/* JADX INFO: loaded from: classes15.dex */
public final class AppInfoTable implements Metadata.Entry {
    public final int controlCode;

    /* JADX INFO: renamed from: url, reason: collision with root package name */
    public final String f7620url;

    public AppInfoTable(int i, String str) {
        this.controlCode = i;
        this.f7620url = str;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("Ait(controlCode=");
        sb6.append(this.controlCode);
        sb6.append(",url=");
        return a.i(sb6, this.f7620url, ")");
    }
}
