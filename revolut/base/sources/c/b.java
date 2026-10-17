package c;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes13.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20072c = "android$support$customtabs$ICustomTabsCallback".replace(CoreConstants.DOLLAR, CoreConstants.DOT);

    void extraCallback(String str, Bundle bundle);

    Bundle extraCallbackWithResult(String str, Bundle bundle);

    void onActivityLayout(int i, int i2, int i3, int i5, int i6, Bundle bundle);

    void onActivityResized(int i, int i2, Bundle bundle);

    void onMessageChannelReady(Bundle bundle);

    void onMinimized(Bundle bundle);

    void onNavigationEvent(int i, Bundle bundle);

    void onPostMessage(String str, Bundle bundle);

    void onRelationshipValidationResult(int i, Uri uri2, boolean z, Bundle bundle);

    void onUnminimized(Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
