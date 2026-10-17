package yr9;

import com.revolut.feature.payments.groups.impl.members_picker.GroupChatQrAction;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316158a;

    static {
        int[] iArr = new int[GroupChatQrAction.values().length];
        try {
            iArr[GroupChatQrAction.COPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GroupChatQrAction.SHARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GroupChatQrAction.SHOW_QR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f316158a = iArr;
    }
}
