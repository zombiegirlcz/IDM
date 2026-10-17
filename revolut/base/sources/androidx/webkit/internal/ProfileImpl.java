package androidx.webkit.internal;

import androidx.webkit.Profile;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* JADX INFO: loaded from: classes16.dex */
public class ProfileImpl implements Profile {
    private final ProfileBoundaryInterface mProfileImpl;

    public ProfileImpl(ProfileBoundaryInterface profileBoundaryInterface) {
        this.mProfileImpl = profileBoundaryInterface;
    }

    @Override // androidx.webkit.Profile
    public String getName() {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.mProfileImpl.getName();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
