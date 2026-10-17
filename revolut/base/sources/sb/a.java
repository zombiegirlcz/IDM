package sb;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f261467a;

    public a(String str) {
        this.f261467a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f261467a);
    }
}
