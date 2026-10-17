package qed;

import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$Step;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f245119a;

    static {
        int[] iArr = new int[SharedAddAlertFlowContract$Step.values().length];
        try {
            iArr[SharedAddAlertFlowContract$Step.FROM_ASSET_TYPE_CHOOSER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharedAddAlertFlowContract$Step.FROM_ASSET_CHOOSER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharedAddAlertFlowContract$Step.CREATE_ALERT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SharedAddAlertFlowContract$Step.EDIT_ALERT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SharedAddAlertFlowContract$Step.NOTIFICATIONS_PERMISSION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f245119a = iArr;
    }
}
