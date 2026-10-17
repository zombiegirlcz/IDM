package androidx.media3.datasource.cache;

import a5.a;
import androidx.media3.datasource.DataSpec;

/* JADX INFO: loaded from: classes.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new a(20);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.f7466uri.toString();
    }
}
