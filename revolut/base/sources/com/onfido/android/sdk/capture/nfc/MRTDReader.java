package com.onfido.android.sdk.capture.nfc;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&JY\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/nfc/MRTDReader;", "", "cancelSession", "", "activity", "Landroid/app/Activity;", "read", "documentInfo", "Lcom/onfido/android/sdk/capture/nfc/MRTDDocumentInfo;", "preferredAccessControl", "Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;", "dataGroups", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "activeAuthenticationChallenge", "", "chipAuthentication", "", "delegate", "Lcom/onfido/android/sdk/capture/nfc/MRTDReaderDelegate;", "(Landroid/app/Activity;Lcom/onfido/android/sdk/capture/nfc/MRTDDocumentInfo;Lcom/onfido/android/sdk/capture/nfc/MRTDAccessControl;[Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;[BZLcom/onfido/android/sdk/capture/nfc/MRTDReaderDelegate;)V", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MRTDReader {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void read$default(MRTDReader mRTDReader, Activity activity, MRTDDocumentInfo mRTDDocumentInfo, MRTDAccessControl mRTDAccessControl, MRTDDataGroup[] mRTDDataGroupArr, byte[] bArr, boolean z, MRTDReaderDelegate mRTDReaderDelegate, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
            }
            if ((i & 4) != 0) {
                mRTDAccessControl = null;
            }
            if ((i & 8) != 0) {
                mRTDDataGroupArr = null;
            }
            if ((i & 16) != 0) {
                bArr = null;
            }
            if ((i & 32) != 0) {
                z = false;
            }
            mRTDReader.read(activity, mRTDDocumentInfo, mRTDAccessControl, mRTDDataGroupArr, bArr, z, mRTDReaderDelegate);
        }
    }

    void cancelSession(@NotNull Activity activity);

    void read(@NotNull Activity activity, @NotNull MRTDDocumentInfo documentInfo, MRTDAccessControl preferredAccessControl, MRTDDataGroup[] dataGroups, byte[] activeAuthenticationChallenge, boolean chipAuthentication, @NotNull MRTDReaderDelegate delegate);
}
