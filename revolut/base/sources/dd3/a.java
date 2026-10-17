package dd3;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public interface a {
    String a();

    int b();

    default Parcelable getAnalyticsContext() {
        return null;
    }
}
